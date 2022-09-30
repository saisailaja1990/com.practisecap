import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basetest_AxCrypt_AccountSite {
    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sunee\\Desktop\\chrome105\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        String Url="https://www.axcrypt.net/";
        driver.get(Url);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement Sign_In= driver.findElement(By.xpath("//div[text()=' Sign in ']"));
        Sign_In.click();

        WebElement Email= driver.findElement(By.id("useremail"));
        Email.sendKeys("saisailajapattipati@axcrypt.net");

        WebElement Password=driver.findElement(By.id("login-temp-password"));
        Password.sendKeys("Suneel@143");

        WebElement Showpassword= driver.findElement(By.id("togglePassword"));
        Showpassword.click();

        WebElement Remember_me=driver.findElement(By.id("RememberMe"));
        Remember_me.click();

        WebElement Signin= driver.findElement(By.xpath("//input[@class='button signin-button success']"));
        Signin.click();

        WebElement Signout=driver.findElement(By.linkText("Sign Out"));
        Signout.click();

        driver.quit();


    }
}
