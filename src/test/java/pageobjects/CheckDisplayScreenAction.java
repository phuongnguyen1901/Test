package pageobjects;

import Common.Constans;
import Common.Events;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckDisplayScreenAction {
    public boolean navigateToCreateJob(WebDriver driver){
        boolean result = false;
        try{
            if (Events.clickButton(driver, By.xpath("//a[@role='button' and @href='/nguoi-tim-viec/thu-xin-viec/moi']"))){
                return true;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
            Constans.errorLog.concat(e.getMessage());
        }
        return result;
    }

    public boolean checkShowTitleAndDescription(WebDriver driver){
        boolean result = false;
        try {
            boolean checkTitle = driver.findElements(By.xpath("//input[@name='cover_letter[title]']")).size()>0;
            boolean checkDesciption = driver.findElements(By.xpath("//textarea[@name='cover_letter[message]']")).size()>0;
            if (checkTitle && checkDesciption){
                result = true;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
            Constans.errorLog.concat(e.getMessage());
        }
        return result;
    }
}
