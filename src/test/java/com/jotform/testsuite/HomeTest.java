package com.jotform.testsuite;

import com.jotform.customlisteners.CustomListeners;
import com.jotform.pages.HomePage;
import com.jotform.pages.SecurityPage;
import com.jotform.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class HomeTest extends TestBase {
    HomePage homePage;
    SecurityPage securityPage;

    @BeforeMethod (alwaysRun = true)
    public void init() {
        homePage = new HomePage();
        securityPage = new SecurityPage();
    }

    @Test(groups = {"sanity", "smoke", "regression"})
    public void testHappyPath() throws InterruptedException {

        homePage.clickOnFirstname("kavan");
        homePage.clickOnLastName("patel");
        homePage.clickOnNextButton1();
        homePage.uploadFile();
        homePage.clickOnNextButton2();
        homePage.sendSignature();

        homePage.setClickOnnextButton3();
        homePage.selectDate();
        homePage.clickOnDate();
        homePage.clickOnnext();

        securityPage.selectsecurity(1);

        securityPage.selectAnswer("xyz");
        securityPage.clickOnSubmitButton();
        securityPage.clickOnNext();
        securityPage.selectSubmit1();
        homePage.getYoursubmissionreceivedText();
  }
}
