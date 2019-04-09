package com.ricardo.interfaces.Componentes

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout
import com.ricardo.interfaces.R

class MiNomponente2 (context: Context, attrs: AttributeSet) : LinearLayout(context, attrs){

    init {
        inflate(context, R.layout.componente_dni, this)
    }
}