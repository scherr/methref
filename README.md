Type-safe Method References
===

Maximilian Scherr, 2014-

A prototype of a mini library for dynamically creating "type-safe" method references, i.e. method objects. Reflective method objects such as
`java.lang.reflect.Method` as well as `java.lang.invoke.MethodHandle` already fullfill such a role but are not really type-safe.
Java 8's lambda expressions are type-safe but static, i.e. do not allow the dynamic generation of references to methods whose name is not statically known.

The library relies on Guava's `TypeToken`s to provide a representation of meta-level (generic) type objects. Type safety in the library presented here means that no unchecked casts
need to be performed by users. Method reference resolution fails fast (if it fails) and unless users use unchecked casts to tamper with the created object's static type,
no type-related issues should occur after successful resolution.
Of course, the extent of type safety relies on the proper usage of the library and Guava's `TypeToken`s.

Performance
---

Method invocation is sped up using dynamic code generation. Tentative experiments suggest that the performance is comparable with the untyped approaches.

It seems that the optimization of reflective method invocation has received quite a lot of attention in recent JVM versions so the difference to using this library is not very large.
In the experiments such calls are initially slower and seem to be JIT-compiled and optimized in a different fashion than other method objects including method handles, e.g.
calls involving primitive types are quite a bit faster after some point.

Dependencies
---

* Javassist 3
* Guava 18.0

Unfinished Business
---

* Proper error handling (checked exceptions)
* Experiments and tests
* Extending parameter limit? Currently set to 32 parameters ...
