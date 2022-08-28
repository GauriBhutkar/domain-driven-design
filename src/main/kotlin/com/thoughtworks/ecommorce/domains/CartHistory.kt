package com.thoughtworks.ecommorce.domains

class CartHistory : ArrayList<Item>() {
    fun addDeletedItems(item: Item) {
        this.add(item)
    }
}