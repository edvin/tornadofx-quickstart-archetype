package ${package}.view

import ${package}.controller.DeliciousController
import ${package}.model.DeliciousBookmark
import javafx.scene.Scene
import javafx.scene.layout.BorderPane
import javafx.scene.web.WebView
import java.util.logging.Level.INFO
import javafx.scene.control.TableView
import javafx.stage.Stage
import tornadofx.*

class MainView : View() {
    override val root: BorderPane by fxml()
    val table: TableView<DeliciousBookmark> by fxid()
    val controller: DeliciousController by inject()

    init {
        title = messages.get("title")

        with (table) {
            // Create table columns and bind to the data model
            column(messages.get("description"), DeliciousBookmark::descriptionProperty).prefWidth = 500.0
            column(messages.get("url"), DeliciousBookmark::urlProperty).prefWidth = 300.0

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
        log.log(INFO, "Browsing ${bookmark.url}...")

        val webView = WebView().apply { engine.load(bookmark.url) }
        scene = Scene(webView)
        title = bookmark.description
        show()
    }
}