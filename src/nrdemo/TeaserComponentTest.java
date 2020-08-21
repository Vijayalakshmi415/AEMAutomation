package nrdemo;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import nrdemoUtils.BaseClass;

public class TeaserComponentTest extends BaseClass {
	public TeaserComponentTest(WebDriver driver){
		this.driver=driver;
	}
	@BeforeMethod
	public void aemLogin()
	{
		login();
	}

	@Test
	public void teaserTest() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"globalnav-start-home-collection\"]/coral-masonry-item[3]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"granite-shell-content\"]/div[2]/div/div[2]/coral-columnview/coral-columnview-column[1]/coral-columnview-column-content/coral-columnview-item[13]")).click();
		driver.findElement(By.xpath("//*[@id=\"granite-shell-content\"]/div[2]/div/div[2]/coral-columnview/coral-columnview-column[2]/coral-columnview-column-content/coral-columnview-item[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"granite-shell-content\"]/div[2]/div/div[2]/coral-columnview/coral-columnview-column[3]/coral-columnview-column-content/coral-columnview-item[1]")).click();
		driver.findElement(By.xpath("//*[contains(@src,'/content/nr_finance/language-masters/en/home.thumb.48.48.png?ck=1576067582')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(@class,'betty-ActionBar-item cq-siteadmin-admin-actions-edit-activator foundation-collection-action coral-Button--graniteActionBar coral3-Button coral3-Button--quiet')]")).click();
		
		//window handles
		String parent=driver.getWindowHandle();
		Set<String>s=driver.getWindowHandles();
		Iterator<String>i1=s.iterator();
		while(i1.hasNext())
		{

		String child_window=i1.next();

		if(!parent.equals(child_window))
		{
		driver.switchTo().window(child_window);
		
		//page scrolldown
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");	
		
		driver.findElement(By.xpath("//*[@id=\"OverlayWrapper\"]/div[2]/div[8]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"EditableToolbar\"]/button[2]")).click();
		Thread.sleep(4000);	
		driver.findElement(By.id("coral-id-505")).click();//text
		driver.findElement(By.xpath("//input[@class='coral-Form-field coral3-Textfield' and @name='./jcr:title' and @value=\"Push the limits\"]")).clear();	
	    driver.findElement(By.xpath("//input[@class='coral-Form-field coral3-Textfield' and @name='./jcr:title' and @value=\"Push the limits\"]")).sendKeys("Push the limits");
	    Thread.sleep(3000);
	    
		driver.findElement(By.id("coral-id-506")).click();//link and actions
		driver.findElement(By.xpath("/html/body/coral-dialog/div[2]/form/coral-dialog-content/div/coral-tabview/coral-panelstack/coral-panel[3]/coral-panel-content/div/div/div/coral-multifield/coral-multifield-item/coral-multifield-item-content/div/foundation-autocomplete/div/div/span/button")).click();
		
		driver.findElement(By.xpath("//*[@id=\"cq-ui-pagefield-picker-collection\"]/coral-columnview-column[6]/coral-columnview-column-content/coral-columnview-item[2]")).click();
		driver.findElement(By.xpath("//img[contains(@src,'/content/we-retail/language-masters/en/products/men/shirts.thumb.48.48.png?ck=')]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Select']")).click(); //html/body/coral-dialog[2]/div[2]/coral-dialog-content/form/div[1]/div/div[2]/button[2]
		driver.findElement(By.name("./actions/item0/text")).clear();
		driver.findElement(By.name("./actions/item0/text")).sendKeys("Our strongest clothes");
		if (driver.findElement(By.xpath("/html/body/coral-dialog/div[2]/form/div/div/coral-dialog-header/div/button[4]")).isEnabled()) {
			driver.findElement(By.xpath("/html/body/coral-dialog/div[2]/form/div/div/coral-dialog-header/div/button[4]")).click();//Done button
			System.out.println("Teaser component test SUCCESS");
		}
		else {
			System.out.println("Teaser component test fail");
			
		}
			
		}
	}
		//driver.quit();
	}
}