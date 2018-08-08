package TestCases.Utilities.Branches.Profile;

import config.DataProviders;
import config.TestCore;
import controlers.Generics;
import io.qameta.allure.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageLibrary.CloseWebDriver;
import pageLibrary.LogIn;
import pageLibrary.Menu;

public class TCBRPROF013 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }
    @Epic("UTILITIES")
    @Feature("BRANCH")
    @Story("PROFILE")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCBRPROF013_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("utilities.menu.utilities", "utilities.menu.utilities.branches", "utilities.menu.utilities.branches.profile");
        Generics.switchToFrame("core");
        Generics.FieldPopulate("Branch Code", "utilities.field.txtBranchCode1", "JS");
        Generics.ClickButtonLink("utilities.button.binacular1", "utilities.button.binacular1");
        driverwait();
        Generics.switchToFrame("mainTabs");
        Generics.ClearTextField("utilities.field.RezCentralBranch");
        Generics.FieldPopulate("RezCentral Branch", "utilities.field.RezCentralBranch", "JNBT01");
        Generics.ClearTextField("utilities.field.UtilBranch");
        Generics.FieldPopulate("Utilisation Branch", "utilities.field.UtilBranch", "JS");
        Generics.ClearTextField("utilities.field.EmiratesBranch");
        Generics.FieldPopulate("Emirates Branch", "utilities.field.EmiratesBranch", "JJ");
        Generics.ClickButtonLink("utilities.button.submit", "utilities.button.submit");

    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
