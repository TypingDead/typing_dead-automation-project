package com.tiki.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tiki.utilities.Driver;

public class TrackerPage {

	public TrackerPage() {
		PageFactory.initElements(Driver.getInstance(), this);
	}

	@FindBy(css = "a[href='tiki-ajax_services.php?controller=tracker&action=replace&modal=1']")
	public WebElement createTracker;

	public WebElement name;

	public WebElement description;

	@FindBy(css = "button[class='btn btn-primary auto-btn']")
	public WebElement save;

	@FindBy()
	public WebElement b;

	@FindBy()
	public WebElement c;

	@FindBy()
	public WebElement d;
	
	public void save() {
		if(save.isDisplayed()) {
			save.click();
		}
	}
}
