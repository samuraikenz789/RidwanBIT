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

WebUI.delay(4)

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/1.Verifikasi Peserta Baru/1.Verifikasi Peserta Baru/Page_Bhakti Web/1Clicka_Administration'))

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/1.Verifikasi Peserta Baru/1.Verifikasi Peserta Baru/Page_Bhakti Web/2Clicka_Verifikasi Peserta'))

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Page_Bhakti Web/1Clicka_Peserta Sukses Verifikasi'))

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Search All Cabang/Page_Bhakti Web/1Click CheckBox Semua Cabang'))

WebUI.delay(2)

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/semuaCabang/Page_Bhakti Web/1.Click button_Nama Toko'))

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/semuaCabang/Page_Bhakti Web/2Click nb-option_Nama Toko'))

WebUI.delay(2)

WebUI.setText(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/semuaCabang/Page_Bhakti Web/5 ST Nama Pemilik Email Kabupaten'), 
    'Toko Bagus Dotcom')

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/semuaCabang/Page_Bhakti Web/6Click button_Go'))

WebUI.delay(2)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('NamaTokoSearch.PNG')

WebUI.delay(1)

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/semuaCabang/Page_Bhakti Web/1.Click button_Nama Toko'))

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/semuaCabang/Page_Bhakti Web/2Click nb-option_Nama Pemilik'))

WebUI.delay(2)

WebUI.setText(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/semuaCabang/Page_Bhakti Web/5 ST Nama Pemilik Email Kabupaten'), 
    'Irvant')

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/semuaCabang/Page_Bhakti Web/6Click button_Go'))

WebUI.delay(2)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('NamaPemilik.PNG')

WebUI.delay(1)

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/semuaCabang/Page_Bhakti Web/1.Click button_Nama Toko'))

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/semuaCabang/Page_Bhakti Web/3Click nb-option_Email'))

WebUI.delay(2)

WebUI.setText(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/semuaCabang/Page_Bhakti Web/5 ST Nama Pemilik Email Kabupaten'), 
    'namaku_tcoy@yahoo.com')

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/semuaCabang/Page_Bhakti Web/6Click button_Go'))

WebUI.delay(2)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('Email.PNG')

WebUI.delay(1)

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/semuaCabang/Page_Bhakti Web/1.Click button_Nama Toko'))

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/semuaCabang/Page_Bhakti Web/4Click nb-option_Kabupaten'))

WebUI.delay(2)

WebUI.setText(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/semuaCabang/Page_Bhakti Web/5 ST Nama Pemilik Email Kabupaten'), 
    'Kota Jakarta Barat')

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/semuaCabang/Page_Bhakti Web/6Click button_Go'))

WebUI.delay(2)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('Kabupaten.PNG')

WebUI.delay(1)

