
package com.example.stocksportfolioappkotlin.stocksPortfolio.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.Group
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.example.stocksportfolioappkotlin.R
import com.example.stocksportfolioappkotlin.stocksPortfolio.model.responseModels.Stock
import java.text.DecimalFormat


class PortfolioListAdapter(private val stocks: List<Stock?>?): RecyclerView.Adapter<PortfolioListAdapter.PortfolioViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PortfolioViewHolder {
            val v: View = LayoutInflater.from(parent.context).inflate(R.layout.list_layout, parent, false)
            return PortfolioViewHolder(v)
        }

        override fun onBindViewHolder(holder: PortfolioViewHolder, position: Int) {
            val f = DecimalFormat("##.00")

            holder.ticker.text = stocks?.get(position)?.ticker
            holder.name.text = stocks?.get(position)?.name
            holder.currency.text = stocks?.get(position)?.currency
            holder.current_price_cents.text = "${
                (stocks?.get(position)?.current_price_cents?.toFloat())?.div(506.34235225795123)
                    ?.let { f.format(it).toString() }
            }"
            holder.quantity.text = "Stocks owned: ${stocks?.get(position)?.quantity?.let { it.toString()}?: kotlin.run { "0" }}"
            holder.current_price_timestamp.text ="TIme: ${stocks?.get(position)?.current_price_timestamp.toString()}"