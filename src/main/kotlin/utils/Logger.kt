package utils

import org.testng.Reporter

object Logger {
    fun ACTION(text: String) {
        println("ACTION: $text...")
        Reporter.log("ACTION: $text...")
    }

    fun STEP(text: String) {
        println("STEP: $text")
        Reporter.log("STEP: $text")
    }

    fun REQUEST(text: String) {
        println("API REQUEST: $text")
        Reporter.log("API REQUEST: $text")
    }

    fun WARNING(text: String) {
        println("WARNING: ======================= $text =======================")
        Reporter.log("WARNING: $text")
    }

    fun INFO(text: String) {
        println("INFO: ======================= $text =======================")
        Reporter.log("INFO: $text")
    }
}