package com.tiki.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tiki.utilities.Driver;

public class HomePage {

	public String homePageTitle = "Home Page | HomePage";

	public HomePage() {
		PageFactory.initElements(Driver.getInstance(), this);
	}

	@FindBy(linkText = "Home")
	public WebElement home;

	@FindBy(linkText = "Search")
	public WebElement search;

	@FindBy(linkText = "Categories")
	public WebElement categories;

	@FindBy(linkText = "Tags")
	public WebElement tags;

	@FindBy(linkText = "Calendar")
	public WebElement calendar;

	@FindBy(linkText = "Trackers")
	public WebElement trackers;

	@FindBy(css = "a[href='tiki-list_trackers.php']")
	public WebElement listTrackers;
	
	public void openTrackerList() {
		trackers.click();
		listTrackers.click();
	}
}
