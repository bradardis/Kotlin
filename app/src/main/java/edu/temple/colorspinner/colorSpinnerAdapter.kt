package edu.temple.colorspinner

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter

class colorSpinnerAdapter(context: Context, list: List<ColorObj>)
    : ArrayAdapter<ColorObj>(context, 0, list) {

private var layoutInflater = LayoutInflater.from(context)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view: View = layoutInflater.inflate(R.layout.spinner_bg, null, true)
        return view(view,position)
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
        var cv = convertView
        if(cv == null)
            cv = layoutInflater.inflate(R.layout.spinner_color, parent, false)
        return view(cv!!, position)
    }
    private fun view(view: View, position: Int): View{
        val colorObj: ColorObj = getItem(position) ?: return view

        

        colorHex?.background?.setTint(Color.parseColor(colorObj.Hex))
return view
    }

}

