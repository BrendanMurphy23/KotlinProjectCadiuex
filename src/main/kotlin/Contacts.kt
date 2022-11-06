class Contacts constructor(var contactID: Int = 123,
                           var firstName: String? = "bill",
                           var lastName: String = "man",
                           var shiftTime: String? = "1"
                            ){


    fun printAll(){
        println("$contactID" +
                "\n$firstName $lastName" +
                "\nShift hour: $shiftTime")
    }





}