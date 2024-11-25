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

WebUI.openBrowser('https://www.saucedemo.com/')

WebUI.verifyElementVisible(findTestObject('WEB/Saucedemo/login/Page_Swag Labs/div_Accepted usernames arestandard_userlocked_out_userproblem_userperformance_glitch_usererror_uservisual_userPassword for all userssecret_sauce'))

WebUI.verifyElementVisible(findTestObject('WEB/Saucedemo/login/Page_Swag Labs/div_Swag Labs'))

WebUI.verifyElementVisible(findTestObject('WEB/Saucedemo/login/Page_Swag Labs/div_Swag Labs_login_wrapper-inner'))

WebUI.verifyElementVisible(findTestObject('WEB/Saucedemo/login/Page_Swag Labs/h4_Password for all users'))

CustomKeywords.'sauce.LoginPage.login'(findTestObject('WEB/Saucedemo/login/input_Swag Labs_user-name'), findTestObject('WEB/Saucedemo/login/input_Swag Labs_password'), 
    username, password)

//CustomKeywords.'sauce.LoginPage.inputUsername'(findTestObject('WEB/Saucedemo/login/input_Swag Labs_user-name'), 'standard_user')
//
//WebUI.setText(findTestObject('WEB/Saucedemo/login/input_Swag Labs_password'), password)
WebUI.click(findTestObject('WEB/Saucedemo/login/input_Swag Labs_login-button'))

WebUI.verifyElementVisible(findTestObject('WEB/Saucedemo/dashboard/button_Add to cart'))

WebUI.verifyElementVisible(findTestObject('WEB/Saucedemo/dashboard/a_Swag Labs_shopping_cart_link'))

WebUI.verifyElementVisible(findTestObject('WEB/Saucedemo/dashboard/button_Open Menu'))

WebUI.verifyElementVisible(findTestObject('WEB/Saucedemo/dashboard/div_29.99'))

WebUI.verifyElementVisible(findTestObject('WEB/Saucedemo/dashboard/span_Name (A to Z)Name (A to Z)Name (Z to A)Price (low to high)Price (high to low)'))

WebUI.verifyElementVisible(findTestObject('WEB/Saucedemo/dashboard/span_Products'))

WebUI.verifyElementVisible(findTestObject('WEB/Saucedemo/dashboard/Page_Swag Labs/div_carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection'))

WebUI.verifyElementVisible(findTestObject('WEB/Saucedemo/dashboard/Page_Swag Labs/div_15.99'))

WebUI.verifyElementVisible(findTestObject('WEB/Saucedemo/dashboard/Page_Swag Labs/div_49.99'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('WEB/Saucedemo/dashboard/Page_Swag Labs/div_carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection'))

