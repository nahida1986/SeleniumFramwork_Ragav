import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;



public class BrowserTest {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumhq.org");
        driver.manage().window().maximize();
       driver.getTitle();
       System.out.println("my Title " +driver.getTitle() );
		
	}

}
