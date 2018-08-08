package TestCases.Utilities.Printing.ReportScheduler;

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
public class REPSCH002 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }

    @Epic("UTILITIES")
    @Feature("PRINTING")
    @Story("REPORT SCHEDULE")
    @Severity(SeverityLevel.CRITICAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void REPSCH002_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("utilities.menu.utilities", "utilities.menu.utilities.printing", "utilities.menu.utilities.printing.reportscheduler");
        // Generics.DropdownSelector("Catagory","utilities.dropdown.category","Head Office");
        // Generics.ClickButtonLink("utilities.button.Output","utilities.button.Output");

    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
