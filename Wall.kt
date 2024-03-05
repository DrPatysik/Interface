import kotlin.random.Random

open class Wall ():RunJump  {
    private val name:String = ""
    override val name1: String
        get() = name

    private var height1:Int = Random.nextInt(1, 7)
    override var height: Int
        get() = height1
        set(value) {}

    private var length1 = 0
    override var length: Int
        get() = length1
        set(value) {}


    private var result1:Boolean = true
    override var result: Boolean
        get() = result1
        set(value) {}

}