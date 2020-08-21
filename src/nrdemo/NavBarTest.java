package nrdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import nrdemoUtils.BaseClass;

public class NavBarTest extends BaseClass {
	@BeforeMethod
	public void aemPublish() {
		publishTest();
	}
	@Test
	public void navBarLinksTest() throws InterruptedException {
		
		Actions act=new Actions(driver);
		
		//Home Tab
		//personal
		act.moveToElement(driver.findElement(By.xpath("//a[@href='/content/nr_finance/language-masters/en/home.html']"))).perform();
		driver.findElement(By.xpath("//*[@id=\"we-example-navbar-collapse-inverse\"]/ul/div/nav/ul/li[1]/ul/li[1]/a")).click();
		Thread.sleep(3000);
		if ("Personal".equalsIgnoreCase(driver.getTitle())) {
			System.out.println("Personal link test passed");
		}
		else {
			System.out.println("Personal link test failed");
		}
		
		//Business
		act.moveToElement(driver.findElement(By.xpath("//a[@href='/content/nr_finance/language-masters/en/home.html']"))).perform();
		driver.findElement(By.xpath("//a[@href='/content/nr_finance/language-masters/en/home/business.html']")).click();
		Thread.sleep(4000);
		if ("Business".equalsIgnoreCase(driver.getTitle())) {
			System.out.println("Business link test passed");
		}
		else {
			System.out.println("Business link test failed");
		}
		
		//Social-media
		act.moveToElement(driver.findElement(By.xpath("//a[@href='/content/nr_finance/language-masters/en/home.html']"))).perform();
		driver.findElement(By.xpath("//a[@href='/content/nr_finance/language-masters/en/home/social-media.html']")).click();
		Thread.sleep(3000);
		if ("Social-media".equalsIgnoreCase(driver.getTitle())) {
			System.out.println("Social-media link test passed");
		}
		else {
			System.out.println("Social-media link test failed");
		}
		
		//Contact-us
		act.moveToElement(driver.findElement(By.xpath("//a[@href='/content/nr_finance/language-masters/en/home.html']"))).perform();
		driver.findElement(By.xpath("//a[@href='/content/nr_finance/language-masters/en/home/contact-us.html']")).click();
		Thread.sleep(3000);
		if ("Contact-us".equalsIgnoreCase(driver.getTitle())) {
			System.out.println("Contact-us link test passed");
		}
		else {
			System.out.println("Contact-us link test failed");
		}
		
		//Membership Tab
		//Login
		act.moveToElement(driver.findElement(By.xpath("//a[@href='/content/nr_finance/language-masters/en/membership.html']"))).perform();
		driver.findElement(By.xpath("//a[@href='/content/nr_finance/language-masters/en/membership/login.html']")).click();
		Thread.sleep(3000);
		if ("Login".equalsIgnoreCase(driver.getTitle())) {
			System.out.println("Login link test passed");
		}
		else {
			System.out.println("Login link test failed");
		}
		
		//Members Only
		act.moveToElement(driver.findElement(By.xpath("//a[@href='/content/nr_finance/language-masters/en/membership.html']"))).perform();
		driver.findElement(By.xpath("//a[@href='/content/nr_finance/language-masters/en/membership/members.html']")).click();
		Thread.sleep(3000);
		if ("Members Only".equalsIgnoreCase(driver.getTitle())) {
			System.out.println("Members Only link test passed");
		}
		else {
			System.out.println("Members Only test failed");
		}
		
		//Communities Tab
		act.moveToElement(driver.findElement(By.xpath("//a[@href='/content/nr_finance/language-masters/en/communities.html']"))).perform();
		driver.findElement(By.xpath("//a[@href='/content/nr_finance/language-masters/en/communities.html']")).click();
		Thread.sleep(3000);
		if ("Communities".equalsIgnoreCase(driver.getTitle())) {
			System.out.println("Communities test passed");
		}
		else {
			System.out.println("Communities test failed");
		}
		
		//Learning tab
		//Video-tutorials
		act.moveToElement(driver.findElement(By.xpath("//a[@href='/content/nr_finance/language-masters/en/learning.html']"))).perform();
		driver.findElement(By.xpath("//a[@href='/content/nr_finance/language-masters/en/learning/video-tutotials.html']")).click();
		Thread.sleep(3000);
		if ("Video-tutotials".equalsIgnoreCase(driver.getTitle())) {
			System.out.println("Video-tutotials link test passed");
		}
		else {
			System.out.println("Video-tutotials test failed");
		}
		
		//register-for-training
		act.moveToElement(driver.findElement(By.xpath("//a[@href='/content/nr_finance/language-masters/en/learning.html']"))).perform();
		driver.findElement(By.xpath("//a[@href='/content/nr_finance/language-masters/en/learning/register-for-training.html']")).click();
		Thread.sleep(3000);
		if ("Register For Training".equalsIgnoreCase(driver.getTitle())) {
			System.out.println("Register For Training link test passed");
		}
		else {
			System.out.println("Register For Training test failed");
		}	
		
		//Integration
		act.moveToElement(driver.findElement(By.xpath("//a[@href='/content/nr_finance/language-masters/en/learning.html']"))).perform();
		driver.findElement(By.xpath("//a[@href='/content/nr_finance/language-masters/en/learning/integration.html']")).click();
		Thread.sleep(3000);
		if ("Integration".equalsIgnoreCase(driver.getTitle())) {
			System.out.println("Integration link test passed");
		}
		else {
			System.out.println("Integration test failed");
		}	
		
		//FAQsTab
		act.moveToElement(driver.findElement(By.xpath("//a[@href='/content/nr_finance/language-masters/en/faqs.html']"))).perform();
		driver.findElement(By.xpath("//a[@href='/content/nr_finance/language-masters/en/faqs.html']")).click();
		Thread.sleep(3000);
		if ("FAQs".equalsIgnoreCase(driver.getTitle())) {
			System.out.println("FAQs test passed");
		}
		else {
			System.out.println("FAQs test failed");
		}	
		
		//Home Lending
		act.moveToElement(driver.findElement(By.xpath("//a[@href='/content/nr_finance/language-masters/en/home-lending.html']"))).perform();
		driver.findElement(By.xpath("//a[@href='/content/nr_finance/language-masters/en/home-lending.html']")).click();
		Thread.sleep(3000);
		if ("Home Lending".equalsIgnoreCase(driver.getTitle())) {
			System.out.println("Home Lending test passed");
		}
		else {
			System.out.println("Home Lending test failed");
		}
		driver.quit();
	}
	}
