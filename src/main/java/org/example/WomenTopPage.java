package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class WomenTopPage extends Util{
private By _TextOnTopPage = By.xpath("//div[@id=\"center_column\"]/div[1]/div[1]/div[1]/span");


public void checkWomenTopPage()
{
    String text1 = driver.findElement(_TextOnTopPage).getText();
    Assert.assertEquals(text1,"Tops");
}
}
