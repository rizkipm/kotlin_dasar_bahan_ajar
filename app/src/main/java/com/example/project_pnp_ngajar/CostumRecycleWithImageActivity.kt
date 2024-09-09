package com.example.project_pnp_ngajar

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.project_pnp_ngajar.adapter.HeroAdapter
import com.example.project_pnp_ngajar.model.Hero

class CostumRecycleWithImageActivity : AppCompatActivity() {

    private lateinit var listView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_costum_recycle_with_image)

        val listHeroes = listOf(
            Hero(name = "Spider-Man", image = "https://i.annihil.us/u/prod/marvel/i/mg/9/30/538cd33e15ab7/standard_xlarge.jpg"),
            Hero(name = "Black Panther", image = "https://i.annihil.us/u/prod/marvel/i/mg/1/c0/537ba2bfd6bab/standard_xlarge.jpg"),
            Hero(name = "Iron Man", image = "https://i.annihil.us/u/prod/marvel/i/mg/6/a0/55b6a25e654e6/standard_xlarge.jpg")
        )
        // Inisialisasi ListView
        listView = findViewById(R.id.rv_buah)

        val heroesAdapter = HeroAdapter(listHeroes)

        listView.apply {
            layoutManager = LinearLayoutManager(this@CostumRecycleWithImageActivity)
            adapter = heroesAdapter
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}