package first.playwright;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Logins {

private pageObjects PageObjects;
     @BeforeClass
    public void setUp() {
         PageObjects = new pageObjects();
     }
         @Test
         public void emailLogin(){
                String appUrl = "http://olx.com.pk";
            PageObjects.navigateTo(appUrl);
            PageObjects.clickLoginButton();
            PageObjects.clickLoginEmailButton();
            PageObjects.enterEmail("hasnain.xaidi1@gmail.com");
            PageObjects.enterPassword("qwerty10@");
            PageObjects.clickSubmitButton();
            }

    @AfterClass
    public void tearDown() {
        // Close the browser
        PageObjects.closeBrowser();
    }
        }

