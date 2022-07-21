package com.cucumber.testng.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-htmlreport/CucumberTestRunner",
                "json:target/json-files/CucumberTestRunner.json",
                "junit:target/junit_cucumber.xml"},
        monochrome = true,
        tags = "@smoke",
        glue = "com.cucumber.testng",
        features = "classpath:com/cucumber/testng/features"
)
public class CucumberTestRunner extends AbstractTestNGCucumberTests {
}

