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

WebUI.delay(4)

WebUI.click(findTestObject('1.Action/Redeem/Peringkat OB-Search-Verifikasi/Page_Bhakti Web/1Click a_Action'))

WebUI.click(findTestObject('1.Action/Redeem/Peringkat OB-Search-Verifikasi/Page_Bhakti Web/2Click a_Redeem'))

WebUI.delay(2)

WebUI.click(findTestObject('1.Action/Redeem/Peringkat OB-Search-Verifikasi/Page_Bhakti Web/3Click button_Peringkat'))

WebUI.delay(1)

WebUI.click(findTestObject('1.Action/Redeem/Peringkat OB-Search-Verifikasi/Page_Bhakti Web/4Click button_Pilih Campaign'))

WebUI.delay(1)

WebUI.focus(findTestObject('1.Action/Redeem/Peringkat OB-Search-Verifikasi/Page_Bhakti Web/5 Click nb-option_Test Sonny QR'))

WebUI.click(findTestObject('1.Action/Redeem/Peringkat OB-Search-Verifikasi/Page_Bhakti Web/5 Click nb-option_Test Sonny QR'))

WebUI.delay(1)

WebUI.click(findTestObject('1.Action/Redeem/Peringkat OB-Search-Verifikasi/Page_Bhakti Web/6 Click button_Pilih Zona'))

WebUI.delay(1)

WebUI.click(findTestObject('1.Action/Redeem/Peringkat OB-Search-Verifikasi/Page_Bhakti Web/7Click nb-option_KALIMANTAN'))

WebUI.delay(1)

'A-Z'
WebUI.click(findTestObject('1.Action/Redeem/Peringkat OB-Search-Verifikasi/Page_Bhakti Web/8OB Nama'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('NamaA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('1.Action/Redeem/Peringkat OB-Search-Verifikasi/Page_Bhakti Web/8OB Nama'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('NamaZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('1.Action/Redeem/Peringkat OB-Search-Verifikasi/Page_Bhakti Web/9OB Email'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('EmailA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('1.Action/Redeem/Peringkat OB-Search-Verifikasi/Page_Bhakti Web/9OB Email'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('EmailZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('1.Action/Redeem/Peringkat OB-Search-Verifikasi/Page_Bhakti Web/10OB Kabupaten'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('KabupatenA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('1.Action/Redeem/Peringkat OB-Search-Verifikasi/Page_Bhakti Web/10OB Kabupaten'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('KabupatenZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('1.Action/Redeem/Peringkat OB-Search-Verifikasi/Page_Bhakti Web/11OB Peringkat'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('PeringkatA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('1.Action/Redeem/Peringkat OB-Search-Verifikasi/Page_Bhakti Web/11OB Peringkat'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('PeringkatZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('1.Action/Redeem/Peringkat OB-Search-Verifikasi/Page_Bhakti Web/12OB Reward'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('RewardA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('1.Action/Redeem/Peringkat OB-Search-Verifikasi/Page_Bhakti Web/12OB Reward'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('RewardZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

WebUI.click(findTestObject('1.Action/Redeem/Peringkat OB-Search-Verifikasi/Page_Bhakti Web/13 Click Checkbox Rank 1'))

'Delay\r\n'
WebUI.delay(1)

WebUI.click(findTestObject('1.Action/Redeem/Peringkat OB-Search-Verifikasi/Page_Bhakti Web/14 Click Checkbox Rank 2'))

'Delay\r\n'
WebUI.delay(1)

WebUI.click(findTestObject('1.Action/Redeem/Peringkat OB-Search-Verifikasi/Page_Bhakti Web/15 Click Checkbox Select All'))

'Delay\r\n'
WebUI.delay(1)

WebUI.setText(findTestObject('1.Action/Redeem/Peringkat OB-Search-Verifikasi/Page_Bhakti Web/16ST Search Nama'), 'Toko Bagusss')

'Delay\r\n'
WebUI.delay(1)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('SearchNama.PNG')

WebUI.setText(findTestObject('1.Action/Redeem/Peringkat OB-Search-Verifikasi/Page_Bhakti Web/16ST Search Nama'), ' ')

'Delay\r\n'
WebUI.delay(1)

WebUI.setText(findTestObject('1.Action/Redeem/Peringkat OB-Search-Verifikasi/Page_Bhakti Web/17ST Search Email'), 'sudimin@bhakti.co.id')

'Delay\r\n'
WebUI.delay(1)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('SearchNama.PNG')

WebUI.setText(findTestObject('1.Action/Redeem/Peringkat OB-Search-Verifikasi/Page_Bhakti Web/17ST Search Email'), ' ')

'Delay\r\n'
WebUI.delay(1)

WebUI.click(findTestObject('1.Action/Redeem/Peringkat OB-Search-Verifikasi/Page_Bhakti Web/18Click button_Verifikasi'))

'Delay\r\n'
WebUI.delay(1)

WebUI.click(findTestObject('1.Action/Redeem/Peringkat OB-Search-Verifikasi/Page_Bhakti Web/15 Click Checkbox Select All'))

WebUI.delay(5555)

WebUI.click(findTestObject('1.Action/Redeem/Peringkat OB-Search-Verifikasi/Page_Bhakti Web/19Click button_Iya'))

