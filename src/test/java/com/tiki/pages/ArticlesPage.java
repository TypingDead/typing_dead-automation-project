package com.tiki.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tiki.utilities.Driver;

public class ArticlesPage {
	
	public ArticlesPage() {
		PageFactory.initElements(Driver.getInstance(), this);
	}
	
	@FindBy(className="toggle_zone left")
	public WebElement openMenuButton;
	
	@FindBy(xpath="(//*[text()[contains(.,'Articles')]])[1]")
	public WebElement articlesLink;
	
	@FindBy(linkText="New Article")
	public WebElement newArticleLink;
	
	@FindBy(xpath="//input[@name='title']")
	public WebElement titleField;
	
	@FindBy(xpath="//textarea[@name='heading']")
	public WebElement headingField;
	
	@FindBy(xpath="//textarea[@name='body']")
	public WebElement bodyField;
	
	@FindBy(xpath="//input[@name='allowhtml']")
	public WebElement allowFullHTMLCheckbox;
	
	@FindBy(name="save")
	public WebElement saveButton;
	
	@FindBy(xpath="//span[@class='titleb']/..")
	public WebElement articleTitle;
	
	@FindBy(xpath="//div[@class='articleheadingtext media-body']/..")
	public WebElement articleHeading;
	
	@FindBy(xpath="//div[@class='articlebody clearfix']")
	public WebElement articleBody;
	
	@FindBy(css="a[title='List Articles']")
	public WebElement listArticlesLink;
	
	@FindBy(xpath="//tbody//td[2]")
	public List<WebElement> numberOfArticlesBefore;
	
	@FindBy(xpath="//tbody//td[2]")
	public List<WebElement> numberOfArticlesAfter;

	public void deleteArticleNumber(List<WebElement> count) {
		int index = 0;
	LOOP:for (WebElement list : count) {
			index++;
				if(list.getText().contains("Typing Dead TEST")) {
					break LOOP;
				}
		}
		System.out.println(index);
	}
	@FindBy(xpath="//tbody//tr[2]//td[11]")
	public WebElement actionsLink;
	
	@FindBy(linkText="Remove")
	public WebElement removeLink;
	
	@FindBy(linkText="Confirm action")
	public WebElement comfirmActionButton;
	
	
}
