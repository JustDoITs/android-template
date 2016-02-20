package org.jdc.template.webservice.websearch

class DtoResult {
    var unescapedUrl: String? = null
    var url: String? = null
    var visibleUrl: String? = null
    var cacheUrl: String? = null
    var title: String? = null
    var titleNoFormatting: String? = null
    var content: String? = null
    var curor: List<DtoCursor>? = null
}