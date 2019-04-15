run with
```bash
mill foo.doesNotWorks
```
the result should be
```
Compiling ${PWD}/build.sc
build.sc:14: Target.ctx() can only be used with a T{...} block
    delegatee(T.ctx().dest.toString())()
                   ^
Compilation Failed
```
