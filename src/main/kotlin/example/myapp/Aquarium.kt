package example.myapp

class Aquarium(length: Int = 100, width: Int = 20, height: Int = 40) {
    init {
        println("aquarium initializing")
    }
    init {
        println("Volume: ${width * length * height / 1000} liters")
    }
    var length: Int = length
    var width: Int = width
    var height: Int = height
    fun  printSize(){
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")
    }
}