package tests;

import manage.ConfigurationWiki;
import model.User;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.MainScreen;

public class Login extends ConfigurationWiki {

    @Test
    public void login1() {
        User user = User.builder().userName("juliakliot.jk").password("Misha240613").build();
        boolean isLogged = new MainScreen(driver)
                .clickOnFlowButton()
                .clickOnLoginButton()
                .fillInLofinForm(user)
                .clickOnFlowButton()
                .isLogged();
        Assert.assertTrue(isLogged);


    }

    @Test
    public void login2() {
        String inf = new MainScreen(driver)
                .clickOnFlowButton()
                .clickOnLoginButton()
                .fillInLofinForm(User.builder().userName("juliakliot.jk").password("Misha240613").build())
                .clickOnFlowButton()
                .logOut()
                .clickOnFlowButton()
                .getInf();

        Assert.assertEquals(inf, "Log in to Wikipedia");
    }

    @Test
    public void login3() {
        new MainScreen(driver)
                .clickOnFlowButton()
                .clickOnLoginButton()
                .fillInLofinForm2("juliakliot.jk", "Misha240613")
                .clickOnFlowButton()
                .logOut();

    }
    @Test
    public void login4() {
        User user = User.builder().userName("juliakliot.jk").password("Misha240613").build();
        String info = new MainScreen(driver)
                .clickOnFlowButton()
                .clickOnLoginButton()
                .fillInLofinForm(user)
                .clickOnFlowButton()
                .getInfo();
        Assert.assertEquals(info,"Juliakliot.jk");


    }
    @Test
    public void login5() {
        User user = User.builder().userName("juliakliot.jk").password("Misha240613").build();
        String logOut = new MainScreen(driver)
                .clickOnFlowButton()
                .clickOnLoginButton()
                .fillInLofinForm(user)
                .clickOnFlowButton()
                .getLog();
        Assert.assertEquals(logOut,"Log out");


    }
}
