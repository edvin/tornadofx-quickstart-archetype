package $package

import javafx.application.Application
import tornadofx.App
import tornadofx.View
import tornadofx.importStylesheet
import kotlin.reflect.KClass
import ${package}.view.MainView

class MyApp: App() {
    override val primaryView = MainView::class

    init {
        importStylesheet("/app.css")
    }
}

fun main(args: Array<String>) {
    Application.launch(MyApp::class.java, *args)
}