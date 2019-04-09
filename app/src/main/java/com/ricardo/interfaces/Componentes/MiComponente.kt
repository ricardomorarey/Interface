package com.ricardo.interfaces.Componentes

import android.content.Context
import android.util.AttributeSet
import android.widget.RelativeLayout
import com.ricardo.interfaces.R

class MiComponente(context: Context, attrs: AttributeSet) : RelativeLayout(context, attrs){

    init {
        inflate(context, R.layout.email_validator, this)
    }
}


