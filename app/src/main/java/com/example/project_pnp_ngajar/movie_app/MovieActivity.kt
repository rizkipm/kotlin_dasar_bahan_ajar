package com.example.project_pnp_ngajar.movie_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.project_pnp_ngajar.R

class MovieActivity : AppCompatActivity() {

    private var recyclerView: RecyclerView? = null
    private var recyclerViewMovieAdapter: RecyclerViewMovieAdapter? = null
    private var movieList = mutableListOf<Movie>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_main)

        movieList = ArrayList()

        recyclerView = findViewById<View>(R.id.rvMovieLists) as RecyclerView
        recyclerViewMovieAdapter = RecyclerViewMovieAdapter(this@MovieActivity, movieList)
        val layoutManager: RecyclerView.LayoutManager = GridLayoutManager(this, 2)
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = recyclerViewMovieAdapter

        prepareMovieListData()

    }

    private fun prepareMovieListData() {
        var movie = Movie("Avatar", R.drawable.avatar)
        movieList.add(movie)
        movie = Movie("Batman", R.drawable.batman)
        movieList.add(movie)

        movie = Movie("End Game", R.drawable.end_game)
        movieList.add(movie)
        movie = Movie("Hulk", R.drawable.hulk)
        movieList.add(movie)
        movie = Movie("Inception", R.drawable.inception)
        movieList.add(movie)
        movie = Movie("Jumanji", R.drawable.jumanji)
        movieList.add(movie)
        movie = Movie("Lucy", R.drawable.lucy)
        movieList.add(movie)
        movie = Movie("Jurassic World", R.drawable.jurassic_world)
        movieList.add(movie)
        movie = Movie("Spider Man", R.drawable.spider_man)
        movieList.add(movie)
        movie = Movie("Venom", R.drawable.venom)
        movieList.add(movie)

        recyclerViewMovieAdapter!!.notifyDataSetChanged()

        //All Code is done let's run the app
    }
}