fun main(args: Array<String>){
    println("Welcome to Anytime plumbing")

    val person1 = Contacts(123,"bill","man", "1")
    person1.printAll()

    val person2 = Contacts(124,"rick","bobby","3")
    person2.printAll()

    val person3 = Contacts(125,"patrick","bateman","2")
    person3.printAll()



    println("What employee would be the best for you, person1 2 or 3:  ")
    var stringInput = readln()!!
    println("$stringInput sounds great!")
    println("What do you need done: ")








}