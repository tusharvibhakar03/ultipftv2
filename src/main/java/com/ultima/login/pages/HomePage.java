package com.ultima.login.pages;

import com.ultima.login.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    @FindBy(linkText = "Sign In")
    WebElement loginPage;
  //  By loginPage = By.linkText("Sign In");
    public void clickOnLogin(){
        clickOnElement(loginPage);
    }
}
