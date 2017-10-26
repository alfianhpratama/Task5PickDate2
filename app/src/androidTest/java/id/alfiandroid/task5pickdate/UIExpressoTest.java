package id.alfiandroid.task5pickdate;

import android.content.Intent;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.action.ViewActions.click;

/**
 * Created by Alfian Hadi Pratama on 20/10/2017.
 */
@RunWith(AndroidJUnit4.class)
public class UIExpressoTest {

    @Rule
    public ActivityTestRule<MainActivity> mMainTestRule =
            new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    public void clickTest() throws Exception {
        mMainTestRule.launchActivity(new Intent());
        onView(withId(R.id.button_date))
                .perform(click());
        onView(withId(R.id.button_time))
                .perform(click());
    }
}
