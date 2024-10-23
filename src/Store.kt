abstract class Store(val city: String) {
    abstract fun addPhone(phone: Phone)
    abstract fun sellPhone(model: String): String
    abstract fun showStatistic(): Unit
}