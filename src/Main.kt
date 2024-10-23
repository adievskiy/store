import User.User

fun main() {
    val store1 = RegularStore("Москва").apply {
        addPhone(RegularPhone("Samsung", 500.0))
        addPhone(RegularPhone("iPhone", 1000.0))
    }

    val store2 = RegularStore("Питер").apply {
        addPhone(RegularPhone("Samsung", 505.0))
        addPhone(RegularPhone("iPhone", 1005.0))
    }

    val stores = mutableListOf(store1, store2)
    val user = User()
}