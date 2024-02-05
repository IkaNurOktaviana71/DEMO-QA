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
import org.openqa.selenium.WebElement as WebElement

WebUI.callTestCase(findTestCase('Web Tables/nav-001'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Web Tables/div_Age'))

List<WebElement> age = WebUI.findWebElements(findTestObject('Web Tables/sort age'), 10)

String[] arrOri = new String[age.size()]

String[] arrOriSort = new String[age.size()]

for (int i = 0; i < age.size(); i++) {
    
	value = WebUI.getAttribute(findTestObject('Web Tables/sort age'), 'elements')
	if(value.equals(" ")) {
		continue;
	}else {
		text = age.get(i).text
		
			(arrOri[i]) = text.trim()
		
			(arrOriSort[i]) = text.trim()
			}
	}

Arrays.sort(arrOriSort)

println(arrOri)

println(arrOriSort)

assert arrOri == arrOriSort

