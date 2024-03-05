public interface RunJump {
    val name1:String
    var length:Int
    var height:Int

    fun printInfoRun(){
        println("$name1 can run")
    }
    fun printInfoJump(){
        println("$name1 can jump")
    }
    fun runningOnTrack(n:Int):Boolean {
        var result:Boolean
        if(n <= length) {
            result = true
            println("$name1 ran length-${n} successfully!")
        }
        else {
            result = false
            println("$name1 didn't run length-${n} successfully!!") }
        return result
    }

    fun jumping(n:Int):Boolean {
        var result:Boolean
        if(n <= height) {
            result = true
            println("$name1 jumped height-$n successfully!")
        }
        else {
           result = false
            println("$name1 didn't jump height-$n successfully!!")
        }
        return result
    }

}
