package be.bepolytech.bepos

import java.util.Date

data class Transaction (
    var date: Date,
    var item: Item,
    var quantity: Int,
)


