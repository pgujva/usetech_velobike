package ru.usetech.pft.velo_bike.Tests.LoginLogoutTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.usetech.pft.velo_bike.Tests.Testbase;

public class LoginToSystemFromMenuTest extends Testbase {

    @Test(enabled = false)
    public void TestLoginToSystemFromMenu() {
        app.getSessionHelper().loginInSideMenu("4001776", "3875");
        boolean a = app.getHelperBase().isThereARightPage(By.tagName("h1"), "Личный кабинет",
                By.cssSelector("span.lk-intro__welcome-name"), "Тест!", "https://velobike.ru/account/");
        app.getNavigationHelper().goToSideMenu();
        Assert.assertEquals(a, true);

    }

}
