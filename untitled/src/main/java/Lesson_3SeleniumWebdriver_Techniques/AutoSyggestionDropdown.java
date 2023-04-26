package Lesson_3SeleniumWebdriver_Techniques;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AutoSyggestionDropdown {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("autosuggest")).sendKeys("ind");
        Thread.sleep(3000);
        List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));// opcje to nic innego jak lista WebElementów
                                        // teraz możemy zrobić iteracje każdej opcji i zobaczyć czy pasują do naszego req-a "ind" naszym celem jest wybrać Idnia
        for(WebElement option :options)// wybierz 1 opcje za każdym razem i ta opcja będzie w naszej zmiennej opcja a return type będzie WebElement
        {

            if (option.getText().equalsIgnoreCase("India")) // czyli jak zeskanuje i znajdzie India to musi to wybrać
            {
                option.click();
                break;
            }
        }



    }
}
