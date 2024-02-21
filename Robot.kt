open class Robot(private val name:String, var run:Int = 0, var jump:Int = 0 ):RunJump {
    override val _name: String
        get() = name

}