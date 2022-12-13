package com.ultima.login.testsuite;

import com.ultima.login.customlisteners.CustomListeners;
import com.ultima.login.pages.HomePage;
import com.ultima.login.pages.LoginPage;
import com.ultima.login.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class LoginTest extends BaseTest {

    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod (alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        loginPage = new LoginPage();
    }
 //  HomePage homePage = new HomePage();
   // LoginPage loginPage = new LoginPage();

    @Test(groups = {"sanity","regression"})


   public void verifyUserShouldOnLogin(){
        homePage.clickOnLogin();
        Assert.assertEquals(loginPage.getLoginText(),"Welcome Back!","not Verified");
    }
    @Test (groups = {"smoke","regression"})
    public void verifyTheErrorMessage(){
        homePage.clickOnLogin();
        loginPage.enterUserName("Prime@gmail.com");
        loginPage.enterPassword("Welcome");
        loginPage.clickOnSignIn();
        Assert.assertEquals(loginPage.getErrorMessage(),"Invalid email or password.","Not verify");
    }



}
