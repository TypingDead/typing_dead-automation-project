package com.tiki.step_definitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;

import com.tiki.pages.ArticlesPage;
import com.tiki.pages.HomePage;
import com.tiki.pages.LoginPage;
import com.tiki.utilities.BrowserUtils;
import com.tiki.utilities.ConfigurationReader;
import com.tiki.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CreatingAndDeleteNewArticlesStepDefinitions {

	ArticlesPage articlePage = new ArticlesPage();
	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();

	@Given("^a user logged into Tiki Application, HomePage is displayed$")
	public void a_user_logged_into_Tiki_Application_HomePage_is_displayed() {
		Driver.getInstance().get(ConfigurationReader.getProperty("url"));
		BrowserUtils.waitFor(2);
		BrowserUtils.hoverOver(loginPage.loginMenu);
		loginPage.login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
		loginPage.start.click();
		assertTrue(homePage.home.isDisplayed());

	}

	@Then("^a user creates New Article$")
	public void a_user_creates_New_Article() {
		BrowserUtils.waitFor(2);

		articlePage.articlesLink.click();
		assertTrue(articlePage.newArticleLink.isDisplayed());

		articlePage.newArticleLink.click();

	}

	@Then("^a user fills the Title field \"([^\"]*)\"$")
	public void a_user_fills_the_Title_field(String articleTitleText) {
		articlePage.titleField.sendKeys(articleTitleText);
	}

	@Then("^a user fills the Heading field \"([^\"]*)\" and Body field \"([^\"]*)\"$")
	public void a_user_fills_the_Heading_field_and_Body_field(String articleHeadindText, String articleBobyText) {
		articlePage.headingField.sendKeys(articleHeadindText);
		articlePage.bodyField.sendKeys(articleBobyText);

	}

	@Then("^a user selects Allow full HTML checkbox$")
	public void a_user_selects_Allow_full_HTML_checkbox() {
		articlePage.allowFullHTMLCheckbox.click();
		assertTrue(articlePage.allowFullHTMLCheckbox.isSelected());
	}

	@Then("^a user saves it$")
	public void a_user_saves_it() {
		articlePage.saveButton.click();
	}

	@Then("^a user verifies article Title, Heading and Body text is displayed$")
	public void a_user_verifies_article_Title_Heading_and_Body_text_is_displayed() {
		assertTrue(articlePage.articleTitle.getText().contains("Tiping Dead Forever"));
		assertTrue(articlePage.articleHeading.getText().contains("It's the best team"));
		assertTrue(articlePage.articleBody.getText().contains("Never give up"));
	}

	// ***Delete Article***\\

	static int before;
	static int after;

	@Then("^a user opens List Articles and saves the number of articles$")
	public void a_user_opens_List_Articles_and_saves_the_number_of_articles() {
		articlePage.listArticlesLink.click();
		before = articlePage.numberOfArticlesBefore.size();

	}

	@Then("^a user finds \"([^\"]*)\" and hovers over Actions link, removes the article$")
	public void a_user_finds_and_hovers_over_Actions_link_removes_the_article(String arg1) {
		articlePage.actionsLink.click();
		BrowserUtils.waitFor(2);
		articlePage.removeLink.click();
		BrowserUtils.waitFor(2);
		articlePage.comfirmActionButton.click();
	}

	@Then("^a user verifies the number of articles is less by one$")
	public void a_user_verifies_the_number_of_articles_is_less_by_one() {
		after = articlePage.numberOfArticlesBefore.size();
	System.out.println("before: "+before+"; After: "+after);
		assertTrue(before == after + 1);
	}

}