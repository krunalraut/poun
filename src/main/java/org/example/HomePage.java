package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HomePage extends Util
{
    private By _NEWLink = By.linkText("Women");
    private By _TextOnHomePage = By.xpath("//div[@id=\"cmsinfo_block\"]/div[2]/h3");

public void clickOnNewLink()
{
    waitUntilElementClickable(_NEWLink,30);
    clickOnElement(_NEWLink,30);
}
public void checkHomePage()
{
    String text = driver.findElement(_TextOnHomePage).getText();
    Assert.assertEquals(text,"Custom Block","not on homepage");
}
}
