# FragmentOperator

A library to make managing Android fragment backstack easier!

### Usage

Currently you need to grab all source code.

Your `Activity` for `Fragment` operation has to extend from `FoActivity`.
All your fragments have to extend from `FoFragment`.

When your `Activity` is ready, you need register current active `Activity`.
```java
  FragmentOperator.INSTANCE.setCurrentActivity(CURRENT_ACTIVITY)
```

When you need to show a `Fragment`, use APIs in FragmentOperator:
```java
  FragmentOperator.INSTANCE.showFragment
```

* `clearStack`: Flag for clearing all previous backstack
* `skipOnPop`: Mark new fragment to be skipped when pop backstack
* `containerId`: Res ID for where the fragment should be loaded to

When you need to set a `Fragment` class to be single instance in backstack, just add annotation
`SingleInstanceFragment` to your `Fragment` class.
```java
  @SingleInstanceFragment
  public class CategoryFragment {}
```

### MIT License

Copyright (c) 2018 Tubi, Inc.

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.


