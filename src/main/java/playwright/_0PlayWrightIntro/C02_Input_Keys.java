package playwright._0PlayWrightIntro;

import com.microsoft.playwright.*;

public class C02_Input_Keys {
    public static void main(String[] args) {
        Playwright pw = Playwright.create();
        Browser browser = pw.chromium().launch(
                new BrowserType.LaunchOptions()
                        .setHeadless(false)
        );
        Page page = browser.newPage();
        page.navigate("https://letcode.in/edit");
        page.locator("//input[@id='fullName']").type("Can E");
     Locator locator=  page.locator("//input[@id='fullName']");
        locator.press("Tab");
     locator.type("acaba");




//        page.close();
//        browser.close();
//        pw.close();

    }
}
