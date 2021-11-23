package Pages;

import com.testvagrant.ekam.testBases.testng.WebTest;

import static com.testvagrant.ekam.commons.LayoutInitiator.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AboutUsPageTest extends WebTest {

    @Test(groups = "web")
    public void getName() {
        Page(HomePage.class).getAboutUsPage();
        Assert.assertEquals(Page(AboutUsPage.class).getName(),"UltraLesson");
    }
}