package uz.gita.a4pics1word.data.local.preferences

import android.content.Context
import uz.gita.a4pics1word.app.App
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MySharedPreferences @Inject constructor() {
    private val preferences =
        App.instace.getSharedPreferences("my_preferences", Context.MODE_PRIVATE)

    var saveQuestionPosition: String
        get() = preferences.getString("POSITION", "")!!
        set(value) {
            preferences.edit().putString("POSITION", value).apply()
        }
}