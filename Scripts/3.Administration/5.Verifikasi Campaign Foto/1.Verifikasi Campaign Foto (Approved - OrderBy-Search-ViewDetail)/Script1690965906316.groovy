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

WebUI.click(findTestObject('3.Administration/5.Verifikasi Campaign Foto/Campaign Foto V1/Page_Bhakti Web/1Click a_Administration'))

WebUI.click(findTestObject('3.Administration/5.Verifikasi Campaign Foto/Campaign Foto V1/Page_Bhakti Web/2Click a_Verifikasi Campaign Foto'))

WebUI.delay(2)

WebUI.click(findTestObject('3.Administration/5.Verifikasi Campaign Foto/Campaign Foto V1/Page_Bhakti Web/3Click button_Pilih Campaign'))

WebUI.delay(2)

WebUI.click(findTestObject('3.Administration/5.Verifikasi Campaign Foto/Campaign Foto V1/Page_Bhakti Web/4Click nb-option_Testing Sonny Display'))

WebUI.delay(2)

WebUI.click(findTestObject('3.Administration/5.Verifikasi Campaign Foto/Campaign Foto V1/Page_Bhakti Web/5Click button_Pilih Periode'))

WebUI.delay(2)

WebUI.click(findTestObject('3.Administration/5.Verifikasi Campaign Foto/Campaign Foto V1/Page_Bhakti Web/6Click nb-option_Periode 1'))

WebUI.delay(2)

WebUI.click(findTestObject('3.Administration/5.Verifikasi Campaign Foto/Campaign Foto V1/Page_Bhakti Web/7click a_Approved'))

'A-Z'
WebUI.click(findTestObject('3.Administration/5.Verifikasi Campaign Foto/Campaign Foto V1/Page_Bhakti Web/8Click th_Nama'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('NamaOBA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('3.Administration/5.Verifikasi Campaign Foto/Campaign Foto V1/Page_Bhakti Web/8Click th_Nama'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('NamaOBZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('3.Administration/5.Verifikasi Campaign Foto/Campaign Foto V1/Page_Bhakti Web/9Click th_Email'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('EmailOBA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('3.Administration/5.Verifikasi Campaign Foto/Campaign Foto V1/Page_Bhakti Web/9Click th_Email'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('EmailOBZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('3.Administration/5.Verifikasi Campaign Foto/Campaign Foto V1/Page_Bhakti Web/10 Click th_Tgl Upload'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('TglUploadOB1-100.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('3.Administration/5.Verifikasi Campaign Foto/Campaign Foto V1/Page_Bhakti Web/10 Click th_Tgl Upload'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('TglUploadOB100-1.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('3.Administration/5.Verifikasi Campaign Foto/Campaign Foto V1/Page_Bhakti Web/11Click th_Periode'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('PeriodeOB1-100.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('3.Administration/5.Verifikasi Campaign Foto/Campaign Foto V1/Page_Bhakti Web/11Click th_Periode'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('PeriodeOB100-1.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('3.Administration/5.Verifikasi Campaign Foto/Campaign Foto V1/Page_Bhakti Web/12Click th_Jumlah Revisi'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('JumlahRevisiOB1-100.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('3.Administration/5.Verifikasi Campaign Foto/Campaign Foto V1/Page_Bhakti Web/12Click th_Jumlah Revisi'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('JumlahRevisiOB100-1.PNG')

'Delay\r\n'
WebUI.delay(2)

WebUI.setText(findTestObject('3.Administration/5.Verifikasi Campaign Foto/Campaign Foto V1/Page_Bhakti Web/13 ST Nama'), 
    'Toko Bagusss')

WebUI.delay(2)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('HasilSearchNama.PNG')

WebUI.delay(1)

WebUI.setText(findTestObject('3.Administration/5.Verifikasi Campaign Foto/Campaign Foto V1/Page_Bhakti Web/13 ST Nama'), 
    ' ')

WebUI.delay(2)

WebUI.click(findTestObject('3.Administration/5.Verifikasi Campaign Foto/Campaign Foto V1/Page_Bhakti Web/14Click button_Detail'))

WebUI.delay(3)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('DetailUserYangBerpatisipasi.PNG')

WebUI.click(findTestObject('3.Administration/5.Verifikasi Campaign Foto/Campaign Foto V1/Page_Bhakti Web/15Click button_BACK'))

