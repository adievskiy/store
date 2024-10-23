class RepairShop {
    private val repairedPhones = mutableListOf<Phone>()

    fun repairPhone(phone: Phone): String {
        repairedPhones.add(phone)
        return "Ваш телефон отремонтирован"
    }
}