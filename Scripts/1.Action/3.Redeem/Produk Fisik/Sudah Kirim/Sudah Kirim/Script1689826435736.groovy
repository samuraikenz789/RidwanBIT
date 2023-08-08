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

WebUI.click(findTestObject('1.Action/Redeem/Produk Fisik/Pending Search-Comment-Input Detail-Reject/Page_Bhakti Web/1Click a_Action'))

WebUI.click(findTestObject('1.Action/Redeem/Produk Fisik/Pending Search-Comment-Input Detail-Reject/Page_Bhakti Web/2Click a_Redeem'))

WebUI.delay(1)

WebUI.click(findTestObject('1.Action/Redeem/Produk Fisik/Sudah Kirim/Page_Bhakti Web/1Click a_Sudah Dikirim'))

WebUI.delay(1)

WebUI.setText(findTestObject('1.Action/Redeem/Produk Fisik/Sudah Kirim/Page_Bhakti Web/2ST Start Date'), '01/01/2023')

WebUI.setText(findTestObject('1.Action/Redeem/Produk Fisik/Sudah Kirim/Page_Bhakti Web/3ST End Date'), '12/12/2023')

WebUI.click(findTestObject('1.Action/Redeem/Produk Fisik/Sudah Kirim/Page_Bhakti Web/4 8 Click button_Search'))

WebUI.setText(findTestObject('1.Action/Redeem/Produk Fisik/Sudah Kirim/Page_Bhakti Web/5 ST Comment'), 'CommentAutomation01')

WebUI.click(findTestObject('1.Action/Redeem/Produk Fisik/Sudah Kirim/Page_Bhakti Web/6Click button_Kirim'))

WebUI.setText(findTestObject('1.Action/Redeem/Produk Fisik/Sudah Kirim/Page_Bhakti Web/7ST Search Nama Toko'), 'Toko Bagusss')

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('NamaTokoSearch.PNG')

WebUI.click(findTestObject('1.Action/Redeem/Produk Fisik/Sudah Kirim/Page_Bhakti Web/4 8 Click button_Search'))

WebUI.setText(findTestObject('1.Action/Redeem/Produk Fisik/Sudah Kirim/Page_Bhakti Web/7ST Search Nama Toko'), ' ')

WebUI.click(findTestObject('1.Action/Redeem/Produk Fisik/Sudah Kirim/Page_Bhakti Web/4 8 Click button_Search'))

