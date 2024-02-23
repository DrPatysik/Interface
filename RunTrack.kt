open class RunTrack(private var length:Int, private val name:String):RunJump  {
    constructor( length:Int ):this(length,name = "")
    override val _name: String
        get() = name

    fun runningOnTrack(n:Int,name:String) {
         if(n >= length) {
             println("$name ran length-${length} successfully!")
         }
             else { println("$name didn't run length-${length} successfully!!") }
    }
}