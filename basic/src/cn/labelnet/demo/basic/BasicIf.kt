package cn.labelnet.demo.basic


val a = 11;
val b = 2;


fun main(args: Array<String>) {

    // 作为块使用，必须有 else , 最后一行是返回的值
    val max = if (a > b) {
        println("max is a $a")
        a
    } else {
        println("max is b $b")
        b
    }


    println("do finish : $max")


    when (a) {
        1 -> println("I'm a")
        10 -> println("I'm b")
        else -> println("ELSE")
    }

    when{
        a==1 -> println("I'm a")
        b==2 -> println("I'm b")
        else -> println("Fack")
    }
}