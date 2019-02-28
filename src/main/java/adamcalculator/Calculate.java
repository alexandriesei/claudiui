package adamcalculator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.Constants;
import org.testng.Assert;


public class Calculate {

    By lot = By.id("Lot");
    By entryTime = By.id("EntryTime");
    By entryDate = By.id("EntryDate");
    By exitTime = By.id("ExitTime");
    By exitDate = By.id("ExitDate");
    By calculate = By.name("Submit");
    By checkPrice=By.xpath("/html/body/form/table/tbody/tr[4]/td[2]/span/font/b");
    WebDriver webDriver;

    public Calculate(WebDriver webDriver) {
        this.webDriver = webDriver;
    }



    public void selectLot() {
        webDriver.get("http://adam.goucher.ca/parkcalc/index.php");
        Select dropdown = new Select(webDriver.findElement(lot));
        dropdown.selectByValue("LTS");

    }

    public void setEntryDate() {

        WebElement entrydate = webDriver.findElement(entryDate);
        entrydate.clear();
        entrydate.sendKeys(Constants.ENTRYDATE);
    }

    public void setEntryTime() {
        WebElement entrytime = webDriver.findElement(entryTime);
        entrytime.clear();
        entrytime.sendKeys(Constants.ENTRYTIME);

    }


    public void setExitTime() {
        WebElement exittime = webDriver.findElement(exitTime);
        exittime.clear();
        exittime.sendKeys(Constants.EXITTIME);
    }

    public void setExitDate() {
        WebElement exitdate = webDriver.findElement(exitDate);
        exitdate.clear();
        exitdate.sendKeys(Constants.EXITDATE);

    }

    public void setCalculate() {

        WebElement clickcalculate = webDriver.findElement(calculate);
        clickcalculate.click();
    }



    public void testPricePositive(String expectedprice)
    {
        WebElement checkprice=webDriver.findElement(checkPrice);
        Assert.assertEquals(checkprice.getText(),expectedprice);




    }

    public void testPriceNegative(String expectedprice)
    {
        WebElement checkprice=webDriver.findElement(checkPrice);
        Assert.assertNotEquals(checkprice.getText(),expectedprice);



    }
}
