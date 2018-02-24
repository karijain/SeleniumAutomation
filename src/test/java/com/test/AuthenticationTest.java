package com.test;

import com.base.BaseClass;
import com.pages.WelcomePage;
import org.testng.annotations.Test;

public class AuthenticationTest extends BaseClass {

    WelcomePage welcomePage;
    @Test
    void loginTest()
    {
        welcomePage.navigateToLogin();
    }
}
