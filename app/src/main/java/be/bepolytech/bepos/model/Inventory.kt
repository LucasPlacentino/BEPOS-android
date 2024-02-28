package be.bepolytech.bepos.model

import be.bepolytech.bepos.model.Item
import java.util.Date

class Inventory {
    private var totalItemsQuantity: Int = 0
    private var totalItemsValueInCent: Int = 0
    var lastRestock: Date? = null //TODO

    fun getTotalItemsQuantity(): Int {
        return totalItemsQuantity
    }

    fun getTotalItemsValueInCent(): Int {
        return totalItemsValueInCent
    }

    fun add(item: Item, quantity: Int): Item {
        // TODO
        return item
    }

    fun remove(item: Item, quantity: Int): Item {
        // TODO
        return item
    }

    fun delete(item: Item): Boolean {
        // TODO
        return true
    }

    fun changePrice(item: Item, priceInCent: Int): Item {
        // TODO
        return item
    }

    fun changeName(item: Item, name: String): Item {
        // TODO
        return item
    }

    fun changeQuantity(item: Item, quantity: Int): Item {
        // TODO
        return item
    }

    fun changeCategory(item: Item, category: String): Item {
        // TODO
        return item
    }

    fun getAllItems(): List<Item>? {
        // TODO get from Firestore table
        return null
    }
}