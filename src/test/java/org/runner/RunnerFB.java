package org.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\mselva\\Oxygen eclipse-workspace\\CucumberProject1\\src\\test\\java\\org\\runner\\RunnerFB.java", glue = "C:\\Users\\mselva\\Oxygen eclipse-workspace\\CucumberProject1\\src\\test\\java\\org\\stepdefinition\\LoginFB.java")
public class RunnerFB {

}
