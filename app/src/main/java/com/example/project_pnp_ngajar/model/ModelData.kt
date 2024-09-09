package com.example.project_pnp_ngajar.model

import com.example.project_pnp_ngajar.R


data class ModelData(val image: Int, val description: String)


object MockList {

    fun getModel(): List<ModelData> {


        val itemModel1 = ModelData(
            R.drawable.apple,
            "Lord Of The Rings",
        )

        val itemModel2 = ModelData(
            R.drawable.orange,
            "Harry Potter",
        )


        val itemModel3 = ModelData(
            R.drawable.grapes,
            "Interstellar",
        )


        val itemModel4 = ModelData(
            R.drawable.pear,
            "Squid Game",
        )


        val itemModel5 = ModelData(
            R.drawable.grapes,
            "How I Met Your Mother",
        )


        val itemModel6 = ModelData(
            R.drawable.apple,
            "Vikings",
        )

        val itemModel7 = ModelData(
            R.drawable.strawberry,
            "The Walking Dead",
        )

        val itemModel8 = ModelData(
            R.drawable.orange,
            "Spartacus",
        )
        val itemModel9 = ModelData(
            R.drawable.grapes,
            "Rick and Morty",
        )
        val itemModel10 = ModelData(
            R.drawable.pear,
            "Hababam Sınıfı",
        )


        val itemList: ArrayList<ModelData> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)
        itemList.add(itemModel5)
        itemList.add(itemModel6)
        itemList.add(itemModel7)
        itemList.add(itemModel8)
        itemList.add(itemModel9)
        itemList.add(itemModel10)



        return itemList
    }

}