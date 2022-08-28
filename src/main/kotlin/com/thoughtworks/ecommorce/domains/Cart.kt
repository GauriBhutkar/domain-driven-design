package com.thoughtworks.ecommorce.domains

import java.util.*

class Cart {

    private val id = Random().nextInt()
    private var items : List<Item> = emptyList()
    private var isCheckedOut : Boolean = false
    private val cartHistory = CartHistory()

    fun addItem(item: Item) {
        items = items + item
    }

    fun items() = items

    fun quantity() = items.fold(0) { init, item -> item.quantity + init}

    fun removeItem(name: String) {
        val removableItem = items.find { item -> item.product.name == name }
        removableItem?.let {
            items = items - removableItem
            cartHistory.addDeletedItems(removableItem)
        }
    }

    fun deletedItems(): List<Item> = cartHistory

    fun checkOut() {
        isCheckedOut = true
        val t  = items.map { item -> item.product }.toList()
        // raise event t
    }

    fun total(): Double {
        return items.fold(0.0) { init, item -> item.getItemPrice() + init }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Cart

        if (id != other.id) return false
        if (items != other.items) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id
        result = 31 * result + items.hashCode()
        return result
    }
}

