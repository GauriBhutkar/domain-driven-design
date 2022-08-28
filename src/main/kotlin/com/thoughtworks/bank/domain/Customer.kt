package com.thoughtworks.bank.domain

class Customer {
    var bankAccount : List<BankAccount> = emptyList()
    var address : String = ""

    fun updateAddress(newAddress: String) {
        address = newAddress
        bankAccount.forEach {
            it.customerAddress(newAddress)
        }
    }

    fun addBankAccount(b: BankAccount) {
        bankAccount = bankAccount + b
    }
}