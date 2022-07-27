package sourabh.pal.findfalcone.common.utils

import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.databinding.BindingAdapter
import sourabh.pal.findfalcone.R

@BindingAdapter("adapter")
fun AutoCompleteTextView.setAdapter(items: List<String>) {
    val adapter = ArrayAdapter(context, R.layout.dropdown_item, items)
    setAdapter(adapter)
}