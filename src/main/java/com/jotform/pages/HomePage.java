package com.jotform.pages;

import com.aventstack.extentreports.Status;
import com.jotform.customlisteners.CustomListeners;
import com.jotform.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import static org.openqa.selenium.By.xpath;

public class HomePage extends Utility {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//button[@id='jfCard-welcome-start']")
    WebElement nextButton;

    @CacheLookup
    @FindBy(css = "#first_3")
    WebElement firstName;

    @CacheLookup
    @FindBy(css = "#last_3")
    WebElement lastName;

    @CacheLookup
    @FindBy(css = "#form-pagebreak-next_5")
     WebElement nextButton1;
    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'Browse Files')]")
    WebElement browseFiles;
    @CacheLookup
    @FindBy(css = "#form-pagebreak-next_4")
    WebElement nextButton2;
     @CacheLookup
     @FindBy(xpath = "//canvas[@aria-label='E-Signature Field']")
     WebElement signature;
     @CacheLookup
     @FindBy(css = "#form-pagebreak-next_8")
     WebElement nextButton3;

     @CacheLookup
     @FindBy(xpath = "//img[@id='input_9_pick']")
     WebElement date;
     @CacheLookup
     @FindBy(xpath = "//td[contains(text(),'23')]")
     WebElement clickdate;

     @CacheLookup
     @FindBy(css = "#form-pagebreak-next_10")
     WebElement nextButton4;



     @CacheLookup
     @FindBy(xpath = "//p[contains(text(),'Your submission has been received.')]")
     WebElement verifyText;
public void clickOnNextButton(){
    clickOnElement(nextButton);
    CustomListeners.test.log(Status.PASS,"Click on Next Button ");
}
public void clickOnFirstname(String name){
    sendTextToElement(firstName,name);
    CustomListeners.test.log(Status.PASS,"Click on First Name ");
}
public void clickOnLastName(String name){
    sendTextToElement(lastName,name);
    CustomListeners.test.log(Status.PASS,"Click on Last Name ");
}
public void clickOnBrowsefile(){
    clickOnElement(browseFiles);

}
    public void clickOnNextButton1(){
        clickOnElement(nextButton1);
        CustomListeners.test.log(Status.PASS,"Click on Next Button1 ");
    }
    public void clickOnNextButton2(){
        clickOnElement(nextButton2);
        CustomListeners.test.log(Status.PASS,"Click on Next Button2 ");
    }
    public void sendSignature(){

        Actions a = new Actions(driver);
        Action b = a.moveToElement(signature).clickAndHold().moveToElement(signature,-50,-30)
                .moveByOffset(-30,-50).moveByOffset(50,40)
                .moveByOffset(-20,60).moveByOffset(30,-30).release(signature).build();
        b.perform();
        CustomListeners.test.log(Status.PASS,"Send signature ");

    }
    public void setClickOnnextButton3(){
    clickOnElement(nextButton3);
        CustomListeners.test.log(Status.PASS,"Click on Next Button3 ");
    }
  public void selectDate(){
    clickOnElement(date);
      CustomListeners.test.log(Status.PASS,"Select Date ");
  }
  public void clickOnDate(){
    clickOnElement(clickdate);
      CustomListeners.test.log(Status.PASS,"Click on Date ");
  }
  public void clickOnnext(){
    clickOnElement(nextButton4);
      CustomListeners.test.log(Status.PASS,"Click on Next Button4 ");
  }
    public String getYoursubmissionreceivedText() {
        String message = getTextFromElement(verifyText);
        return message;
    }

    public void uploadFile() {
    WebElement add = driver.findElement(xpath("//input[@id='input_6']"));
       add.sendKeys("C:\\Users\\Toshiba\\Desktop\\file.txt");
           }


}
