package nrdemo;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import nrdemoUtils.BaseClass;

public class CreatePageTest extends BaseClass{
    
//    public CreatePageTest()
//    {
//        super();
//    }
   @BeforeMethod
   public void aemLogin()
   {
	   login();
   }
   
    @Test
        public void testpage() throws InterruptedException {
        			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"globalnav-start-home-collection\"]/coral-masonry-item[3]/div")).click();
			driver.findElement(By.xpath("//*[@id=\"granite-shell-content\"]/div[2]/div/div[2]/coral-columnview/coral-columnview-column[1]/coral-columnview-column-content/coral-columnview-item[13]")).click();
			driver.findElement(By.xpath("//*[@id=\"granite-shell-content\"]/div[2]/div/div[2]/coral-columnview/coral-columnview-column[2]/coral-columnview-column-content/coral-columnview-item[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"granite-shell-content\"]/div[2]/div/div[2]/coral-columnview/coral-columnview-column[3]/coral-columnview-column-content/coral-columnview-item[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"granite-shell-content\"]/div[2]/div/div[2]/coral-columnview/coral-columnview-column[4]/coral-columnview-column-content/coral-columnview-item[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"granite-shell-actionbar\"]/betty-titlebar-secondary/button[3]")).click();
			driver.findElement(By.xpath("//*[contains(@class,'cq-siteadmin-admin-createpage foundation-collection-action coral-Link coral3-BasicList-item coral3-AnchorList-item')]")).click();
			driver.findElement(By.xpath("//*[contains(@class,'coral3-Card-wrapper')]")).click();
			driver.findElement(By.xpath("//*[contains(@class,'foundation-layout-inline2-item foundation-wizard-control coral3-Button coral3-Button--primary')]")).click();
			driver.findElement(By.name("./jcr:title")).sendKeys("Testpage");
			driver.findElement(By.name("pageName")).sendKeys("Testpage");
			driver.findElement(By.xpath("//*[@id=\"coral-id-11\"]/coral-panel[2]/coral-panel-content/div/button[2]")).click();
			driver.findElement(By.xpath("//*[text()='Done']")).click();
			System.out.println("Testpage created");
			System.out.println("Test pass");
																		
			driver.close();	
	}
	   }
