package ${package}.view

import ${package}.controller.DeliciousController
import ${package}.model.DeliciousBookmark
import javafx.scene.Scene
import javafx.scene.layout.BorderPane
import javafx.scene.web.WebView
import javafx.stage.Stage
import tornadofx.*

class MainView : View() {
    override val root: BorderPane by fxml()
    val table: FXTableView<DeliciousBookmark> by fxid()
    val controller: DeliciousController by inject()

    init {
        title = "TornadoFX Sample App"

        with (table) {
            // Create table columns and bind to the data model
            column("Description", DeliciousBookmark::descriptionProperty).prefWidth = 500.0
            column("URL", DeliciousBookmark::urlProperty).prefWidth = 300.0

            // Handle double click on row
            onUserSelect { browse(selectedItem) }

            // Load data from the controller
            asyncItems { controller.recentBookmarks() }
        }
    }

    /**
     * Open the selected bookmark in a new browser window
     */
    private fun browse(bookmark: DeliciousBookmark) = Stage().apply {
        val webView = WebView().apply { engine.load(bookmark.url) }
        scene = Scene(webView)
        title = bookmark.description
        show()
    }
}