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
    fun runningOnTrack(n:Int,name:String) {
        if(n >= length) {
            result
            println("$name ran length-${length} successfully!")
        }
        else {
            result = false
            println("$name didn't run length-${length} successfully!!") }
    }

    fun jumping(n:Int,name: String) {
        if(n >= height) {
            result
            println("$name jumped height-$height successfully!")
        }
        else {
            result = false
            println("$name didn't jump height-$height successfully!!")
        }
    }

}
