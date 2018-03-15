package iv_properties

import util.TODO
import util.doc34
import kotlin.reflect.KProperty

class LazyPropertyUsingDelegates(val initializer: () -> Int) {
    val lazyValue: Int by lazy(initializer)

}

fun main(args: Array<String>) {

    val lazyProperty = LazyPropertyUsingDelegates(initializer = { 12 })
    lazyProperty.lazyValue


}
