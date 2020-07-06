package model

class Meat(quantity: Int):Ingredient(quantity) {
    override fun toString(): String {
        return "\nMeat: $quantity "
    }
}