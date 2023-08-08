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
// Penting dibawah
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent

WebUI.callTestCase(findTestCase('Login/Login As Administrator'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('7.User Activity Log/ActivityLogV1/Page_Bhakti Web/1.Click a_Administration'))

WebUI.click(findTestObject('7.User Activity Log/ActivityLogV1/Page_Bhakti Web/2Click a_User Activity Log'))

WebUI.setText(findTestObject('7.User Activity Log/Page_Bhakti Web/3ST Nama'), 'CV Bambang')

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('HasilSearchNama.PNG')

WebUI.setText(findTestObject('7.User Activity Log/Page_Bhakti Web/3ST Nama'), ' ')

WebUI.delay(1)

WebUI.setText(findTestObject('7.User Activity Log/Page_Bhakti Web/4ST Status Peserta'), 'dealer')

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('HasilSearchStatusPeserta.PNG')

WebUI.setText(findTestObject('7.User Activity Log/Page_Bhakti Web/4ST Status Peserta'), ' ')

WebUI.delay(1)

WebUI.setText(findTestObject('7.User Activity Log/Page_Bhakti Web/5ST No Telpon'), '081999097876')

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('HasilSearchNoTelpon.PNG')

WebUI.setText(findTestObject('7.User Activity Log/Page_Bhakti Web/5ST No Telpon'), ' ')

WebUI.delay(1)

WebUI.setText(findTestObject('7.User Activity Log/Page_Bhakti Web/6ST Email'), 'nixandmp@gmail.com')

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('HasilSearchEmail.PNG')

WebUI.setText(findTestObject('7.User Activity Log/Page_Bhakti Web/6ST Email'), ' ')

WebUI.setText(findTestObject('7.User Activity Log/Page_Bhakti Web/7ST Status Akun'), 'Suspended')

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('HasilSearchStatusAkun.PNG')

WebUI.setText(findTestObject('7.User Activity Log/Page_Bhakti Web/7ST Status Akun'), ' ')

WebUI.delay(2)

WebUI.setText(findTestObject('7.User Activity Log/Page_Bhakti Web/3ST Nama'), 'ridwan')

WebUI.delay(2)

WebUI.click(findTestObject('7.User Activity Log/Page_Bhakti Web/8Click button_Detail'))

WebUI.delay(2)

WebUI.click(findTestObject('7.User Activity Log/Page_Bhakti Web/9Click Icon Gear (Setting)'))

WebUI.click(findTestObject('7.User Activity Log/Page_Bhakti Web/10 Lock Campaign Test Sonny QR'))

WebUI.click(findTestObject('7.User Activity Log/Page_Bhakti Web/11 Lock Campaign Test Sonny QR 2'))

WebUI.click(findTestObject('7.User Activity Log/Page_Bhakti Web/12 Lock Campaign  Test Sonny QR 3'))

WebUI.click(findTestObject('7.User Activity Log/Page_Bhakti Web/13 Lock Campaign  Testing Sonny Display'))

WebUI.click(findTestObject('7.User Activity Log/Page_Bhakti Web/14 Lock Wallet Point MSR'))

WebUI.click(findTestObject('7.User Activity Log/Page_Bhakti Web/15 Lock Wallet Rupiah MSR'))

WebUI.focus(findTestObject('7.User Activity Log/Page_Bhakti Web/16 Lock Wallet Undian Akhir Tahun Mishirin'))

WebUI.click(findTestObject('7.User Activity Log/Page_Bhakti Web/16 Lock Wallet Undian Akhir Tahun Mishirin'))

WebUI.click(findTestObject('7.User Activity Log/Page_Bhakti Web/18Click div_Save'))

WebUI.click(findTestObject('7.User Activity Log/Page_Bhakti Web/19 Click button_Yes'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('Hasil Lock Campagin Atau Wallet.PNG')

WebUI.delay(3)

WebUI.click(findTestObject('7.User Activity Log/Page_Bhakti Web/9Click Icon Gear (Setting)'))

WebUI.click(findTestObject('7.User Activity Log/Page_Bhakti Web/10 Lock Campaign Test Sonny QR'))

WebUI.click(findTestObject('7.User Activity Log/Page_Bhakti Web/11 Lock Campaign Test Sonny QR 2'))

WebUI.click(findTestObject('7.User Activity Log/Page_Bhakti Web/12 Lock Campaign  Test Sonny QR 3'))

WebUI.click(findTestObject('7.User Activity Log/Page_Bhakti Web/13 Lock Campaign  Testing Sonny Display'))

WebUI.click(findTestObject('7.User Activity Log/Page_Bhakti Web/14 Lock Wallet Point MSR'))

WebUI.click(findTestObject('7.User Activity Log/Page_Bhakti Web/15 Lock Wallet Rupiah MSR'))

WebUI.focus(findTestObject('7.User Activity Log/Page_Bhakti Web/16 Lock Wallet Undian Akhir Tahun Mishirin'))

WebUI.click(findTestObject('7.User Activity Log/Page_Bhakti Web/16 Lock Wallet Undian Akhir Tahun Mishirin'))

WebUI.click(findTestObject('7.User Activity Log/Page_Bhakti Web/18Click div_Save'))

WebUI.click(findTestObject('7.User Activity Log/Page_Bhakti Web/19 Click button_Yes'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('Hasil UnLock Campagin Atau Wallet.PNG')

WebUI.delay(2)

WebUI.click(findTestObject('7.User Activity Log/Page_Bhakti Web/9Click Icon Gear (Setting)'))

WebUI.click(findTestObject('7.User Activity Log/Page_Bhakti Web/20 Click Suspend Campaign'))

WebUI.click(findTestObject('7.User Activity Log/Page_Bhakti Web/18Click div_Save'))

WebUI.click(findTestObject('7.User Activity Log/ActivityLogV2/Page_Bhakti Web/99 Suspend Campaign button_Yes'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('HasilSuspend Campaign.PNG')

WebUI.delay(3)

WebUI.click(findTestObject('7.User Activity Log/Page_Bhakti Web/9Click Icon Gear (Setting)'))

WebUI.click(findTestObject('7.User Activity Log/Page_Bhakti Web/20 Click Suspend Campaign'))

WebUI.click(findTestObject('7.User Activity Log/Page_Bhakti Web/21 Click Suspend Account'))

WebUI.click(findTestObject('7.User Activity Log/Page_Bhakti Web/18Click div_Save'))

WebUI.click(findTestObject('7.User Activity Log/ActivityLogV2/Page_Bhakti Web/98 Suspend Account button_Yes'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('HasilSuspend Account.PNG')

WebUI.delay(3)

WebUI.click(findTestObject('7.User Activity Log/Page_Bhakti Web/9Click Icon Gear (Setting)'))

WebUI.click(findTestObject('7.User Activity Log/Page_Bhakti Web/21 Click Suspend Account'))

WebUI.click(findTestObject('7.User Activity Log/Page_Bhakti Web/18Click div_Save'))

WebUI.click(findTestObject('7.User Activity Log/ActivityLogV2/Page_Bhakti Web/98 Suspend Account button_Yes'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('Hasil UnSuspend Account.PNG')

WebUI.delay(3)

WebUI.click(findTestObject('7.User Activity Log/Page_Bhakti Web/22. Click div_Filter'))

WebUI.setText(findTestObject('7.User Activity Log/Page_Bhakti Web/23 ST Start Date'), '01/01/2023')

WebUI.setText(findTestObject('7.User Activity Log/Page_Bhakti Web/24 ST End Date'), '12/12/2023')

not_run: WebUI.click(findTestObject('7.User Activity Log/Page_Bhakti Web/25 Click Filter By Campaign'))

WebUI.click(findTestObject('7.User Activity Log/Page_Bhakti Web/26 Click Filter By Redeem'))

not_run: WebUI.click(findTestObject('7.User Activity Log/Page_Bhakti Web/27 Click Filter By Update Data'))

'tingal di ganti pilihan di atas\r\n'
WebUI.delay(0)

WebUI.delay(2)

WebUI.click(findTestObject('7.User Activity Log/Button Apply Backup/div_Apply Filter'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('7.User Activity Log/ActivityLogV3/Page_Bhakti Web/Scroll To div_User Logs Summary'), 
    0)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('7.User Activity Log/Page_Bhakti Web/9Click Icon Gear (Setting)'), 0)

WebUI.click(findTestObject('7.User Activity Log/Page_Bhakti Web/29 Click span_Lihat Detail'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/7.User Activity Log/TestingV1/Page_Bhakti Web/path'))

WebUI.delay(1)

WebUI.click(findTestObject('7.User Activity Log/Page_Bhakti Web/30 Click span_Lihat Titik Lokasi'))

