package cn.labelnet.demo.basic

import cn.labelnet.demo.students.Student
import cn.labelnet.demo.students.*
import cn.labelnet.demo.students.Teacher as Tea


fun main(args: Array<String>) {
    val s = Student("kotlin", 2)
    val t = Tea("Java", 20)
    t.speak()
    val p = Programer("LABELNET")
}
