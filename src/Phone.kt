abstract class Phone(val model: String, val basePrice: Double) {
    abstract fun getFinalPrice(): Double
}