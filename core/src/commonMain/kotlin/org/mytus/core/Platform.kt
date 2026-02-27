package org.mytus.core

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
