package com.haochang.party

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    open class Base {
        private var name: String = ""
        private var stage: String = ""
    }

    @Test
    fun testObjectProperty() {
        val base = object : Base() {
            var age: Int = 100
        }
        val base1 = Base()
        println("ExampleUnitTest.testObjectProperty  ${base1::class.java}  ${base::class.java}  ${base.age}")
    }

    @Test
    fun kotlinEqual() {
        val a = setOf("Ssahakespeare", "Hemingway", "Twadin")
        val b = setOf("Twadin", "Ssahakespeare", "Hemingway")
        //值比较
        println(a == b)
        //引用比较
        println(a === b)
        val map = mutableMapOf<String, String?>()
        map["dd"] = "32478"
        map["dd"] = null
        map.getOrElse("dd", {"ddd"})


        val authors = setOf("Shakespeare", "Hemingway", "Twain")
        val writers = setOf("Twain", "Shakespeare", "Hemingway")

        println(authors == writers)   // 1
        println(authors === writers)  // 2
    }
}