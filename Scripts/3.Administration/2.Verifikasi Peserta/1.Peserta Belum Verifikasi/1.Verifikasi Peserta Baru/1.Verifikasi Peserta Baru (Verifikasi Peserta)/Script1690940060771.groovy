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

'A-Z'
WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/1.Verifikasi Peserta Baru/1.Verifikasi Peserta Baru/Page_Bhakti Web/4ClickOB_Nama Toko'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('ParticipantNamaTokoA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/1.Verifikasi Peserta Baru/1.Verifikasi Peserta Baru/Page_Bhakti Web/4ClickOB_Nama Toko'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('ParticipantNamaTokoA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/1.Verifikasi Peserta Baru/1.Verifikasi Peserta Baru/Page_Bhakti Web/5ClickOB_Name of the owner'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('NameOwnerA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/1.Verifikasi Peserta Baru/1.Verifikasi Peserta Baru/Page_Bhakti Web/5ClickOB_Name of the owner'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('NameOwnerZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/1.Verifikasi Peserta Baru/1.Verifikasi Peserta Baru/Page_Bhakti Web/6ClickOB_Email'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('EmailA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/1.Verifikasi Peserta Baru/1.Verifikasi Peserta Baru/Page_Bhakti Web/6ClickOB_Email'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('EmailA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/1.Verifikasi Peserta Baru/1.Verifikasi Peserta Baru/Page_Bhakti Web/7ClickOBRegencyCity'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('RegencyA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/1.Verifikasi Peserta Baru/1.Verifikasi Peserta Baru/Page_Bhakti Web/7ClickOBRegencyCity'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('RegencyZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/1.Verifikasi Peserta Baru/1.Verifikasi Peserta Baru/Page_Bhakti Web/8.ClickOB_BL'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('BL A-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/1.Verifikasi Peserta Baru/1.Verifikasi Peserta Baru/Page_Bhakti Web/8.ClickOB_BL'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('BL Z-A.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/1.Verifikasi Peserta Baru/1.Verifikasi Peserta Baru/Page_Bhakti Web/9ClickOB_ClockTime'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('ClockTime1-100.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/1.Verifikasi Peserta Baru/1.Verifikasi Peserta Baru/Page_Bhakti Web/9ClickOB_ClockTime'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('ClockTime100-1.PNG')

'Delay\r\n'
WebUI.delay(2)

WebUI.setText(findTestObject('3.Administration/2.Verifikasi Peserta/1.Verifikasi Peserta Baru/1.Verifikasi Peserta Baru/Page_Bhakti Web/10ST StoreName'), 
    'rino')

WebUI.delay(2)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('StoreName.PNG')

WebUI.setText(findTestObject('3.Administration/2.Verifikasi Peserta/1.Verifikasi Peserta Baru/1.Verifikasi Peserta Baru/Page_Bhakti Web/10ST StoreName'), 
    ' ')

'Delay\r\n'
WebUI.delay(2)

WebUI.setText(findTestObject('3.Administration/2.Verifikasi Peserta/1.Verifikasi Peserta Baru/1.Verifikasi Peserta Baru/Page_Bhakti Web/11ST NameOfTheOwner'), 
    'asdas')

WebUI.delay(2)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('NameOfTheOwner.PNG')

WebUI.setText(findTestObject('3.Administration/2.Verifikasi Peserta/1.Verifikasi Peserta Baru/1.Verifikasi Peserta Baru/Page_Bhakti Web/11ST NameOfTheOwner'), 
    ' ')

'Delay\r\n'
WebUI.delay(2)

WebUI.setText(findTestObject('3.Administration/2.Verifikasi Peserta/1.Verifikasi Peserta Baru/1.Verifikasi Peserta Baru/Page_Bhakti Web/12ST Email'), 
    'rino.bit82')

WebUI.delay(2)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('Email.PNG')

WebUI.setText(findTestObject('3.Administration/2.Verifikasi Peserta/1.Verifikasi Peserta Baru/1.Verifikasi Peserta Baru/Page_Bhakti Web/12ST Email'), 
    ' ')

'Delay\r\n'
WebUI.delay(2)

WebUI.setText(findTestObject('3.Administration/2.Verifikasi Peserta/1.Verifikasi Peserta Baru/1.Verifikasi Peserta Baru/Page_Bhakti Web/13ST RegencyCity'), 
    'kota jakarta barat')

WebUI.delay(2)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('RegencyCity.PNG')

WebUI.setText(findTestObject('3.Administration/2.Verifikasi Peserta/1.Verifikasi Peserta Baru/1.Verifikasi Peserta Baru/Page_Bhakti Web/13ST RegencyCity'), 
    ' ')

'Delay\r\n'
WebUI.delay(2)

