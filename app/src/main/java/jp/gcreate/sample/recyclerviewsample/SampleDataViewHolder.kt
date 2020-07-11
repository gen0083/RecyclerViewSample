package jp.gcreate.sample.recyclerviewsample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_sample_data.view.*
import java.text.SimpleDateFormat
import java.util.*

class SampleDataViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
    private val titleText: TextView = view.title
    private val dateText: TextView = view.date
    private val descriptionText: TextView = view.description
    private val formatter = SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.JAPAN)
    
    fun bindData(data: SampleData) {
        titleText.text = data.title
        dateText.text = formatter.format(data.createdAt)
        descriptionText.text = data.description
        if (data.id % 2 == 0L) {
            view.setBackgroundResource(R.color.item_color_1)
        } else {
            view.setBackgroundResource(R.color.item_color_2)
        }
    }
    
    companion object {
        @JvmStatic
        fun create(parent: ViewGroup): SampleDataViewHolder {
            val inflater = LayoutInflater.from(parent.context)
            val view = inflater.inflate(R.layout.item_sample_data, parent, false)
            return SampleDataViewHolder(view)
        }
    }
}