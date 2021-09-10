package aa.tests;

import aa.common.Constans;
import aa.users.user;
import aa.users.userFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class testic {
    //@Test
  //  public void W() {
   //     WebDriverManager.chromedriver().setup();
   //     final ChromeDriver driver = new ChromeDriver();
    //    driver.manage().window().maximize();
    //    driver.get("https://mvnrepository.com/");
   //     Assert.assertEquals(driver.getCurrentUrl(), "https://mvnrepository.com/");
    //    driver.quit();

    //}

    ChromeDriver driver;
    static user validUser = userFactory.getValidUser();

    @BeforeSuite
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Constans.BASE_URL);
    }

    @Test
    public void W1() {
        driver.findElement(By.name("login")).sendKeys(validUser.login);
        driver.findElement(By.name("pass")).sendKeys(validUser.password);
        driver.findElement(By.xpath("//input[@tabindex='5']")).click();
        String text = driver.findElement(By.xpath("//span[@class='sn_menu_title']")).getText();
        Assert.assertEquals(text, validUser.email);
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }
}
