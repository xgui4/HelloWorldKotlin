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
           (__)                      
           (oo)                                                     \                 (\_/) (\___/) 
    /-------\/      __        O             \O/          (\___/)     \ /\     ()_()   (^_^) (='.'=)    _[ ]_       
   / |     ||      /o)\      /|\             |           (='.'=)     ( )     (='.'=)  (>${'$'}<) ( U U )   \('o')/      
  *  ||----||      \(o/      / \            / \          (")_(")   .( o ).   (")_(")  (/ \) (")_(")    ( : )       
     ~~    ~~                                    
    """)
}
