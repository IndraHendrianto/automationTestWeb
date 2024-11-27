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

'Given i already login the website'
WebUI.callTestCase(findTestCase('Test Cases/Login/Login-Positive'), null, FailureHandling.STOP_ON_FAILURE)

'When i click the booking button'
WebUI.click(findTestObject('Page_CURA Healthcare Service/button_Book Appointment'))

'Then i verify callendar will appear because field date is required'
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CURA Healthcare Service/div_November 2024SuMoTuWeThFrSa272829303112_1e78dd'), 
    0)

WebUI.callTestCase(findTestCase('Test Cases/Login/Close-Browser'), null, FailureHandling.STOP_ON_FAILURE)

