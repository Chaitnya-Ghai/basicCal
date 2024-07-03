package cg.tutorials.example.basiccal

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import cg.tutorials.example.basiccal.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
//    var ter :TextView?=null
//    var plus :Button?= null
//    var minus :Button?= null
//    var multiply :Button?=null
//    var divide :Button?= null
    lateinit var binding :ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        ter = findViewById(R.id.btn1)
//        plus = findViewById(R.id.plus)
//        minus = findViewById(R.id.minus)
//        multiply= findViewById(R.id.multiply)
//        divide = findViewById(R.id.divide)



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.plus.setOnClickListener {
//            binding.btn1.text = "${binding.btn1.text.toString().toInt() +2}"
            binding.btn1.setText((binding.btn1.text.toString().toInt() +2).toString())
        }
        binding.minus.setOnClickListener {
           binding.btn1.text = "${binding.btn1.text.toString().toInt()-2}"
        }
        binding.multiply.setOnClickListener {
            binding.btn1.text = "${binding.btn1.text.toString().toInt()*2}"
        }
        binding.divide.setOnClickListener {
            binding.btn1.text = "${binding.btn1.text.toString().toInt()/2}"
        }

    }
}