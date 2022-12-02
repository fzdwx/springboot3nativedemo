# SpringBoot3 native demo

env:

```text
1. graalvm17-22.3.0 https://github.com/graalvm/graalvm-ce-builds/releases/tag/vm-22.3.0
2. export GRAALVM_HOME=/path/to/graalvm
```

run:

```sh
./gradlew nativeCompile && ./build/native/nativeCompile/springboot3nativedemo
curl  http://localhost:8080/fzdwx
```

看了下，打包出来的文件还是很大，有60m。对比 golang 来说还是有一定差距。