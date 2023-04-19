package cc2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task1 {
public static void main(String[] args)
{
WebDriverManager.chromedriver().setup();
WebDriver driver;
ChromeOptions co=new ChromeOptions();
co.addArguments("--remote-allow-origins=*");
driver=new ChromeDriver(co);
driver.manage().window().maximize();
driver.get("https://www.yatra.com/");
WebElement flight = driver.findElement(By.xpath("//*[@id=\"booking_engine_flights\"]"));
flight.click();
WebElement rtrip = driver.findElement(By.xpath("//*[@id=\"BE_flight_form_wrapper\"]/div[1]/div[1]/ul[1]/li[2]/a"));
rtrip.click();
WebElement departFrom = driver.findElement(By.xpath("//*[@id=\"BE_flight_origin_city\"]"));
departFrom.click();
WebElement departClick= driver.findElement(By.xpath("//*[@id=\"BE_flight_form_wrapper\"]/div[1]/div[2]/ul/li[1]/ul/li[1]/div/div/ul/div/div/div/li[1]/div[1]/p[1]"));
departClick.click();
WebElement goingTo = driver.findElement(By.xpath("//*[@id=\"BE_flight_arrival_city\"]"));
goingTo.click();
WebElement goingClick = driver.findElement(By.xpath("//*[@id=\"BE_flight_form_wrapper\"]/div[1]/div[2]/ul/li[1]/ul/li[3]/div/div/ul/div/div/div/li[3]"));
goingClick.click();
WebElement departDate = driver.findElement(By.xpath("//*[@id=\"BE_flight_origin_city\"]"));
departDate.click();
WebElement dateClick = driver.findElement(By.xpath("//*[@id=\"20/04/2023\"]"));
dateClick.click();
WebElement returnDate = driver.findElement(By.xpath("//*[@id=\"BE_flight_arrival_date\"]"));
returnDate.click();
WebElement returnClick = driver.findElement(By.xpath("//*[@id=\"22/04/2023\"]"));
returnClick.click();
WebElement traveller = driver.findElement(By.xpath("//*[@id=\"BE_flight_paxInfoBox\"]/span"));
traveller.click();
WebElement adult = driver.findElement(By.xpath("//*[@id=\"BE_flight_passengerBox\"]/div[1]/div[1]/div/div/span[2]"));
adult.click();
WebElement chk = driver.findElement(By.xpath("//*[@id=\"special_student_offer\"]/a/i"));
chk.click();
WebElement search = driver.findElement(By.xpath("//*[@id=\"BE_flight_flsearch_btn\"]"));
search.click();


}
}


