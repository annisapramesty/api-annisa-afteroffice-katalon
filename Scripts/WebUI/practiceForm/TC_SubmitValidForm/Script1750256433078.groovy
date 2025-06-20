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

WebUI.openBrowser('')
WebUI.navigateToUrl('https://demoqa.com/automation-practice-form')
WebUI.maximizeWindow()

WebUI.setText(findTestObject('PracticeForm/input_FirstName'), 'Annisa')
WebUI.setText(findTestObject('PracticeForm/input_LastName'), 'Pramesty')
WebUI.setText(findTestObject('PracticeForm/input_Email'), 'annisa@gmail.com')
WebUI.click(findTestObject('PracticeForm/radio_Gender_Female'))
WebUI.setText(findTestObject('PracticeForm/input_Mobile'), '0812345678')
WebUI.click(findTestObject('PracticeForm/input_DateOfBirth'))
WebUI.sendKeys(findTestObject('PracticeForm/input_DateOfBirth'), Keys.chord(Keys.CONTROL, 'a'))
WebUI.sendKeys(findTestObject('PracticeForm/input_DateOfBirth'), '10 Jan 2000' + Keys.ENTER)
WebUI.setText(findTestObject('PracticeForm/input_Subjects'), 'Computer Science')
WebUI.sendKeys(findTestObject('PracticeForm/input_Subjects'), Keys.chord(Keys.ENTER))
WebUI.click(findTestObject('PracticeForm/checkbox_Hobby_Reading'))

WebUI.uploadFile(findTestObject('PracticeForm/input_PictureUpload'), 'C:\\Users\\HCIS_Fed\\Downloads\\profile.jpg')

WebUI.setText(findTestObject('PracticeForm/textarea_CurrentAddress'), 'Jl. Mawar No. 10, Bekasi')

WebUI.click(findTestObject('PracticeForm/dropdown_State'))
WebUI.click(findTestObject('PracticeForm/option_State_NCR'))
WebUI.click(findTestObject('PracticeForm/dropdown_City'))
WebUI.click(findTestObject('PracticeForm/option_City_Delhi'))

WebUI.click(findTestObject('PracticeForm/button_Submit'))
WebUI.delay(2)
WebUI.closeBrowser()