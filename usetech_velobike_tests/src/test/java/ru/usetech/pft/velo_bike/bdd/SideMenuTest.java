package ru.usetech.pft.velo_bike.bdd;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "classpath:bdd",glue = {"ru/usetech/pft/velo_bike/bdd/StepDefinitions"},plugin = {"pretty","html:build/cucumber-report"})
public class SideMenuTest extends AbstractTestNGCucumberTests {

}
