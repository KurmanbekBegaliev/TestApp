package com.example.testapp

import org.junit.After
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class MainTest {

    var math: Math? = null

    @Before
    fun install() {
        math = Math()
    }

    @Test
    fun simpleAddCase() {
        assertEquals("4", math?.plus("2", "2"))
    }

    @Test
    fun checkEmpty(){
        assertEquals("Одно из полей является пустыми", math?.plus("", ""))
    }

    @Test
    fun checkSymbol(){
        assertEquals("Нельзя сложить буквы", math?.plus("b", "s"))
    }

    @Test
    fun checkEmailTrue() {
        assertEquals(true,math?.checkEmail("test@gmail.com"))
    }

    @Test
    fun checkEmailFalse() {
        assertEquals(false,math?.checkEmail("test"))
    }

    @Test
    fun checkNumber() {
        assertEquals(false,math?.checkNumber("1234567"))
    }

    @Test
    fun simpleAddWithDouble() {
        assertEquals("4.0", math?.plus("2.0", "2.0"))
    }

    @After
    fun after() {
        math = null
    }
}