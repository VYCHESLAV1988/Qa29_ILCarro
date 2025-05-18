package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HelperBase {
    WebDriver wd;
    //created Constructor == click the right baton with the Generate and click to Constructor and click to Ok!
    public HelperBase(WebDriver wd) {
        this.wd = wd;
    }

public void click(By locator){
wd.findElement(locator).click();
}
public void type(By locator , String text){
    WebElement element = wd.findElement(locator);
    element.click();
    element.clear();
    if (text != null){
       element.sendKeys(text);
    }
}




}