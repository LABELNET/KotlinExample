package cn.labelnet.demo.students

fun main(args: Array<String>) {
    val s1 = Student("lang", 100)
    val s2 = Student("java", 120)

    val t1 = Teacher("kotlin", 1)
    val t2 = Teacher("kotlin1", 2)

    t1.speak()

    s1.run()
    s1.work()
    s1.speak()

    val p1 = Programer("python")
    p1.writeCode()
}