package com.ricardo.interfaces.Componentes

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import com.google.android.material.textfield.TextInputLayout
import com.ricardo.interfaces.R

class ItemMainSpinner(context: Context?, attrs: AttributeSet?): LinearLayout(context, attrs) {

    private val iconImage: ImageView

    private val editText: TextInputLayout

    init {
        View.inflate(this.context, R.layout.item_imput_text_spinner,this)

        iconImage = findViewById(R.id.imageView7)
        editText = findViewById(R.id.inputNickName)

        attrs?.let {
            val typeArray = context!!.obtainStyledAttributes(it, R.styleable.ItemMainSpinner, 0, 0)

            // Recogo de app:
            val place = typeArray.getString(R.styleable.ItemMainSpinner_ims_editspin)
            val drawable = typeArray.getDrawable(R.styleable.ItemMainSpinner_ims_icon)

            // Asigno
            iconImage.setImageDrawable(drawable)
            editText.hint = place
            typeArray.recycle()
        }

    }
}