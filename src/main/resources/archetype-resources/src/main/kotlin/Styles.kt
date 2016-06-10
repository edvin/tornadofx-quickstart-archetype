package $package

import javafx.scene.text.FontWeight
import tornadofx.*

class Styles : Stylesheet() {
    companion object {
        val heading by cssclass()
    }

    init {
        select(heading) {
            fontSize = 1.5.em
            fontWeight = FontWeight.BOLD
            padding = box(15.px)
        }
    }
}