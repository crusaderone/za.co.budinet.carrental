package TestCases.Operations.BackOffice.BlackList.Profile;

import config.DataProviders;
import config.TestCore;
import io.qameta.allure.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageLibrary.BackOffice;
import pageLibrary.CloseWebDriver;
import pageLibrary.LogIn;
import pageLibrary.Menu;

public class TCBLP003 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }
    @Epic("OPERATIONS")
    @Feature("BACKOFFICE")
    @Story("INTERNATIONAL BLACKLIST PROFILE")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCBLP003_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo4("operations.menu.operation", "operations.menu.backoffice",
                "operations.menu.backoffice.intlblacklist", "operations.menu.backoffice.intlblacklist.profile");

        BackOffice.BlackListProfile();
       // Generics.ClearTextField("blacklist.field.txtVoucherNo");
       // Generics.ClearDropDownField("blacklist.dropdown.cmbCardIndicator");
       // Generics.ClearTextField("blacklist.field.txtVoucherRangeTo");
      //  Generics.ClearTextField("blacklist.field.txtVoucherRangeFrom");
       // Generics.ClickButtonLink("blacklist.button.Submit","blacklist.button.Submit");
        driver.close();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
