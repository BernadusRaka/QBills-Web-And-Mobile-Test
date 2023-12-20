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

WebUI.navigateToUrl('https://qbills.vercel.app/login')

WebUI.click(findTestObject('Object Repository/Page_QBills  Login/label_Username'))

WebUI.setText(findTestObject('Object Repository/Page_QBills  Login/input_username'), 'arieflazuardi3')

WebUI.click(findTestObject('Object Repository/Page_QBills  Login/label_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_QBills  Login/input_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Page_QBills  Login/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Qbills  Dashboard/a_Manage Account'))

WebUI.click(findTestObject('Object Repository/Page_Qbills  Manage Account/button__flex items-center justify-center rounded-xl border border-E1 bg-E1 text-E5 hoverborder-E2 hoverbg-E2 activescale-95 activeborder-E3 activebg-E3 p-1.5'))

WebUI.setText(findTestObject('Object Repository/Page_Qbills  Manage Account/input_Username_w-full rounded-lg bg-transparent outline-none'), 
    'Maulidya Baru')

WebUI.setText(findTestObject('Object Repository/Page_Qbills  Manage Account/input_Username_w-full rounded-lg bg-transparent outline-none'), 
    'Maul')

WebUI.setText(findTestObject('Object Repository/Page_Qbills  Manage Account/input_Username_w-full rounded-lg bg-transparent outline-none'), 
    '12345678')

WebUI.click(findTestObject('Object Repository/Page_Qbills  Manage Account/button_Save'))

WebUI.closeBrowser()
