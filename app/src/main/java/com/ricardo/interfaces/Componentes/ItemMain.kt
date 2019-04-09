package com.ricardo.interfaces.Componentes

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import com.google.android.material.textfield.TextInputLayout
import com.ricardo.interfaces.R
import kotlinx.android.synthetic.main.item_input_text.view.*

class ItemMain(context: Context?, attrs: AttributeSet?): LinearLayout(context, attrs) {

    private val iconc: ImageView
    private val editText: TextInputLayout

    init {
        View.inflate(this.context, R.layout.item_input_text,this)

        iconc = findViewById(R.id.iv_item)
        editText = findViewById(R.id.editText6)

        attrs?.let {
            val typeArray = context!!.obtainStyledAttributes(it,
                R.styleable.ItemMain, 0, 0)
            editText.hint = typeArray.getString(R.styleable.ItemMain_im_et)
            val i = typeArray.getDrawable(R.styleable.ItemMain_im_image)
            iconc.setImageDrawable(i)
        }

    }
}