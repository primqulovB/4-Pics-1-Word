package uz.gita.a4pics1word.domain.repository.impl

import uz.gita.a4pics1word.data.local.preferences.MySharedPreferences
import uz.gita.a4pics1word.domain.repository.AppRepository
import uz.gita.a4pics1word.domain.repository.Repository
import javax.inject.Inject

class AppRepositoryImpl @Inject constructor(

) : AppRepository {
    private var storage: MySharedPreferences = MySharedPreferences()
}