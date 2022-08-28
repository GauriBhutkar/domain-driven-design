package com.thoughtworks.ecommorce.domains

import io.kotlintest.shouldBe
import org.junit.Test

class TestCart {

    @Test
    fun `should add product in cart`() {
        val cart = Cart()

        cart.addItem(Item(Product("ipod", Price(1000.0)),1))
        cart.addItem(Item(Product("hero ink pen", Price(10.0)),1))

        cart.quantity() shouldBe 2
    }

    @Test
    fun `should add item with multiple quantity in cart`() {
        val cart = Cart()

        cart.addItem(Item(Product("GM cricket bat", Price(100.0)),2))
        cart.addItem(Item(Product("hero ink pen", Price(10.0)),1))

        cart.quantity() shouldBe 3
    }

    @Test
    fun `should remove item from cart`() {
        val cart = Cart()

        cart.addItem(Item(Product("hero ink pen", Price(100.0)),1))
        cart.removeItem("hero ink pen")

        cart.quantity() shouldBe 0
    }

    @Test
    fun `should return deleted items from cart`() {
        val cart = Cart()

        cart.addItem(Item(Product("hero ink pen", Price(10.0)),1))
        cart.addItem(Item(Product("GM cricket bat", Price(100.0)),2))
        cart.addItem(Item(Product("GM cricket ball", Price(100.0)),1))

        cart.removeItem("hero ink pen")
        cart.removeItem("GM cricket ball")

        cart.deletedItems().size shouldBe 2
    }

    @Test
    fun `should check equality of cart`() {
        val cart1 = Cart()
        val cart2 = Cart()

        val item1 = Item(Product("Ipad", Price(1000.0)), 1)
        val item2 =  Item(Product("Ipad", Price(1000.0)), 1)

        cart1.addItem(item1)
        cart2.addItem(item2)
        (cart1 == cart2) shouldBe false
    }

    @Test
    fun `should get price of product`() {
        //val currency = Currency.getInstance(Locale.);
    }

    @Test
    fun `should give price less than 10% of competitor`() {
        val cart = Cart()

        val product = Product.new("hero ink pen")
        cart.addItem(Item(product,1))

        cart.total() shouldBe 9.0
    }
}