package com.qa.pageModel;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class TestingPage {
    public final Locator returnHomePageButton;
    public final Locator customerLoginButton;
    public final Locator customerNameSelectButton;
    public final Locator customerLoginSubmitButton;
    public final Locator customerLogoutButton;
    public final Locator accountSelectButton;
    public final Locator depositButton;
    public final Locator depositAmountField;
    public final Locator depositSubmitButton;
    public final Locator withDrawlButton;
    public final Locator withDrawlAmountField;
    public final Locator withDrawlSubmitButton;
    public final Locator transactionButton;

    public TestingPage(Page page) {
        returnHomePageButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Home"));
        customerLoginButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Customer Login"));
        customerNameSelectButton = page.locator("#userSelect");
        customerLoginSubmitButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Login"));
        customerLogoutButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Logout"));
        accountSelectButton = page.locator("#accountSelect");
        depositButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Deposit"));
        depositAmountField = page.getByPlaceholder("amount");
        depositSubmitButton = page.getByRole(AriaRole.FORM).getByRole(AriaRole.BUTTON, new Locator.GetByRoleOptions().setName("Deposit"));
        withDrawlButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Withdrawl"));
        withDrawlAmountField = page.getByPlaceholder("amount");
        withDrawlSubmitButton = page.getByRole(AriaRole.FORM).getByRole(AriaRole.BUTTON, new Locator.GetByRoleOptions().setName("Withdrawl"));
        transactionButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Transactions"));
    }
}
