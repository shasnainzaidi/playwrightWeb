package first.playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class baseTest {

    protected Browser browser;
    protected Page page;
    protected Playwright playwright;

    public baseTest(){
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        page = browser.newPage();
    }
    public void navigateTo(String url){
        page.navigate(url);

    }
    public void closeBrowser(){
        browser.close();
        playwright.close();
    }
}
