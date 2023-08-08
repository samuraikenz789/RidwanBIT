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

WebUI.callTestCase(findTestCase('Login/Login As Administrator'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('5.Reporting/2.Campaign Quiz Report/Campaign Quiz Report/Page_Bhakti Web/1a_Reporting'))

WebUI.click(findTestObject('5.Reporting/2.Campaign Quiz Report/Campaign Quiz Report/Page_Bhakti Web/2a_Campaign Quiz Report'))

WebUI.click(findTestObject('5.Reporting/2.Campaign Quiz Report/Campaign Quiz Report/Page_Bhakti Web/3input_Periode_p-inputtext p-component p-element'))

WebUI.delay(3)

WebUI.setText(findTestObject('5.Reporting/2.Campaign Quiz Report/Page_Bhakti Web/ST Nama Campaign'), 'Gebyar Quiz')

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('HasilSearchNamaCampaign.PNG')

WebUI.delay(2)

WebUI.setText(findTestObject('5.Reporting/2.Campaign Quiz Report/Page_Bhakti Web/ST Nama Campaign'), ' ')

WebUI.click(findTestObject('5.Reporting/2.Campaign Quiz Report/Page_Bhakti Web/Click span_View Result'))

WebUI.delay(2)

WebUI.setText(findTestObject('5.Reporting/2.Campaign Quiz Report/Campaign Quiz Report/Page_Bhakti Web/5SetTextNama2xreset'), 
    'arya')

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('HasilSearchName.PNG')

WebUI.delay(2)

WebUI.setText(findTestObject('5.Reporting/2.Campaign Quiz Report/Campaign Quiz Report/Page_Bhakti Web/5SetTextNama2xreset'), 
    ' ')

WebUI.delay(2)

WebUI.setText(findTestObject('5.Reporting/2.Campaign Quiz Report/Campaign Quiz Report/Page_Bhakti Web/6SetTextStatusPeserta2x'), 
    'dealer')

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('HasilSearchStatusPeserta.PNG')

WebUI.delay(2)

WebUI.setText(findTestObject('5.Reporting/2.Campaign Quiz Report/Campaign Quiz Report/Page_Bhakti Web/6SetTextStatusPeserta2x'), 
    ' ')

WebUI.delay(2)

WebUI.setText(findTestObject('5.Reporting/2.Campaign Quiz Report/Campaign Quiz Report/Page_Bhakti Web/7SetTextPeriodeYangDiikuti2xreset'), 
    '1')

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('HasilSearchStatusPesertaDealer.PNG')

WebUI.delay(2)

WebUI.setText(findTestObject('5.Reporting/2.Campaign Quiz Report/Campaign Quiz Report/Page_Bhakti Web/7SetTextPeriodeYangDiikuti2xreset'), 
    ' ')

WebUI.delay(2)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('HasilSearchStatusPesertaSubDealer.PNG')

WebUI.click(findTestObject('5.Reporting/2.Campaign Quiz Report/Campaign Quiz Report/Page_Bhakti Web/8Clickspan_View Detail'), 
    FailureHandling.STOP_ON_FAILURE)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('ViewPeriode1.PNG')

WebUI.delay(2)

WebUI.click(findTestObject('5.Reporting/2.Campaign Quiz Report/Campaign Quiz Report/Page_Bhakti Web/9Clicka_Periode 2'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('ViewPeriode2.PNG')

WebUI.click(findTestObject('5.Reporting/2.Campaign Quiz Report/Campaign Quiz Report/Page_Bhakti Web/10clickbutton_BACK'))

WebUI.click(findTestObject('5.Reporting/2.Campaign Quiz Report/Campaign Quiz Report/Page_Bhakti Web/11Clicka_Periode 1'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('StatistikPeriode1.PNG')

WebUI.delay(2)

WebUI.click(findTestObject('5.Reporting/2.Campaign Quiz Report/Campaign Quiz Report/Page_Bhakti Web/16Clicka_Periode 2'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('StatistikPeriode2.PNG')

