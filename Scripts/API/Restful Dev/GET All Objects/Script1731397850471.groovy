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
import com.kms.katalon.core.testobject.ResponseObject;

WS.sendRequest(findTestObject('API/restful-api.dev/GET All Objects'))



// Get the API response of above test and geenrate if else statement with print success when get 200 returna and else print failed
// Send a request to the API and store the response

// import the ResponseObject

ResponseObject response = WS.sendRequest(findTestObject('API/restful-api.dev/GET All Objects'))

// Check if the response status code is 200
if (response.getStatusCode() == 200) {
	// print the API response body from ResponseObject response
    // Get the API response body from ResponseObject response
    println(response.getResponseBodyContent())


    // Print 'Success' if the status code is 200
    println('Success')
} else {
    // Print 'Failed' if the status code is not 200
    println('Failed')
}
