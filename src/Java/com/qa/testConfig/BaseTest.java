package com.qa.testConfig;

import com.microsoft.playwright.Page;
import com.qa.factory.PlaywrightFactory;
import com.qa.pageModel.TestingPage;
import org.testng.annotations.*;

public class BaseTest {
    public Page page;
    public PlaywrightFactory playwrightFactory;
    public TestingPage testingPage;

    @BeforeClass
    @Parameters({"baseUrl","browserType"})
    public void setUp(String url, String browserType) {
        playwrightFactory = new PlaywrightFactory();
        page = playwrightFactory.getPage(url, browserType);
        testingPage = new TestingPage(page);
    }

    @AfterMethod
    @Parameters({"baseUrl"})
    public void returnBaseUrl(String url) {
        page.navigate(url);
    }

    @AfterClass
    public void tearDown(){
        playwrightFactory.playwright.close();
    }
}
