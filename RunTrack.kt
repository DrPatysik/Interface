import kotlin.random.Random

open class RunTrack():RunJump  {
    private val name = ""
    override val name1: String
        get() = name

    private var height1 = 45
    override var height: Int
        get() = height1
        set(value) {}

    private var length1 = Random.nextInt(1, 25)
    override var length: Int
        get() = this.length1
        set(value){}
}