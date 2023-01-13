package playwright._0PlayWrightIntro;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class C01_LB_Assigment_1 {
    public static void main(String[] args) {
        /*

        *goto google.com
        *Print title and url

        */

        Playwright pw = Playwright.create();
        //--local       Browser browser=pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
         Browser browser=pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setChannel("chrome"));
        Page page = browser.newPage();
        page.navigate("https://www.google.com");

        System.out.println(page.title());
        System.out.println(page.url());





        page.close();
        browser.close();
        pw.close();
    }
}
