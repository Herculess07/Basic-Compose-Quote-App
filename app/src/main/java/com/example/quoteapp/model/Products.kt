package com.example.quoteapp.model
import android.os.Parcelable

import kotlinx.parcelize.Parcelize

@Parcelize
data class Products(
    val limit: Int,
    val products: List<Product>,
    val skip: Int,
    val total: Int
) : Parcelable {
    @Parcelize
    data class Product(
        val brand: String,
        val category: String,
        val description: String,
        val discountPercentage: Double,
        val id: Int,
        val images: List<String>,
        val price: Int,
        val rating: Double,
        val stock: Int,
        val thumbnail: String,
        val title: String
    ) : Parcelable
}