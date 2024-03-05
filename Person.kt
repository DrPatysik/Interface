import kotlin.random.Random

open class Person(private val name:String ):RunJump {
    override val name1: String
        get() = name

    private var result1 = true
    override var result: Boolean
        get() = result1
        set(value) {}

    private var run:Int = Random.nextInt(1, 25)
    override var length: Int
        get() = run
        set(value) {}

    private var jump:Int = Random.nextInt(1, 5)
    override var height: Int
        get() = jump
        set(value) {}

    fun printInfo(){
        println("$name, run-$run, jump-$jump ")
    }
}