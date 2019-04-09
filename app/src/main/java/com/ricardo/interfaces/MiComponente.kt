package com.ricardo.interfaces

import android.content.Context
import android.util.AttributeSet
import android.widget.RelativeLayout

class MiComponente(context: Context, attrs: AttributeSet) : RelativeLayout(context, attrs){

    init {
        inflate(context, R.layout.email_validator, this)
    }
}


