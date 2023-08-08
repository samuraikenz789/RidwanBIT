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

WebUI.delay(2)

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/1Clicka_Administration'))

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/2Clicka_User Wallet Management'))

'A-Z'
WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/3Click OB th_Nama'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('NamaOBA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/3Click OB th_Nama'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('NamaOBZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/4Click OB th_Status Peserta'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('StatusPesertaOBA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/4Click OB th_Status Peserta'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('StatusPesertaOBZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/5Click OB th_No. Telepon'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('NoTelponOB1-100.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/5Click OB th_No. Telepon'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('NoTelponOB100-1.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/6Click OB th_Email'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('EmailOBA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/6Click OB th_Email'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('EmailOBZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/7Click button_Search with'))

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/option_Email'))

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/Click Label Setelah Pilih Opsi Browse Data User'))

WebUI.setText(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/ST input_Email_filter-email'), 'wijayadell789@gmail.com')

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/111 Reuse button_Go setelah set text'))

WebUI.delay(2)

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/7Click button_Search with'))

WebUI.delay(2)

WebUI.focus(findTestObject('3.Administration/6.User Wallet Management/Tambelan Wallet/Page_Bhakti Web/nb-option_Nama Toko'))

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Tambelan Wallet/Page_Bhakti Web/nb-option_Nama Toko'))

WebUI.delay(2)

WebUI.focus(findTestObject('3.Administration/6.User Wallet Management/Tambelan Wallet/Page_Bhakti Web/nb-option_No HP'))

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Tambelan Wallet/Page_Bhakti Web/nb-option_No HP'))

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/Click Label Setelah Pilih Opsi Browse Data User'))

WebUI.setText(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/ST input_No HP, Nama Toko_filter-no_hp'), 
    '081394338831')

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/111 Reuse button_Go setelah set text'))

WebUI.delay(0)

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/7Click button_Search with'))

WebUI.delay(2)

WebUI.focus(findTestObject('3.Administration/6.User Wallet Management/Tambelan Wallet/tambelanyg bener/Page_Bhakti Web/nb-option_No HP'))

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Tambelan Wallet/tambelanyg bener/Page_Bhakti Web/nb-option_No HP'))

WebUI.delay(2)

WebUI.focus(findTestObject('3.Administration/6.User Wallet Management/Tambelan Wallet/tambelanyg bener/Page_Bhakti Web/nb-option_Nama Toko'))

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Tambelan Wallet/tambelanyg bener/Page_Bhakti Web/nb-option_Nama Toko'))

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/Click Label Setelah Pilih Opsi Browse Data User'))

WebUI.setText(findTestObject('3.Administration/6.User Wallet Management/Tambelan Wallet/Page_Bhakti Web/input_Nama Toko_filter-nama_toko'), 
    'ridwan')

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/111 Reuse button_Go setelah set text'))

