package Lesson_3SeleniumWebdriver_Techniques;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamivDropdown {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        // //a[@value='MAA'] xpath for Chinai ale jak mamy w drugim dropdownie tą samą nazwę to Selenium idzie od lewego górnego rogu
        // więc wtedy stosujemy (//(a[@value='MAA'])[2]

        ////a[@value='BLR'] xpath for Bengaluru

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        Thread.sleep(2000);
        //driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();//czasami w projektach może być że nie akceptują indeksów [2]
        // wtedy można przekształcić to na metodę parent -> child xpath
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

        // Callendar functionality
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();



    }
}
