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

WebUI.click(findTestObject('Object Repository/3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Peserta Sukses Verifikasi AllCabang/Page_Bhakti Web/a_Administration'))

WebUI.click(findTestObject('Object Repository/3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Peserta Sukses Verifikasi AllCabang/Page_Bhakti Web/a_Verifikasi Peserta'))

WebUI.click(findTestObject('Object Repository/3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Peserta Sukses Verifikasi AllCabang/Page_Bhakti Web/a_Peserta Sukses Verifikasi'))

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Search All Cabang/Page_Bhakti Web/1Click CheckBox Semua Cabang'))

WebUI.delay(2)

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/semuaCabang/Page_Bhakti Web/1.Click button_Nama Toko'))

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/semuaCabang/Page_Bhakti Web/2Click nb-option_Nama Toko'))

WebUI.delay(2)

WebUI.setText(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/semuaCabang/Page_Bhakti Web/5 ST Nama Pemilik Email Kabupaten'), 
    'Toko Rino')

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/semuaCabang/Page_Bhakti Web/6Click button_Go'))

WebUI.delay(2)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('NamaTokoSearch.PNG')

WebUI.delay(1)

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/semuaCabang/Page_Bhakti Web/1.Click button_Nama Toko'))

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/semuaCabang/Page_Bhakti Web/2Click nb-option_Nama Pemilik'))

WebUI.delay(2)

WebUI.setText(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/semuaCabang/Page_Bhakti Web/5 ST Nama Pemilik Email Kabupaten'), 
    'Andrey wijaya')

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
    'Jakarta')

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/semuaCabang/Page_Bhakti Web/6Click button_Go'))

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/semuaCabang/Page_Bhakti Web/6Click button_Go'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/semuaCabang/Page_Bhakti Web/6Click button_Go'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/semuaCabang/Page_Bhakti Web/6Click button_Go'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/semuaCabang/Page_Bhakti Web/6Click button_Go'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('Kabupaten.PNG', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

'A-Z'
WebUI.focus(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Peserta Sukses Verifikasi Unverified/Tess/Page_Bhakti Web/1Click Nama Toko'), 
    FailureHandling.CONTINUE_ON_FAILURE)

'A-Z'
WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Peserta Sukses Verifikasi Unverified/Tess/Page_Bhakti Web/1Click Nama Toko'), 
    FailureHandling.CONTINUE_ON_FAILURE)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('NamaTokoOBA-Z.PNG', FailureHandling.CONTINUE_ON_FAILURE)

'Delay\r\n'
WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

'Z-A\r\n'
WebUI.focus(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Peserta Sukses Verifikasi Unverified/Tess/Page_Bhakti Web/1Click Nama Toko'), 
    FailureHandling.CONTINUE_ON_FAILURE)

'Z-A\r\n'
WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Peserta Sukses Verifikasi Unverified/Tess/Page_Bhakti Web/1Click Nama Toko'), 
    FailureHandling.CONTINUE_ON_FAILURE)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('NamaTokoOBZ-A.PNG', FailureHandling.CONTINUE_ON_FAILURE)

'Delay\r\n'
WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

'A-Z'
WebUI.focus(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Peserta Sukses Verifikasi Unverified/Tess/Page_Bhakti Web/2Click Nama Pemilik'), 
    FailureHandling.CONTINUE_ON_FAILURE)

'A-Z'
WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Peserta Sukses Verifikasi Unverified/Tess/Page_Bhakti Web/2Click Nama Pemilik'), 
    FailureHandling.CONTINUE_ON_FAILURE)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('NamaPemilikOBA-Z.PNG', FailureHandling.CONTINUE_ON_FAILURE)

'Delay\r\n'
WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

'Z-A\r\n'
WebUI.focus(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Peserta Sukses Verifikasi Unverified/Tess/Page_Bhakti Web/2Click Nama Pemilik'), 
    FailureHandling.CONTINUE_ON_FAILURE)

'Z-A\r\n'
WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Peserta Sukses Verifikasi Unverified/Tess/Page_Bhakti Web/2Click Nama Pemilik'), 
    FailureHandling.CONTINUE_ON_FAILURE)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('NamaPemilikOBZ-A.PNG', FailureHandling.CONTINUE_ON_FAILURE)

'Delay\r\n'
WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

'A-Z'
WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Peserta Sukses Verifikasi Unverified/Tess/Page_Bhakti Web/3Click Email'), 
    FailureHandling.CONTINUE_ON_FAILURE)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('EmailOBA-Z.PNG', FailureHandling.CONTINUE_ON_FAILURE)

'Delay\r\n'
WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

'Z-A\r\n'
WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Peserta Sukses Verifikasi Unverified/Tess/Page_Bhakti Web/3Click Email'), 
    FailureHandling.CONTINUE_ON_FAILURE)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('EmailOBZ-A.PNG', FailureHandling.CONTINUE_ON_FAILURE)

'Delay\r\n'
WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

'A-Z'
WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Peserta Sukses Verifikasi Unverified/Tess/Page_Bhakti Web/4Click Kabupaten Kota'), 
    FailureHandling.CONTINUE_ON_FAILURE)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('KabupatenKotaOBA-Z.PNG', FailureHandling.CONTINUE_ON_FAILURE)

'Delay\r\n'
WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

'Z-A\r\n'
WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Peserta Sukses Verifikasi Unverified/Tess/Page_Bhakti Web/4Click Kabupaten Kota'), 
    FailureHandling.CONTINUE_ON_FAILURE)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('KabupatenKotaOBZ-A.PNG', FailureHandling.CONTINUE_ON_FAILURE)

'Delay\r\n'
WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

'A-Z'
WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Peserta Sukses Verifikasi Unverified/Tess/Page_Bhakti Web/5 Click B L'), 
    FailureHandling.CONTINUE_ON_FAILURE)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('BLOBA-Z.PNG', FailureHandling.CONTINUE_ON_FAILURE)

'Delay\r\n'
WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

'Z-A\r\n'
WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Peserta Sukses Verifikasi Unverified/Tess/Page_Bhakti Web/5 Click B L'), 
    FailureHandling.CONTINUE_ON_FAILURE)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('BLOBZ-A.PNG', FailureHandling.CONTINUE_ON_FAILURE)

'Delay\r\n'
WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

'A-Z'
WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Peserta Sukses Verifikasi Unverified/Tess/Page_Bhakti Web/6Click Jam Waktu'), 
    FailureHandling.CONTINUE_ON_FAILURE)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('JamWaktuOB1-100.PNG', FailureHandling.CONTINUE_ON_FAILURE)

'Delay\r\n'
WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

'Z-A\r\n'
WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Peserta Sukses Verifikasi Unverified/Tess/Page_Bhakti Web/6Click Jam Waktu'), 
    FailureHandling.CONTINUE_ON_FAILURE)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('JamWaktuOB100-1.PNG', FailureHandling.CONTINUE_ON_FAILURE)

'Delay\r\n'
WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Peserta Sukses Verifikasi AllCabang/Verifikasi All cabang search/Page_Bhakti Web/1ST Nama Toko'), 
    'ridwan')

WebUI.delay(2)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('NamaToko.PNG')

WebUI.setText(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Peserta Sukses Verifikasi AllCabang/Verifikasi All cabang search/Page_Bhakti Web/1ST Nama Toko'), 
    ' ')

'Delay\r\n'
WebUI.delay(2)

WebUI.setText(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Peserta Sukses Verifikasi AllCabang/Verifikasi All cabang search/Page_Bhakti Web/2ST Nama Pemilik'), 
    'ridwan')

WebUI.delay(2)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('NamaPemilik.PNG')

WebUI.setText(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Peserta Sukses Verifikasi AllCabang/Verifikasi All cabang search/Page_Bhakti Web/2ST Nama Pemilik'), 
    ' ')

'Delay\r\n'
WebUI.delay(2)

WebUI.setText(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Peserta Sukses Verifikasi AllCabang/Verifikasi All cabang search/Page_Bhakti Web/3ST Email'), 
    'wijaya')

WebUI.delay(2)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('Email.PNG')

WebUI.setText(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Peserta Sukses Verifikasi AllCabang/Verifikasi All cabang search/Page_Bhakti Web/3ST Email'), 
    ' ')

'Delay\r\n'
WebUI.delay(2)

WebUI.setText(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Peserta Sukses Verifikasi AllCabang/Verifikasi All cabang search/Page_Bhakti Web/4ST Kabupaten Atau Kota'), 
    'kota jakarta barat')

WebUI.delay(2)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('Kabupaten/Kota.PNG')

WebUI.setText(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Peserta Sukses Verifikasi AllCabang/Verifikasi All cabang search/Page_Bhakti Web/4ST Kabupaten Atau Kota'), 
    ' ')

WebUI.delay(2)

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Peserta Sukses Verifikasi Unverified/Tess/Page_Bhakti Web/a'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Repository/3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Peserta Sukses Verifikasi - Unverified/Page_Bhakti Web/button_Unverified'), 
    0)

WebUI.click(findTestObject('Object Repository/3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Peserta Sukses Verifikasi - Unverified/Page_Bhakti Web/button_Unverified'))

WebUI.delay(555555)

WebUI.click(findTestObject('Object Repository/3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Peserta Sukses Verifikasi - Unverified/Page_Bhakti Web/button_Yes'))

