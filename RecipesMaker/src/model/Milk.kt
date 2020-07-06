package model

class Milk(quantity: Int):Ingredient(quantity) {
    override fun toString(): String {
        return "\nMilk: $quantity "
    }
}