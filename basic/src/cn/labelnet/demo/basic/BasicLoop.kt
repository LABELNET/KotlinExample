package cn.labelnet.demo.basic

fun main(args: Array<String>) {


    yuan@ for (i in 1..100) {
        if (i % 2 == 0) {
            print(" -  $i")
            break@yuan
        }
    }

}

fun foo() {

    val ints = 1..100;

    val num = ints.forEach{
        if (it == 0) {

        }
    }
    return num
}