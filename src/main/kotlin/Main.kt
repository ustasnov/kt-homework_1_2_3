fun main() {
    val sumDiscount: Int = 100
    val startDiscount: Int = 1_000
    val percentDiscount: Int = 5
    val startPercentDiscount: Int = 10_000
    val percentDiscountForRegular: Int = 1
    var regularCustomer: Boolean
    var discount: Int = 0
    var purchaseAmount: Int
    var amount: Int
    var customer: String

    customer = "Анатолий"
    regularCustomer = false
    purchaseAmount = 600
    customer += if (regularCustomer) " (постоянный)" else ""

    if (purchaseAmount > startPercentDiscount) {
        discount = (purchaseAmount * percentDiscount / 100).toInt()
    } else if (purchaseAmount > startDiscount) {
        discount = 100
    }
    amount = purchaseAmount - discount
    if (regularCustomer && discount > 0)  {
        amount -= (amount * percentDiscountForRegular / 100).toInt()
        discount = purchaseAmount - amount
    }

    println("Покупатель $customer : сумма покупки: $purchaseAmount руб., сумма скидки: $discount руб., сумма к оплате: $amount руб.")

    customer = "Иван"
    regularCustomer = false
    purchaseAmount = 2_000
    discount = 0
    customer += if (regularCustomer) " (постоянный)" else ""

    if (purchaseAmount > startPercentDiscount) {
        discount = (purchaseAmount * percentDiscount / 100).toInt()
    } else if (purchaseAmount > startDiscount) {
        discount = 100
    }
    amount = purchaseAmount - discount
    if (regularCustomer && discount > 0)  {
        amount -= (amount * percentDiscountForRegular / 100).toInt()
        discount = purchaseAmount - amount
    }

    println("Покупатель $customer : сумма покупки: $purchaseAmount руб., сумма скидки: $discount руб., сумма к оплате: $amount руб.")

    customer = "Дмитрий"
    regularCustomer = false
    purchaseAmount = 15_000
    discount = 0
    customer += if (regularCustomer) " (постоянный)" else ""

    if (purchaseAmount > startPercentDiscount) {
        discount = (purchaseAmount * percentDiscount / 100).toInt()
    } else if (purchaseAmount > startDiscount) {
        discount = 100
    }
    amount = purchaseAmount - discount
    if (regularCustomer && discount > 0)  {
        amount -= (amount * percentDiscountForRegular / 100).toInt()
        discount = purchaseAmount - amount
    }

    println("Покупатель $customer : сумма покупки: $purchaseAmount руб., сумма скидки: $discount руб., сумма к оплате: $amount руб.")

    customer = "Владимир"
    regularCustomer = true
    purchaseAmount = 700
    discount = 0
    customer += if (regularCustomer) " (постоянный)" else ""

    if (purchaseAmount > startPercentDiscount) {
        discount = (purchaseAmount * percentDiscount / 100).toInt()
    } else if (purchaseAmount > startDiscount) {
        discount = 100
    }
    amount = purchaseAmount - discount
    if (regularCustomer && discount > 0)  {
        amount -= (amount * percentDiscountForRegular / 100).toInt()
        discount = purchaseAmount - amount
    }

    println("Покупатель $customer : сумма покупки: $purchaseAmount руб., сумма скидки: $discount руб., сумма к оплате: $amount руб.")

    customer = "Пётр"
    regularCustomer = true
    purchaseAmount = 5_000
    discount = 0
    customer += if (regularCustomer) " (постоянный)" else ""

    if (purchaseAmount > startPercentDiscount) {
        discount = (purchaseAmount * percentDiscount / 100).toInt()
    } else if (purchaseAmount > startDiscount) {
        discount = 100
    }
    amount = purchaseAmount - discount
    if (regularCustomer && discount > 0)  {
        amount -= (amount * percentDiscountForRegular / 100).toInt()
        discount = purchaseAmount - amount
    }

    println("Покупатель $customer : сумма покупки: $purchaseAmount руб., сумма скидки: $discount руб., сумма к оплате: $amount руб.")

    customer = "Борис"
    regularCustomer = true
    purchaseAmount = 20_000
    discount = 0
    customer += if (regularCustomer) " (постоянный)" else ""

    if (purchaseAmount > startPercentDiscount) {
        discount = (purchaseAmount * percentDiscount / 100).toInt()
    } else if (purchaseAmount > startDiscount) {
        discount = 100
    }
    amount = purchaseAmount - discount
    if (regularCustomer && discount > 0)  {
        amount -= (amount * percentDiscountForRegular / 100).toInt()
        discount = purchaseAmount - amount
    }

    println("Покупатель $customer : сумма покупки: $purchaseAmount руб., сумма скидки: $discount руб., сумма к оплате: $amount руб.")
}