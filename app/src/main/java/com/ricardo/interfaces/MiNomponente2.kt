package com.ricardo.interfaces

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout

class MiNomponente2 (context: Context, attrs: AttributeSet) : LinearLayout(context, attrs){

    init {
        inflate(context, R.layout.componente_dni, this)
    }
}