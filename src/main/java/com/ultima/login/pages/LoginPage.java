package com.ultima.login.pages;

import com.ultima.login.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {

    @CacheLookup
    @FindBy(linkText = "Sign In")
    WebElement loginPage;

    @FindBy(xpath="//h2[@class='page__heading']")
    WebElement loginText;

    @FindBy(id="user[email]")
     WebElement emailField;

    @FindBy(id="user[password]")
            WebElement passwordField;

    @FindBy(xpath="//input[@type='submit']")
    WebElement signIn;

//   By loginPage = By.linkText("Sign In");
 //   By loginText = By.xpath("//h1[contains(text(),'Welcome Back!')]");
 //   By emailField = By.id("user[email]");
//    By passwordField = By.id("user[password]");
  //  By signIn = By.xpath("//input[@type='submit']");

    By errorMessage = By.xpath("//li[contains(text(),'Invalid email or password.')]");

    public String getLoginText(){
        return getTextFromElement(loginText);
    }
    public void enterUserName(String email){
       sendTextToElement(emailField,email);
    }
    public void enterPassword(String password){
        sendTextToElement(passwordField,password);
    }
    public String getErrorMessage(){
        return getTextFromElement(errorMessage);
    }
  public void clickOnSignIn(){
        clickOnElement(signIn);
    }
}
