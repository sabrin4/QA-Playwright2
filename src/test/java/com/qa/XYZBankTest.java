package com.qa;

import com.qa.parameters.LoginParams;
import com.qa.testConfig.BaseTest;
import io.qase.api.annotation.CaseId;
import org.testng.annotations.Test;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class XYZBankTest extends BaseTest {

    @Test(dataProvider = "validLoginParams", dataProviderClass = LoginParams.class)
    @CaseId(1)
    void successLogin(String user) {
        assertThat(page).hasTitle("XYZ Bank");
        testingPage.customerLoginButton.click();
        assertThat(page).hasURL("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/customer");
        testingPage.customerNameSelectButton.selectOption(user);
        testingPage.customerLoginSubmitButton.click();
        assertThat(page).hasURL("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/account");
        testingPage.customerLogoutButton.click();
    }

    @Test(dataProvider = "depositDollarsParams", dataProviderClass = LoginParams.class)
    void depositDollars(String user, String accountNumber) {
        assertThat(page).hasTitle("XYZ Bank");
        testingPage.customerLoginButton.click();
        assertThat(page).hasURL("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/customer");
        testingPage.customerNameSelectButton.selectOption(user);
        testingPage.customerLoginSubmitButton.click();
        assertThat(page).hasURL("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/account");
        testingPage.accountSelectButton.selectOption(accountNumber);
        //page.getByText("Dollar").isVisible();
        testingPage.depositButton.click();
        testingPage.depositAmountField.fill("100");
        testingPage.depositSubmitButton.click();
        assertThat(page.getByText("Deposit Successful")).hasText("Deposit Successful");
    }

    @Test(dataProvider = "depositPoundsParams", dataProviderClass = LoginParams.class)
    void depositPounds(String user, String accountNumber) {
        assertThat(page).hasTitle("XYZ Bank");
        testingPage.customerLoginButton.click();
        assertThat(page).hasURL("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/customer");
        testingPage.customerNameSelectButton.selectOption(user);
        testingPage.customerLoginSubmitButton.click();
        assertThat(page).hasURL("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/account");
        testingPage.accountSelectButton.selectOption(accountNumber);
        testingPage.depositButton.click();
        testingPage.depositAmountField.fill("200");
        testingPage.depositSubmitButton.click();
        assertThat(page.getByText("Deposit Successful")).hasText("Deposit Successful");
    }

    @Test(dataProvider = "depositRupeesParams", dataProviderClass = LoginParams.class)
    void depositRupees(String user, String accountNumber) {
        assertThat(page).hasTitle("XYZ Bank");
        testingPage.customerLoginButton.click();
        assertThat(page).hasURL("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/customer");
        testingPage.customerNameSelectButton.selectOption(user);
        testingPage.customerLoginSubmitButton.click();
        assertThat(page).hasURL("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/account");
        testingPage.accountSelectButton.selectOption(accountNumber);
        testingPage.depositButton.click();
        testingPage.depositAmountField.fill("300");
        testingPage.depositSubmitButton.click();
        assertThat(page.getByText("Deposit Successful")).hasText("Deposit Successful");
    }
}
