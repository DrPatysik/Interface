public interface RunJump {
    val name1:String
    var length:Int
    var height:Int
    var result:Boolean


    fun printInfoRun(){
        println("$name1 can run")
    }
    fun printInfoJump(){
        println("$name1 can jump")
    }
    fun runningOnTrack(n:Int) {
        if(n <= length) {
            result
            println("$name1 ran length-${n} successfully!")
        }
        else {
            result = false
            println("$name1 didn't run length-${n} successfully!!") }
    }

    fun jumping(n:Int) {
        if(n <= height) {
            result
            println("$name1 jumped height-$n successfully!")
        }
        else {
            result = false
            println("$name1 didn't jump height-$n successfully!!")
        }
    }

}
