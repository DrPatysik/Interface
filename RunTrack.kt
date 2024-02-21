open class RunTrack(var length:Int, val name:String):RunJump  {
    constructor( length:Int ):this(length,name = "")
    override val _name: String
        get() = name

    fun runningOnTrack(n:Int,name:String) {
         if(n >= length) {
             println("$name ran successfully!")
         }
             else { println("$name didn't run successfully!!") }
    }
}