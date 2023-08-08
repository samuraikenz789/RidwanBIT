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

WebUI.delay(3)

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/1CLick a_Master'))

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/2Click a_Setting Roles'))

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/3Click button_Pilih Role ---'))

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/4Click option_test'))

WebUI.delay(1)

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/5Click Main Dashboard'))

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/5.1 Read'))

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/5.1 Write'))

WebUI.delay(1)

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/6Click Statistik Peserta'))

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/6.1 Read'))

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/6.1 Write'))

WebUI.delay(1)

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/7 Statistik-Campaign'))

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/7.1 Read'))

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/7.1 Write'))

WebUI.delay(1)

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/8 Setting Campaign'))

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/8.1 Read'))

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/8.1 Write'))

WebUI.delay(1)

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/9 Setting Catalog Reward'))

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/9.1 Read'))

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/9.1 Write'))

WebUI.delay(1)

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/10 Redeem'))

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/10.1 Read'))

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/10.1 Write'))

WebUI.delay(1)

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/11 Setting MD Survey'))

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/11.1 Read'))

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/11.1 Write'))

WebUI.delay(1)

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/12 Master Barang'))

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/12.1 Read'))

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/12.1 Write'))

WebUI.delay(1)

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/13 Master Wallet'))

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/13.1 Read'))

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/13.1 Write'))

WebUI.delay(1)

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/14 Master Target Peserta'))

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/14.1 Read'))

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/14.1 Write'))

WebUI.delay(1)

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/15 BC Massage Tamplate'))

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/15.1 Read'))

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/15.1 Write'))

WebUI.delay(1)

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/16 Setting Roles'))

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/16.1 Read'))

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/16.1 Write'))

WebUI.delay(1)

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/17 User Mishirin'))

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/17.1 Read'))

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/17.1 Write'))

WebUI.delay(1)

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/18 Verifikasi Peserta'))

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/18.1 Read'))

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/18.1 Write'))

WebUI.delay(1)

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/19 Reward Verification'))

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/19.1 Read'))

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/19.1 Write'))

WebUI.delay(1)

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/20 Mapping Zona'))

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/20.1 Read'))

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/20.1 Write'))

WebUI.delay(1)

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/21 Verifikasi Campaign Foto'))

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/21.1 Read'))

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/21.1 Write'))

WebUI.delay(1)

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/22 User Wallet Management'))

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/22.1 Read'))

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/22.1 Write'))

WebUI.delay(1)

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/23 User Activity Log'))

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/23.1 Read'))

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/23.1 Write'))

WebUI.delay(1)

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/24 Ticket Massages'))

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/24.1 Read'))

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/24.1 Write'))

WebUI.delay(1)

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/25 Broadcast Message'))

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/25.1 Read'))

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/25.1 Write'))

WebUI.delay(1)

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/26 MD Survey dan Attendance'))

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/26.1 Read'))

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/26.1 Write'))

WebUI.delay(1)

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/27 Campaign Quiz Report'))

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/27.1 Read'))

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/27.1 Write'))

WebUI.delay(1)

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/28 Monitoring Scan QR'))

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/28.1 Read'))

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/28.1 Write'))

WebUI.delay(1)

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/29 Monitoring Sys Action Log'))

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/29.1 Read'))

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/29.1 Write'))

WebUI.delay(1)

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/30 Monitoring Vendor IAK'))

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/30.1 Read'))

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/30.1 Write'))

WebUI.delay(1)

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/31 Click button_Simpan'))

WebUI.click(findTestObject('2.Master/Setting Roles/Page_Bhakti Web/32 Click button_Yes'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('SettingRole.PNG')

