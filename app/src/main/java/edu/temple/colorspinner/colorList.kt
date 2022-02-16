package edu.temple.colorspinner

class colorList {

    val defaultColor:ColorObj = basicColors()[0]

    fun colorPos(colorObj: ColorObj): Int{
        for(i in basicColors().indices){
            if(colorObj==basicColors()[i])
                return i
        }
        return 0
    }

    fun basicColors(): List<ColorObj>{
        return listOf(
            ColorObj("White", "FFFFFF"),
            ColorObj("Teal", "008080"),
            ColorObj("Blue", "0000FF"),
            ColorObj("Navy", "000080"),
            ColorObj("Lime", "00FF00"),
            ColorObj("Maroon", "800000"),
            ColorObj("Aqua", "00FFFF"),
            ColorObj("Yellow", "FFFF00"),
            ColorObj("Green", "008000"),
            ColorObj("Red", "FF0000"),
            ColorObj("Fuchsia", "FF00FF"),



        )
    }
}