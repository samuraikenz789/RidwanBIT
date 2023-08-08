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

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/1.Verifikasi Peserta Baru/1.Verifikasi Peserta Baru/Page_Bhakti Web/1Clicka_Administration'))

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/1.Verifikasi Peserta Baru/1.Verifikasi Peserta Baru/Page_Bhakti Web/2Clicka_Verifikasi Peserta'))

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Tunggu Revisi dari Peserta Baru/Page_Bhakti Web/1Clicka_Tunggu Revisi dari Peserta Baru (4)'))

'A-Z'
WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Tunggu Revisi dari Peserta Baru/Page_Bhakti Web/2Clickth_Nama Toko'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('NamaTokoOBA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Tunggu Revisi dari Peserta Baru/Page_Bhakti Web/2Clickth_Nama Toko'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('NamaTokoOBZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Tunggu Revisi dari Peserta Baru/Page_Bhakti Web/3Clickth_Nama Pemilik'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('NamaPemilikOBA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Tunggu Revisi dari Peserta Baru/Page_Bhakti Web/3Clickth_Nama Pemilik'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('NamaPemilikOBZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Tunggu Revisi dari Peserta Baru/Page_Bhakti Web/4Clickth_Email'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('EmailOBA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Tunggu Revisi dari Peserta Baru/Page_Bhakti Web/4Clickth_Email'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('EmailOBA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Tunggu Revisi dari Peserta Baru/Page_Bhakti Web/5Clickth_KabupatenKota'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('KabupatenKotaOBA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Tunggu Revisi dari Peserta Baru/Page_Bhakti Web/5Clickth_KabupatenKota'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('KabupatenKotaOBZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Tunggu Revisi dari Peserta Baru/Page_Bhakti Web/6Clickth_BL'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('BLOBA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Tunggu Revisi dari Peserta Baru/Page_Bhakti Web/6Clickth_BL'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('BLOBA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Tunggu Revisi dari Peserta Baru/Page_Bhakti Web/7th_JamWaktu'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('JamWaktuOB1-100.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Tunggu Revisi dari Peserta Baru/Page_Bhakti Web/7th_JamWaktu'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('JamWaktuOB100-1.PNG')

'Delay\r\n'
WebUI.delay(2)

WebUI.setText(findTestObject('3.Administration/2.Verifikasi Peserta/2.Tunggu Revisi dari Peserta Baru/Page_Bhakti Web/8ST Nama Toko'), 
    'toko rino')

WebUI.delay(2)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('NameOfTheOwner.PNG')

WebUI.setText(findTestObject('3.Administration/2.Verifikasi Peserta/2.Tunggu Revisi dari Peserta Baru/Page_Bhakti Web/8ST Nama Toko'), 
    ' ')

'Delay\r\n'
WebUI.delay(2)

WebUI.setText(findTestObject('3.Administration/2.Verifikasi Peserta/2.Tunggu Revisi dari Peserta Baru/Page_Bhakti Web/9ST Nama Pemilik'), 
    'rino')

WebUI.delay(2)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('NameOfTheOwner.PNG')

WebUI.setText(findTestObject('3.Administration/2.Verifikasi Peserta/2.Tunggu Revisi dari Peserta Baru/Page_Bhakti Web/9ST Nama Pemilik'), 
    ' ')

'Delay\r\n'
WebUI.delay(2)

WebUI.setText(findTestObject('3.Administration/2.Verifikasi Peserta/2.Tunggu Revisi dari Peserta Baru/Page_Bhakti Web/10ST Email'), 
    'rinodarput05@gmail.com')

WebUI.delay(2)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('NameOfTheOwner.PNG')

WebUI.setText(findTestObject('3.Administration/2.Verifikasi Peserta/2.Tunggu Revisi dari Peserta Baru/Page_Bhakti Web/10ST Email'), 
    ' ')

'Delay\r\n'
WebUI.delay(2)

WebUI.setText(findTestObject('3.Administration/2.Verifikasi Peserta/2.Tunggu Revisi dari Peserta Baru/Page_Bhakti Web/11ST KabupatenKotao'), 
    'kota jakarta barat')

WebUI.delay(2)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('NameOfTheOwner.PNG')

WebUI.setText(findTestObject('3.Administration/2.Verifikasi Peserta/2.Tunggu Revisi dari Peserta Baru/Page_Bhakti Web/11ST KabupatenKotao'), 
    ' ')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/3.Administration/2.Verifikasi Peserta/2.Tunggu Revisi dari Peserta Baru/Tunggu Revisi Dari Peserta Baru View-Verified/Page_Bhakti Web/rect'))

WebUI.delay(500)

WebUI.click(findTestObject('Object Repository/3.Administration/2.Verifikasi Peserta/2.Tunggu Revisi dari Peserta Baru/Tunggu Revisi Dari Peserta Baru View-Verified/Page_Bhakti Web/button_Verified'))

