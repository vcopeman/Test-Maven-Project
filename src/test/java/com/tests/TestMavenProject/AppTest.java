package com.tests.TestMavenProject;

import java.io.IOException;

import org.apache.commons.lang.time.StopWatch;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
//import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class AppTest 
    
{		// This is a Maven test
		//@Test
		public void sampletest()
		{
			FirefoxDriver driver = new FirefoxDriver();
			driver.get("http://www.google.co.uk");
			driver.quit();	     
		}
	
		// This is a headless HTML.Unit
		//@Test
		public void HeadlessHtmlUnittest()
		{
			HtmlUnitDriver driver = new HtmlUnitDriver();
			driver.manage().deleteAllCookies();
			driver.get("http://www.gmail.com");
			driver.findElement(By.id("Email")).sendKeys("test@gmail.com");
		}
		
		//This is using Phantom JS
		//@Test
		//public void HeadlessPhantomJS()
		//{
			//System.setProperty("phantomjs.binary.path","C:\\Automation0705\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
			//PhantomJSDriver driver = new PhantomJSDriver();
			//driver.manage().deleteAllCookies();
			//driver.get("http://www.gmail.com");
			//driver.findElement(By.id("Email")).sendKeys("test@gmail.com");
		//}
		
		//This is testing Client side performance, TIMER
		//@Test
		public void Clientsidetimer() throws IOException
		{
			FirefoxDriver driver = new FirefoxDriver();
			long starttime = System.currentTimeMillis();
			driver.get("http://www.youtube.com");
			long endtime = System.currentTimeMillis();
			
			System.out.println(endtime-starttime);
		}
		
		//This is testing Client side performance, STOPWATCH
		//@Test
		public void ClientsideStopwatch() throws IOException
		{
			FirefoxDriver driver = new FirefoxDriver();
			StopWatch s = new StopWatch();
			s.start();
			driver.get("http://www.youtube.com");
			s.stop();
			System.out.println(s.getTime());
			driver.quit();
		}
		
		//This is testing Client side performance, NAVIGATION API
		@Test
		public void Navigationtimingtest() 
		
		{
			FirefoxDriver driver = new FirefoxDriver();
			JavaScriptExecutor js = (JavascriptExecutor) driver;
			String startinstring = ((js.executeScript("return window.performance.timing.loadEventStart");
			driver.get("http://www.youtube.com");
			
			String endinstring = ((js.executeScript("return window.performance.timing.loadEventEnd");
			
			
			
		}		
}


    