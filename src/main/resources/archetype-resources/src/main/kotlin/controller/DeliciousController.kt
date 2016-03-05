package ${package}.controller

import ${package}.model.DeliciousBookmark
import javafx.collections.ObservableList
import tornadofx.*

class DeliciousController: Controller() {
    val api: Rest by inject()

    init {
        api.baseURI = "http://feeds.delicious.com/v2/json/"
    }

    fun recentBookmarks(): ObservableList<DeliciousBookmark> =
            api.get("recent?count=").list().toModel()
}

