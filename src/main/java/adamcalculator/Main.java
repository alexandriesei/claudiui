package adamcalculator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Constants;

public class Main {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get(Constants.URL);
        Calculate practice = new Calculate(webDriver);
        practice.selectLot();
        practice.setEntryDate();
        practice.setEntryTime();
        practice.setExitDate();
        practice.setExitTime();
        practice.setCalculate();

    }


}



