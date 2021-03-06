package ru.usetech.pft.velo_bike.Tests.SideMenuTests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.usetech.pft.velo_bike.Tests.Testbase;

import java.util.ArrayList;
import java.util.List;

public class SideMenuTestsNotUse extends Testbase {


    @Test(enabled = false)
    public void TestsSideMenu() {
        app.getSessionHelper().loginInSideMenu("4001776", "3875");
        app.getNavigationHelper().goToPersonalAccountPage();
        List<String> pageLinks = new ArrayList<String>();
        for (int i = 0; i < app.getSideMenuHelper().getStaticMenuLinks().size(); i++) {
            app.getNavigationHelper().goToSideMenu();
            List<WebElement> newMenuElements = app.getSideMenuHelper().getMenuList();
            app.getHelperBase().waitVisibilityOfElements(newMenuElements);
            newMenuElements.get(i).click();
            pageLinks.add(app.getHelperBase().getCurrentPageURL());
            app.getHelperBase().returnBack();
        }
        Assert.assertEquals(app.getSideMenuHelper().getStaticMenuLinks(), pageLinks);

    }
}






