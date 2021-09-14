

	import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class HelloSelenium {

	    public static void main(String[] args) throws InterruptedException {
	    	Scanner scan = new Scanner(System.in);
	    	System.out.println("cosa vuoi cercare su wikipedia?");
	    	String ricerca = scan.nextLine();
	    	WebDriver driver = new ChromeDriver();
	        WebDriverWait wait = new WebDriverWait(driver, 25);
	        try {
	            driver.get("https://it.wikipedia.org/wiki/Pagina_principale");
	            driver.findElement(By.name("search")).sendKeys(ricerca + Keys.ENTER);
	            driver.switchTo().window("https://google.it/");
	            Thread.sleep(10000);
	            WebElement firstResult = wait.until(presenceOfElementLocated(By.className("searchresult")));
	            System.out.println(firstResult.getAttribute("textContent"));
	        } finally {
	            System.out.println("premi 1 per uscire");
	            if(scan.nextInt()==1)
	            	driver.quit();
	        }
	        scan.close();
	    }
	}
