package first.playwright;

public class pageObjects extends baseTest{

    private final String loginButton = "//button[@aria-label='Login']";
    private final String loginWithEmailButton = "//span[normalize-space()='Login with Email']";
    private final String emailField = "//input[@id='email']";
    private final String passwordField = "//input[@id='password']";
    private final String submitButton = "//span[normalize-space()='Log in']";

    public void clickLoginButton(){
        page.locator(loginButton).click();
    }
    public void clickLoginEmailButton(){
        page.locator(loginWithEmailButton).click();
    }
    public void enterEmail(String email){
        page.locator(emailField).fill(email);
    }
    public void enterPassword(String password) {
        page.locator(passwordField).fill(password);
    }

    public void clickSubmitButton() {
        page.locator(submitButton).click();
    }

}
