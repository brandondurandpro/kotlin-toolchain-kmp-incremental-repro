#!/usr/bin/env bash
# Appends a comment to one file of each module, rebuilds, and counts the .class files rewritten.
set -eu
cd "$(dirname "$0")"
./kotlin build > /dev/null
for m in kmp-src-jvm kmp-compose-resources jvm-lib; do
  dir=$(ls -d build/artifacts/CompiledJvmArtifact/${m}jvm 2>/dev/null || ls -d build/artifacts/CompiledJvmArtifact/${m}*main* 2>/dev/null | head -1)
  touch build/.marker; sleep 1
  echo "// edit $(date +%s%N)" >> $m/src/Model1.kt
  ./kotlin build > /dev/null
  rewritten=$(find "$dir/kotlin-output" -name '*.class' -newer build/.marker | wc -l)
  total=$(find "$dir/kotlin-output" -name '*.class' | wc -l)
  echo "$m: $rewritten of $total classes recompiled after a comment change in Model1.kt"
  log=$(ls -d build/logs/*_build | tail -1)
  grep -h 'Non-incremental' "$log"/info.log | sed 's/^/    /' || true
done
