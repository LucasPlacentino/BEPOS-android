package be.bepolytech.bepos

import java.util.Date

data class Restock (
    var date: Date,
    var item: Item,
    var quantity: Int,
)