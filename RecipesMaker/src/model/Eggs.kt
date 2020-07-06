package model

class Eggs(quantity: Int):Ingredient(quantity) {
    override fun toString(): String {
        return "\nEggs: $quantity "
    }

}