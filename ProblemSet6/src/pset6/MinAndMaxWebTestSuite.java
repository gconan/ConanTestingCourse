package pset6;

import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
* This test suite is designed for the minandmax.html
*/
public class MinAndMaxWebTestSuite {

	public static WebDriver wd;
	public static String webpage = "file:///Users/conangammel/Desktop/minandmax.html";

	/**
	* Init driver before the entire test suite
	*/
	@BeforeClass
	public static void beforeClass(){
		wd = new FirefoxDriver();
		wd.get(webpage);
	}

	/**
	* Refresh the browser before each test
	*/
	@Before
	public void refresh(){
		wd.navigate().refresh();
	}

	/**
	* Quit FireFox after the tests are done running
	*/
	@AfterClass
	public static void quit(){
		wd.quit();
	}


	@Test
	public void test0(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("min(-1, -1, -1) = -1"));
	}

	@Test
	public void test1(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("max(-1, -1, -1) = -1"));
	}

	@Test
	public void test2(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test3(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test4(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("0");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("min(-1, -1, 0) = -1"));
	}

	@Test
	public void test5(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("0");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("max(-1, -1, 0) = 0"));
	}

	@Test
	public void test6(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("0");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test7(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("0");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test8(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("1");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("min(-1, -1, 1) = -1"));
	}

	@Test
	public void test9(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("1");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("max(-1, -1, 1) = 1"));
	}

	@Test
	public void test10(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("1");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test11(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("1");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test12(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("four");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test13(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("four");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test14(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("four");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test15(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("four");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test16(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("0");

		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("min(-1, 0, -1) = -1"));
	}

	@Test
	public void test17(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("0");

		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("max(-1, 0, -1) = 0"));
	}

	@Test
	public void test18(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("0");

		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test19(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("0");

		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test20(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("0");

		we = wd.findElement(By.id("z"));
		we.sendKeys("0");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("min(-1, 0, 0) = -1"));
	}

	@Test
	public void test21(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("0");

		we = wd.findElement(By.id("z"));
		we.sendKeys("0");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("max(-1, 0, 0) = 0"));
	}

	@Test
	public void test22(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("0");

		we = wd.findElement(By.id("z"));
		we.sendKeys("0");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test23(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("0");

		we = wd.findElement(By.id("z"));
		we.sendKeys("0");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test24(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("0");

		we = wd.findElement(By.id("z"));
		we.sendKeys("1");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("min(-1, 0, 1) = -1"));
	}

	@Test
	public void test25(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("0");

		we = wd.findElement(By.id("z"));
		we.sendKeys("1");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("max(-1, 0, 1) = 1"));
	}

	@Test
	public void test26(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("0");

		we = wd.findElement(By.id("z"));
		we.sendKeys("1");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test27(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("0");

		we = wd.findElement(By.id("z"));
		we.sendKeys("1");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test28(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("0");

		we = wd.findElement(By.id("z"));
		we.sendKeys("four");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test29(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("0");

		we = wd.findElement(By.id("z"));
		we.sendKeys("four");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test30(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("0");

		we = wd.findElement(By.id("z"));
		we.sendKeys("four");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test31(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("0");

		we = wd.findElement(By.id("z"));
		we.sendKeys("four");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test32(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("min(-1, 1, -1) = -1"));
	}

	@Test
	public void test33(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("max(-1, 1, -1) = 1"));
	}

	@Test
	public void test34(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test35(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test36(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("0");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("min(-1, 1, 0) = -1"));
	}

	@Test
	public void test37(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("0");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("max(-1, 1, 0) = 1"));
	}

	@Test
	public void test38(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("0");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test39(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("0");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test40(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("1");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("min(-1, 1, 1) = -1"));
	}

	@Test
	public void test41(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("1");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("max(-1, 1, 1) = 1"));
	}

	@Test
	public void test42(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("1");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test43(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("1");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test44(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("four");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test45(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("four");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test46(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("four");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test47(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("four");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test48(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("four");

		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test49(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("four");

		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test50(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("four");

		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test51(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("four");

		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test52(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("four");

		we = wd.findElement(By.id("z"));
		we.sendKeys("0");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test53(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("four");

		we = wd.findElement(By.id("z"));
		we.sendKeys("0");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test54(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("four");

		we = wd.findElement(By.id("z"));
		we.sendKeys("0");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test55(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("four");

		we = wd.findElement(By.id("z"));
		we.sendKeys("0");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test56(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("four");

		we = wd.findElement(By.id("z"));
		we.sendKeys("1");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test57(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("four");

		we = wd.findElement(By.id("z"));
		we.sendKeys("1");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test58(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("four");

		we = wd.findElement(By.id("z"));
		we.sendKeys("1");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test59(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("four");

		we = wd.findElement(By.id("z"));
		we.sendKeys("1");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test60(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("four");

		we = wd.findElement(By.id("z"));
		we.sendKeys("four");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test61(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("four");

		we = wd.findElement(By.id("z"));
		we.sendKeys("four");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test62(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("four");

		we = wd.findElement(By.id("z"));
		we.sendKeys("four");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test63(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("four");

		we = wd.findElement(By.id("z"));
		we.sendKeys("four");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test64(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");

		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("min(0, -1, -1) = -1"));
	}

	@Test
	public void test65(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");

		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("max(0, -1, -1) = 0"));
	}

	@Test
	public void test66(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");

		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test67(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");

		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test68(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");

		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("0");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("min(0, -1, 0) = -1"));
	}

	@Test
	public void test69(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");

		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("0");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("max(0, -1, 0) = 0"));
	}

	@Test
	public void test70(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");

		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("0");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test71(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");

		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("0");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test72(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");

		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("1");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("min(0, -1, 1) = -1"));
	}

	@Test
	public void test73(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");

		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("1");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("max(0, -1, 1) = 1"));
	}

	@Test
	public void test74(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");

		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("1");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test75(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");

		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("1");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test76(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");

		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("four");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test77(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");

		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("four");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test78(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");

		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("four");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test79(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");

		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("four");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test80(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");

		we = wd.findElement(By.id("y"));
		we.sendKeys("0");

		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("min(0, 0, -1) = -1"));
	}

	@Test
	public void test81(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");

		we = wd.findElement(By.id("y"));
		we.sendKeys("0");

		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("max(0, 0, -1) = 0"));
	}

	@Test
	public void test82(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");

		we = wd.findElement(By.id("y"));
		we.sendKeys("0");

		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test83(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");

		we = wd.findElement(By.id("y"));
		we.sendKeys("0");

		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test84(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");

		we = wd.findElement(By.id("y"));
		we.sendKeys("0");

		we = wd.findElement(By.id("z"));
		we.sendKeys("0");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("min(0, 0, 0) = 0"));
	}

	@Test
	public void test85(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");

		we = wd.findElement(By.id("y"));
		we.sendKeys("0");

		we = wd.findElement(By.id("z"));
		we.sendKeys("0");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("max(0, 0, 0) = 0"));
	}

	@Test
	public void test86(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");

		we = wd.findElement(By.id("y"));
		we.sendKeys("0");

		we = wd.findElement(By.id("z"));
		we.sendKeys("0");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test87(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");

		we = wd.findElement(By.id("y"));
		we.sendKeys("0");

		we = wd.findElement(By.id("z"));
		we.sendKeys("0");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test88(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");

		we = wd.findElement(By.id("y"));
		we.sendKeys("0");

		we = wd.findElement(By.id("z"));
		we.sendKeys("1");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("min(0, 0, 1) = 0"));
	}

	@Test
	public void test89(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");

		we = wd.findElement(By.id("y"));
		we.sendKeys("0");

		we = wd.findElement(By.id("z"));
		we.sendKeys("1");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("max(0, 0, 1) = 1"));
	}

	@Test
	public void test90(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");

		we = wd.findElement(By.id("y"));
		we.sendKeys("0");

		we = wd.findElement(By.id("z"));
		we.sendKeys("1");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test91(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");

		we = wd.findElement(By.id("y"));
		we.sendKeys("0");

		we = wd.findElement(By.id("z"));
		we.sendKeys("1");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test92(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");

		we = wd.findElement(By.id("y"));
		we.sendKeys("0");

		we = wd.findElement(By.id("z"));
		we.sendKeys("four");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test93(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");

		we = wd.findElement(By.id("y"));
		we.sendKeys("0");

		we = wd.findElement(By.id("z"));
		we.sendKeys("four");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test94(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");

		we = wd.findElement(By.id("y"));
		we.sendKeys("0");

		we = wd.findElement(By.id("z"));
		we.sendKeys("four");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test95(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");

		we = wd.findElement(By.id("y"));
		we.sendKeys("0");

		we = wd.findElement(By.id("z"));
		we.sendKeys("four");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test96(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");

		we = wd.findElement(By.id("y"));
		we.sendKeys("1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("min(0, 1, -1) = -1"));
	}

	@Test
	public void test97(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");

		we = wd.findElement(By.id("y"));
		we.sendKeys("1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("max(0, 1, -1) = 1"));
	}

	@Test
	public void test98(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");

		we = wd.findElement(By.id("y"));
		we.sendKeys("1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test99(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");

		we = wd.findElement(By.id("y"));
		we.sendKeys("1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test100(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");

		we = wd.findElement(By.id("y"));
		we.sendKeys("1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("0");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("min(0, 1, 0) = 0"));
	}

	@Test
	public void test101(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");

		we = wd.findElement(By.id("y"));
		we.sendKeys("1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("0");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("max(0, 1, 0) = 1"));
	}

	@Test
	public void test102(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");

		we = wd.findElement(By.id("y"));
		we.sendKeys("1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("0");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test103(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");

		we = wd.findElement(By.id("y"));
		we.sendKeys("1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("0");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test104(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");

		we = wd.findElement(By.id("y"));
		we.sendKeys("1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("1");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("min(0, 1, 1) = 0"));
	}

	@Test
	public void test105(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");

		we = wd.findElement(By.id("y"));
		we.sendKeys("1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("1");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("max(0, 1, 1) = 1"));
	}

	@Test
	public void test106(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");

		we = wd.findElement(By.id("y"));
		we.sendKeys("1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("1");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test107(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");

		we = wd.findElement(By.id("y"));
		we.sendKeys("1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("1");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test108(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");

		we = wd.findElement(By.id("y"));
		we.sendKeys("1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("four");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test109(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");

		we = wd.findElement(By.id("y"));
		we.sendKeys("1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("four");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test110(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");

		we = wd.findElement(By.id("y"));
		we.sendKeys("1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("four");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test111(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");

		we = wd.findElement(By.id("y"));
		we.sendKeys("1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("four");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test112(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");

		we = wd.findElement(By.id("y"));
		we.sendKeys("four");

		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test113(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");

		we = wd.findElement(By.id("y"));
		we.sendKeys("four");

		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test114(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");

		we = wd.findElement(By.id("y"));
		we.sendKeys("four");

		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test115(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");

		we = wd.findElement(By.id("y"));
		we.sendKeys("four");

		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test116(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");

		we = wd.findElement(By.id("y"));
		we.sendKeys("four");

		we = wd.findElement(By.id("z"));
		we.sendKeys("0");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test117(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");

		we = wd.findElement(By.id("y"));
		we.sendKeys("four");

		we = wd.findElement(By.id("z"));
		we.sendKeys("0");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test118(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");

		we = wd.findElement(By.id("y"));
		we.sendKeys("four");

		we = wd.findElement(By.id("z"));
		we.sendKeys("0");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test119(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");

		we = wd.findElement(By.id("y"));
		we.sendKeys("four");

		we = wd.findElement(By.id("z"));
		we.sendKeys("0");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test120(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");

		we = wd.findElement(By.id("y"));
		we.sendKeys("four");

		we = wd.findElement(By.id("z"));
		we.sendKeys("1");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test121(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");

		we = wd.findElement(By.id("y"));
		we.sendKeys("four");

		we = wd.findElement(By.id("z"));
		we.sendKeys("1");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test122(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");

		we = wd.findElement(By.id("y"));
		we.sendKeys("four");

		we = wd.findElement(By.id("z"));
		we.sendKeys("1");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test123(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");

		we = wd.findElement(By.id("y"));
		we.sendKeys("four");

		we = wd.findElement(By.id("z"));
		we.sendKeys("1");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test124(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");

		we = wd.findElement(By.id("y"));
		we.sendKeys("four");

		we = wd.findElement(By.id("z"));
		we.sendKeys("four");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test125(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");

		we = wd.findElement(By.id("y"));
		we.sendKeys("four");

		we = wd.findElement(By.id("z"));
		we.sendKeys("four");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test126(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");

		we = wd.findElement(By.id("y"));
		we.sendKeys("four");

		we = wd.findElement(By.id("z"));
		we.sendKeys("four");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test127(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0");

		we = wd.findElement(By.id("y"));
		we.sendKeys("four");

		we = wd.findElement(By.id("z"));
		we.sendKeys("four");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test128(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("min(1, -1, -1) = -1"));
	}

	@Test
	public void test129(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("max(1, -1, -1) = 1"));
	}

	@Test
	public void test130(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test131(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test132(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("0");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("min(1, -1, 0) = -1"));
	}

	@Test
	public void test133(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("0");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("max(1, -1, 0) = 1"));
	}

	@Test
	public void test134(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("0");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test135(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("0");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test136(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("1");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("min(1, -1, 1) = -1"));
	}

	@Test
	public void test137(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("1");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("max(1, -1, 1) = 1"));
	}

	@Test
	public void test138(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("1");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test139(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("1");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test140(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("four");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test141(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("four");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test142(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("four");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test143(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("four");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test144(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("0");

		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("min(1, 0, -1) = -1"));
	}

	@Test
	public void test145(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("0");

		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("max(1, 0, -1) = 1"));
	}

	@Test
	public void test146(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("0");

		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test147(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("0");

		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test148(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("0");

		we = wd.findElement(By.id("z"));
		we.sendKeys("0");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("min(1, 0, 0) = 0"));
	}

	@Test
	public void test149(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("0");

		we = wd.findElement(By.id("z"));
		we.sendKeys("0");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("max(1, 0, 0) = 1"));
	}

	@Test
	public void test150(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("0");

		we = wd.findElement(By.id("z"));
		we.sendKeys("0");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test151(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("0");

		we = wd.findElement(By.id("z"));
		we.sendKeys("0");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test152(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("0");

		we = wd.findElement(By.id("z"));
		we.sendKeys("1");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("min(1, 0, 1) = 0"));
	}

	@Test
	public void test153(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("0");

		we = wd.findElement(By.id("z"));
		we.sendKeys("1");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("max(1, 0, 1) = 1"));
	}

	@Test
	public void test154(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("0");

		we = wd.findElement(By.id("z"));
		we.sendKeys("1");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test155(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("0");

		we = wd.findElement(By.id("z"));
		we.sendKeys("1");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test156(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("0");

		we = wd.findElement(By.id("z"));
		we.sendKeys("four");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test157(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("0");

		we = wd.findElement(By.id("z"));
		we.sendKeys("four");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test158(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("0");

		we = wd.findElement(By.id("z"));
		we.sendKeys("four");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test159(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("0");

		we = wd.findElement(By.id("z"));
		we.sendKeys("four");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test160(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("min(1, 1, -1) = -1"));
	}

	@Test
	public void test161(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("max(1, 1, -1) = 1"));
	}

	@Test
	public void test162(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test163(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test164(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("0");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("min(1, 1, 0) = 0"));
	}

	@Test
	public void test165(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("0");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("max(1, 1, 0) = 1"));
	}

	@Test
	public void test166(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("0");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test167(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("0");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test168(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("1");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("min(1, 1, 1) = 1"));
	}

	@Test
	public void test169(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("1");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("max(1, 1, 1) = 1"));
	}

	@Test
	public void test170(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("1");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test171(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("1");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test172(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("four");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test173(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("four");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test174(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("four");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test175(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("four");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test176(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("four");

		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test177(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("four");

		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test178(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("four");

		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test179(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("four");

		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test180(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("four");

		we = wd.findElement(By.id("z"));
		we.sendKeys("0");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test181(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("four");

		we = wd.findElement(By.id("z"));
		we.sendKeys("0");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test182(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("four");

		we = wd.findElement(By.id("z"));
		we.sendKeys("0");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test183(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("four");

		we = wd.findElement(By.id("z"));
		we.sendKeys("0");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test184(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("four");

		we = wd.findElement(By.id("z"));
		we.sendKeys("1");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test185(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("four");

		we = wd.findElement(By.id("z"));
		we.sendKeys("1");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test186(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("four");

		we = wd.findElement(By.id("z"));
		we.sendKeys("1");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test187(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("four");

		we = wd.findElement(By.id("z"));
		we.sendKeys("1");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test188(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("four");

		we = wd.findElement(By.id("z"));
		we.sendKeys("four");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test189(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("four");

		we = wd.findElement(By.id("z"));
		we.sendKeys("four");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test190(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("four");

		we = wd.findElement(By.id("z"));
		we.sendKeys("four");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test191(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1");

		we = wd.findElement(By.id("y"));
		we.sendKeys("four");

		we = wd.findElement(By.id("z"));
		we.sendKeys("four");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test192(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");

		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test193(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");

		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test194(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");

		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test195(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");

		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test196(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");

		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("0");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test197(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");

		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("0");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test198(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");

		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("0");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test199(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");

		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("0");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test200(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");

		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("1");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test201(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");

		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("1");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test202(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");

		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("1");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test203(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");

		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("1");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test204(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");

		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("four");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test205(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");

		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("four");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test206(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");

		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("four");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test207(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");

		we = wd.findElement(By.id("y"));
		we.sendKeys("-1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("four");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test208(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");

		we = wd.findElement(By.id("y"));
		we.sendKeys("0");

		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test209(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");

		we = wd.findElement(By.id("y"));
		we.sendKeys("0");

		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test210(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");

		we = wd.findElement(By.id("y"));
		we.sendKeys("0");

		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test211(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");

		we = wd.findElement(By.id("y"));
		we.sendKeys("0");

		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test212(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");

		we = wd.findElement(By.id("y"));
		we.sendKeys("0");

		we = wd.findElement(By.id("z"));
		we.sendKeys("0");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test213(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");

		we = wd.findElement(By.id("y"));
		we.sendKeys("0");

		we = wd.findElement(By.id("z"));
		we.sendKeys("0");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test214(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");

		we = wd.findElement(By.id("y"));
		we.sendKeys("0");

		we = wd.findElement(By.id("z"));
		we.sendKeys("0");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test215(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");

		we = wd.findElement(By.id("y"));
		we.sendKeys("0");

		we = wd.findElement(By.id("z"));
		we.sendKeys("0");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test216(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");

		we = wd.findElement(By.id("y"));
		we.sendKeys("0");

		we = wd.findElement(By.id("z"));
		we.sendKeys("1");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test217(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");

		we = wd.findElement(By.id("y"));
		we.sendKeys("0");

		we = wd.findElement(By.id("z"));
		we.sendKeys("1");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test218(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");

		we = wd.findElement(By.id("y"));
		we.sendKeys("0");

		we = wd.findElement(By.id("z"));
		we.sendKeys("1");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test219(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");

		we = wd.findElement(By.id("y"));
		we.sendKeys("0");

		we = wd.findElement(By.id("z"));
		we.sendKeys("1");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test220(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");

		we = wd.findElement(By.id("y"));
		we.sendKeys("0");

		we = wd.findElement(By.id("z"));
		we.sendKeys("four");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test221(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");

		we = wd.findElement(By.id("y"));
		we.sendKeys("0");

		we = wd.findElement(By.id("z"));
		we.sendKeys("four");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test222(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");

		we = wd.findElement(By.id("y"));
		we.sendKeys("0");

		we = wd.findElement(By.id("z"));
		we.sendKeys("four");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test223(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");

		we = wd.findElement(By.id("y"));
		we.sendKeys("0");

		we = wd.findElement(By.id("z"));
		we.sendKeys("four");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test224(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");

		we = wd.findElement(By.id("y"));
		we.sendKeys("1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test225(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");

		we = wd.findElement(By.id("y"));
		we.sendKeys("1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test226(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");

		we = wd.findElement(By.id("y"));
		we.sendKeys("1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test227(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");

		we = wd.findElement(By.id("y"));
		we.sendKeys("1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test228(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");

		we = wd.findElement(By.id("y"));
		we.sendKeys("1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("0");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test229(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");

		we = wd.findElement(By.id("y"));
		we.sendKeys("1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("0");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test230(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");

		we = wd.findElement(By.id("y"));
		we.sendKeys("1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("0");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test231(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");

		we = wd.findElement(By.id("y"));
		we.sendKeys("1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("0");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test232(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");

		we = wd.findElement(By.id("y"));
		we.sendKeys("1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("1");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test233(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");

		we = wd.findElement(By.id("y"));
		we.sendKeys("1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("1");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test234(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");

		we = wd.findElement(By.id("y"));
		we.sendKeys("1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("1");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test235(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");

		we = wd.findElement(By.id("y"));
		we.sendKeys("1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("1");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test236(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");

		we = wd.findElement(By.id("y"));
		we.sendKeys("1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("four");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test237(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");

		we = wd.findElement(By.id("y"));
		we.sendKeys("1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("four");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test238(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");

		we = wd.findElement(By.id("y"));
		we.sendKeys("1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("four");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test239(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");

		we = wd.findElement(By.id("y"));
		we.sendKeys("1");

		we = wd.findElement(By.id("z"));
		we.sendKeys("four");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test240(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");

		we = wd.findElement(By.id("y"));
		we.sendKeys("four");

		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test241(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");

		we = wd.findElement(By.id("y"));
		we.sendKeys("four");

		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test242(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");

		we = wd.findElement(By.id("y"));
		we.sendKeys("four");

		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test243(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");

		we = wd.findElement(By.id("y"));
		we.sendKeys("four");

		we = wd.findElement(By.id("z"));
		we.sendKeys("-1");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test244(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");

		we = wd.findElement(By.id("y"));
		we.sendKeys("four");

		we = wd.findElement(By.id("z"));
		we.sendKeys("0");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test245(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");

		we = wd.findElement(By.id("y"));
		we.sendKeys("four");

		we = wd.findElement(By.id("z"));
		we.sendKeys("0");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test246(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");

		we = wd.findElement(By.id("y"));
		we.sendKeys("four");

		we = wd.findElement(By.id("z"));
		we.sendKeys("0");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test247(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");

		we = wd.findElement(By.id("y"));
		we.sendKeys("four");

		we = wd.findElement(By.id("z"));
		we.sendKeys("0");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test248(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");

		we = wd.findElement(By.id("y"));
		we.sendKeys("four");

		we = wd.findElement(By.id("z"));
		we.sendKeys("1");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test249(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");

		we = wd.findElement(By.id("y"));
		we.sendKeys("four");

		we = wd.findElement(By.id("z"));
		we.sendKeys("1");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test250(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");

		we = wd.findElement(By.id("y"));
		we.sendKeys("four");

		we = wd.findElement(By.id("z"));
		we.sendKeys("1");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test251(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");

		we = wd.findElement(By.id("y"));
		we.sendKeys("four");

		we = wd.findElement(By.id("z"));
		we.sendKeys("1");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test252(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");

		we = wd.findElement(By.id("y"));
		we.sendKeys("four");

		we = wd.findElement(By.id("z"));
		we.sendKeys("four");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test253(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");

		we = wd.findElement(By.id("y"));
		we.sendKeys("four");

		we = wd.findElement(By.id("z"));
		we.sendKeys("four");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));
		we.click();

		assertTrue(wd.findElement(By.id("result")).getText().equals("Please enter integer values only!"));
	}

	@Test
	public void test254(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");

		we = wd.findElement(By.id("y"));
		we.sendKeys("four");

		we = wd.findElement(By.id("z"));
		we.sendKeys("four");

		wd.findElement(By.id("min")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}

	@Test
	public void test255(){
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("four");

		we = wd.findElement(By.id("y"));
		we.sendKeys("four");

		we = wd.findElement(By.id("z"));
		we.sendKeys("four");

		wd.findElement(By.id("max")).click();

		we = wd.findElement(By.id("computeButton"));

		//dontClick()
		assertTrue(wd.findElement(By.id("result")).getText().equals(""));
	}
}

