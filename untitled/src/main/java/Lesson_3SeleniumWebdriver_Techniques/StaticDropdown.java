package Lesson_3SeleniumWebdriver_Techniques;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        // dropdown with select tag
        WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));//tą zmienna staticDropdown musimy skopiować poniżej

        Select dropdown = new Select(staticDropdown); //we are creating new object
        dropdown.selectByIndex(3); //teraz musimy potwierdzić czy USD zostało faktycznie wybrane więc poniżej tworzymy object do klasy Select i object czyli dropdown wywołuje metody np.selectbyindex
        System.out.println(dropdown.getFirstSelectedOption().getText());
        //Jeśli chcemy z dropdownu wybrać AED
        dropdown.selectByVisibleText("AED");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        //another method to find atribute
        dropdown.selectByValue("INR");
        System.out.println(dropdown.getFirstSelectedOption().getText());

    }
}
