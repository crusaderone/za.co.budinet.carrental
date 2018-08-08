package TestCases.Utilities.Codes.Dealers;

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

public class TCDEAL004 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }
    @Epic("UTILITIES")
    @Feature("CODES")
    @Story("CODES DEALERS")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCDEAL004_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("utilities.menu.utilities", "utilities.menu.utilities.codes", "utilities.menu.utilities.codes.dealers");
        driverwait();
        Generics.switchToFrame("core");
        Generics.DropdownSelector("Dealer", "utilities.codes.dropdown.dealer", "Algoa Toyota");

        //Generics.FieldPopulate("Dealer Name", "utilities.codes.field.dealer", "Toyota");
        //Generics.DropdownSelector("Country", "utilities.codes.dropdown.country", "South Africa");
        //Generics.FieldPopulate("Sundry Debtors Acc No", "utilities.codes.field.debtorsaccno", "8555555");
        //Generics.DropdownSelector("Region", "utilities.codes.dropdown.region", "Gauteng Central");
        //Generics.ClickButtonLink("utilities.codes.button.Add", "utilities.codes.button.Add");

    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
