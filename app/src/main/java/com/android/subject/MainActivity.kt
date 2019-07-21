package com.android.subject

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    var inc = 0

    @SuppressLint("CheckResult")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        MainApplication.SINGLTON.subject.subscribe({ t -> text.text = t.toString() },
            { t ->
                showToast(
                    t
                )
            })

        button.setOnClickListener { v -> MainApplication.SINGLTON.subject.onNext(inc++) }

        button2.setOnClickListener { v -> startActivity(Intent(this, Main2Activity::class.java)) }

    }

    private fun showToast(t: Throwable) {
        Toast.makeText(this, t.message, Toast.LENGTH_LONG).show()
    }

}
