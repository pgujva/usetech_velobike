package ru.usetech.pft.velo_bike.Tests.SideMenuTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.usetech.pft.velo_bike.Tests.Testbase;

public class GoToPersonalAccountBySideMenuTest extends Testbase {

    @Test(enabled = false)
    public void TestGoToPersonalAccountByPhoto() throws Exception {

        app.getNavigationHelper().goToPersonalAccountPage();
        boolean a = app.getHelperBase().isThereARightPage(By.tagName("h1"), "Личный кабинет",
                By.cssSelector("span.lk-intro__welcome-name"), "Тест!",
                "https://velobike.ru/account/");
        app.getNavigationHelper().goToSideMenu();

        Assert.assertEquals(a, true);


    }

}
