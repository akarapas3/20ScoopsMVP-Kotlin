package tweentyscoops.mvp.kotlin.extensions

import android.content.Context
import android.view.View
import android.widget.Toast

infix fun Int.dpToPx(context: Context): Int = this * context.resources.displayMetrics.density.toInt()

fun View.show() = { this.visibility = View.VISIBLE }

fun View.hide() = { this.visibility = View.GONE }

fun Context.toast(resourceId: Int) = toast(getString(resourceId))

fun Context.toast(message: CharSequence) = Toast.makeText(this, message, Toast.LENGTH_SHORT).show()