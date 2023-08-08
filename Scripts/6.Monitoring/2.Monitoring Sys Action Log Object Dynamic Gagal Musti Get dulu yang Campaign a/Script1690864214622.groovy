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

WebUI.click(findTestObject('6.Monitoring/2.Monitoring Sys Action Log/Page_Bhakti Web/1a_Monitoring'))

WebUI.click(findTestObject('6.Monitoring/2.Monitoring Sys Action Log/Page_Bhakti Web/2a_Monitoring Sys Action Log'))

WebUI.delay(2)

WebUI.click(findTestObject('6.Monitoring/2.Monitoring Sys Action Log/Page_Bhakti Web/3button_-- Pilih Module --'))

WebUI.click(findTestObject('6.Monitoring/2.Monitoring Sys Action Log/Page_Bhakti Web/4nb-option_Setting Campaign'))

WebUI.click(findTestObject('6.Monitoring/2.Monitoring Sys Action Log/Page_Bhakti Web/5button_-- Pilih Campaign --'))

WebUI.click(findTestObject('6.Monitoring/2.Monitoring Sys Action Log/Page_Bhakti Web/6nb-option_a', [('variable') : '//nb-option[@id=\'nb-option-46\']']))

WebUI.click(findTestObject('6.Monitoring/2.Monitoring Sys Action Log/Page_Bhakti Web/7img'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('HeaderCampaign')

WebUI.delay(2)

WebUI.click(findTestObject('6.Monitoring/2.Monitoring Sys Action Log/Page_Bhakti Web/8a_Master Barang  Wallet'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('MasterBarang')

WebUI.delay(2)

WebUI.click(findTestObject('6.Monitoring/2.Monitoring Sys Action Log/Page_Bhakti Web/9a_Setting Tambahan'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('SettingTambahan')

WebUI.delay(2)

