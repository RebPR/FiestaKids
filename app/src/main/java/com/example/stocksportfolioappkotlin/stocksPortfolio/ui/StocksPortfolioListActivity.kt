package com.example.stocksportfolioappkotlin.stocksPortfolio.ui

import android.os.Bundle
import com.example.stocksportfolioappkotlin.BaseActivity
import com.example.stocksportfolioappkotlin.Constants
import com.example.stocksportfolioappkotlin.Constants.Companion.STOCKS_EMPTY_LIST
import com.example.stocksportfolioappkotlin.Constants.Companion.STOCKS_FULL_LIST
import com.example.stocksportfolioappkotlin.Constants.Companion.STOCKS_MALFORMED_LIST
import com.example.stocksportfolioappkotlin.databinding.ActivityStocksPortfolioListBinding

class StocksPortfolioListActivity : BaseActivity() {
    private lateinit var binding: ActivityStocksPortfolioListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStocksPortfolioListBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setupViews()
    }

    private fun setupViews() {
        context=this
        val extras= 