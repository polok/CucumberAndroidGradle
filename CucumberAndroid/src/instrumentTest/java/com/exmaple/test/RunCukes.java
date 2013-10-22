package com.exmaple.test;

import junit.framework.TestCase;

import cucumber.api.android.RunWithCucumber;

@RunWithCucumber(glue = "com.example.test", features = "features")
public class RunCukes extends TestCase {
}