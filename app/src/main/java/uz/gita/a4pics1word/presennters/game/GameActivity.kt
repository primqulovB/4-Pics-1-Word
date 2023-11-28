package uz.gita.a4pics1word.presennters.game

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.activity.viewModels
import com.google.android.material.imageview.ShapeableImageView
import uz.gita.a4pics1word.R

class GameActivity : AppCompatActivity() {

    private val questionImages = ArrayList<ShapeableImageView>()
    private val answers = ArrayList<TextView>()
    private val variants = ArrayList<TextView>()


    private val viewModel: GameContract.ViewModel by viewModels<GameViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)


    }
}