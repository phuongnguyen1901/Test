package pageobjects;

import Common.Constans;
import Common.Events;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginAction {
    public boolean checkLoginPage(WebDriver driver){
        boolean result = false;
        try{
            boolean logo = driver.findElements(By.xpath("//img[@alt='CareerLink']")).size()>0;
            if (logo){
                return true;
            }
        }catch (Exception e){
            Constans.errorLog.concat(e.getMessage());
            System.out.println(e.getMessage());
        }
        return result;
    }

    public boolean insertUsernameAndPassword(WebDriver driver, String username,String password){
        boolean result = false;
        try{
            Events.inputTextField(driver,By.xpath("//input[@name='_username']"),username);
            Events.inputTextField(driver,By.xpath("//input[@name='_password']"),password);
            Events.clickButton(driver,By.xpath("//button[@type='submit']"));
            result = true;
        }catch (Exception e){
            Constans.errorLog.concat(e.getMessage());
            System.out.println(e.getMessage());
        }
        return result;
    }

    public boolean checkLoginSuccess(WebDriver driver){
        boolean result = false;
        try{
            boolean checkSuccess = driver.findElements(By.xpath("//a[@class='nav-link nav-link-with-icon']")).size()>0;
            if (checkSuccess){
                result = true;
            }
        }catch (Exception e){
            Constans.errorLog.concat(e.getMessage());
            System.out.println(e.getMessage());
        }
        return result;
    }

    public boolean navigateToJobApplication(WebDriver driver){
        boolean result = false;
        try{
            if(Events.clickButton(driver,By.xpath("//li[@class='nav-item dropdown']//a[@id='profileMenu']"))){
                if (Events.clickButton(driver,By.xpath("//div[@class='col-8 px-2 py-0']//a[@href='/nguoi-tim-viec/ho-so']"))){
                    result = true;
                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
            Constans.errorLog.concat(e.getMessage());
        }
        return  result;
    }
}
