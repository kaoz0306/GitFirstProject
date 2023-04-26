package Lesson_3SeleniumWebdriver_Techniques;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class UpdateDropdown {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000L);
        // 2 or more adults
       /* int i=1;
        while(i<5) // zapętlaj dopóki pętla loop będzie mniejsza jak 5
            // cokolwiek tu nie wpiszemy warunek będzie wykonywany tak długo aż będzie false
        {
            driver.findElement(By.id("hrefIncAdt")).click();//4 adults
            i++; // jak wprowadzimy zmienną to będzie zapętlać do 4 true a a jak osiągnie 5<5 bedzie false i przejdzie dalej. Dlatego wyżej jest zmienna int i=1 i warunek i<5
        }*/
        // Drugi sposób na pętle tym razem for i zapisujemy w jednym ciągu
        for (int i = 1; i < 5; i++) {
            driver.findElement(By.id("hrefIncAdt")).click();
        }
        driver.findElement(By.id("btnclosepaxoption")).click();

        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());


    }
}
