# Kotlin笔记（三） - 程序结构

* 3.1   变量与常量（val，var）
* 3.2   函数（function）
* 3.3   Lambda表达式
* 3.4   类成员（成员方法、成员变量）
* 3.5   基本运算符
* 3.6   表达式（中缀表达式、分支表达式、when表达式等）
* 3.7   循环语句（for循环，while循环，continue，break）
* 3.8   异常捕获（try，catch，finally）
* 3.9   具名参数，变长参数，默认参数
* 3.10  小案例：命令行计数器开发
* 3.11  导出可执行程序

## 3.1   变量与常量（val，var）
> Demo见：VarAndVal.kt

1. 什么是常量？
* val = value，值类型；
* 类似 Java 的 final，只是类似，并不是等价；
* 不可能被重新赋值；
> 举例：</br>
> 运行时常量：val x = getX() </br>
> 编译期常量：const val x = 2 </br>

2. 什么是变量？
* var = variable
> 举例：
> var x = "HelloWorld"  //定义变量 /br>
> x = "HiWorld"  //再次赋值 </br>

3. 类型推导
* 编译器可以推导量的类型
> val string = "Hello"  //推导出 String 类型 </br>
> val int = 5   //Int 类型 </br>
> var x = getString() + 5   //String类型 </br>

通过 Tools --> Kotlin --> Show Kotlin Bytecode 可以查看 Kotlin 被编译成的字节码文件。

## 3.2   函数（function）
> Demo见：FunctionExample.kt

在 java 中，没有返回值的函数默认返回 void； </br>
在 kotlin 中，没有返回值的函数默认返回 Unit。 </br>

### 3.2.1  函数
什么是函数？
* 以特定功能组织起来的代码块
> fun [函数名] ([参数列表]):[返回值类型]{[函数体]} </br>
> fun [函数名] ([参数列表]) = [表达式] </br>
* 举例
```kotlin
//案例1：
//常规写法
fun sayHi(name:String){
    println("Hi,$name")
}
//简写
fun sayHi(name:String) = println("Hi,$name")

//案例2：
//kotlin常规函数的写法：
fun sum(arg1: Int, arg2: Int): Int {
    return arg1 + arg2
}

//上面这个函数，计算两个 Int 参数的和并返回，可以简写为下面这种方式：
fun sum(arg1: Int, arg2: Int) = arg1 + arg2
```

### 3.2.2  匿名函数
* 无名氏一直是神一样的存在
* fun([参数列表])...
* 在 Kotlin 中，一个函数可以不定义它的方法名，但是需要用一个变量去接收它的返回值，这种函数叫做匿名函数。
* 举例
```kotlin
val sayHi = fun(nane:String) = println("Hi,$name")

var sum = fun(arg1: Int, arg2: Int) = arg1 + arg2
```

### 3.2.3  编写函数的注意事项
* 功能要单一
* 函数名要做到顾名思义
* 参数个数不要太多

## 3.3   Lambda表达式

对于函数来说，如果它的最后一个参数是 Lambda表达式，那么可以将参数移到外面去；
如果小括号里面什么都没有，那么可以将小括号删掉；
如果传入的函数和需要接收的Lambda表达式的类型是完全一样的，还可以继续简化。