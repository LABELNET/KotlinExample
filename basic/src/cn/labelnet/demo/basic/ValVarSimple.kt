package cn.labelnet.demo.basic


/**
 * val : 只可读
 * var : 可改变的
 */
fun main(args: Array<String>) {
    val a = 1;
    // a = 2;
    var b = 1;
    b = 2;

    // ? : 可为 null 的变量
    println(sum(null, 1))
    println(sum(2, 1))

    // check type
    if (checkType("") != null) {
        println(1)
    } else {
        println(0)
    }

    // 函数默认值
    val c = add(0, 2)

    // 字符串
    println("a = $a,b=$b,c=$c,d=${add(1, 20)}")
}

// 参数a 可为 null
fun sum(a: Int?, b: Int): Int {
    if (a != null) {
        return a + b;
    }
    return b;
}

// 返回可为 null 的值
fun checkType(obj: Any): Int? {
    if (obj is String) {
        return 1
    }
    return null
}


// 函数默认值
fun add(a: Int = 1, b: Int): Int {
    return a + b;
}