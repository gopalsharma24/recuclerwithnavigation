package com.example.cardview

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class BlogPost(
    val label : String,
    val title : String,
    val timestamp : String,
    val des : String,
    val image : Int

): Parcelable
