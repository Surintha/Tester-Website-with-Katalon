package stepDefinition
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class UserLogin {
	@Given(": Open browser {string}")
	public void open_browser(String string) {
		WebUI.openBrowser('https://secondhand.binaracademy.org/')
	}

	@When(": User click button masuk in homepage")
	public void user_click_button_masuk_in_homepage() {
		WebUI.click(findTestObject('Register spy/button masuk homepage'))
	}

	@When(": User fill field email {string}")
	public void user_fill_field_email(String email) {
		WebUI.setText(findTestObject('Spy login/Field Email login'), email)
	}

	@When(": User fill field password {string}")
	public void user_fill_field_password(String password) {
		WebUI.setText(findTestObject('Spy login/Field Email Password'), password)
	}

	@When(": User click button masuk")
	public void user_click_button_masuk() {
		WebUI.click(findTestObject('Spy login/button Masuk'))
	}

	@When(": verify button profile")
	public void verify_button_profile() {
		WebUI.verifyElementPresent(findTestObject('Spy login/button profile'), 3)
	}

	@When(": User click button profile")
	public void user_click_button_profile() {
		WebUI.click(findTestObject('Spy login/button profile'))
	}

	@When(": User click button keluar")
	public void user_click_button_keluar() {
		WebUI.click(findTestObject('Spy login/button_keluar'))
	}

	@Then(": Close Browser")
	public void close_Browser() {
		WebUI.closeBrowser()
	}
}