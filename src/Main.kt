fun main() {
    var name = userInput("Qui est tu?")
    greeting(name)
    displayAsciiArt()
    userInput("Pressez sur n'importe qu'elle touche pour fermer le programme")
}

fun userInput(msg: String): String {
    println(msg)
    var name = readln() ?: ""
    return name
}

fun greeting(name: String) {
    print("Salue ")
    print(name)
    print("!")
}

fun displayAsciiArt() {
    println("""
        ____________
   ___/ ___________\
  / ___/           _____
 / /              (____ \
| |  E V 1 L           \ \
| |      1 N 5 1 D E    ) )
 \ \__               __/ /           __
  \__ \_____________/ __/        ___/  \
     \_______________/       ___/       \_
                         ___/             \
                     ___/   __/            \
                 ___/   __  \__/\           \
             ___/    __/        _\      ___/|
        ____/    __     \      /    ___/ _  (
       /        \ /_     \      ___/ _   \\ |
       |\  __    \  /       ___/ _   \\  _H_/
       | \/  \    \/    ___/ _   \\  _H_/ Y
       |`|  _/      ___/ _   \\  _H_/ Y   !   MEPH.
        \|_|\   ___/ _   \\  _H_/ Y   !   !
        !  | \_/ _   \\  _H_/ Y   !   !
        !  \` |  \\  _H_/ Y   !   !
            \`|  _H_/ Y   !   !
             \|_/ Y   !   !
                  !   !
                  !

    """)
}
