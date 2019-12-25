import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddUSER {

    public static WebDriver driver;

    @Test
    public void Login () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Helena\\Downloads\\Chrome\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://users.bugred.ru/");
        driver.findElement(By.xpath ("//*[contains (text(), \"Войти\")]")).click();
        driver.findElement(By.xpath ("/html/body/div[3]/div[1]/div[1]/form/table/tbody/tr[1]/td[2]/input")).sendKeys("razg@ukr.net");
        driver.findElement(By.xpath ("/html/body/div[3]/div[1]/div[1]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("12345");
        driver.findElement(By.xpath ("/html/body/div[3]/div[1]/div[1]/form/table/tbody/tr[3]/td[2]/input")).submit();
        driver.findElement(By.xpath ("/html/body/div[3]/p[1]/a")).click();
        driver.findElement(By.xpath ("/html/body/div[3]/form/table/tbody/tr[1]/td[2]/input")).sendKeys("Semona");
        driver.findElement(By.xpath ("/html/body/div[3]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("sema@ukr.net");
        driver.findElement(By.xpath ("/html/body/div[3]/form/table/tbody/tr[3]/td[2]/input")).sendKeys("12345");
        driver.findElement(By.xpath ("/html/body/div[3]/form/table/tbody/tr[21]/td[2]/input")).click();
        driver.findElement(By.xpath ("//*[@id=\"fat-menu\"]/a")).click();
        driver.findElement(By.xpath ("//*[@id=\"fat-menu\"]/ul/li[1]/a")).click();
        driver.findElement(By.xpath ("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("ADEL");
        driver.findElement(By.xpath ("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[3]/td[2]/select")).sendKeys("Женский");

        driver.findElement(By.xpath ("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[4]/td[2]/input")).sendKeys("13.12.2000");
        driver.findElement(By.xpath ("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[5]/td[2]/input")).sendKeys("05.05.2015");
        driver.findElement(By.xpath ("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[6]/td[2]/textarea")).sendKeys("read a books");
        driver.findElement(By.xpath ("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[7]/td[2]/input")).sendKeys("123456789101");
        driver.findElement(By.xpath ("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[8]/td[2]/input")).click();

    }


}
