// Student id :- #A00255187
// Student Name :- Bhimani Dhavalkumar Zaverbhai
//JAV-1001 - 91337 - App Development for Android - 202209 - 001


class DieRolling {
    // use get set method for Name
    var Name : String private set
    // Get the Name String
    private var Numberofside : Int
    // get intiger for number of dice side


    // use get set method for Face of side
    var faceofside = 0  // get intiger for face of side

    constructor() {  // use the Constructors for DiceRolling
        Name = "d6" // dice name is d6
        Numberofside = 6
        rolling()
    }

    constructor(Numofside: Int) {
        this.Numberofside = Numofside
        Name = "d$Numberofside" // Name is define to d and Number of Diceside
        rolling()
    }

    constructor(Numberofside: Int, Faceofside: Int) {
        this.Numberofside = Numberofside
        Name = "d$Numberofside"
        faceofside = Faceofside
    }

    //A roll method to generate a random value
    fun rolling() {
        faceofside = (1 + Math.random() * Numberofside).toInt()
    }
    // use get set method for number of dice side
    fun getNumofside(): Int {
        return Numberofside
    }
    // use set for number of dice side for d6
    fun setNumofside(Numofside: Int) {
        this.Numberofside = Numofside
        Name = "d6"
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("Defualt DiceName :- D6") // DiceName is d6
            val d6 = DieRolling() // get object d6 for diceRolling
            println("Face of Dice :- " + d6.faceofside)
            println("Roll the d6...") // Roll the dice
            d6.rolling()
            println(
                """
                    After the roll:- ${d6.faceofside}

                    """.trimIndent()
            ) // get value after the roll d6
            println("Defualt DiceName :- D20") // dicename is d20
            val d20 = DieRolling(20) // get object d20 for DieRolling
            println("Face of Dice :- " + d20.faceofside)
            println("Roll the d20...") // Roll the dice
            d20.rolling()
            println(
                """
                    After the roll ${d20.faceofside}

                    """.trimIndent()
            ) // get value after the roll for d20
            println("Defualt DiceName :- D10") // dicename is d10
            val d10 = DieRolling(10) //get object d10 for DieRolling
            println("Face of Dice :-  " + d10.faceofside)
            println("Roll the d10") // Roll the dice
            d10.rolling()
            println(
                """
                    After the roll ${d10.faceofside}

                    """.trimIndent()
            ) //get value after the roll for d10
            val dice = arrayOfNulls<DieRolling>(5)
            for (i in dice.indices) dice[i] = DieRolling(6)
            var rolls = 0
            do {
                for (i in dice.indices) dice[i]!!.rolling() // loop run untill get 5
                rolls += 1
            } while (dice[0]!!.faceofside != dice[1]!!.faceofside || dice[0]!!.faceofside != dice[2]!!.faceofside || dice[0]!!.faceofside != dice[3]!!.faceofside || dice[0]!!.faceofside != dice[4]!!.faceofside)
            println("Bonus Found 5 :-$rolls") // get the total after roll untill get 5
        }
    }
}
