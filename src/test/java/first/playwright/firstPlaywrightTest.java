package first.playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class firstPlaywrightTest {
        public static void main(String[] args) {
            pageObjects PageObjects = new pageObjects();
            try {
                String appUrl = "http://olx.com.pk";
            PageObjects.navigateTo(appUrl);
            PageObjects.clickLoginButton();
            PageObjects.clickLoginEmailButton();
            PageObjects.enterEmail("hasnain.xaidi1@gmail.com");
            PageObjects.enterPassword("qwerty10@");
            PageObjects.clickSubmitButton();
            }
            finally {
                PageObjects.closeBrowser();
            }
        }
    }

