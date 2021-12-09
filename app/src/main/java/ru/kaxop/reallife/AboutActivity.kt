package ru.kaxop.reallife

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class AboutActivity : AppCompatActivity() {

    lateinit var name_holder: TextView
    lateinit var agree: Button
    lateinit var name_thanks: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        name_holder = findViewById(R.id.name_holder)
        agree = findViewById(R.id.agree)
        name_thanks = findViewById(R.id.name_thanks)

    }

    fun saveToNameHolder(view: View) {
        name_thanks.text = name_holder.text
    }

    override fun onSaveInstanceState(outState: Bundle) {

        outState.run {
            putString("KEY", name_thanks.text.toString())
        }

        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        name_thanks.text = savedInstanceState.getString("KEY")
    }



}