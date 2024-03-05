import kotlin.random.Random

open class Robot(private val name:String ):RunJump {
    override val name1: String
        get() = name

    private var run:Int = Random.nextInt(1, 30)
    override var length: Int
        get() = run
        set(value) {}

    private var jump:Int = Random.nextInt(1, 3)
    override var height: Int
        get() = jump
        set(value) {}

    fun printInfo(){
        println("$name, run-$run, jump-$jump ")
    }
}