
package com.example.stocksportfolioappkotlin

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.example.stocksportfolioappkotlin.Constants.Companion.FRAGMENT_TO_OPEN
import com.example.stocksportfolioappkotlin.stocksPortfolio.ui.StocksPortfolioListActivity

open class BaseActivity : AppCompatActivity() {
    var context: Context? = null
    var activity: Activity? = null

    fun openActivity(fragmentToOpen: String) {
        val intent = Intent(this.context, StocksPortfolioListActivity::class.java)
        intent.putExtra(FRAGMENT_TO_OPEN, fragmentToOpen)
        this.context?.startActivity(intent)
    }

    fun loadFragment(
        fragment: Fragment,
        fragmentPlaceHolder: Int,
        animate: Boolean = true,
        replace: Boolean = true,
        backStack: Boolean = false
    ) {