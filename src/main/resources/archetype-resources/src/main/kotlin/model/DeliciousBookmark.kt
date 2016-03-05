package ${package}.model

import tornadofx.*
import javax.json.JsonObject

class DeliciousBookmark: JsonModel {
    var description by property<String>()
    fun descriptionProperty() = getProperty(DeliciousBookmark::description)

    var url by property<String>()
    fun urlProperty() = getProperty(DeliciousBookmark::url)

    override fun updateModel(json: JsonObject) {
        with (json) {
            description = json.string("d")
            url = json.string("u")
        }
    }
}

