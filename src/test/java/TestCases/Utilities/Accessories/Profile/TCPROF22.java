package TestCases.Utilities.Accessories.Profile;

import config.DataProviders;
import config.TestCore;
import io.qameta.allure.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageLibrary.CloseWebDriver;
import pageLibrary.LogIn;
import pageLibrary.Menu;

/**
 * Created by GregDev on 2017/05/16.
 */
public class TCPROF22 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }

    @Epic("UTILITIES")
    @Feature("ACCESSORIES")
    @Story("PROFILE")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCPROF22_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("utilities.menu.utilities", "utilities.menu.utilities.accessories", "utilities.menu.utilities.accessories.profile");
        driverwait();
       // Generics.switchToFrame("core");
      //  Generics.ClickButtonLink("utilities.field.AccessoryNo", "utilities.field.AccessoryNo");
     //   Generics.FieldPopulate("Accessory No", "utilities.field.AccessoryNo", "119");
     //   Generics.ClickButtonLink("utilities.field.banicular1", "utilities.field.banicular1");
     //   driver.switchTo().frame("MainTabs");
    //    Generics.ClickButtonLink("utilities.button.new", "utilities.button.new");
    //    Utilities.AccessoryProfilePopulate("GPS");
   //     Generics.ClickButtonLink("utilities.button.Submit", "utilities.button.Submit");
   //     driver.close();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
