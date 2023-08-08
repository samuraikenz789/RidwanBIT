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

WebUI.click(findTestObject('Object Repository/2.Master/Master Target Peserta/Provinsi Group/Provinsi Group Create-Edit-Delete/Page_Bhakti Web/a_Master'))

WebUI.click(findTestObject('Object Repository/2.Master/Master Target Peserta/Provinsi Group/Provinsi Group Create-Edit-Delete/Page_Bhakti Web/a_Master Target Peserta'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/2.Master/Master Target Peserta/Provinsi Group/Provinsi Group Create-Edit-Delete/Page_Bhakti Web/a_Provinsi Group'))

WebUI.click(findTestObject('Object Repository/2.Master/Master Target Peserta/Provinsi Group/Provinsi Group Create-Edit-Delete/Page_Bhakti Web/button_Add New Group'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/2.Master/Master Target Peserta/Provinsi Group/Provinsi Group Create-Edit-Delete/Page_Bhakti Web/input_Group ID_ng-pristine ng-invalid input_dd468a'), 
    'TEST')

WebUI.delay(0)

WebUI.setText(findTestObject('Object Repository/2.Master/Master Target Peserta/Provinsi Group/Provinsi Group Create-Edit-Delete/Page_Bhakti Web/textarea_Keterangan_ng-untouched input-full_c08075'), 
    'test')

WebUI.delay(0)

WebUI.click(findTestObject('Object Repository/2.Master/Master Target Peserta/Provinsi Group/Provinsi Group Create-Edit-Delete/Page_Bhakti Web/button_Tambah Cakupan Provinsi'))

WebUI.click(findTestObject('Object Repository/2.Master/Master Target Peserta/Provinsi Group/Provinsi Group Create-Edit-Delete/Page_Bhakti Web/button_Search with'))

WebUI.click(findTestObject('Object Repository/2.Master/Master Target Peserta/Provinsi Group/Provinsi Group Create-Edit-Delete/Page_Bhakti Web/nb-option_Provinsi'))

WebUI.click(findTestObject('Object Repository/2.Master/Master Target Peserta/Provinsi Group/Provinsi Group Create-Edit-Delete/Page_Bhakti Web/button_Go'))

WebUI.click(findTestObject('Object Repository/2.Master/Master Target Peserta/Provinsi Group/Provinsi Group Create-Edit-Delete/Page_Bhakti Web/button_Select'))

WebUI.click(findTestObject('Object Repository/2.Master/Master Target Peserta/Provinsi Group/Provinsi Group Create-Edit-Delete/Page_Bhakti Web/button_Yes'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/2.Master/Master Target Peserta/Provinsi Group/Provinsi Group Create-Edit-Delete/Page_Bhakti Web/button_Tambah Cakupan Provinsi'))

WebUI.click(findTestObject('Object Repository/2.Master/Master Target Peserta/Provinsi Group/Provinsi Group Create-Edit-Delete/Page_Bhakti Web/button_Search with'))

WebUI.click(findTestObject('Object Repository/2.Master/Master Target Peserta/Provinsi Group/Provinsi Group Create-Edit-Delete/Page_Bhakti Web/nb-option_Provinsi_1'))

WebUI.click(findTestObject('Object Repository/2.Master/Master Target Peserta/Provinsi Group/Provinsi Group Create-Edit-Delete/Page_Bhakti Web/button_Go'))

WebUI.click(findTestObject('Object Repository/2.Master/Master Target Peserta/Provinsi Group/Provinsi Group Create-Edit-Delete/Page_Bhakti Web/button_Select'))

WebUI.click(findTestObject('Object Repository/2.Master/Master Target Peserta/Provinsi Group/Provinsi Group Create-Edit-Delete/Page_Bhakti Web/span_Yes'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/2.Master/Master Target Peserta/Provinsi Group/Provinsi Group Create-Edit-Delete/Page_Bhakti Web/button_Save'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('AddNewGroup.PNG')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/2.Master/Master Target Peserta/Provinsi Group/Provinsi Group Create-Edit-Delete/Page_Bhakti Web/img'))

WebUI.setText(findTestObject('Object Repository/2.Master/Master Target Peserta/Provinsi Group/Provinsi Group Create-Edit-Delete/Page_Bhakti Web/textarea_Keterangan_ng-untouched input-full_c08075'), 
    'testganti')

WebUI.scrollToElement(findTestObject('Object Repository/2.Master/Master Target Peserta/Provinsi Group/Provinsi Group Create-Edit-Delete/Page_Bhakti Web/button_Tambah Cakupan Provinsi'), 
    0)

WebUI.delay(1)

WebUI.focus(findTestObject('2.Master/Master Target Peserta/Provinsi Group/Provinsi Group Create-Edit-Delete/tambelanprovinsi/Page_Bhakti Web/1Click Button Provinsi View'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('2.Master/Master Target Peserta/Provinsi Group/Provinsi Group Create-Edit-Delete/tambelanprovinsi/Page_Bhakti Web/1Click Button Provinsi View'))

WebUI.click(findTestObject('2.Master/Master Target Peserta/Provinsi Group/Provinsi Group Create-Edit-Delete/tambelanprovinsi/Page_Bhakti Web/2Click button_Search with'))

WebUI.click(findTestObject('2.Master/Master Target Peserta/Provinsi Group/Provinsi Group Create-Edit-Delete/tambelanprovinsi/Page_Bhakti Web/3Click nb-option_Provinsi'))

WebUI.click(findTestObject('2.Master/Master Target Peserta/Provinsi Group/Provinsi Group Create-Edit-Delete/tambelanprovinsi/Page_Bhakti Web/4Click button_Go'))

WebUI.click(findTestObject('2.Master/Master Target Peserta/Provinsi Group/Provinsi Group Create-Edit-Delete/tambelanprovinsi/Page_Bhakti Web/5 Click Bali button_Select'))

WebUI.delay(2)

WebUI.click(findTestObject('2.Master/Master Target Peserta/Provinsi Group/Provinsi Group Create-Edit-Delete/tambelanprovinsi/Page_Bhakti Web/6Click button_Yes'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('NewGroupEdit.PNG')

WebUI.click(findTestObject('2.Master/Master Target Peserta/Provinsi Group/Provinsi Group Create-Edit-Delete/tambelanprovinsi/Page_Bhakti Web/7Click button_Edit'))

WebUI.click(findTestObject('2.Master/Master Target Peserta/Provinsi Group/Provinsi Group Create-Edit-Delete/tambelanprovinsi/Page_Bhakti Web/1Click Icon View img'))

WebUI.click(findTestObject('2.Master/Master Target Peserta/Provinsi Group/Provinsi Group Create-Edit-Delete/tambelanprovinsi/Page_Bhakti Web/2Click rect'))

WebUI.delay(2)

WebUI.click(findTestObject('2.Master/Master Target Peserta/Provinsi Group/Provinsi Group Create-Edit-Delete/tambelanprovinsi/Page_Bhakti Web/3Click button_Delete'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('ProvinsiGroupDelete.PNG')

WebUI.acceptAlert()

