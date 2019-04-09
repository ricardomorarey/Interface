package com.ricardo.interfaces.Componentes

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import com.ricardo.interfaces.R

class ItemMain(context: Context?, attrs: AttributeSet?): LinearLayout(context, attrs) {

    private val icon: ImageView
    private val editText: EditText

    init {
        View.inflate(this.context, R.layout.item_input_text,this)

        icon = findViewById(R.id.imageView7)
        editText = findViewById(R.id.editText6)

        attrs?.let {
            val typeArray = context!!.obtainStyledAttributes(it,
                R.styleable.ItemMain, 0, 0)
            editText.hint = typeArray.getString(R.styleable.ItemMain_im_et)
        }

    }
}