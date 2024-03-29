package com.udacity.gradle.builditbigger;

import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.not;

public class TestForTextViewNotNull
{
    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void checkTextView_isDisplayed_and_notEmpty() throws Exception {
        // perform a click on the button
        onView(withId(R.id.get_joke)).perform(click());

        // passes if the textView does not match the empty string
        onView(withId(R.id.joke_view)).check(matches(not(withText(""))));
    }
}
