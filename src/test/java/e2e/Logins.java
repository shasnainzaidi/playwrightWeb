package e2e;

import Objects.loginObjects;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Logins {

private Objects.loginObjects login;
     @BeforeClass
    public void setUp() {
         login = new loginObjects();
     }
         @Test
         public void emailLogin(){
                String appUrl = "http://olx.com.pk";
            login.navigateTo(appUrl);
            login.clickLoginButton();
            login.clickLoginEmailButton();
            login.enterEmail("hasnain.xaidi1@gmail.com");
            login.enterPassword("qwerty10@");
            login.clickSubmitButton();
            login.clickUserProfile();

             Assert.assertEquals(login.actualUserName, login.expectedUserName,"The Username does not match the expected value." );
            }




    @AfterClass
    public void tearDown() {
        login.closeBrowser();
    }
        }

