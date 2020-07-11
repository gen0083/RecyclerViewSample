package jp.gcreate.sample.recyclerviewsample

import java.util.*

data class SampleData(
    val id: Long,
    val title: String,
    val description: String,
    val createdAt: Date = Date()
)