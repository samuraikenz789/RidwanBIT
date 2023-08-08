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

'A-Z'
WebUI.click(findTestObject('2.Master/Master Target Peserta/Pemenang Group OB-Search/Page_Bhakti Web/2Click th_Group ID'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('GroupIDOBA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('2.Master/Master Target Peserta/Pemenang Group OB-Search/Page_Bhakti Web/2Click th_Group ID'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('GroupIDOBZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('2.Master/Master Target Peserta/Pemenang Group OB-Search/Page_Bhakti Web/3Click th_Tipe Pemenang'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('TipePemenangOBA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('2.Master/Master Target Peserta/Pemenang Group OB-Search/Page_Bhakti Web/3Click th_Tipe Pemenang'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('TipePemenangOBZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('2.Master/Master Target Peserta/Pemenang Group OB-Search/Page_Bhakti Web/4Click th_Campaign'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('CampaignOBA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('2.Master/Master Target Peserta/Pemenang Group OB-Search/Page_Bhakti Web/4Click th_Campaign'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('CampaignOBZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('2.Master/Master Target Peserta/Pemenang Group OB-Search/Page_Bhakti Web/5Click th_Keterangan'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('KeteranganOBA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('2.Master/Master Target Peserta/Pemenang Group OB-Search/Page_Bhakti Web/5Click th_Keterangan'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('KeteranganOBZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

WebUI.setText(findTestObject('2.Master/Master Target Peserta/Pemenang Group OB-Search/Page_Bhakti Web/6ST Group ID'), 'TEST_SONNY_QR-PEMENANG-PERINGKAT')

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('GroupIDSearch,PNG')

WebUI.setText(findTestObject('2.Master/Master Target Peserta/Pemenang Group OB-Search/Page_Bhakti Web/6ST Group ID'), ' ')

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('2.Master/Master Target Peserta/Pemenang Group OB-Search/Page_Bhakti Web/7ST Tipe PEmenang'), 
    'Undian')

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('TipePemenangSearch,PNG')

WebUI.setText(findTestObject('2.Master/Master Target Peserta/Pemenang Group OB-Search/Page_Bhakti Web/7ST Tipe PEmenang'), 
    ' ')

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('2.Master/Master Target Peserta/Pemenang Group OB-Search/Page_Bhakti Web/8ST Campaign'), 'a')

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('TipePemenangSearch,PNG')

WebUI.setText(findTestObject('2.Master/Master Target Peserta/Pemenang Group OB-Search/Page_Bhakti Web/8ST Campaign'), ' ')

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('2.Master/Master Target Peserta/Pemenang Group OB-Search/Page_Bhakti Web/9ST Keterangan'), 'Daftar Pemenang Peringkat Test Sonny QR')

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('KeteranganSearch,PNG')

WebUI.setText(findTestObject('2.Master/Master Target Peserta/Pemenang Group OB-Search/Page_Bhakti Web/9ST Keterangan'), ' ')

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

