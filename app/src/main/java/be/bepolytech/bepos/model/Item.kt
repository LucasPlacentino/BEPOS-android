package be.bepolytech.bepos.model

data class Item (
    val id: String,
    var name: String? = null,
    var type: String? = null,
    var stockQuantity: Int = 0,
    var priceInCents: Int = 0,
) {
    companion object {

        const val ID = "id"
        const val NAME = "name"
        const val TYPE = "type"
        const val STOCK_QUANTITY = "stockQuantity"
        const val PRICE_IN_CENTS = "priceInCents"
    }
}