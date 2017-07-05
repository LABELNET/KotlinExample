package cn.labelnet.kotlin.kotlinandroid

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var value = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /**
     * + 1
     */
    fun onAddOne(view: View) {
        value++
        setTvValue()
    }

    /**
     * -1
     */
    fun onMinusOne(view: View) {
        value--
        setTvValue()
    }

    /**
     * upd value
     */
    fun setTvValue() {
        val tvValue = findViewById(R.id.tvValue) as TextView
        tvValue.text = getString(R.string.kotlin_value, value)
        if (value == 0) {
            Toast.makeText(this, getString(R.string.kotlin_value, value), Toast.LENGTH_LONG).show()
        }
    }
}
