package jp.gcreate.sample.recyclerviewsample

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter

class SampleListAdapter :
    ListAdapter<SampleData, SampleDataViewHolder>(object : DiffUtil.ItemCallback<SampleData>() {
        override fun areItemsTheSame(oldItem: SampleData, newItem: SampleData): Boolean {
            return oldItem.id == newItem.id
        }
        
        override fun areContentsTheSame(oldItem: SampleData, newItem: SampleData): Boolean {
            return oldItem == newItem
        }
    }) {
    
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SampleDataViewHolder {
        return SampleDataViewHolder.create(parent)
    }
    
    override fun onBindViewHolder(holder: SampleDataViewHolder, position: Int) {
        val data = getItem(position)
        holder.bindData(data)
    }
}