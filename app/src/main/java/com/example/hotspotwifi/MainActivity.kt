package com.example.hotspotwifi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Adapter
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var recyclerView: RecyclerView? = null
    private var recycleViewList: ArrayList<RcvModel>? = null
    private var adapter: RecyclerAdapter? = null
    private val myImageList = intArrayOf(
        R.drawable.abaac_first_img,
        R.drawable.abaac_first_img,
        R.drawable.abaac_first_img,
        R.drawable.abaac_first_img,
        R.drawable.abaac_first_img,
        R.drawable.abaac_first_img,
        R.drawable.abaac_first_img,
        R.drawable.abaac_first_img)
    private val myImageNameList = arrayOf("Benz", "Bike", "Car", "Carrera", "Ferrari", "Harly", "Lamborghini", "Silver")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initialize()
    }

    fun initialize(){
        recyclerView = findViewById(R.id.recyclerView) as RecyclerView

        recycleViewList = populateList()
        Log.d("RecycleView List: ", recycleViewList!!.size.toString() + "")
        adapter = RecyclerAdapter( recycleViewList!!)
        recyclerView!!.adapter = adapter
        recyclerView!!.layoutManager = LinearLayoutManager(applicationContext, LinearLayoutManager.VERTICAL, false)
    }

    private fun populateList(): ArrayList<RcvModel> {

        val list = ArrayList<RcvModel>()

        for (i in 0..7) {
            val rcvModel = RcvModel()
            rcvModel.setTitles(myImageNameList[i])
            rcvModel.setImages(myImageList[i])
            list.add(rcvModel)
        }

        return list
    }
}
