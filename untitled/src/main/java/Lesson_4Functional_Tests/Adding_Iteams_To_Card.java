package Lesson_4Functional_Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class Adding_Iteams_To_Card {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        int j = 0; // warunek przerzucony z samego dołu żeby zadeklarować jak produkt osiagnie wartość 3 to ma sie zatrzymac
        // Jak chcemy wybierać wiele produktów to musimy najpierw zadeklarować i utworzyc tablice czyli po String [] i to co chcemy umieszczamy w { }
        String[] itemsVeggies = {"Cucumber", "Brocolli", "Beetroot"};

        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        Thread.sleep(3000);

        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

        for (int i = 0; i < products.size(); i++) //iteracja produktów zaczyna się od 0 do 30 produktów
        {
            // za każdym razem muszę pobrać indeks z tych 30 stu a później pobrać tekst z produktów czyli z By.cssSelector("h4.product-name"))
            /*String name to zmienna */
            String[] name = products.get(i).getText().split("-"); // czyli za każdym razem loop zupdatuje indeks o 30 razy i każdy produkt bedzie kontrolowany za pomocą getText
            // Brocoli - 1 Kg
            String formattedName = name[0].trim(); // Czyli najpierw dostane tekst z getText() później go podzielimy split póxniej pobieramy wartość Brocoli i mając na uwadze że są spacje - 1 Kg usuwamy je za pomocą trim
            // convert array into array list for easy search
            // Check whether name you extracted is present in array or not z tych { } na górze
            List itemsNeededList = Arrays.asList(itemsVeggies);

            if (itemsNeededList.contains(formattedName))
            // if (name.contains("Cucumber")) tego możemy użyć gdy chcemy wybrac tylko cucumber
            {
                j++;
                // click Add To Card
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();  // czyli cała petla powyżej sprawdza czy jest cucumber jeśli jest to przechodzi tutaj i klika Add to card

                if (j == 3) {
                    break;
                }

            }


        }
    }
}
