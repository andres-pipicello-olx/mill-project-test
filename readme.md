run with
```bash
mill show foo.upstreamAssemblyClasspath
```
the result should be
```
[1/1] show
1 targets failed
show java.nio.file.NoSuchFileException: /Users/andres/git/mill-project-test/out/dep/upstreamAssemblyClasspath/meta.json
    sun.nio.fs.UnixException.translateToIOException(UnixException.java:86)
    sun.nio.fs.UnixException.rethrowAsIOException(UnixException.java:102)
    sun.nio.fs.UnixException.rethrowAsIOException(UnixException.java:107)
    sun.nio.fs.UnixFileAttributeViews$Basic.readAttributes(UnixFileAttributeViews.java:55)
    sun.nio.fs.UnixFileSystemProvider.readAttributes(UnixFileSystemProvider.java:144)
    java.nio.file.Files.readAttributes(Files.java:1737)
    java.nio.file.Files.size(Files.java:2332)
    ujson.PathParser$.transform(ChannelParser.scala:14)
    ujson.FileParser$.transform(ChannelParser.scala:9)
    ujson.FileParser$.transform(ChannelParser.scala:8)
    ujson.Readable$fromTransformer.transform(Readable.scala:13)
    ujson.package$.transform(package.scala:4)
    ujson.package$.read(package.scala:9)
    mill.main.RunScript$.$anonfun$evaluate$6(RunScript.scala:243)
    scala.collection.immutable.Stream.map(Stream.scala:418)
    mill.main.RunScript$.evaluate(RunScript.scala:237)
    mill.main.RunScript$.$anonfun$evaluateTasks$1(RunScript.scala:189)
    scala.util.Either.map(Either.scala:353)
    mill.main.RunScript$.evaluateTasks(RunScript.scala:188)
    mill.main.MainModule$.evaluateTasks(MainModule.scala:20)
    mill.main.MainModule.$anonfun$show$1(MainModule.scala:189)
    mill.define.Applicative$Applyer.$anonfun$zipMap$1(Applicative.scala:35)
    mill.define.Task$MappedDest.evaluate(Task.scala:337)
```
