package Pages;

import com.testvagrant.ekam.reports.annotations.WebStep;
import com.testvagrant.ekam.atoms.web.WebPage;
import org.openqa.selenium.By;

public class HomePage extends WebPage {
    private By aboutUs = queryByText("About Us");


    @WebStep(keyword = "When", description = "I press on About us")
    public HomePage getAboutUsPage() {
        element(aboutUs).click();
        return this;
    }

}