package be.bepolytech.bepos

import java.util.Date //! What Date class to use ? or just a String ?

class PointOfSaleSystem {
    private val inventory: Inventory = Inventory()
    private val transactions: TransactionsList = TransactionsList()
    private val restocksList: RestocksList = RestocksList()

    fun getInventory(): Inventory {
        return inventory
    }

    fun getTransactions(): TransactionsList {
        return transactions
    }

    fun newItem(id: String, name: String?, type: String?, quantity: Int = 0, price: Float) {
        val item = Item(id, name, type, quantity, price)
        inventory.add(item, quantity)
    }

    fun sellItem(date: Date, item: Item, quantity: Int) {
        val transaction = Transaction(date, item, quantity)
        transactions.add(transaction)
        inventory.remove(item, quantity)
    }

    fun deleteTransaction(transaction: Transaction) {
        transactions.remove(transaction)
    }

    fun restockItem(date: Date, item: Item, quantity: Int) {
        val restock = Restock(date, item, quantity)
        restocksList.add(restock)
        inventory.add(item, quantity)
    }

    fun deleteRestock(restock: Restock) {
        restocksList.remove(restock)
    }

    fun editRestock(restock: Restock) {
        restocksList.edit(restock)
    }

    fun changeItemPrice(item: Item, price: Float) {
        inventory.changePrice(item, price)
    }

    fun changeItemName(item: Item, name: String) {
        inventory.changeName(item, name)
    }

    fun changeItemQuantity(item: Item, quantity: Int) {
        inventory.changeQuantity(item, quantity)
    }

    fun changeItemCategory(item: Item, category: String) {
        inventory.changeCategory(item, category)
    }

}