package playwright;



import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PlaywrightBasics {
    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
     LaunchOptions lp=new LaunchOptions();
        lp.setChannel("chrome");
        lp.setHeadless(false);
            Browser browser = playwright.chromium().launch(lp);
            Page page = browser.newPage();
            page.navigate("http://www.amazon.com");
            System.out.println("Page Title : "+page.title());
            System.out.println("Page URL : "+page.url());


    }
}
