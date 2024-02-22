import java.util.Random

fun main() {

    val likes: UInt = (Random().nextInt(999)).toUInt()

    val word: String = if (likes % 10U == 1U && likes % 100U != 11U) "Человеку" else "Людям"

    println("Понравилось $likes $word")
}
