package com.example.testapp

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @Rule
    @JvmField
    val rule : ActivityScenarioRule<*> = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun simpleAdd() {
        runBlocking {
            Espresso.onView(withId(R.id.edt_one)).perform(ViewActions.typeText("5"))
            delay(1500)
            Espresso.onView(withId(R.id.edt_two)).perform(ViewActions.typeText("5"))
            delay(1500)
            Espresso.onView(withId(R.id.btn_plus)).perform(ViewActions.click())
            delay(1500)
            Espresso.onView(withId(R.id.tv_result))
                .check(ViewAssertions.matches(ViewMatchers.withText("10")))
        }

    }

    @Test
    fun checkEmail() {
        runBlocking {
            Espresso.onView(withId(R.id.edt_email)).perform(ViewActions.typeText("test"))
            delay(1500)
            Espresso.onView(withId(R.id.btn_email)).perform(ViewActions.click())
            delay(1500)
            Espresso.onView(withId(R.id.tv_result))
                .check(ViewAssertions.matches(ViewMatchers.withText("false")))
        }
    }

    @Test
    fun checkNumber() {
        runBlocking {
            Espresso.onView(withId(R.id.edt_number)).perform(ViewActions.typeText("skjnsvcds"))
            delay(1500)
            Espresso.onView(withId(R.id.btn_number)).perform(ViewActions.click())
            delay(1500)
            Espresso.onView(withId(R.id.tv_result))
                .check(ViewAssertions.matches(ViewMatchers.withText("false")))
        }
    }
}