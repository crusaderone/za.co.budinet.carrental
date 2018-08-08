package TestCases.Utilities.Rates.Profile;

import config.DataProviders;
import config.TestCore;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageLibrary.CloseWebDriver;
import pageLibrary.LogIn;
import pageLibrary.Menu;
import pageLibrary.Utilities;

public class TCRATES060 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }
    @Epic("UTILITIES")
    @Feature("RATE")
    @Story("PROFILE")
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCRATES060_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("utilities.menu.utilities", "utilities.menu.utilities.rates", "utilities.menu.utilities.rates.profile");
        driverwait();
        Utilities.RatePopulating();
     //   Generics.CheckBoxSelect("Vehicle Extras", "utilities.link.AdditionalExtras");
      //  Generics.CheckBoxSelect("GPS", "utilities.field.gps");
        //Generics.ClickButtonLink("utilities.intra.button.Add", "utilities.intra.button.Add");
      //  Generics.ClickButtonLink("utilities.intra.button.Submit", "utilities.intra.button.Submit");

        driver.close();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}