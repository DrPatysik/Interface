fun main(){

    var competitionMembers = mutableListOf<RunJump>(
    Cat("Barsik",9,5),
    Cat("Murzik",4,6),
    Cat("Murka",2),
    Robot("A14",15,1),
    Robot("B24",21),
    Robot("A28",3,4),
    Person("David",16,7),
    Person("Maria",12,4),
    Person("Oleg",17,7)
    )

    var barriers = mutableListOf<RunJump>(
        RunTrack(4),
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
                if  ( b is RunTrack ) {
                    when(m) {
                        is Cat -> b.runningOnTrack(m.run, m._name)
                        is Robot -> b.runningOnTrack(m.run, m._name)
                        is Person -> b.runningOnTrack(m.run, m._name)

                    }
                }
                    if  ( b is Wall ) {
                        when(m){
                            is Cat -> b.jumping(m.jump,m._name)
                            is Robot -> b.jumping(m.jump,m._name)
                            is Person -> b.jumping(m.jump,m._name)
                        }
                    }
            }
        }
}