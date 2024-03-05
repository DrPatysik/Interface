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

    var barriers = mutableListOf<RunJump>(
        RunTrack(),
        Wall(),
        RunTrack(),
        Wall(),
        RunTrack(),
        Wall(),
        RunTrack(),
        RunTrack(),
        Wall()
    )

    for(m in competitionMembers ) {
        for (b in barriers) {
            if (b is RunTrack)// это добавила в надежде,что что-то поменяется
            {

                m.runningOnTrack(b.length, m.name1) //выдает длину беговой дорожки и высоту стены одну и ту же у
                                                    //представителя класса
                m.jumping(b.height, m.name1)
            }
        }
    }
}
