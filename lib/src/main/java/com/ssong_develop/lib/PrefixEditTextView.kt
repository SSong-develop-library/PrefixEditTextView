package com.ssong_develop.lib

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatEditText

class PrefixEditTextView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null
) : AppCompatEditText(context, attrs) {

    private val prefixTextDrawable: PrefixTextDrawable = PrefixTextDrawable(context, paint)

    private val lineBoundsRect = Rect()

    private var prefix: String = ""
        set(value) {
            field = value
            prefixTextDrawable.prefixText = value
            updatePrefixDrawable()
        }

    init {
        if (attrs != null) {
            getStyleableAttrs(attrs)
        }
        updatePrefixDrawable()
    }

    override fun onDraw(canvas: Canvas) {
        (0 until lineCount).forEach { line ->
            val lineBounds = getLineBounds(line, lineBoundsRect)
            prefixTextDrawable.lineBounds = lineBounds
            super.onDraw(canvas)
        }
    }

    private fun getStyleableAttrs(attrs: AttributeSet) {
        context.obtainStyledAttributes(attrs, R.styleable.PrefixEditTextView).use {
            prefix = it.getString(R.styleable.PrefixEditTextView_prefix) ?: ""
        }
    }

    private fun updatePrefixDrawable() {
        setCompoundDrawablesRelative(prefixTextDrawable, null, null, null)
    }
}