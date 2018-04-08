import java.util.HashMap

fun buildMap(build: HashMap<Int, String>.() -> Unit): Map<Int, String> {
    val numberMap = HashMap<Int, String>()
    numberMap.build()
    return numberMap
}

fun usage(): Map<Int, String> {
    return buildMap {
        put(0, "0")
        for (i in 1..10) {
            put(i, "$i")
        }
    }
}

