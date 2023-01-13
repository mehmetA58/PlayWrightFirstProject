package playwright._0PlayWrightIntro;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class C02_Input {
    public static void main(String[] args) {
        Playwright pw = Playwright.create();
        Browser browser = pw.chromium().launch(
                new BrowserType.LaunchOptions()
                        .setHeadless(false)
        );
        Page page = browser.newPage();
        page.navigate("https://letcode.in/edit");
//        page.locator("//input[@id='fullName']").type("Can E");
//        page.locator("//input[@id='join']").fill("Can E");//önce clear sonra sendkeys yapar

        page.type("//input[@id='fullName']","Can E");
        String value=page.locator("//input[@id='getMe']").getAttribute("value");//ortonikc
        System.out.println(value);


//
////PlaywrightException: Error
//        page.locator("(//label[text()='Clear the text']/following::input)[1")//-->PlaywrightException: Error
//                .clear();
////->is not a valid XPath expression.

        page.locator("//input[@id='clearMe']")//-->PlaywrightException: Error
               .clear();
        page.close();
      browser.close();
        pw.close();

    }
}
