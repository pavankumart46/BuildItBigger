package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.test.AndroidTestCase;

import org.junit.Test;

import java.util.concurrent.ExecutionException;

public class AsyncTaskTestForNonEmptyString extends AndroidTestCase {

    private static final String TAG = AsyncTaskTestForNonEmptyString.class.getSimpleName();
    private Context context;

    @Test
    public void isJokeEmpty() {
        String joke;
        context = InstrumentationRegistry.getTargetContext();
        try {
            joke = new EndpointsAsyncTask(null).execute(context).get();
            assertNotNull(joke);
            assertTrue(joke.length() > 0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
