package com.example.isalshabak.homework_customer_listview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
  lateinit var  listview:ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listview=findViewById(R.id.listview)

var list= mutableListOf<Persons>()
list.add(Persons("ahmad","sami",R.drawable.first))
        list.add(Persons("Ali","Mohammad",R.drawable.second))
        list.add(Persons("Omar","Suliman",R.drawable.third))
        list.add(Persons("Sameer","Khaleed",R.drawable.fourth))
val adapter=My_list_Adapter(this,R.layout.my_list_item,list)
listview.adapter=adapter
    }
}
