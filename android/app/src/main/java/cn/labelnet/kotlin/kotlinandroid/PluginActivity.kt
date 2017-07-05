package cn.labelnet.kotlin.kotlinandroid

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_plugin.*

/**
 * Created by yuan on 05/07/2017.
 *  kotlin 拓展 , 不使用 findViewById
 */
class PluginActivity : AppCompatActivity() {

    var value = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plugin)

    }

    fun randomClick(view: View) {
        value++
        tvRandom.text = "random >> ${value}"
    }

}