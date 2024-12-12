package com.gafful.kmp.datafaker

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform