package com.example.finallab2

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import com.google.android.material.imageview.ShapeableImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomeActivity : AppCompatActivity() {
    lateinit var profilebtn: ImageView
    lateinit var picH11: ShapeableImageView // Added variable for ShapeableImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        profilebtn = findViewById(R.id.imageView17)
        picH11 = findViewById(R.id.pic_H11) // Initialize ShapeableImageView

        profilebtn.setOnClickListener {
            intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
            finish()
        }

        picH11.setOnClickListener {
            intent = Intent(this, DetailsActivity::class.java) // Navigate to DetailsActivity
            startActivity(intent)
        }
    }
}
