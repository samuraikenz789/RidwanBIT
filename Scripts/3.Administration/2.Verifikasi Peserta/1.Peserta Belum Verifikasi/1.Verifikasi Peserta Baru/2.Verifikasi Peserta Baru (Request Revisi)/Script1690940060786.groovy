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

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/1.Verifikasi Peserta Baru/1.Verifikasi Peserta Baru/Page_Bhakti Web/3Click Checkbox Semua Cabang'))

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/1.Verifikasi Peserta Baru/1.Verifikasi Peserta Baru/Verifikasi Peserta Baru Icon Revisi/Page_Bhakti Web/1IconView(RevisiDataToko)'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/1.Verifikasi Peserta Baru/Verifikasi Peserta Baru Icon Revisi/Page_Bhakti Web/2Click Checkbox Permintaan Revisi'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('3.Administration/2.Verifikasi Peserta/1.Verifikasi Peserta Baru/Verifikasi Peserta Baru Icon Revisi/Page_Bhakti Web/3 Scroll Click Checkbox No Rekening'), 
    0)

'Request Revisi no Rekening\r\n'
WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/1.Verifikasi Peserta Baru/Verifikasi Peserta Baru Icon Revisi/Page_Bhakti Web/3 Scroll Click Checkbox No Rekening'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('3.Administration/2.Verifikasi Peserta/1.Verifikasi Peserta Baru/Verifikasi Peserta Baru Icon Revisi/Page_Bhakti Web/4 Scroll ST Data Toko'), 
    0)

WebUI.setText(findTestObject('3.Administration/2.Verifikasi Peserta/1.Verifikasi Peserta Baru/Verifikasi Peserta Baru Icon Revisi/Page_Bhakti Web/4 Scroll ST Data Toko'), 
    'Tolong Revisi Data Toko')

WebUI.scrollToElement(findTestObject('3.Administration/2.Verifikasi Peserta/1.Verifikasi Peserta Baru/Verifikasi Peserta Baru Icon Revisi/Page_Bhakti Web/5 Scroll ST Status Usaha'), 
    0)

WebUI.setText(findTestObject('3.Administration/2.Verifikasi Peserta/1.Verifikasi Peserta Baru/Verifikasi Peserta Baru Icon Revisi/Page_Bhakti Web/5 Scroll ST Status Usaha'), 
    'Tolong Revisi Status Usaha')

WebUI.scrollToElement(findTestObject('3.Administration/2.Verifikasi Peserta/1.Verifikasi Peserta Baru/Verifikasi Peserta Baru Icon Revisi/Page_Bhakti Web/6 Scroll ST Data Bank'), 
    0)

WebUI.setText(findTestObject('3.Administration/2.Verifikasi Peserta/1.Verifikasi Peserta Baru/Verifikasi Peserta Baru Icon Revisi/Page_Bhakti Web/6 Scroll ST Data Bank'), 
    'Tolong Revisi Data Bank')

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/1.Verifikasi Peserta Baru/Verifikasi Peserta Baru Icon Revisi/Page_Bhakti Web/7 Click Kirim Revisi'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/1.Verifikasi Peserta Baru/Verifikasi Peserta Baru Icon Revisi/Page_Bhakti Web/7 Click button_Yes'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('MemintaTokoRevisi.PNG')

WebUI.delay(1)

WebUI.sendKeys(findTestObject('3.Administration/2.Verifikasi Peserta/1.Verifikasi Peserta Baru/Verifikasi Peserta Baru Icon Revisi/Page_Bhakti Web/7 Click button_Yes'), 
    Keys.chord(Keys.ESCAPE))

WebUI.delay(2)

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/1.Verifikasi Peserta Baru/Verifikasi Peserta Baru Icon Revisi/Page_Bhakti Web/8Click Icon Refresh'))

WebUI.delay(2)

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/1.Verifikasi Peserta Baru/Verifikasi Peserta Baru Icon Revisi/Page_Bhakti Web/9Click button_Verified'), 
    FailureHandling.STOP_ON_FAILURE)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('MemverifiedToko.PNG')

WebUI.delay(2)

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/1.Verifikasi Peserta Baru/1.Verifikasi Peserta Baru/Verifikasi Peserta Baru Icon Revisi/Page_Bhakti Web/10Click img'))

WebUI.delay(2)

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/1.Verifikasi Peserta Baru/1.Verifikasi Peserta Baru/Verifikasi Peserta Baru Icon Revisi/Page_Bhakti Web/11Click button_UPDATE'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(555)

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/1.Verifikasi Peserta Baru/1.Verifikasi Peserta Baru/Verifikasi Peserta Baru Icon Revisi/Page_Bhakti Web/12Clickbutton_yes'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('Meng-UpdateToko.PNG')

