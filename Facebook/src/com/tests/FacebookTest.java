package com.tests;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.pageobjects.BaseClass;
import com.pageobjects.HomePage;

public class FacebookTest extends BaseClass {

	@Test
	public void testcase1() throws InterruptedException {

		HomePage HomePG = PageFactory.initElements(driver, HomePage.class);

		 HomePG.TypeLogInEmailOrPhoneTextBox("a@b.com");
		 HomePG.TypeLogInPasswordTextBox("xyz");
		 HomePG.TypeFirstName("asdf");
		 HomePG.TypeLastName("jkl");
		 HomePG.TypeSignUpEmailOrMobile("3470004000");
		 HomePG.ChooseFemale(1);
	
//		Map<String, String> data = new HashMap<String, String>();
//		data.put("emailOrPhone", "a@b.com");
//		data.put("password", "xyz");
//		data.put("firstName", "asdf");
//		data.put("lastName", "jkl");
//		data.put("email", "a@b.com");
//		data.put("signUpEmailOrMobile", "Z@A.com");
//		data.put("reEnterEmailOrMobile", "Z@A.com");
//		data.put("password", "qz");
//		data.put("month", "Feb");
//		data.put("day", "10");
//		data.put("year", "1972");
//	
//		HomePG.SignUp(data);

	}

}
