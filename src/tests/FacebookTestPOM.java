package tests;

import org.junit.Test;

public class FacebookTestPOM extends TestBasePOM {
	//TODO Which files to ignore?
	@Test
	public void searchFriendTest() {
		login.login("robert.glez.clase.selenium@gmail.com", "Test_1234");
		searchPage.findFriend("Carol Rojo");
	}
}
