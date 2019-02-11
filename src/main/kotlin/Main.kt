import spark.kotlin.*

fun main(args: Array<String>) {
    val http: Http = ignite()
    val a = Main()

    http.get("/hello") {
        a.hello()
        return@get "Hola"
    }
}