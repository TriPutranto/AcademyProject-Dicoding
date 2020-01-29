package com.triputranto.academy.utils

import android.content.Context
import android.graphics.Canvas
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.Gravity.CENTER
import androidx.appcompat.widget.AppCompatButton
import androidx.core.content.ContextCompat
import com.triputranto.academy.R

/**
 * Created by Ahmad Tri Putranto on 30/01/2020.
 * */
class MyButton : AppCompatButton {

    private var enabledBackground: Drawable? = null
    private var disabledBackground: Drawable? = null
    private var textColour: Int = 0

    constructor(context: Context) : super(context) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        init()
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        background = if (isEnabled) enabledBackground else disabledBackground
        setTextColor(textColour)
        textSize = 12f
        gravity = CENTER
    }

    private fun init() {
        val resources = resources
        enabledBackground = resources.getDrawable(R.drawable.bg_button, resources.newTheme())
        disabledBackground =
            resources.getDrawable(R.drawable.bg_button_disable, resources.newTheme())
        textColour = ContextCompat.getColor(context, android.R.color.background_light)
    }
}