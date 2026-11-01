# kmp/lib modules are never compiled incrementally

Three modules with the same 30 Kotlin files:

| Module | Setup |
|---|---|
| `kmp-src-jvm` | `kmp/lib`, `platforms: [jvm]`, plus one file in `src@jvm` |
| `kmp-compose-resources` | `kmp/lib`, `platforms: [jvm]`, Compose enabled, one string in `composeResources` (no `src@jvm`) |
| `jvm-lib` | `jvm/lib` (control) |

Run:

```
./measure.sh
```

It builds once, then appends a comment to `Model1.kt` of each module, rebuilds, and counts the `.class` files
rewritten. Output with Kotlin Toolchain 0.13.0 (Linux, JDK from the toolchain):

```
kmp-src-jvm: 61 of 61 classes recompiled after a comment change in Model1.kt
    INFO  :kmp-src-jvm:compileJvm   KotlinBuildToolsApiKt     Non-incremental compilation will be performed: Incremental compilation might be incorrect (KT-62686)
kmp-compose-resources: 69 of 69 classes recompiled after a comment change in Model1.kt
    INFO  :kmp-compose-resources:compileJvm KotlinBuildToolsApiKt     Non-incremental compilation will be performed: Incremental compilation might be incorrect (KT-62686)
jvm-lib: 2 of 60 classes recompiled after a comment change in Model1.kt
```
