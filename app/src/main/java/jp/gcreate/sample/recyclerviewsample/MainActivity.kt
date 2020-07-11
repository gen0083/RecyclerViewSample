package jp.gcreate.sample.recyclerviewsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    
        // 適当にデータを生成
        val list = (0..50).map { i ->
            SampleData(
                id = i.toLong(),
                title = "title No.$i",
                description = "description for title $i"
            )
        }
    
        val adapter = SampleListAdapter()
    
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.adapter = adapter
    
        // adapterに表示するリストをセット
        adapter.submitList(list)
    }
}