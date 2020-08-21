package nrdemo;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import nrdemoUtils.BaseClass;

public class TeaserComponentPublishTest extends BaseClass{
	TeaserComponentTest tTest;

	public TeaserComponentPublishTest() {
		super();
	}
	
	@BeforeMethod
	public void aemLogin() throws InterruptedException
	{
	login();
	tTest=new TeaserComponentTest(driver);
	tTest.teaserTest();
	}
	
		@Test
	public void teaserPublishTest() throws InterruptedException
	{
		Thread.sleep(5000L);
		//publish the page
		driver.findElement(By.xpath("//a[@id='pageinfo-trigger']")).click();
		driver.findElement(By.xpath("//*[@id=\"pageinfo-data\"]/button[4]")).click();
		
		//open publisher
		Thread.sleep(4000);
		driver.get("https://nextrow-publish.adobesandbox.com/content/nr_finance/language-masters/en/home.html");
		if (driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[8]/div/div[1]/div/img")).isDisplayed()) {
			System.out.println("Publish Test pass");
		}
		else {
			System.out.println("Publish Test failed");
		}
		driver.quit();
	}
}
