package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HelperUser extends HelperBase {
    public HelperUser(WebDriver wd) {
        super(wd);
    }

    public void openLoginForm() {
        click(By.xpath("//a[text()=' Log in ']")); // Create method click for class HelperBase

    }

    public void fillLoginForm(String email, String password) {
        type(By.id("email"),email);
        type(By.id("password"),password);
    }

    public void submitLogin() {
        click(By.xpath("//*[@type='submit']"));
    }

    public String getMessage() {
// ================Var1==============================
//        WebElement element = wd.findElement(By.cssSelector(".dialog-container>h2"));
//        String text = element.getText();
//        return text;
// ================Var2==============================
            return wd.findElement(By.cssSelector(".dialog-container>h2")).getText();

    }
}
