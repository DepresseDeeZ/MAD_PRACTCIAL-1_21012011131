class Car(var type: String, var model: String, var price: Double, var owner: String, var milesDrive: Double) {

    fun getCarPrice(): Double {
        return price
    }

    fun getOriginalCarPrice(): Double {

        return price
    }

    fun getCurrentCarPrice(): Double {

        return price * 0.8
    }

    fun getCarInformation(): String {
        return "Type: $type\nModel: $model\nPrice: $price\nOwner: $owner\nMiles Driven: $milesDrive"
    }

    fun displayCarInfo() {
        println(getCarInformation())
    }
}

fun main() {

    val myCar = Car("Sedan", "Toyota Camry", 25000.0, "John Doe", 10000.0)

    println("Car Price: ${myCar.getCarPrice()}")
    println("Original Car Price: ${myCar.getOriginalCarPrice()}")
    println("Current Car Price: ${myCar.getCurrentCarPrice()}")

    myCar.displayCarInfo()
}
