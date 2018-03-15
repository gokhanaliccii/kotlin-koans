package ii_collections

import java.util.*

fun example() {

    val result = listOf("abc", "12").flatMap { it.toList() }

    result == listOf('a', 'b', 'c', '1', '2')
}

val Customer.orderedProducts: Set<Product>
    get() {
        val flatMap = this.orders.flatMap { it.products }
        return flatMap.toSet()
    }

val Shop.allOrderedProducts: Set<Product>
    get() {
        return this.customers.flatMap { it.orders }
                .flatMap { it.products }.toSet()
    }
