package cucumberTests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.annotation.After;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.runtime.PendingException;

public class StepDefinition {
	
	WebDriver driver;
	
	@Given("^I launch home page$")
	public void I_lanch_home_page() {
	    driver = new ChromeDriver();
	    assertNotNull(driver);
	    driver.get("http://songs-by-sinatra.herokuapp.com");
	}

	@Given("^Home page is displayed correctly$")
	public void Home_page_is_displayed_correctly() {
		/*linkHome: linkText =""Home""
		imageSinatra: xpath = //img[@src='/images/sinatra.jpg']
		linkLogin: link txt = "log in "*/
		//primero encontrar los elementos
		WebElement homeLink = driver.findElement(By.linkText("Home"));
		WebElement imageSinatra = driver.findElement(By.xpath("//img[@src='/images/sinatra.jpg']"));
		WebElement linkLogin = driver.findElement(By.linkText("log in"));
		//verificar que estan desplegados.
		assertTrue(homeLink.isDisplayed());
		assertTrue(imageSinatra.isDisplayed());
		assertTrue(linkLogin.isDisplayed());
	}

	@When("^I log in to the application$")
	public void I_log_in_to_the_application() {
		WebElement linkLogin = driver.findElement(By.linkText("log in"));
		linkLogin.click();
		WebElement usernameTxt = driver.findElement(By.id("username"));
		WebElement passwordTxt = driver.findElement(By.id("password"));
		WebElement loginBtn = driver.findElement(By.xpath("//*[@value = 'Log In']"));
		
		usernameTxt.sendKeys("frank");
		passwordTxt.sendKeys("sinatra");
		loginBtn.click();
	}

	@When("^I show a list of songs$")
	public void I_show_a_list_of_songs() {
	    WebElement songsLink = driver.findElement(By.linkText("Songs"));
	    songsLink.click();
	}

	@When("^I create a new song$")
	public void I_create_a_new_song() {
		WebElement createSonglink = driver.findElement(By.xpath("//a[text()='Create a new song']"));
		createSonglink.click();
		
		WebElement title = driver.findElement(By.id("title"));
	    WebElement length = driver.findElement(By.id("length"));
	    WebElement date = driver.findElement(By.id("released_on"));
	    WebElement lyric = driver.findElement(By.id("lyrics"));
	    WebElement saveSongButton = driver.findElement(By.xpath("//input[@value='Save Song']"));
	    
	    date.sendKeys("06/05/2001");
	    title.click();
	    title.sendKeys("Hoy toca ser feliz");
	    length.sendKeys("330");
	    lyric.sendKeys("Cuando un sueño se te muera...");
	    saveSongButton.click();
	}

	@Then("^The song is created$")
	public void The_song_is_created() {
		WebElement successfullyMessage = driver.findElement(By.xpath("//*[@id='flash']//div[text()='Song successfully added']"));
		WebElement titleSong = driver.findElement(By.xpath("//*[@class='main content']//h1[text()='Hoy toca ser feliz']"));
		WebElement releaseDateSong = driver.findElement(By.xpath("//*[@class='main content']//p[text()='Release Date:  5 June 2001']"));
	    WebElement lengthSongP = driver.findElement(By.xpath("//p[contains(text(),'Length:')]"));
	    String textLength = lengthSongP.getText();
	    int lengthSong = 330;
	    int lengthMinutes = lengthSong/60;
	    int lengthSeconds = lengthSong % 60;
	    String messageLength = "Length: " + lengthMinutes + " minutes " + lengthSeconds + " seconds";
	    System.out.println("text1: " + textLength);
	    System.out.println("text2: " + messageLength);
	    Assert.assertTrue(textLength.equals(messageLength));
	    
	    
	}
	
	@After()
	public void endTest() {
		driver.quit();
	}



}
