fun main(){
    name()
    var z =ageName("Nadine",23)
    println(z)
    println()
    var y = lengthOfText()
    println(y)
    myName("Sangwa")

}
fun name(){
    var x = "akirachix"
    println(x[0].toString() + x[2]+ x[3])

}
fun ageName(b:String,c: Int):String {
    var name = ("Hi my name is $b, I am $c years old")
   return name
}
fun lengthOfText(): Int {
    var text ="reading"
    return text.length
}

fun myName(name:String){
    if (name=="Nadine")
        println("That's me")
   else
       println("I don't know who that is")

}


