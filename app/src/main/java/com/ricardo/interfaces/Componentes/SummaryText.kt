package com.ricardo.interfaces.Componentes

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.ricardo.interfaces.R

class SummaryText(context: Context?, attrs: AttributeSet?) : LinearLayout(context, attrs) {

    private val image: ImageView
    private val title: TextView
    private val summary: TextView

    init {
        View.inflate(this.context, R.layout.item_chica, this)
        image = findViewById(R.id.ic_chica)
        title = findViewById(R.id.textView2)
        summary = findViewById(R.id.tv_decription)

        attrs?.let {
            val typeArray = context!!.obtainStyledAttributes(it, R.styleable.SummaryText, 0, 0)

            // Recogo de app:
            val place1 = typeArray.getString(R.styleable.SummaryText_st_title)
            val place2 = typeArray.getString(R.styleable.SummaryText_st_summary)
            val drawable = typeArray.getDrawable(R.styleable.SummaryText_st_image)

            // Asigno
            image.setImageDrawable(drawable)
            title.hint = place1
            summary.hint = place2
            typeArray.recycle()

        }


    }

}