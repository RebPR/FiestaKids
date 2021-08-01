package com.example.stocksportfolioappkotlin.stocksPortfolio.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.stocksportfolioappkotlin.FragmentBase
import com.example.stocksportfolioappkotlin.databinding.FragmentStocksPortfolioFullListBinding
import com.example.stocksportfolioappkotlin.stocksPortfolio.model.responseModels.Stock
import com.example.stocksportfolioappkotlin.stocksPortfolio.viewmodel.PortfolioViewModel


class StocksPortfolioFullListFragment : FragmentBase() {
    private lateinit var binding: FragmentStocksPortfolioFullListBinding
    private val portfolioViewModel: PortfolioViewModel by viewModels()

    override fun onCreateV