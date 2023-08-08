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

WebUI.click(findTestObject('6.Monitoring/1.Monitoring Scan QR/Page_Bhakti Web/a_Monitoring'))

WebUI.click(findTestObject('6.Monitoring/1.Monitoring Scan QR/Page_Bhakti Web/a_Monitoring Scan QR'))

WebUI.delay(2)

WebUI.click(findTestObject('6.Monitoring/1.Monitoring Scan QR/Page_Bhakti Web/button_-- Pilih Campaign --'))

WebUI.click(findTestObject('6.Monitoring/1.Monitoring Scan QR/Page_Bhakti Web/nb-option_Test Sonny QR 2'))

WebUI.click(findTestObject('6.Monitoring/1.Monitoring Scan QR/Page_Bhakti Web/Total PesertaS Scan View TakePhoto'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('Peserta Sukses Scan')

WebUI.click(findTestObject('HeaderCampaign/Page_Bhakti Web/1PesertaSuksesClose'))

WebUI.click(findTestObject('6.Monitoring/1.Monitoring Scan QR/Page_Bhakti Web/Total ggl Scan View TakePhoto'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('Peserta Gagal Scan')

WebUI.click(findTestObject('6.Monitoring/1.Monitoring Scan QR/Page_Bhakti Web/2PesertaGGLClose'))

WebUI.scrollToElement(findTestObject('6.Monitoring/1.Monitoring Scan QR/Page_Bhakti Web/Scrollto'), 0)

WebUI.click(findTestObject('6.Monitoring/1.Monitoring Scan QR/Page_Bhakti Web/th_Nama OrderBy'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('OrderByNameA-Z')

WebUI.click(findTestObject('6.Monitoring/1.Monitoring Scan QR/Page_Bhakti Web/th_Nama OrderBy'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('OrderByNameZ-A')

WebUI.delay(0)

WebUI.click(findTestObject('6.Monitoring/1.Monitoring Scan QR/Page_Bhakti Web/th_KotaKabupaten OrderBy'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('OrderByKabupatenA-Z')

WebUI.click(findTestObject('6.Monitoring/1.Monitoring Scan QR/Page_Bhakti Web/th_KotaKabupaten OrderBy'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('OrderByKabupatenZ-A')

WebUI.delay(0)

WebUI.click(findTestObject('6.Monitoring/1.Monitoring Scan QR/Page_Bhakti Web/th_Jumlah Scan OrderBy'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('OrderByJumlahScanA-Z')

WebUI.click(findTestObject('6.Monitoring/1.Monitoring Scan QR/Page_Bhakti Web/th_Jumlah Scan OrderBy'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('OrderByJumlahScanZ-A')

WebUI.delay(0)

WebUI.click(findTestObject('6.Monitoring/1.Monitoring Scan QR/Page_Bhakti Web/th_Total Point OrderBy'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('OrderByTotalPointA-Z')

WebUI.click(findTestObject('6.Monitoring/1.Monitoring Scan QR/Page_Bhakti Web/th_Total Point OrderBy'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('OrderByTotalPointZ-A')

WebUI.delay(0)

WebUI.click(findTestObject('6.Monitoring/1.Monitoring Scan QR/Page_Bhakti Web/th_Status Peserta OrderBy'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('OrderByTotalPointA-Z')

WebUI.click(findTestObject('6.Monitoring/1.Monitoring Scan QR/Page_Bhakti Web/th_Status Peserta OrderBy'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('OrderByTotalPointZ-A')

WebUI.scrollToElement(findTestObject('6.Monitoring/1.Monitoring Scan QR/Page_Bhakti Web/button_-- Pilih Campaign --'), 0)

WebUI.click(findTestObject('6.Monitoring/1.Monitoring Scan QR/Page_Bhakti Web/span_Filter Result'))

WebUI.setText(findTestObject('6.Monitoring/1.Monitoring Scan QR/Page_Bhakti Web/Filter Date ST'), '01/01/2020')

WebUI.setText(findTestObject('6.Monitoring/1.Monitoring Scan QR/Page_Bhakti Web/Filter Date sampai dengan ST'), '6/30/2023')

WebUI.click(findTestObject('6.Monitoring/1.Monitoring Scan QR/Page_Bhakti Web/Status Peserta Dealer CB Click'))

WebUI.click(findTestObject('6.Monitoring/1.Monitoring Scan QR/Page_Bhakti Web/Status Peserta SubDealer CB Click'))

WebUI.click(findTestObject('6.Monitoring/1.Monitoring Scan QR/Page_Bhakti Web/Semarang Checkbox Click'))

WebUI.scrollToElement(findTestObject('6.Monitoring/1.Monitoring Scan QR/Page_Bhakti Web/Semarang Checkbox Click'), 0)

WebUI.delay(2)

WebUI.focus(findTestObject('6.Monitoring/1.Monitoring Scan QR/ButtonFilter/Page_Bhakti Web/div_Apply Filter'))

WebUI.click(findTestObject('6.Monitoring/1.Monitoring Scan QR/ButtonFilter/Page_Bhakti Web/div_Apply Filter'))

'entah kenapa kaga mau ke klik\r\n'
WebUI.delay(2)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('Hasil Filter')

