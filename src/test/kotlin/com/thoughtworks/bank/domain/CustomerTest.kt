package com.thoughtworks.bank.domain

import io.kotlintest.shouldBe
import org.junit.Test


class CustomerTest {

    @Test
    fun `should update customer address and its respective bank acc add`() {
        val b1 = BankAccount();
        val b2 = BankAccount();

        val customer = Customer()
        customer.addBankAccount(b1)
        customer.addBankAccount(b2)

        customer.updateAddress("hey this is my new address")

        b1.customerAddress() shouldBe "hey this is my new address"
        b2.customerAddress() shouldBe "hey this is my new address"
    }
}