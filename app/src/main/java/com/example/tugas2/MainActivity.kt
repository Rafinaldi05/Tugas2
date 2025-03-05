package com.example.tugas2

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.ComponentActivity


class MainActivity : ComponentActivity() {
    private val photos = listOf(
        Pair(R.drawable.foto1, Pair("KIWI", "Kiwi adalah buah kecil berbentuk oval dengan kulit cokelat berbulu dan daging hijau atau kuning yang segar. Rasanya manis-asam dengan biji hitam kecil yang bisa dimakan. Kaya akan vitamin C dan serat.")),
        Pair(R.drawable.foto2, Pair("APEL", "Apel adalah buah yang renyah dengan rasa manis atau asam, tergantung jenisnya. Mengandung serat dan antioksidan yang baik untuk kesehatan.")),
        Pair(R.drawable.foto3, Pair("DURIAN", "Durian dikenal sebagai 'raja buah' dengan aroma yang khas dan tajam. Dagingnya lembut, manis, dan creamy.")),
        Pair(R.drawable.foto4, Pair("PISANG", "Pisang memiliki kulit kuning saat matang, dengan tekstur lembut dan rasa manis. Sumber energi yang baik karena kaya akan karbohidrat dan kalium.")),
        Pair(R.drawable.foto5, Pair("MANGGA", "Mangga adalah buah tropis berdaging lembut dengan rasa manis dan sedikit asam. Kaya akan vitamin A dan C.")),
        Pair(R.drawable.foto6, Pair("~~~", "~~~."))
    )

    private var currentIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout)

        val textView2 = findViewById<TextView>(R.id.textView2)
        val imageView = findViewById<ImageView>(R.id.imageView)
        val textView = findViewById<TextView>(R.id.textView)
        val prevButton = findViewById<Button>(R.id.prevButton)
        val nextButton = findViewById<Button>(R.id.nextButton)

        fun updatePhoto() {
            imageView.setImageResource(photos[currentIndex].first)
            textView2.text = photos[currentIndex].second.first
            textView.text = photos[currentIndex].second.second


        }
        updatePhoto()

        nextButton.setOnClickListener {
            if (currentIndex < photos.size - 1) {
                currentIndex++
                updatePhoto()
            }
        }

        prevButton.setOnClickListener {
            if (currentIndex > 0) {
                currentIndex--
                updatePhoto()
            }
        }
    }
}