package com.example.stocksportfolioappkotlin.stocksPortfolio.service

import com.example.stocksportfolioappkotlin.stocksPortfolio.model.responseModels.PortfolioResponseModel
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface PortfolioCalls {

    @GET("/ca