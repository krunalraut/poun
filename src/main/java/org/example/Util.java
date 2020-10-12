package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util extends BaseProject{
        //waiting for element to be clickable
        public void waitUntilElementClickable(By by, int time) {
            WebDriverWait wait = new WebDriverWait(driver, time);
            wait.until(ExpectedConditions.elementToBeClickable(by));
        }

        //waiting for element to be visible
        public void waitUntilElementVisible(By by, int time) {
            WebDriverWait wait = new WebDriverWait(driver, time);
        }

        public void clickOnElement(By by, int time) {
            waitUntilElementClickable(by, time);
            driver.findElement(by).click();
        }

        //for enter text to textbox
        public void typeText(By by, String text, int time) {
            waitUntilElementClickable(by, time);
            driver.findElement(by).sendKeys(text);
        }
    }

