package playwright._0PlayWrightIntro;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class C02_Inpt_Assigment_2 {
    public static void main(String[] args) {
        Playwright pw = Playwright.create();
        Browser browser=pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setChannel("chrome"));
        Page page = browser.newPage();
        page.navigate("https://www.lambdatest.com/selenium-playground/simple-form-demo");
        page.type("//input[@id='user-message']","Can");
        page.locator("//button[@id='showInput']").click();
        System.out.println(page.locator("//p[@id='message']").textContent());//Can


        page.type("//input[@id='sum1']","8");
        page.type("//input[@id='sum2']","2");
        page.locator("//button[normalize-space()='Get values']").click();

        System.out.println(page.locator("//p[@id='addmessage']").textContent());//10








        page.close();
        browser.close();
        pw.close();
    }
}
