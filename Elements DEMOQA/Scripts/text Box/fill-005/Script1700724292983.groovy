import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('text Box/nav-001'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Text Box/input_Full Name_userName'), name)

WebUI.setText(findTestObject('Text Box/input_Email_userEmail'), mail)

WebUI.setText(findTestObject('Text Box/textarea_Current Address_currentAddress'), cur)

//WebUI.setText(findTestObject('Text Box/textarea_Permanent Address_permanentAddress'), permanen)

WebUI.scrollToElement(findTestObject('Text Box/button_Submit'), 0)

WebUI.click(findTestObject('Text Box/button_Submit'))

nama = WebUI.getText(findTestObject('Text Box/p_Namejohan'))

nm=nama.replace('Name:', '')

println(nm)

email = WebUI.getText(findTestObject('Text Box/p_Emailjohandugmail.com'))

e=email.replace('Email:', '')

println(e)

current = WebUI.getText(findTestObject('Text Box/p_Current Address street kaliurang km 17, Sleman, Yogyakarta'))

c=current.replace('Current Address :', '')

println(c)

//perm = WebUI.getText(findTestObject('Text Box/p_Permananet Address street kaliurang km 17, Sleman, Yogyakarta'))
//
//p=perm.replace('Permananet Address :', '')
//
//println(p)


assert nm.toString().trim().equalsIgnoreCase(name.trim())
assert e.toString().trim().equalsIgnoreCase(mail.trim())
assert c.toString().trim().equalsIgnoreCase(cur.trim())
//assert p.toString().trim().equalsIgnoreCase(permanen.trim())







