package uz.gita.a4pics1word.presennters.main

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import uz.gita.a4pics1word.domain.repository.AppRepository
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: AppRepository,
) : MainContract.ViewModel, ViewModel() {
    private var storage: LocalStorage = LocalStorage.getStorage()


}