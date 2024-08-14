package com.example.quoteapp

import android.content.Context
import androidx.compose.runtime.mutableStateOf
import com.example.quoteapp.model.Quote
import com.google.gson.Gson

object DataManager {

    var data = emptyArray<Quote>()
    var currentPage = mutableStateOf(Pages.LISTING)
    var currentQuote: Quote? = null
    var isDataLoaded = mutableStateOf(false)

    fun loadAssetFromFile(context: Context) {
        val inputStream = context.assets.open("Quotes.json")
        val size = inputStream.available()
        val buffer = ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()
        val json = String(buffer, Charsets.UTF_8)
        val gson = Gson()
        data = gson.fromJson(json, Array<Quote>::class.java)
        isDataLoaded.value = true
    }

    fun switchPages(quote: Quote?) {
        if (currentPage.value == Pages.LISTING) {
            currentPage.value = Pages.DETAILS
            currentQuote = quote
        } else {
            currentPage.value = Pages.LISTING
        }
    }
}