package com.jotform.pages;

import com.aventstack.extentreports.Status;
import com.jotform.customlisteners.CustomListeners;
import com.jotform.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class SecurityPage extends Utility {
    public SecurityPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//select[@id='input_11']")////span[@class='jfDropdown-toggle']
    WebElement security;

    @FindBy(css = "#input_11")
    WebElement clickquestion;

    @FindBy(css = "#input_12")
    WebElement answer;

    @FindBy(css = "#form-pagebreak-next_13")
    WebElement submit;
    @FindBy(css = "#form-pagebreak-next_14")
    WebElement next12;

    @FindBy(xpath = "//button[@id='input_2']")
    WebElement submit1;

    public void selectsecurity(int value) {
        selectByIndexFromDropDown(security, value);
        CustomListeners.test.log(Status.PASS,"Select Security ");
    }

    public void clickOnQuestion() {
        clickOnElement(clickquestion);
        CustomListeners.test.log(Status.PASS,"Click on Question ");
    }

    public void selectAnswer(String name) {
        sendTextToElement(answer, name);
        CustomListeners.test.log(Status.PASS,"Select Answer ");
    }

    public void clickOnSubmitButton() {
        clickOnElement(submit);
        CustomListeners.test.log(Status.PASS,"Click on Submit Button ");
    }

    public void clickOnNext() {
        clickOnElement(next12);
        CustomListeners.test.log(Status.PASS,"Click on Next Button1 ");
    }
    public void selectSubmit1(){
        clickOnElement(submit1);
        CustomListeners.test.log(Status.PASS,"Click on Submit1 Button ");
    }
}