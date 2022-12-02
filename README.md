# SpringBoot3 native demo

env:

```text
1. graalvm17-22.3.0 https://github.com/graalvm/graalvm-ce-builds/releases/tag/vm-22.3.0
2. export GRAALVM_HOME=/path/to/graalvm
```

run:

```sh
./gradlew nativeCompile && ./build/native/nativeCompile/springboot3nativedemo
```