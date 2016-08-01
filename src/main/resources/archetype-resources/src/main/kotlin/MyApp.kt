package $package

import tornadofx.App
import tornadofx.importStylesheet
import ${package}.view.MainView

class MyApp: App(MainView::class) {
    init {
        importStylesheet(Styles::class)
    }
}