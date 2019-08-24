package com.example.hotspotwifi

class RcvModel {

    var title: String? = null
    var image: Int = 0

    fun getTitles(): String{
        return title.toString()
    }
    fun setTitles(title: String){
        this.title = title
    }

    fun getImages(): Int{
        return image
    }
    fun setImages(image : Int){
        this.image = image
    }
}