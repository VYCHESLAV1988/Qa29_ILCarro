package manager;

import org.openqa.selenium.WebDriver;

public class HelperBase {
    WebDriver wd;
    //created Constructor == click the right baton with the Generate and click to Constructor and click to Ok!
    public HelperBase(WebDriver wd) {
        this.wd = wd;
    }
}
