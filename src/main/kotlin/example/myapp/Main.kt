package example.myapp

fun buildAquarium(){
    val aquarium6 = Aquarium(numberofFish =  29)
    aquarium6.printSize()
    aquarium6.volume = 70
    aquarium6.printSize()
    //println("Volume: ${aquarium6.width * aquarium6.length * aquarium6.height /1000} liters")
}

fun main(){
    buildAquarium()
}