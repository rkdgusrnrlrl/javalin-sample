package app

import io.javalin.Javalin
import java.lang.Exception

fun main(args: Array<String>) {
    val app = Javalin.start(8080)
    val map = hashMapOf("hello" to "world")
    app.get("/") { ctx -> ctx.json(map) }
}