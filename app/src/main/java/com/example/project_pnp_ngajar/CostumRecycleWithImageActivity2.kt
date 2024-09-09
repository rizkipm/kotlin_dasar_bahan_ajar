package com.example.project_pnp_ngajar

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.project_pnp_ngajar.adapter.HeroAdapter
import com.example.project_pnp_ngajar.adapter.RecycleViewAdapter
import com.example.project_pnp_ngajar.model.Hero
import com.example.project_pnp_ngajar.model.MockList
import com.example.project_pnp_ngajar.model.ModelData

class CostumRecycleWithImageActivity2 : AppCompatActivity() {

    private lateinit var listView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_costum_recycle_with_image)


        // Inisialisasi ListView
        listView = findViewById(R.id.rv_buah)

        listView.layoutManager = GridLayoutManager(this, 1, GridLayoutManager.VERTICAL, false)

        val adapter =
            RecycleViewAdapter(MockList.getModel() as ArrayList<ModelData>)

        listView.adapter= adapter

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}