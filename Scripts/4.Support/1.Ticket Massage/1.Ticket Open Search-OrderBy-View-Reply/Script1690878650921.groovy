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

WebUI.click(findTestObject('4.Support/Ticket Massages/Ticket Open/Page_Bhakti Web/1a_Support'))

WebUI.click(findTestObject('4.Support/Ticket Massages/Ticket Open/Page_Bhakti Web/2a_Ticket Messages'))

'A-Z'
WebUI.click(findTestObject('4.Support/Ticket Massages/Ticket Open/Page_Bhakti Web/3OBth_Nama Toko'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('NamaTokoOBA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('4.Support/Ticket Massages/Ticket Open/Page_Bhakti Web/3OBth_Nama Toko'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('NamaTokoOBZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('4.Support/Ticket Massages/Ticket Open/Page_Bhakti Web/4OBth_Whastapp'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('NamaTokoOBA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('4.Support/Ticket Massages/Ticket Open/Page_Bhakti Web/4OBth_Whastapp'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('WhatsappOBZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('4.Support/Ticket Massages/Ticket Open/Page_Bhakti Web/5OBth_Kabupaten'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('KabupatenOBA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('4.Support/Ticket Massages/Ticket Open/Page_Bhakti Web/5OBth_Kabupaten'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('KabupatenOBZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('4.Support/Ticket Massages/Ticket Open/Page_Bhakti Web/6OBth_Kategori'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('KabupatenOBA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('4.Support/Ticket Massages/Ticket Open/Page_Bhakti Web/6OBth_Kategori'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('KategoriZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('4.Support/Ticket Massages/Ticket Open/Page_Bhakti Web/7OBth_Title'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('TitleA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('4.Support/Ticket Massages/Ticket Open/Page_Bhakti Web/7OBth_Title'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('TitleZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('4.Support/Ticket Massages/Ticket Open/Page_Bhakti Web/8OBth_JamWaktu'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('JamWaktu1-100.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('4.Support/Ticket Massages/Ticket Open/Page_Bhakti Web/8OBth_JamWaktu'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('JamWaktu100-1.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('4.Support/Ticket Massages/Ticket Open/Page_Bhakti Web/9OBth_Sudah Balas'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('SudahBalasOBA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('4.Support/Ticket Massages/Ticket Open/Page_Bhakti Web/9OBth_Sudah Balas'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('SudahBalasOBZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

WebUI.setText(findTestObject('4.Support/Ticket Massages/Ticket Open/Page_Bhakti Web/10NamaToko'), 'toko bagus dotcom')

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('HasilSearchNamaToko.PNG')

WebUI.setText(findTestObject('4.Support/Ticket Massages/Ticket Open/Page_Bhakti Web/10NamaToko'), ' ')

'Delay\r\n'
WebUI.delay(2)

WebUI.setText(findTestObject('4.Support/Ticket Massages/Ticket Open/Page_Bhakti Web/11Whatsapp'), '081291102323')

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('HasilSearchWhatsApp.PNG')

WebUI.setText(findTestObject('4.Support/Ticket Massages/Ticket Open/Page_Bhakti Web/11Whatsapp'), ' ')

'Delay\r\n'
WebUI.delay(2)

WebUI.setText(findTestObject('4.Support/Ticket Massages/Ticket Open/Page_Bhakti Web/12Kabupaten'), 'kota jakarta barat')

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('HasilSearchKabupaten.PNG')

WebUI.setText(findTestObject('4.Support/Ticket Massages/Ticket Open/Page_Bhakti Web/12Kabupaten'), ' ')

'Delay\r\n'
WebUI.delay(2)

WebUI.setText(findTestObject('4.Support/Ticket Massages/Ticket Open/Page_Bhakti Web/13Kategori'), 'other')

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('HasilSearchKategori.PNG')

WebUI.setText(findTestObject('4.Support/Ticket Massages/Ticket Open/Page_Bhakti Web/13Kategori'), ' ')

'Delay\r\n'
WebUI.delay(2)

WebUI.setText(findTestObject('4.Support/Ticket Massages/Ticket Open/Page_Bhakti Web/14Title'), 'tidak bisa join')

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('HasilSearchTitle.PNG')

WebUI.setText(findTestObject('4.Support/Ticket Massages/Ticket Open/Page_Bhakti Web/14Title'), ' ')

'Delay\r\n'
WebUI.delay(4)

WebUI.focus(findTestObject('4.Support/Ticket Massages/Ticket Open/Page_Bhakti Web/22ClickIconSearchh'))

WebUI.click(findTestObject('4.Support/Ticket Massages/Ticket Open/Page_Bhakti Web/22ClickIconSearchh'))

WebUI.setText(findTestObject('4.Support/Ticket Massages/Ticket Open/Page_Bhakti Web/16SetText BalasPesan'), 'Test Balas Pesan')

WebUI.delay(2)

WebUI.click(findTestObject('4.Support/Ticket Massages/Ticket Open/Page_Bhakti Web/17Clickbutton_Balas Pesan'))

WebUI.click(findTestObject('4.Support/Ticket Massages/Ticket Open/Page_Bhakti Web/23ClickBalasPesanYes'))

WebUI.focus(findTestObject('4.Support/Ticket Massages/Ticket Open/Page_Bhakti Web/path'))

WebUI.click(findTestObject('4.Support/Ticket Massages/Ticket Open/Page_Bhakti Web/path'))

WebUI.click(findTestObject('4.Support/Ticket Massages/Ticket Open/Page_Bhakti Web/22ClickIconSearchh'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('HasilSetelahDiBalasPesan.PNG')

