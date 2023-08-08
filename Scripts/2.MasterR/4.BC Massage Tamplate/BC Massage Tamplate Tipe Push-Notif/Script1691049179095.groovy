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

WebUI.click(findTestObject('2.Master/BC Massage Tamplate/BC Massage Tamplate Tipe Push-Notif/Page_Bhakti Web/1Click a_Master'))

WebUI.click(findTestObject('2.Master/BC Massage Tamplate/BC Massage Tamplate Tipe Push-Notif/Page_Bhakti Web/2Click a_BC Message Template'))

WebUI.click(findTestObject('2.Master/BC Massage Tamplate/BC Massage Tamplate Tipe Push-Notif/Page_Bhakti Web/3Click ComboBox Tipe'))

WebUI.delay(1)

WebUI.click(findTestObject('2.Master/BC Massage Tamplate/BC Massage Tamplate Tipe Push-Notif/Page_Bhakti Web/4Click Pilihan_Push-Notif'))

WebUI.click(findTestObject('2.Master/BC Massage Tamplate/BC Massage Tamplate Tipe Push-Notif/Page_Bhakti Web/5Click Allow Broadcast'))

WebUI.click(findTestObject('2.Master/BC Massage Tamplate/BC Massage Tamplate Tipe Push-Notif/Page_Bhakti Web/6Click Public'))

WebUI.setText(findTestObject('2.Master/BC Massage Tamplate/BC Massage Tamplate Tipe Push-Notif/Page_Bhakti Web/7ST Judul Artikel'), 
    'Automation Test')

WebUI.setText(findTestObject('2.Master/BC Massage Tamplate/BC Massage Tamplate Tipe Push-Notif/Page_Bhakti Web/8ST Content'), 
    'Automation Content')

WebUI.click(findTestObject('2.Master/BC Massage Tamplate/BC Massage Tamplate Tipe Push-Notif/Page_Bhakti Web/9Click button_Submit'))

WebUI.delay(1)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('TamplatePush-Notif.PNG')

