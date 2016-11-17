package com.qait.automation.keywords;
import org.openqa.selenium.WebDriver;

import com.qait.automation.getpageobjects.GetPage;

public class HomePageActionKeyWords extends GetPage {

	WebDriver driver;

	public HomePageActionKeyWords(WebDriver driver) {
		super(driver, "HomePage");
		this.driver = driver;
	}

	public void selectAllDataBases() {
		wait.hardWait(2);
		elements("chkBox_selectAll").get(0).click();
		elements("btn_continue").get(0).click();
	}
	public void verifyUserIsAtHomePage() {
		verifyPageTitleExact();
		logMessage("User is on Home Page");
	}

	public void performSearch(String searchTerm) {	
		isElementDisplayed("inp_searchTextBox");
		element("inp_searchTextBox").sendKeys(searchTerm);
		//wait.waitForElementToBeVisible(element("btn_search"));
		//isElementDisplayed("btn_search");
		wait.hardWait(5);
		hoverClick(element("btn_search"));
		wait.hardWait(5);
		//		element("btn_search").click();
		//		
		//		do{
		//			wait.hardWait(1);
		//		}while(getPageTitle().contains("Basic Search"));
		logMessage("Entered search term and clicked search button");
	}

}
