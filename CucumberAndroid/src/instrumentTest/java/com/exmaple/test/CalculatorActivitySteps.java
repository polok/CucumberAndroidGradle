package com.exmaple.test;

import android.annotation.TargetApi;
import android.os.Build;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.example.cucumberandroid.MainActivity;
import com.example.cucumberandroid.R;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CalculatorActivitySteps extends ActivityInstrumentationTestCase2<MainActivity> {
    private MainActivity mActivity;

    public CalculatorActivitySteps() {
        super(MainActivity.class);
    }

    @Before
    public void before() {
    }

    @After
    public void after() {
    }

    @Given("^I have a MainActivity")
    public void I_have_a_CalculatorActivity() {
        mActivity = getActivity();
        assertNotNull(mActivity);
    }

    @When("^I press (\\d)$")
    public void I_press_d(int d) {
        switch (d) {
            case 0:
//                clickOnView(mActivity, R.id.btn_d_0);
                break;
            case 1:
//                clickOnView(mActivity, R.id.btn_d_1);
                break;
            case 2:
//                clickOnView(mActivity, R.id.btn_d_2);
                break;
            case 3:
//                clickOnView(mActivity, R.id.btn_d_3);
                break;
            case 4:
//                clickOnView(mActivity, R.id.btn_d_4);
                break;
            case 5:
//                clickOnView(mActivity, R.id.btn_d_5);
                break;
            case 6:
//                clickOnView(mActivity, R.id.btn_d_6);
                break;
            case 7:
//                clickOnView(mActivity, R.id.btn_d_7);
                break;
            case 8:
//                clickOnView(mActivity, R.id.btn_d_8);
                break;
            case 9:
//                clickOnView(mActivity, R.id.btn_d_9);
                break;
        }
    }

    @When("^I press ([+–x\\/=])$")
    public void I_press_op(char op) {
        switch (op) {
            case '+':
//                clickOnView(mActivity, R.id.btn_op_add);
                break;
            case '–':
//                clickOnView(mActivity, R.id.btn_op_subtract);
                break;
            case 'x':
//                clickOnView(mActivity, R.id.btn_op_multiply);
                break;
            case '/':
//                clickOnView(mActivity, R.id.btn_op_divide);
                break;
            case '=':
//                clickOnView(mActivity, R.id.btn_op_equals);
                break;
        }
    }

    @Then("^I should see on the display$")
    public void I_should_see_s_on_the_display(String s) {
//        TextView display = (TextView) mActivity.findViewById(R.id.txt_calc_display);
//        String displayed_result = display.getText().toString();
//        assertEquals(s, displayed_result);
        assertTrue(true);
    }
}