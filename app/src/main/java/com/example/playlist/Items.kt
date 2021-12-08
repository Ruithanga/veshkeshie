package com.example.playlist

data class Items(
    var image: Int,
    var name: String,
    var desc: String
)


object Data{
    val dataList = listOf<Items>(
        Items(R.drawable.ss, "Turning page", "Katie Sky"),
        Items(R.drawable.ss, "my FAv", "music be my bestie"),
        Items(R.drawable.ss, "my FAv", "first fav i created"),
        Items(R.drawable.ss, "my FAv", "first fav i created"),
        Items(R.drawable.i, "my FAv", "nature heals"),
        Items(R.drawable.i, "my FAv", "first fav i created"),
        Items(R.drawable.ic_favorite, "my FAv", "first fav i created"),
        Items(R.drawable.ic_favorite, "my FAv", "first fav i created"),
        Items(R.drawable.s2, "my FAv", "enjoying the cool breeze"),
        Items(R.drawable.ic_favorite, "my FAv", "first fav i created"),
        Items(R.drawable.ic_favorite, "my FAv", "first fav i created"),
        Items(R.drawable.ic_favorite, "my FAv", "first fav i created"),
        Items(R.drawable.pic, "my FAv", "enjoying my own company"),
        Items(R.drawable.ic_favorite, "my FAv", "first fav i created"),
        Items(R.drawable.ic_favorite, "my FAv", "first fav i created"),
        Items(R.drawable.pp, "my FAv", "coding be my second name"),
        Items(R.drawable.ic_favorite, "my FAv", "first fav i created"),
        Items(R.drawable.ic_favorite, "my FAv", "first fav i created")
    )
}