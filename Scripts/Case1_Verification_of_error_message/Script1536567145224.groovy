import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

'open test page'
WebUI.navigateToUrl('https://courses.edx.org/register')

'enter email'
WebUI.setText(findTestObject('Object Repository/Page_Sign in or Register  edX/input_email'), input_email)

'input Full name'
WebUI.setText(findTestObject('Object Repository/Page_Sign in or Register  edX/input_name'), 'helena')

'input Public Username'
WebUI.setText(findTestObject('Object Repository/Page_Sign in or Register  edX/input_username'), 'helenajohn')

'input password'
WebUI.setText(findTestObject('Object Repository/Page_Sign in or Register  edX/input_password'), '1')

'select country or region of residence'
WebUI.selectOptionByValue(findTestObject('Page_Sign in or Register  edX/select_Afghanistan'), 'AW', true)

'click Registration button'
WebUI.click(findTestObject('Object Repository/Page_Sign in or Register  edX/button_Create Account'))

WebUI.waitForElementPresent(findTestObject('Page_Sign in or Register  edX/StatusErrorMessage'), 4)

def text = WebUI.getText(findTestObject('Page_Sign in or Register  edX/li_Enter a password with at le'))

'Verification of error message'
WebUI.verifyTextPresent('Enter a password with at least 8 characters & 1 letter.', false)

WebUI.closeBrowser()

