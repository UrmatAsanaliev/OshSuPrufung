package com.devsys.oshsuprufung

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform