import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import javax.print.DocFlavor.BYTE_ARRAY

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable

import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver


WebUI.callTestCase(findTestCase('text Box/nav-001'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Text Box/input_Full Name_userName'), name)

WebUI.setText(findTestObject('Text Box/input_Email_userEmail'), mail)

WebUI.setText(findTestObject('Text Box/textarea_Current Address_currentAddress'), cur)

WebUI.setText(findTestObject('Text Box/textarea_Permanent Address_permanentAddress'), permanen)

WebUI.scrollToElement(findTestObject('Text Box/button_Submit'), 0)

WebUI.click(findTestObject('Text Box/button_Submit'))

WebUI.mouseOver(findTestObject('Text Box/input_Email_userEmail'))

WebDriver webDriver = DriverFactory.getWebDriver()
field_email = webDriver.findElement(By.xpath('//input[@id="userEmail"]'))
error_message = ((JavascriptExecutor) webDriver).executeScript("return arguments[0].validationMessage", field_email)
println(error_message)

assert error_message == "Please include an '@' in the email address. 'johandu' is missing an '@'."









