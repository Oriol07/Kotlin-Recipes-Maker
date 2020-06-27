import java.util.concurrent.TimeUnit

enum class Ingredients {WATER, MILK, MEAT, VEGETABLES, FRUITS, CEREAL, EGGS, OIL};


fun main()
{
    val welcomeText: String = ".: Welcome to Recipe Maker :."
    val menuQuestions: String = """
            Select the desired option
            1. Make a recipe
            2. See my recipes
            3. Exit
        """.trimIndent()

    //game loop
    do{
        print("\u001b[H\u001b[2J") //clear
        println(welcomeText)
        println("\n\n\n $menuQuestions")



        //INPUT
        val input = Integer.valueOf(readLine());

        //UPDATE
        when(input)
        {
            1 ->
            {
                //number one selected
                println("Making a recipe...")
                TimeUnit.SECONDS.sleep(1L);
            }
            2 ->
            {   // number two selected
                println("Looking the recipes...")
                TimeUnit.SECONDS.sleep(1L);

            }
        }

    }while(input != 3)

    println("Exit...")
    TimeUnit.SECONDS.sleep(1L);

}