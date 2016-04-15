package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTestng {

	@BeforeClass
	void beforeClass() {
		System.out.println("Before Class");
	}

	@BeforeTest
	void beforeTest() {
		System.out.println("Before Test");
	}

	@AfterTest
	void afterTest() {
		System.out.println("After test");
	}

	@BeforeMethod
	void BeforeMethod() {
		System.out.println("Before method");
	}

	@AfterMethod
	void afterMethod() {
		System.out.println("After method");
	}

	@Test(priority = 1, dependsOnGroups = "A")
	void test1() {
		System.out.println("Test1");

	}

	@Test(priority = 2, groups = "A")
	void test3() {
		System.out.println("Test3");

	}

	@Test(priority = 3, groups = "B")
	void test2() {
		System.out.println("Test2");
	}

	@AfterClass
	void afterClass() {
		System.out.println("After class");
	}

}
