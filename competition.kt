fun main(){

    val competitionMembers = mutableListOf<RunJump>(
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
    val a1 = Wall()
    val b = RunTrack()
    val b1 = Wall()
    val c = RunTrack()
    val c1 = Wall()

    val barriers = mutableListOf<RunJump>(
        a, b, c, a1, b1, c1
    )

    for(m in competitionMembers ) {
        for (bar in barriers) {
           when(bar) {
               is RunTrack -> { if( !m.runningOnTrack(bar.length)) {break};
               }
                is Wall -> { if ( !m.jumping(bar.height)) {break};
                }
           }
        }
    }
}