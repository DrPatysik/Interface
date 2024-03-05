fun main(){

    var competitionMembers = mutableListOf<RunJump>(
    Cat("Barsik"),
    Cat("Murzik"),
    Cat("Murka"),
    Robot("A14"),
    Robot("B24"),
    Robot("A28"),
    Person("David"),
    Person("Maria"),
    Person("Oleg")
    )
    val a = RunTrack()
    val b = RunTrack()
    val c = RunTrack()
    val a1 = Wall()
    val b1 = Wall()
    val c1 = Wall()

    var barriers = mutableListOf<RunJump>(
        a, b, c, a1, b1, c1
    )

    for(m in competitionMembers ) {
        for (b in barriers) {
            m.runningOnTrack(b.length)
            m.jumping(b.height)
        }
    }
}