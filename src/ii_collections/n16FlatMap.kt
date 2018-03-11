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
        // Return all products that were ordered by at least one customer
        todoCollectionTask()
    }


fun main(ars: Array<String>) {

    class Person<T> {

        fun process(a: T) {
            print(a?.hashCode())

            print("called")
        }
    }

    fun <T> isA(value: Any) = value is T


}