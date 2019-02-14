import com.beust.klaxon.Klaxon
import com.beust.klaxon.KlaxonException
import documentos.Factura
import org.eclipse.jetty.http.HttpParser.LOG

import spark.kotlin.*

fun main(args: Array<String>) {

    post("/factura") {
        val contenido = request.body().toString()

        return@post "asd"

    }
}