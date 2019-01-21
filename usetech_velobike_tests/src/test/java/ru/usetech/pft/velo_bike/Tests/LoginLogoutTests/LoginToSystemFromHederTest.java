package ru.usetech.pft.velo_bike.Tests.LoginLogoutTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.usetech.pft.velo_bike.Tests.Testbase;

public class LoginToSystemFromHederTest extends Testbase {

    @Test
    public void TestLoginToSystemFromHeder () {
        app.getSessionHelper().loginInHeder("4001776", "3875");
        boolean a = app.getHelperBase().isThereARightPage(By.tagName("h1"), "Личный кабинет",
                By.cssSelector("span.lk-intro__welcome-name"),
                "Тест!", "https://velobike.ru/account/");
        Assert.assertEquals(a, true);
        app.getSessionHelper().logoutFromSystem();
    }

    @Test()
    public void TestLoginToSystemFromMenu() {
        app.getSessionHelper().loginInSideMenu("4001776", "3875");
        boolean a = app.getHelperBase().isThereARightPage(By.tagName("h1"), "Личный кабинет",
                By.cssSelector("span.lk-intro__welcome-name"), "Тест!", "https://velobike.ru/account/");
        app.getNavigationHelper().goToSideMenu();
        Assert.assertEquals(a, true);
        app.getSessionHelper().logoutFromSideMenu();
    }

    @Test()
    public void TestLogoutFromSystem () {
        app.getSessionHelper().loginInHeder("4001776","3875");
        app.getSessionHelper().logoutFromSystem();

        Assert.assertEquals(app.getHelperBase().isThereARightPage(By.xpath("//a[contains(text(),'Войти')]"),"ВОЙТИ",
                By.xpath("//a[contains(text(),'Регистрация')]"),"РЕГИСТРАЦИЯ",
                "https://velobike.ru/"), true);

    }
}
