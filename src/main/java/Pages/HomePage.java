package Pages;

import com.testvagrant.ekam.reports.annotations.WebStep;
import com.testvagrant.ekam.atoms.web.WebPage;
import com.testvagrant.ekam.web.annotations.WebSwitchView;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends WebPage {
    private By loginIcon = query("//a[@class='header__icon header__icon--account link focus-inset small-hide']");

    @WebSwitchView(view = HomePageResponsive.class)
    @WebStep(keyword = "When", description = "I press on Login icon")
    public HomePage getLoginPage() {
        element(loginIcon).click();
        return this;
    }

}