import kotlin.random.Random

open class RunTrack():RunJump  {
    private val name = ""
    override val name1: String
        get() = name

    private var height1 = 0
    override var height: Int
        get() = height1
        set(value) {}

    private var length1 = Random.nextInt(1, 30)
    override var length: Int
        get() = this.length1
        set(value){}

    private var result1 = true
    override var result: Boolean
        get() = result1
        set(value) {}


}