package web.Pages;

import com.testvagrant.ekam.reports.annotations.WebStep;
import org.openqa.selenium.By;

public class HomePageResponsive extends HomePage {
    private By menu = query("//summary[@aria-label='Menu']");
    private By logIn = query("//*[@id=\"menu-drawer\"]/div/div/div/a");


    @WebStep(keyword = "When", description = "I hit search button")
    public HomePageResponsive getLoginPage() {
        element(menu).click();
        element(logIn).click();
        return this;
    }

}