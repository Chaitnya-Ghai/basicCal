package cg.tutorials.example.basiccal

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var ter :TextView?=null
    var plus :Button?= null
    var minus :Button?= null
    var multiply :Button?=null
    var divide :Button?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ter = findViewById(R.id.btn1)
        plus = findViewById(R.id.plus)
        minus = findViewById(R.id.minus)
        multiply= findViewById(R.id.multiply)
        divide = findViewById(R.id.divide)



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        plus?.setOnClickListener {
            ter?.text = "${ter?.text.toString().toInt() +2}"
        }
        minus?.setOnClickListener {
            ter?.text = "${ter?.text.toString().toInt()-2}"
        }
        multiply?.setOnClickListener {
            ter?.text = "${ter?.text.toString().toInt()*2}"
        }
        divide?.setOnClickListener {
            ter?.text = "${ter?.text.toString().toInt()/2}"
        }

    }
}