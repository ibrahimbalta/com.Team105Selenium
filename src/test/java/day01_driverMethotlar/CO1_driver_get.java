package day01_driverMethotlar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CO1_driver_get {
    public static void main(String[] args) throws InterruptedException {
       /*System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver_win32 (2)/chromedriver.exe") ;*/
        System.setProperty("webdriver.firefox.driver","src/drivers/firefoxdriver/geckodriver.exe") ;
      /*WebDriver driver=new ChromeDriver();
      driver.get("https://www.amazon.com/");
      Thread.sleep(500);
      driver.close();*/
      WebDriver fdriver=new FirefoxDriver();
        fdriver.get("https://www.expedia.com/");
        fdriver.findElement(By.id("d1-btn")).click();
    }
}
