package tests;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class dataTest {
	@Test(dataProvider = "login")
	public void login(String userName, String password, String email) {
		System.out.println(userName + " Tests " + password + "Email : " + email);
	}

	@DataProvider(name = "dp")
	public Object[][] dataProv() {

		return new Object[][] { { "user1", "pass1", "user1@gmail.com" }, { "user2", "pass2", "user2@gmail.com" },
				{ "user3", "pass3", "user3@test.com" } };
	}

	@DataProvider(name = "login")
	public Object[][] loginData() {

		Object[][] data = new Object[2][3];

		data[0][0] = "user1";
		data[0][1] = "pass1";
		data[0][2] = "email1";

		data[1][0] = "user2";
		data[1][1] = "pass2";
		data[1][2] = "email2";

		return data;

	}
}
