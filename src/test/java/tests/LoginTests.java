package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

    @Test
    public void loginSuccess(){
    app.getHelperUser().openLoginForm();   //Create method  for class HelperUser
    app.getHelperUser().fillLoginForm("svngdv@gmail.com","A123456789a@"); //Create method  for class HelperUser
    app.getHelperUser().submitLogin();
    //Assert if element with text "Logged in success" is present
        Assert.assertEquals(app.getHelperUser().getMessage(),"Logged in success"); //create to method .getMessage for class HelperUser


    //app.getHelperUser().clickOkButton();
    }





}
