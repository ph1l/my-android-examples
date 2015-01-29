package org.kremlor.examplemessenger;

import android.test.ActivityInstrumentationTestCase2;

/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class org.kremlor.examplemessenger.ExampleMessengerTest \
 * org.kremlor.examplemessenger.tests/android.test.InstrumentationTestRunner
 */
public class ExampleMessengerTest extends ActivityInstrumentationTestCase2<ExampleMessenger> {

    public ExampleMessengerTest() {
        super("org.kremlor.examplemessenger", ExampleMessenger.class);
    }

}
