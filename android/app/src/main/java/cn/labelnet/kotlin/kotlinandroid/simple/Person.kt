package cn.labelnet.kotlin.kotlinandroid.simple

import android.util.Log

/**
 * Created by yuan on 05/07/2017.
 * 人
 */
class Person {
    var name = "kotlin"
    var age = 0

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    fun drink(water: Int) {
        Log.v("Drink", "${name} 喝水 ${water} 升 !")
    }
}