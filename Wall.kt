open class Wall (private var height:Int, private val name:String):RunJump  {
    constructor(height:Int ):this(height,name = "")
    override val _name: String
        get() = name

    fun jumping(n:Int,name: String) {
        if(n >= height) {
            println("$name jumped height-$height successfully!")
        }
        else { println("$name didn't jump height-$height successfully!!") }
    }
}