package uz.gita.a4pics1word.presennters.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.viewModels
import dagger.hilt.android.AndroidEntryPoint
import uz.gita.a4pics1word.databinding.ActivityMainBinding
import uz.gita.a4pics1word.presennters.game.GameActivity

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel: MainContract.ViewModel by viewModels<MainViewModel>()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        binding.buttonPlay.setOnClickListener {
            startActivity(Intent(this, GameActivity::class.java))
        }

    }
}