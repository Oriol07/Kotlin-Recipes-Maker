package model

enum class FruitType {STRAWBERRY, BANANA, GRAPES, APPLE, ORANGE, PEAR, CHERRY, NONE}

class Fruits(quantity: Int, var type: FruitType):Ingredient(quantity) {
    override fun toString(): String {
        return "\n${type.name}: $quantity "
    }
}