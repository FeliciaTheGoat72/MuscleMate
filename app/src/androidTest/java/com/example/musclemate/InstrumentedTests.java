package com.example.musclemate;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.assertEquals;

import android.content.Context;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;

import com.example.musclemate.ExerciseActivities.MainActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule
            = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.example.musclemate", appContext.getPackageName());
    }

    @Test
    public void ChestNavigation() {
        onView(withId(R.id.button_chest)).perform(click());
        onView(withId(R.id.button_dbFly)).check(matches(isDisplayed()));
    }
    @Test
    public void BenchNavigation() {
        onView(withId(R.id.button_chest)).perform(click());
        onView(withId(R.id.button_bench)).perform(click());
        onView(withId(R.id.youtube_player_view)).check(matches(isDisplayed()));
    }
    @Test
    public void RandomNavigation() {
        onView(withId(R.id.button_random)).perform(click());
        onView(withId(R.id.random_greeting)).check(matches(isDisplayed()));
    }
}
