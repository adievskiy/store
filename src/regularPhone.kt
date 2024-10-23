class regularPhone(model: String, basePrice: Double) : Phone(model, basePrice) {
    override fun getFinalPrice(): Double {
        return basePrice
    }
}