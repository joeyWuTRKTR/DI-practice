import web.AdultWeb;
import web.Browser;
import web.NormalWeb;
import web.Web;

public class Program {
    public static void main(String[] args) {
        Web web = new NormalWeb(); // 依賴注入
        Browser browser = new Browser(web);
        browser.RenderWeb();

        Web adultWeb = new AdultWeb(web, 18); // 開放封閉
        Browser browser1 = new Browser(adultWeb); // 里氏替換
        browser1.RenderWeb();
    }
}