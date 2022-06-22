package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class indexPage extends util {
    @FindBy(xpath = "//a[@title='Women']")protected WebElement lnkWomen;
    @FindBy(xpath = "//a[@title='Women']/following-sibling::ul/li/ul/li/a[@title='Casual Dresses']")protected WebElement lnkCasual;

    public indexPage() {
        PageFactory.initElements(driver, this);
    }

    public void mouseoverWomen(){
        wait.until(ExpectedConditions.visibilityOf(lnkWomen));
        action.moveToElement(lnkWomen).perform();
    }

    public void clickCasualDresses(){
        wait.until(ExpectedConditions.elementToBeClickable(lnkCasual));
        lnkCasual.click();
    }
}
