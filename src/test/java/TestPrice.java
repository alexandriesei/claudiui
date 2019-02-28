import adamcalculator.Calculate;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.Constants;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPrice {

    WebDriver webDriver;
    Calculate price;

    @BeforeSuite

    public void BeforeSuita() {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

        webDriver = new ChromeDriver();

    }

    @BeforeTest

    public void BeforeTest() {

        webDriver.get(Constants.URL);

        price=new Calculate(webDriver);

        price.selectLot();
        price.setEntryDate();
        price.setEntryTime();
        price.setExitDate();
        price.setExitTime();
        price.setCalculate();


    }

    @Test
    public void testPricePositive()
    {

    price.testPricePositive("$ 2.00");


    }

    @Test
    public void testPriceNegataive()
    {
        price.testPriceNegative("$ 1.00");

    }









}
