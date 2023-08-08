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

WebUI.doubleClick(findTestObject('Object Repository/2.Master/Master Target Peserta/Provinsi Group/Provinsi Group Create-Edit-Delete/Page_Bhakti Web/input_Email address_email'))

WebUI.setText(findTestObject('Object Repository/2.Master/Master Target Peserta/Provinsi Group/Provinsi Group Create-Edit-Delete/Page_Bhakti Web/input_Email address_email'), 
    'amink@jasakom.com')

WebUI.setEncryptedText(findTestObject('Object Repository/2.Master/Master Target Peserta/Provinsi Group/Provinsi Group Create-Edit-Delete/Page_Bhakti Web/input_Password_password'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/2.Master/Master Target Peserta/Provinsi Group/Provinsi Group Create-Edit-Delete/Page_Bhakti Web/button_Sign In'))

WebUI.delay(4)

WebUI.click(findTestObject('1.Action/Redeem/Produk Digital/Page_Bhakti Web/1Click a_Action'))

WebUI.click(findTestObject('1.Action/Redeem/Produk Digital/Page_Bhakti Web/2Click a_Redeem'))

WebUI.delay(1)

WebUI.click(findTestObject('1.Action/Redeem/Produk Digital/Page_Bhakti Web/3Click button_Produk Digital'))

WebUI.delay(1)

WebUI.click(findTestObject('1.Action/Redeem/Produk Digital/Page_Bhakti Web/4Click Date Before'))

WebUI.click(findTestObject('1.Action/Redeem/Produk Digital/Page_Bhakti Web/5Click Date After'))

'A-Z'
WebUI.click(findTestObject('1.Action/Redeem/Produk Digital/Page_Bhakti Web/6OB Redeem ID'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('RedeemID1-100.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('1.Action/Redeem/Produk Digital/Page_Bhakti Web/6OB Redeem ID'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('RedeemID100-1.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('1.Action/Redeem/Produk Digital/Page_Bhakti Web/7OB No Tujuan'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('NoTujuan1-100.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('1.Action/Redeem/Produk Digital/Page_Bhakti Web/7OB No Tujuan'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('NoTujuan100-1.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('1.Action/Redeem/Produk Digital/Page_Bhakti Web/8OB Tgl Redeem'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('TglTujuan1-100.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('1.Action/Redeem/Produk Digital/Page_Bhakti Web/8OB Tgl Redeem'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('TglTujuan100-1.PNG')

'Delay\r\n'
WebUI.delay(2)

WebUI.setText(findTestObject('1.Action/Redeem/Produk Digital/Page_Bhakti Web/9ST Redeem ID'), '23afe422-637a-04e1-345f-1fcd0fb986f3')

WebUI.delay(1)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('SearchRedeemID.PNG')

WebUI.setText(findTestObject('1.Action/Redeem/Produk Digital/Page_Bhakti Web/9ST Redeem ID'), ' ')

'Delay\r\n'
WebUI.delay(2)

WebUI.setText(findTestObject('1.Action/Redeem/Produk Digital/Page_Bhakti Web/10 ST No Tujuan'), '33333')

WebUI.delay(1)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('SearchNoTujuan.PNG')

WebUI.setText(findTestObject('1.Action/Redeem/Produk Digital/Page_Bhakti Web/9ST Redeem ID'), ' ')

WebUI.delay(5555)

WebUI.click(findTestObject('1.Action/Redeem/Produk Digital/Page_Bhakti Web/11 Click button_Consolidate'))

