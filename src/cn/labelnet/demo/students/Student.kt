package cn.labelnet.demo.students

// 学生
data class Student(override val name: String, val age: Int) : Person(name), PersonOperation {
    override fun run() {
        println("person : ${this.name} , age : ${this.age} to run !")
    }

    override fun work() {
        println("${this.name} to work")
    }
}

// 老师
data class Teacher(override val name: String, val teachAge: Int) : Person(name) {
    override fun speak() {
        super.speak()
        println("teacher age : ${this.teachAge}")
    }
}

// 程序员
data class Programer(override val name: String) : PersonDoIT(name) {
    override fun writeCode() {
        println("${this.name} do IT , now do coding !")
    }
}

// 父类 人
open class Person(open val name: String) {
    open fun speak() {
        println("person name : " + this.name)
    }
}

// 接口 动作
interface PersonOperation {
    fun work() {
        println("person is work")
    }

    fun run()
}

// 父类 IT 人事
abstract class PersonDoIT(open val name: String) {
    abstract fun writeCode()
}