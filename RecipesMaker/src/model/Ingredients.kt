package model

enum class IngredientType {WATER, MILK, MEAT, VEGETABLES, FRUITS, CEREAL, EGGS, OIL}

abstract class Ingredient(var quantity: Int) {


    override fun toString(): String {
        return "\nQuantity: $quantity "
    }


}