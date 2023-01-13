package playwright._0PlayWrightIntro;


import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class C01_LaunchBrowser {
    public static void main(String[] args) {

        Playwright pw = Playwright.create();
       // Browser browser = pw.chromium().launch();//for Brave-->headles browser acılmıyor
     //   Browser browser=pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));//-->false değeri  bir browser acar.
      //  Browser browser=pw.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));//-->firefox browser engine
     //   Browser browser=pw.webkit().launch(new BrowserType.LaunchOptions().setHeadless(false));//-->safari browser engine
   //PlaywrightException-->     Browser browser=pw.webkit().launch(new BrowserType.LaunchOptions().setHeadless(false).setChannel("chrome"));//Unsupported webkit channel "chrome"
       // Browser browser=pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setChannel("chrome"));
        Browser browser=pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setChannel("msedge"));
        Page page = browser.newPage();
        page.navigate("https://letcode.in");

        System.out.println(page.title());
        page.close();
        browser.close();
        pw.close();
    }
}