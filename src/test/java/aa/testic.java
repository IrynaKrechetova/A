package aa;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testic {
    @Test
    public void W() {
        WebDriverManager.chromedriver().setup();
        final ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mvnrepository.com/");
        Assert.assertEquals(driver.getCurrentUrl(), "https://mvnrepository.com/");
        driver.quit();
    }
}
