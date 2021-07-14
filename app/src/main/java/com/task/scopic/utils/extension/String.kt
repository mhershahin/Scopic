package com.task.scopic.utils.extension

import java.util.*
import java.util.regex.Matcher
import java.util.regex.Pattern

fun String.isEmailValid(): Boolean {
    val regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$"
    val pattern: Pattern = Pattern.compile(regex)
    val matcher: Matcher = pattern.matcher(this)
    return matcher.matches()
}

fun String.isPassValid(): Boolean {
    return this.length > 6
}

fun String.capitalizeFirstLater(): String {
    return this.substring(0, 1).toUpperCase(Locale.getDefault()) + this.substring(1)
}

fun String.trimSpace(): String {
    return this.replace("\\s+".toRegex(), " ")
}

