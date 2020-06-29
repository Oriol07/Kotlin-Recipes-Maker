import java.util.concurrent.TimeUnit
import java.lang.NumberFormatException

enum class Ingredients {WATER, MILK, MEAT, VEGETABLES, FRUITS, CEREAL, EGGS, OIL};
enum class GameScene{GAME_MENU, MAKE_RECIPE, VIEW_RECIPES, EXIT}

fun main() {
    var scene: GameScene = GameScene.GAME_MENU
    val welcomeText: String = ".: Welcome to Recipe Maker :."
    val menuQuestions: String = """
            Select the desired option
            1. Make a recipe
            2. My recipes
            3. Exit
        """.trimIndent()
    var response: Int? = null
    val getInput = {
        try {
            readLine()!!.toInt()
        } catch (e: NumberFormatException) //If the user write a string for example we will have this exception
        {
            null
        }
    }

    //game loop
    do {
        when (scene) {

            //MENU
            GameScene.GAME_MENU -> {
                //DRAW GAME_MENU
                println("$welcomeText \n\n $menuQuestions")

                //INPUTS GAME_MENU
                response = getInput()
                when (response) {
                    1 -> {
                        //1. Make a receipt selected
                        scene = GameScene.MAKE_RECIPE
                    }
                    2 -> {   //2. View the receipts
                        scene = GameScene.VIEW_RECIPES
                    }
                    3 -> {
                        //3. Exit
                        scene = GameScene.EXIT
                    }
                }

            }

            //MAKE RECIPE
            GameScene.MAKE_RECIPE -> {

                //Draw MAKE_RECIPE
                makeRecipe()
                println("""
                    
            Select the desired option
            9. Return to the Main Menu
            10. Exit
        """.trimIndent())

                //INPUTS MAKE_RECIPE
                response = getInput()
                when (response) {
                    9 -> {
                        //9. Return to the Main Menu
                        scene = GameScene.GAME_MENU
                    }
                    10 -> {
                        //10. Exit
                        scene = GameScene.EXIT
                    }
                }
            }

            //VIEW_RECIPES
            GameScene.VIEW_RECIPES -> {
                //DRAW
                viewRecipe()
                println("""
                    
            Select the desired option
            1. Return to the Main Menu
            2. Exit
        """.trimIndent())

                //INPUTS MAKE_RECIPE
                response = getInput()
                when (response) {
                    1 -> {
                        //1. Return to the Main Menu
                        scene = GameScene.GAME_MENU
                    }
                    2 -> {
                        //2. Exit
                        scene = GameScene.EXIT
                    }
                }

            }
        }

    }while (scene.equals(GameScene.EXIT).not())

    println("Exit...")
    TimeUnit.SECONDS.sleep(1L);

}



fun makeRecipe()
{
    println("""
        Make a recipe
        Select by category the ingredient you are looking for
    """.trimIndent())
    for (ingredient in Ingredients.values())
    {
        println("${ingredient.ordinal + 1}. ${ingredient.name} ")
    }

}

fun viewRecipe()
{
    println("You are looking at the recipes...")
}