package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class SaveJob {
    private  WebDriver driver;
    @FindBy(xpath = "/html/body/div[5]/div/div[1]/ul/li[1]/div/div[3]/button/span/strong[1]")
    WebElement btnLuu;
    public  SaveJob(WebDriver driver){
        this.driver = driver;
        this.driver.manage().window().maximize();
    }
    public  void  OpenSaveJob(){
        this.driver.get("https://www.careerlink.vn/vieclam/list");
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        PageFactory.initElements(this.driver,this);
    }
    public  void btnLuu(){this.btnLuu.click();}
}
