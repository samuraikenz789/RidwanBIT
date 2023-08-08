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

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Page_Bhakti Web/1Clicka_Peserta Sukses Verifikasi'))

'A-Z'
WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/OrderBy Sukses Verifikasi/Page_Bhakti Web/1Click th_Nama Toko'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('NamaTokoOBA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/OrderBy Sukses Verifikasi/Page_Bhakti Web/1Click th_Nama Toko'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('NamaTokoOBZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/OrderBy Sukses Verifikasi/Page_Bhakti Web/2Click th_Nama Pemilik'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('NamaPemilikOBA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/OrderBy Sukses Verifikasi/Page_Bhakti Web/2Click th_Nama Pemilik'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('NamaPemilikOBZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/OrderBy Sukses Verifikasi/Page_Bhakti Web/3Click th_Email'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('EmailOBA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/OrderBy Sukses Verifikasi/Page_Bhakti Web/3Click th_Email'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('EmailOBZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/OrderBy Sukses Verifikasi/Page_Bhakti Web/4Click th_KabupatenKota'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('KabupatenKotaOBA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/OrderBy Sukses Verifikasi/Page_Bhakti Web/4Click th_KabupatenKota'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('KabupatenKotaOBZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/OrderBy Sukses Verifikasi/Page_Bhakti Web/5Click th_BL'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('BLOBA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/OrderBy Sukses Verifikasi/Page_Bhakti Web/5Click th_BL'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('BLOBZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/OrderBy Sukses Verifikasi/Page_Bhakti Web/6Click th_JamWaktu'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('JamWaktuOB1-100.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/OrderBy Sukses Verifikasi/Page_Bhakti Web/6Click th_JamWaktu'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('JamWaktuOB100-1.PNG')

'Delay\r\n'
WebUI.delay(2)

WebUI.setText(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Page_Bhakti Web/8ST NamaToko'), 
    'ridwan')

WebUI.delay(2)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('NamaToko.PNG')

WebUI.setText(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Page_Bhakti Web/8ST NamaToko'), 
    ' ')

'Delay\r\n'
WebUI.delay(2)

WebUI.setText(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Page_Bhakti Web/9ST Nama Pemilik'), 
    'ridwan')

WebUI.delay(2)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('NamaPemilik.PNG')

WebUI.setText(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Page_Bhakti Web/9ST Nama Pemilik'), 
    ' ')

'Delay\r\n'
WebUI.delay(2)

WebUI.setText(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Page_Bhakti Web/10ST Email'), 
    'wijaya')

WebUI.delay(2)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('Email.PNG')

WebUI.setText(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Page_Bhakti Web/10ST Email'), 
    ' ')

'Delay\r\n'
WebUI.delay(2)

WebUI.setText(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Page_Bhakti Web/11ST KabupatenKota'), 
    'kota jakarta barat')

WebUI.delay(2)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('Kabupaten/Kota.PNG')

WebUI.setText(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Page_Bhakti Web/11ST KabupatenKota'), 
    'kota jakarta barat')

WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/OrderBy Sukses Verifikasi/Page_Bhakti Web/6Click th_JamWaktu'))

WebUI.delay(1)

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Peserta Sukses Verifikasi Unverified/Tess/Page_Bhakti Web/a'))

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Peserta Sukses Verifikasi (Request Revisi)/Page_Bhakti Web/1Click Checkbox Permintaan Revisi'))

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Peserta Sukses Verifikasi (Request Revisi)/Page_Bhakti Web/2 Revisi Nama Toko'))

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Peserta Sukses Verifikasi (Request Revisi)/Page_Bhakti Web/3 Revisi no HP'))

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Peserta Sukses Verifikasi (Request Revisi)/Page_Bhakti Web/4 Revisi No Whatsapp'))

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Peserta Sukses Verifikasi (Request Revisi)/Page_Bhakti Web/5 Revisi No Telp Toko'))

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Peserta Sukses Verifikasi (Request Revisi)/Page_Bhakti Web/6 Revisi Provinsi'))

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Peserta Sukses Verifikasi (Request Revisi)/Page_Bhakti Web/7 Revisi Kabupaten'))

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Peserta Sukses Verifikasi (Request Revisi)/Page_Bhakti Web/8 Revisi Alamat Toko'))

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Peserta Sukses Verifikasi (Request Revisi)/Page_Bhakti Web/9 Revisi Foto Toko 1'))

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Peserta Sukses Verifikasi (Request Revisi)/Page_Bhakti Web/10 Revisi Foto Toko 2'))

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Peserta Sukses Verifikasi (Request Revisi)/Page_Bhakti Web/11 Revisi Perorangan Atau Badan Usaha'))

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Peserta Sukses Verifikasi (Request Revisi)/Page_Bhakti Web/12 Revisi Nama Lengkap'))

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Peserta Sukses Verifikasi (Request Revisi)/Page_Bhakti Web/13 Revisi Nomor KTP'))

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Peserta Sukses Verifikasi (Request Revisi)/Page_Bhakti Web/14 Revisi Foto KTP'))

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Peserta Sukses Verifikasi (Request Revisi)/Page_Bhakti Web/15 Revisi Nama Bank'))

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Peserta Sukses Verifikasi (Request Revisi)/Page_Bhakti Web/16 Revisi Cabang Bank'))

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Peserta Sukses Verifikasi (Request Revisi)/Page_Bhakti Web/17 Revisi No Rek'))

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Peserta Sukses Verifikasi (Request Revisi)/Page_Bhakti Web/18 Revisi Foto Rek'))

WebUI.setText(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Peserta Sukses Verifikasi (Request Revisi)/Page_Bhakti Web/19 ST Pesan Revisi Data Toko'), 
    'Harap Segera Revisi Data Toko')

WebUI.setText(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Peserta Sukses Verifikasi (Request Revisi)/Page_Bhakti Web/20 ST Pesan Revisi Data Status Usaha'), 
    'Harap Segera Revisi Data Status Usaha')

WebUI.setText(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Peserta Sukses Verifikasi (Request Revisi)/Page_Bhakti Web/21 ST Pesan Revisi Data Bank'), 
    'Harap Segera Revisi Data Bank')

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Peserta Sukses Verifikasi (Request Revisi)/Page_Bhakti Web/22 Click button_Kirim Revisi'))

WebUI.delay(55555555555)

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Peserta Sukses Verifikasi/Peserta Sukses Verifikasi (Request Revisi)/Page_Bhakti Web/23 Click button_Yes'))

