package com.thoughtworks.bank.domain

import java.util.*

class BankAccount(var id: Int = Random().nextInt()) {

    private var customerAddress: String = ""

    fun customerAddress(newAdd : String) {
        customerAddress = newAdd
    }

    fun customerAddress() = customerAddress
}