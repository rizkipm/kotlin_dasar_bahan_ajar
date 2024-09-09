package com.example.project_pnp_ngajar.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.project_pnp_ngajar.R
import com.example.project_pnp_ngajar.model.Hero

class HeroAdapter(private val heroes: List<Hero>) : RecyclerView.Adapter<HeroAdapter.HeroHolder>() {



    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): HeroHolder {
        return HeroHolder(LayoutInflater.from(viewGroup.context).inflate(R.layout.item_recycle_images, viewGroup, false))
    }

    override fun getItemCount(): Int = heroes.size

    override fun onBindViewHolder(holder: HeroHolder, position: Int) {
        holder.bindHero(heroes[position])
    }

    inner class HeroHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val txtNama : TextView = view.findViewById(R.id.nama)
        private val imgGambar : ImageView = view.findViewById(R.id.gambar)

        fun bindHero(hero: Hero) {
            itemView.apply {

                txtNama.text = hero.name
//                imgGambar.setImageDrawable(R.drawable.apple[0])


//                .text = hero.name
//                Picasso.get().load(hero.image).into(imgHeroes)

//                setOnClickListener {
//                    adapterOnClick(hero)
//                }
            }
        }
    }
}