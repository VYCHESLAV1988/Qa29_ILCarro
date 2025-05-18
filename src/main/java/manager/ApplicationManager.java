package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApplicationManager {
    WebDriver wd;

    HelperUser helperUser;

    public void init(){
    wd = new ChromeDriver();
    wd.navigate().to("https://ilcarro.web.app");
    helperUser = new HelperUser(wd);
    }

    public void stop(){

        //wd.quit();
    }
    //Create Getter == click right button mouse and selected Generate and selected Getter and clock HelperUser

    public HelperUser getHelperUser() {
        return helperUser;
    }
}
