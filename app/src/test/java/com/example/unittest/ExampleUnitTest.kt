package com.example.unittest

import Functions
import org.junit.Test
import org.junit.Assert.*
import java.util.Date

class ExampleUnitTest {

    val functions = Functions()

    @Test
    fun sum_isEqual() {
        val result = functions.sum(3,2)
        assertEquals(5, result)
    }

    @Test
    fun division_isEqual() {
        val result = functions.division(4,2)
        assertEquals(2, result)
    }

    @Test
    fun multiplication_isEqual() {
        val result = functions.multiplication(2, 3)
        assertEquals(6, result)
    }

    @Test
    fun divi_isEqual() {
        val result = functions.division(4, 2)
        assertEquals(2, result)
    }

    @Test
    fun test_DateFormatter() {
        val date = Date(1619611200000)
        val expectedDate = "28-04-2021"
        val formatDate = functions.dateFormatter(date)
        assertEquals(expectedDate, formatDate)
    }

    @Test
    fun test_hourFormatter() {
        val hourString = functions.toTimeString("13:48")
        val validHourString = "13:48"

        assertEquals(validHourString, hourString)
    }

    @Test
    fun test_validEmail() {
        val email = "email@email.com"
        val check_Email = functions.isEmail(email)
        assertTrue(check_Email)
    }
}