package com.tiki.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
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
	
	public WebElement startTime;
	
	@FindBy(css="input[name='showCreated']")
	public WebElement showCreatedWhenListingBox;
	
	@FindBy (linkText="Date and Time Format Help")
	public WebElement dateAndTimeFormatHelp;
	
	@FindBy(xpath="//div[@class='description help-block']/../a")
	public WebElement anyTrackerLink;
	
	public void save() {
		if(save.isDisplayed()) {
			save.click();
		}
	}
		
	public void selectDefaultOrderKey(String value) {
		Select select = new Select(defaultOrderKey);
		select.selectByVisibleText(value);
	}
	
	public  void trackerList() {
		List<WebElement> listLinks= Driver.getInstance().findElements(By.xpath("//div[@class='description help-block']/../a"));
		List < WebElement> uniqueLinks=new ArrayList<>();
		for (int i = 0; i < listLinks.size(); i++) {
			for (int j = i+1; j < uniqueLinks.size(); j++) {
				if(listLinks.get(i).equals(listLinks.get(j))) {
					uniqueLinks.add(listLinks.get(i));
				}
			}
		}
	}
}
