package com.ssong_develop.lib

import android.content.Context
import kotlin.math.roundToInt

fun Context.dpToPixel(dp: Int): Int = (dp * resources.displayMetrics.density).roundToInt()
