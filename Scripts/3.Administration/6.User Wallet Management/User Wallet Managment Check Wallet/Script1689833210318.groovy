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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://mishirin-726d8.web.app/#/auth/login')

WebUI.setText(findTestObject('Object Repository/HeaderCampaign/Page_Bhakti Web/input_Email address_email'), 'amink@jasakom.com')

WebUI.setEncryptedText(findTestObject('Object Repository/HeaderCampaign/Page_Bhakti Web/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/HeaderCampaign/Page_Bhakti Web/button_Sign In'))

WebUI.delay(4)

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/1Clicka_Administration'))

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/2Clicka_User Wallet Management'))

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/8Click button_Cek Wallet'))

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/9Click Reuse button_-- Pilih Wallet --'))

WebUI.delay(5)

WebUI.focus(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/Wallet option_TCNew'))

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/Wallet option_TCNew'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('Wallet1.PNG')

WebUI.delay(2)

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/9Click Reuse button_-- Pilih Wallet --'))

WebUI.focus(findTestObject('3.Administration/6.User Wallet Management/Tambelan Wallet/tambelanyg bener/Page_Bhakti Web/nb-option_Wallet Point MSR 2'))

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Tambelan Wallet/tambelanyg bener/Page_Bhakti Web/nb-option_Wallet Point MSR 2'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('Wallet2.PNG')

WebUI.delay(2)

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/9Click Reuse button_-- Pilih Wallet --'))

WebUI.focus(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/Wallet nb-option_Wallet Rupiah MSR'))

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/Wallet nb-option_Wallet Rupiah MSR'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('Wallet3.PNG')

WebUI.delay(2)

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/9Click Reuse button_-- Pilih Wallet --'))

WebUI.focus(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/Wallet nb-option_Wallet Point MSR'))

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/Wallet nb-option_Wallet Point MSR'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('Wallet4.PNG')

WebUI.delay(2)

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/10Click Tambah Transaksi'))

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/11Click button_-- Pilih Tipe Transaksi --'))

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/12Click nb-option_Adjustment'))

WebUI.setText(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/13 ST Notes'), 'testing')

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/14 Click button plusminus'))

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/15Click option Plus'))

WebUI.setText(findTestObject('3.Administration/6.User Wallet Management/Tambelan Wallet/tambelanyg bener/Page_Bhakti Web/ST Nominal Wallet'), 
    '1')

WebUI.delay(2)

WebUI.check(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/17Click button_Input'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/18Click button_Iya'))

