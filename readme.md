run with
```bash
mill foo.delegator
```
the result should be
```
Compiling ${PWD}/build.sc
build.sc:9: Target.ctx() can only be used with a T{...} block
    delegatee(T.ctx().dest.toString())()
                   ^
Compilation Failed
```
