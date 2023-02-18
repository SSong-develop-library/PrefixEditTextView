package com.ssong_develop.lib

import android.content.Context
import android.graphics.Canvas
import android.graphics.ColorFilter
import android.graphics.Paint
import android.graphics.PixelFormat
import android.graphics.drawable.Drawable

class PrefixTextDrawable(
    private val context: Context,
    private val paint: Paint
) : Drawable() {

    var lineBounds: Int by OnChangeProperty(0) {

    }

    var prefixText: String by OnChangeProperty("") {
        setBounds(context.dpToPixel(4), 0, intrinsicWidth + context.dpToPixel(8), intrinsicHeight)
        invalidateSelf()
    }

    override fun draw(canvas: Canvas) {
        canvas.drawText(prefixText, 0f, (lineBounds + canvas.clipBounds.top).toFloat(), paint)
    }

    override fun setAlpha(alpha: Int) {
        /** not - implemented **/
    }

    override fun setColorFilter(colorFilter: ColorFilter?) {
        /** not - implemented **/
    }

    @Deprecated("Deprecated in Java")
    override fun getOpacity(): Int {
        return PixelFormat.OPAQUE
    }

    override fun getIntrinsicWidth(): Int {
        return paint.measureText(prefixText).toInt()
    }

    override fun getIntrinsicHeight(): Int {
        return paint.textSize.toInt()
    }
}