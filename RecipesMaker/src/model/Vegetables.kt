package model

class Vegetables(quantity: Int):Ingredient(quantity) {
    override fun toString(): String {
        return "\nVegetables: $quantity "
    }
}