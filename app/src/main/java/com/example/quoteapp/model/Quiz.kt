package com.example.quoteapp.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Quiz(
    val hits: Int,
    val id: Int,
    val subject: String,
    val teacher_name: String,
    val teacher_slug: String,
    val title: String,
    val topic_name: String,
    val updated_at: String
) : Parcelable
