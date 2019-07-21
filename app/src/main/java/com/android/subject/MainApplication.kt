package com.android.subject

import android.app.Application
import io.reactivex.subjects.PublishSubject

class MainApplication : Application(){
     object SINGLTON {
         var subject: PublishSubject<Int> = PublishSubject.create() // change with BehaviorSubject to see the difference ;)
     }

}
