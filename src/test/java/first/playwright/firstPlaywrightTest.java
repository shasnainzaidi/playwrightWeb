package first.playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class firstPlaywrightTest {
        public static void main(String[] args) {
            try (Playwright playwright = Playwright.create()) {
                // Launch the browser
                Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
                // Open a new page
                Page page = browser.newPage();

                // Navigate to the URL
                String appUrl = "http://olx.com.pk"; // Replace with your application's URL
                page.navigate(appUrl);

                // Locate and fill the login form
                page.locator("//button[@aria-label='Login']").click();
                page.locator("//span[normalize-space()='Login with Email']").click(); // Replace with username field's selector and value

                page.locator("//input[@id='email']").fill("hasnain.xaidi1@gmail.com"); // Replace with username field's selector and value
                page.locator("//input[@id='password']").fill("qwerty10@"); // Replace with password field's selector and value

                // Click the login button
                page.locator("//span[normalize-space()='Log in']").click();

                // Add an assertion (optional) to verify successful login


                // Close the browser
                browser.close();
            }
        }
    }

