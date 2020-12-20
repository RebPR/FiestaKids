
package com.example.stocksportfolioappkotlin.stocksPortfolio.service

import android.app.AlertDialog
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.stocksportfolioappkotlin.stocksPortfolio.model.responseModels.PortfolioResponseModel
import com.example.stocksportfolioappkotlin.stocksPortfolio.model.responseModels.Stock
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

interface PortfolioRepoInterface {
    fun getPortfolioStocksFullList(): MutableLiveData<PortfolioResponseModel?>
    fun getPortfolioStocksMalformedList(): MutableLiveData<PortfolioResponseModel?>
    fun getPortfolioStocksEmptyList(): MutableLiveData<PortfolioResponseModel?>
}

class PortfolioRepoService: PortfolioRepoInterface {
    val TAG: String = this::class.java.simpleName
    private val portfolioCalls = PortfolioCalls.create()

    var portfolioListResourceHolder: MutableLiveData<PortfolioResponseModel?> = MutableLiveData()