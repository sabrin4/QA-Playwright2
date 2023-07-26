package com.qa.parameters;

import org.testng.annotations.DataProvider;

public class LoginParams {
    @DataProvider(name = "validLoginParams")
    public Object [][] getValidLoginParams() {
        return new Object[][]
                {
                        {"1", null},
                        {"2", null},
                        {"3", null},
                        {"4", null},
                        {"5", null}
                };
    }

    @DataProvider(name = "depositDollarsParams")
    public Object [][] getDepositDollarsParams() {
        return new Object[][]
                {
                        {"1", "number:1001"},
                        {"2", "number:1004"},
                        {"3", "number:1007"},
                        {"4", "number:1010"},
                        {"5", "number:1013"},
                };
    }

    @DataProvider(name = "depositPoundsParams")
    public Object [][] getDepositPoundsParams() {
        return new Object[][]
                {
                        {"1", "number:1002"},
                        {"2", "number:1005"},
                        {"3", "number:1008"},
                        {"4", "number:1011"},
                        {"5", "number:1014"},
                };
    }

    @DataProvider(name = "depositRupeesParams")
    public Object [][] getDepositRupeesParams() {
        return new Object[][]
                {
                        {"1", "number:1003"},
                        {"2", "number:1006"},
                        {"3", "number:1009"},
                        {"4", "number:1012"},
                        {"5", "number:1015"}
                };
    }
}
