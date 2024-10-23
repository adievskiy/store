class RegularStore(city: String) : Store(city) {
    private val phones = mutableListOf<Phone>()
    private val salesStatistics = mutableMapOf<Phone, Int>()
    override fun addPhone(phone: Phone) {
        phones.add(phone)
    }

    override fun sellPhone(model: String): String {
        val phone = phones.find { it.model == model }
        return if (phone != null) {
            salesStatistics[phone] = salesStatistics.getOrDefault(phone, 0) + 1
            "Поздравляем, Вы купили ${phone.model}. Цена покупки составила ${phone.getFinalPrice()}."
        } else {
            "Модель не найдена!"
        }
    }

    override fun showStatistic() {
        println("Статистика продаж в магазине $city:")
        salesStatistics.forEach{ (phone, count) ->
            println("Модель ${phone.model} продана $count раз")
        }
    }
}