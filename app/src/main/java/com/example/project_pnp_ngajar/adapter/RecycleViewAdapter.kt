package com.example.project_pnp_ngajar.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.project_pnp_ngajar.R
import com.example.project_pnp_ngajar.model.ModelData


class RecycleViewAdapter(val itemList: ArrayList<ModelData>) :
    RecyclerView.Adapter<RecycleViewAdapter.ModelViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecycleViewAdapter.ModelViewHolder {

        val v =
            LayoutInflater.from(parent.context).inflate(R.layout.item_recycle_images, parent, false)
        return ModelViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecycleViewAdapter.ModelViewHolder, position: Int) {

        holder.ItemImage.setImageResource(itemList[position].image)
        holder.ItemText.setText(itemList[position].description)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    inner class ModelViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        var ConstraintLayt: ConstraintLayout
        var ItemImage: ImageView
        var ItemText: TextView


        init {
//            ConstraintLayt =
//                itemView.findViewById(R.id.constraint_layout_recycler_view) as ConstraintLayout
            ItemImage = itemView.findViewById(R.id.gambar) as ImageView
            ItemText = itemView.findViewById(R.id.nama) as TextView


        }

    }


}
