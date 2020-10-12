package org.example;

import org.openqa.selenium.By;

public class WomenPage extends Util{
    private By _TopLink = By.linkText("Tops");

    public void clickOnTops()
    {
        waitUntilElementClickable(_TopLink,30);
        clickOnElement(_TopLink,30);
    }
}
