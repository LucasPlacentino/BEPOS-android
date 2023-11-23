package be.bepolytech.bepos

data class Item(
    val id: String,
    var name: String? = null,
    var type: String? = null,
    var stockQuantity: Int = 0,
    var price: Float = 0f
)

