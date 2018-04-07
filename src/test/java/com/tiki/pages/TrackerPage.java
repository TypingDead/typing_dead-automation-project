package com.tiki.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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

	@FindBy(partialLinkText="Features")
	public WebElement features;

	@FindBy(name="useRatings")
	public WebElement allowRatings;

	public WebElement ratingOptions;
	
	@FindBy(name="useAttachments")
	public WebElement allowAttachments;
	
	
	@FindBy(css="input[value='created']")
	public WebElement creationDateCheckBox;
	
	@FindBy(css="input[value='hits']")
	public WebElement viewsCheckBox;
	
	@FindBy(css="input[value='filesize']")
	public WebElement fileSizeCheckBox;
	
	@FindBy(linkText="Typing Dead Tracker")
	public WebElement trackerName;
	
	@FindBy(xpath="//a[contains(text(),'Typing Dead')]/../div")
	public WebElement trackerDescription;
	
	@FindBy(partialLinkText="Display")
	public WebElement display;
	
	public WebElement logo;
	
	@FindBy(css="input[name='showStatus']")
	public WebElement showStatusCheckBox;
	
	@FindBy(xpath="//div[@data-on='showStatus']/label")
	public WebElement showStatusAdminOnly;
	
	public WebElement defaultOrderKey;
	
	@FindBy(partialLinkText="Permissions")
	public WebElement permissions;
	
	public WebElement startDate;
	
	public void save() {
		if(save.isDisplayed()) {
			save.click();
		}
	}
	
	public void selectAllowRatings() {
		JavascriptExecutor js = (JavascriptExecutor) Driver.getInstance();
		js.executeScript("arguments[0].click();", allowRatings);
	}
	
	public void selectAllowAttachments() {
		JavascriptExecutor js = (JavascriptExecutor) Driver.getInstance();
		js.executeScript("arguments[0].click();", allowAttachments);
	}
	
	public void selectShowStatus() {
		JavascriptExecutor js = (JavascriptExecutor) Driver.getInstance();
		js.executeScript("arguments[0].click();", showStatusCheckBox);
	}
	
	public void selectDefaultOrderKey(String value) {
		Select select = new Select(defaultOrderKey);
		select.selectByVisibleText(value);
	}
}
