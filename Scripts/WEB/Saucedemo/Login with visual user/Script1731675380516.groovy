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

/*
 *  Automates logging into a website and verifies elements on the dashboard page.
 *
 *  1. Opens the browser and navigates to 'https://www.saucedemo.com/'.
 *  2. Enters the provided username and password in the respective input fields. the input for username is "visual_user" and the password is "secret_sauce"
 *  3. Clicks on the login button.
 *  4. Verifies the visibility of the 'Add to cart' button on the dashboard.
 *  5. Verifies the presence of the 'Products' span element on the dashboard with a timeout of 0 seconds.
 *
 */
// Navigates to the website 'https://www.saucedemo.com/'
WebUI.openBrowser('https://www.saucedemo.com/')

// Enters the username "visual_user" and password "secret_sauce" in the respective input fields
WebUI.setText(findTestObject('WEB/Saucedemo/login/input_Swag Labs_user-name'), 'visual_user')

WebUI.setText(findTestObject('WEB/Saucedemo/login/input_Swag Labs_password'), 'secret_sauce')

// Clicks on the login button
WebUI.click(findTestObject('WEB/Saucedemo/login/input_Swag Labs_login-button'))

// Verifies the visibility of the 'Add to cart' button on the dashboard
WebUI.verifyElementVisible(findTestObject('WEB/Saucedemo/dashboard/button_Add to cart'))

// Verifies the presence of the 'Products' span element on the dashboard with a timeout of 0 seconds
WebUI.verifyElementVisible(findTestObject('WEB/Saucedemo/dashboard/span_Products'))

