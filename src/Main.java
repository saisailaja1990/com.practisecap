import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunee\\Desktop\\chrome105\\chromedriver_win32\\chromedriver.exe");

                WebDriver driver=new ChromeDriver();
                driver.manage().window().maximize();
                driver.get("https://www.naukri.com/");
                Thread.sleep(3000);
                String mainwindow=driver.getTitle();
                String mainwinId=driver.getWindowHandle();
                Set<String> winId=driver.getWindowHandles();
                for(String Id:winId)
                {
                    driver.switchTo().window(Id);
                    if(!driver.getTitle().equalsIgnoreCase(mainwindow))
                        driver.close();
                }


                driver.switchTo().window(mainwinId);
                System.out.println(mainwindow);
                driver.quit();
//	System.out.println(mainwinId);
            }
        }

