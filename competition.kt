fun main(){

    var competitionMembers = mutableListOf<RunJump>(
    Cat("Barsik",2,5),
    Cat("Murzik",4,6),
    Cat("Murka",2),
    Robot("A14",15,1),
    Robot("B24",21),
    Robot("A28",15,4),
    Person("David",16,7),
    Person("Maria",12,4),
    Person("Oleg",17,7)
    )

    var barriers = mutableListOf<RunJump>(
        RunTrack(7),
        Wall(4),
        RunTrack(1),
        Wall(6),
        RunTrack(8),
        Wall(5),
        RunTrack(14),
        RunTrack(15),
        Wall(8)
    )


        for(m in competitionMembers ) {
            for (b in barriers) {
                if (m is Cat   && b is RunTrack ){
                    b.runningOnTrack(m.run,m._name)

                }

            }
        }


}