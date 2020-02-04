import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://quria1-arena.axiell.com/welcome')

WebUI.setText(findTestObject('Object Repository/Page_Welcome - quria1-arena-arena.a/input_Search_containerSearchQu'), 'Cervantes')

WebUI.click(findTestObject('Object Repository/Page_Welcome - quria1-arena-arena.a/input_Search_arenaSimpleSearch'))

WebUI.click(findTestObject(null))

WebUI.click(findTestObject('Object Repository/Page_Catalogue Search Result - quri/span_El Quijote de Cervantes'))

WebUI.closeBrowser()



