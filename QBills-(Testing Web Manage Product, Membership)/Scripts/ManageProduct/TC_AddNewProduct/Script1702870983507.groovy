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

WebUI.setText(findTestObject('Object Repository/Page_QBills  Login/input_Username_username'), 'arieflazuardi3')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_QBills  Login/input_Password_password'), '9NLz+4tGZcQ=')

WebUI.click(findTestObject('Object Repository/Page_QBills  Login/div_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_QBills  Login/input_Password_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Page_QBills  Login/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Qbills  Dashboard/a_Manage Product'))

WebUI.click(findTestObject('Object Repository/Page_Qbills  Manage Product/span_Add Product'))

WebUI.click(findTestObject('Object Repository/Page_Qbills  Manage Product/div_CategoryCoffeeNon CoffeeMealSnack'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Qbills  Manage Product/select_CoffeeNon CoffeeMealSnack'), 
    'Non Coffee', true)

WebUI.setText(findTestObject('Object Repository/Page_Qbills  Manage Product/input_Name_name'), 'matcha')

WebUI.click(findTestObject('Object Repository/Page_Qbills  Manage Product/label_Ingredient'))

WebUI.setText(findTestObject('Object Repository/Page_Qbills  Manage Product/input_Ingredient_ingredient'), 'es, macha')

WebUI.click(findTestObject('Object Repository/Page_Qbills  Manage Product/button_Save'))

WebUI.closeBrowser()

