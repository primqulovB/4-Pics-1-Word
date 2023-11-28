package uz.gita.a4pics1word.presennters.game

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import uz.gita.a4pics1word.data.model.QuestionData
import javax.inject.Inject

@HiltViewModel
class GameViewModel @Inject constructor() : GameContract.ViewModel, ViewModel() {
}