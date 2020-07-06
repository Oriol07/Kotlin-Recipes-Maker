package model

enum class CerealType {OATS, WHEAT, RICE, CORN}

class Cereal(quantity: Int, var type: CerealType):Ingredient(quantity) {

    override fun toString(): String {
        return "\n${type.name}: $quantity "
    }
}