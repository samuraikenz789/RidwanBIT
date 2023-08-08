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

WebUI.click(findTestObject('2.Master/Master Target Peserta/Pemenang Group OB-Search/Page_Bhakti Web/1Click a_Pemenang Group'))

WebUI.click(findTestObject('2.Master/Master Target Peserta/Pemenang Group OB-Search/Pemenang Group Create-View-Delete/Page_Bhakti Web/1Click button_Generate New Group'))

WebUI.click(findTestObject('2.Master/Master Target Peserta/Pemenang Group OB-Search/Pemenang Group Create-View-Delete/Page_Bhakti Web/2Click button_Pilih Campaign'))

WebUI.click(findTestObject('2.Master/Master Target Peserta/Pemenang Group OB-Search/Pemenang Group Create-View-Delete/Page_Bhakti Web/3Click option_a Pilih Campaign A'))

WebUI.click(findTestObject('2.Master/Master Target Peserta/Pemenang Group OB-Search/Pemenang Group Create-View-Delete/Page_Bhakti Web/4Click button_Generate'))

WebUI.delay(1)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('GenerateNewGroup.PNG')

WebUI.delay(2)

WebUI.click(findTestObject('2.Master/Master Target Peserta/Pemenang Group OB-Search/Pemenang Group Create-View-Delete/Page_Bhakti Web/5CLick img View'))

WebUI.delay(2)

WebUI.click(findTestObject('2.Master/Master Target Peserta/Pemenang Group OB-Search/Pemenang Group Create-View-Delete/Page_Bhakti Web/6Click Delete Button rect'))

WebUI.delay(2)

WebUI.click(findTestObject('2.Master/Master Target Peserta/Pemenang Group OB-Search/Pemenang Group Create-View-Delete/Page_Bhakti Web/7Click button_Delete'))

WebUI.delay(1)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('DeleteGeneratePemenangGroup.PNG')

