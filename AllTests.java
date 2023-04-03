package application;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ WordCTest.class, getCountSS_Test.class, toStringTest.class })
public class AllTests {

}
