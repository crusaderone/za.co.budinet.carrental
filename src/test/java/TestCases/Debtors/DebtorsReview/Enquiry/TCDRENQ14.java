package TestCases.Debtors.DebtorsReview.Enquiry;

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

public class TCDRENQ14 extends TestCore
{
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }
    @Epic("DEBTORS")
    @Feature("DEBTORS REVIEW")
    @Story("ENQUIRY")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCDRENQ14_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("debtors.menu.debtors", "debtors.menu.review", "debtors.menu.review.enquiry");
        driverwait();
        Generics.DropdownSelector("Status", "debtors.dropdown.review.status", "Reschedule");
        Generics.ClickButtonLink("debtors.button.submit","debtors.button.submit");
      //  Generics.ClickButtonLink("debtors.link.customerno", "debtors.link.customerno");
      //  driver.switchTo().frame("mainTabs");
      //  driver.switchTo().frame(0);
      //  driverwait();
     //   Generics.ClickTab("debtors.tabs.History");
     //   driverwait();

    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
