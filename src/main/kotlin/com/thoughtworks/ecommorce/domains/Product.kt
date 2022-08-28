package com.thoughtworks.ecommorce.domains

import java.util.*


class Product(val name: String,
              val price: Price
) {

    companion object {
        fun new(name: String) : Product {
            val competitorPrice = competitorPrices[name]
            val newPrice = competitorPrice?.let { Price(it.value - it.value * 0.1) }
            return Product(name, newPrice!!)
        }
    }
}

class Item(val product: Product, val quantity: Int) {
    fun getItemPrice(): Double {
        return (this.product.price.value * quantity)
    }
}

class Price(
    val value: Double,
    val currency: Currency = Currency.getInstance(Locale("", "IN"))
)

