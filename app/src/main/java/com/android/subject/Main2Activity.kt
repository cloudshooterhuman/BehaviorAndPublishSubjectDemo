package com.android.subject

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import io.reactivex.functions.Consumer
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {



    @SuppressLint("CheckResult")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        MainApplication.SINGLTON.subject.subscribe({ t -> text2.text = t.toString() })
        //MainApplication.SINGLTON.subject.onNext(9)
    }
}
