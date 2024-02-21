open class Wall (var height:Int, val name:String):RunJump  {
    constructor(height:Int ):this(height,name = "")
    override val _name: String
        get() = name

    fun jumping(n:Int) {
        if(n >= height) {
            println("You jumped successfully!")
        }
        else { println("You didn't jump successfully!!") }
    }
}