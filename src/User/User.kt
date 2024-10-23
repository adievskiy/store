class User {
    fun chooseCity(stores: List<Store>): Store {
        println("Выберите город:")
        stores.forEachIndexed { index, store -> println("${index + 1}: ${store.city}") }
        val choice = readLine()?.toIntOrNull() ?: 1
        return stores.getOrElse(choice - 1) { stores[0]}
    }
}
