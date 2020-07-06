package model

class Oil(quantity: Int):Ingredient(quantity) {
    override fun toString(): String {
        return "\nOil: $quantity "
    }
}