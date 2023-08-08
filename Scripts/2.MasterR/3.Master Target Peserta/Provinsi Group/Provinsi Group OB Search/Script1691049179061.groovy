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

WebUI.setText(findTestObject('Object Repository/2.Master/Master Wallet/Approved OB Lock-Unlock Wallet/Page_Bhakti Web/input_Email address_email'), 
    'amink@jasakom.com')

WebUI.setEncryptedText(findTestObject('Object Repository/2.Master/Master Wallet/Approved OB Lock-Unlock Wallet/Page_Bhakti Web/input_Password_password'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.sendKeys(findTestObject('Object Repository/2.Master/Master Wallet/Approved OB Lock-Unlock Wallet/Page_Bhakti Web/input_Password_password'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(4)

WebUI.click(findTestObject('2.Master/Master Target Peserta/Provinsi Group/Provinsi Group Search OB/Page_Bhakti Web/1Click a_Master'))

WebUI.click(findTestObject('2.Master/Master Target Peserta/Provinsi Group/Provinsi Group Search OB/Page_Bhakti Web/2Click a_Master Target Peserta'))

WebUI.click(findTestObject('2.Master/Master Target Peserta/Provinsi Group/Provinsi Group Search OB/Page_Bhakti Web/3Click a_Provinsi Group'))

WebUI.delay(0)

'A-Z'
WebUI.click(findTestObject('2.Master/Master Target Peserta/Provinsi Group/Provinsi Group Search OB/Page_Bhakti Web/4Click OB th_Group ID'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('GroupIDOBA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('2.Master/Master Target Peserta/Provinsi Group/Provinsi Group Search OB/Page_Bhakti Web/4Click OB th_Group ID'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('GroupIDOZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('2.Master/Master Target Peserta/Provinsi Group/Provinsi Group Search OB/Page_Bhakti Web/5Click OB th_Keterangan'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('KeteranganOBA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('2.Master/Master Target Peserta/Provinsi Group/Provinsi Group Search OB/Page_Bhakti Web/5Click OB th_Keterangan'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('KeteranganOZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

WebUI.setText(findTestObject('2.Master/Master Target Peserta/Provinsi Group/Provinsi Group Search OB/Page_Bhakti Web/6 ST Group ID'), 
    'provinsi-msr-2')

WebUI.delay(2)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('GroupIDSearch.PNG')

WebUI.setText(findTestObject('2.Master/Master Target Peserta/Provinsi Group/Provinsi Group Search OB/Page_Bhakti Web/6 ST Group ID'), 
    ' ')

WebUI.delay(2)

WebUI.setText(findTestObject('2.Master/Master Target Peserta/Provinsi Group/Provinsi Group Search OB/Page_Bhakti Web/7 ST Keterangan'), 
    'Provinsi Prioritas 3')

WebUI.delay(2)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('KeteranganSearch.PNG')

WebUI.setText(findTestObject('2.Master/Master Target Peserta/Provinsi Group/Provinsi Group Search OB/Page_Bhakti Web/7 ST Keterangan'), 
    ' ')

WebUI.delay(2)

