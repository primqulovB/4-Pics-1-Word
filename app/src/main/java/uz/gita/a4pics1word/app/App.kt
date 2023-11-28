package uz.gita.a4pics1word.app

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App : Application() {
    override fun onCreate() {
        super.onCreate()
        instace = this
    }

    companion object {
        lateinit var instace: App
            private set
    }
}