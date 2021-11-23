package Pages;

import com.testvagrant.ekam.reports.annotations.WebStep;
import com.testvagrant.ekam.atoms.web.WebPage;
import org.openqa.selenium.By;

public class HomePage extends WebPage {
    private By loginIcon = query("//a[@class='header__icon header__icon--account link focus-inset small-hide']");

    @WebStep(keyword = "When", description = "I press on Login icon")
    public HomePage getLoginPage() {
        element(loginIcon).click();
        return this;
    }

}