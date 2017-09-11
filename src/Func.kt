fun main(args : Array<String>) {
    firstFunction("My name is Leonan")
    println(secondFunction())

    val list = listOf<Int>(1, 5, 7, 9, 10)
    val greaterThan6 = list.count({ n -> n > 6})

    println(greaterThan6)
}

//void = vazio
fun firstFunction(str : String) {
    println(str)
}

// has return
fun secondFunction() : String {
    return "Hello World - SECOND FUNCTION"
}