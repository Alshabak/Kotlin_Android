package com.example.isalshabak.homework_customer_listview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.view.*

class My_list_Adapter(var mCtx:Context ,var resource:Int, var item:List<Persons>)
    :ArrayAdapter<Persons>(mCtx,resource,item) {


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val layoutinflater:LayoutInflater= LayoutInflater.from(mCtx)

        val view:View=layoutinflater.inflate(resource, null)

        val imageview:ImageView=view.findViewById(R.id.mperimage)
        var textview:TextView=view.findViewById(R.id.mfirstname)
        var textview2:TextView=view.findViewById(R.id.mlastname)

        var persons:Persons=item[position]

        imageview.setImageDrawable(mCtx.resources.getDrawable(persons.image))
        textview.text=persons.firstname
            textview2.text=persons.lastname

        return view



        return super.getView(position, convertView, parent)
    }


}