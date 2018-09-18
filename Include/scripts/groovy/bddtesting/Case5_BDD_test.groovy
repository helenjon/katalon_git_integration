package bddtesting
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

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


class Case5_BDD_test {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	@Given("I navigate to registration page")
	def I_navigate_to_registration_page() {
		WebUI.openBrowser("https://courses.edx.org/register")
		println "Pass"
	}

	@When("I enter Email as (.*) and Full Name as (.*) and Public Username as (.*) and Password as (.*)")
	def I_enter_Email_and_Full_Name_and_Password(String email, String name, String username, String password) {
		WebUI.setText(findTestObject('Page_Sign in or Register  edX/input_email'), email)
		WebUI.setText(findTestObject('Page_Sign in or Register  edX/input_name'), name)
		WebUI.setText(findTestObject('Page_Sign in or Register  edX/input_username'), username)
		WebUI.setText(findTestObject('Page_Sign in or Register  edX/input_password'), password)
	}

	@And("I click Create Account")
	def I_click_Create_Account(){
		WebUI.click(findTestObject('Page_Sign in or Register  edX/button_Create Account'))
	}


	@Then("Account was created successfully")
	def I_verify_the_status_in_step() {
		println "Pass"
		WebUI.closeBrowser()
	}
}