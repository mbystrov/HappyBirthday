package com.example.happybirthday

import androidx.test.rule.ActivityTestRule
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import io.github.kakaocup.kakao.text.KButton
import io.github.kakaocup.kakao.text.KTextView
import org.junit.Rule
import org.junit.Test

class MyExampleTest: TestCase() {

    @get:Rule
    val activityRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun myTest() {
        val textView = KTextView { withId(R.id.textView) }
        textView.hasText("Hello World!")

        KButton { withId(R.id.imageButton) }.click()
        textView.hasText("Happy Birthday")
    }
}