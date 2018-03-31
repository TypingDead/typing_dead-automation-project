package com.tiki.pages;

import org.openqa.selenium.support.PageFactory;

import com.tiki.utilities.Driver;

public class HomePage {

	public HomePage() {
		PageFactory.initElements(Driver.getInstance(), this);
	}
}
