package Pages;

import com.testvagrant.ekam.reports.annotations.WebStep;
import com.testvagrant.ekam.atoms.web.WebPage;
import org.openqa.selenium.By;

public class AboutUsPage extends WebPage {

    private By firstParagraph = query("//*[@class=\"sqs-block-content\"]//p[1]//strong");


    @WebStep(keyword = "When", description = "I get the name")
    public String getName() {
       return element(firstParagraph).getTextValue();
    }

}