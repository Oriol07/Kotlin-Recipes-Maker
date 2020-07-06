package model

class Water(quantity: Int):Ingredient(quantity) {
    override fun toString(): String {
        return "\nWater: $quantity "
    }
}