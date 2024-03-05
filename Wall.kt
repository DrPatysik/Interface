import kotlin.random.Random

open class Wall ():RunJump  {
    private val name:String = ""
    override val name1: String
        get() = name

    private var height1:Int = Random.nextInt(1, 5)
    override var height: Int
        get() = height1
        set(value) {}

    private var length1 = 45
    override var length: Int
        get() = length1
        set(value) {}
}