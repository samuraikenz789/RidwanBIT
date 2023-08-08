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

WebUI.click(findTestObject('4.Support/Ticket Massages/Ticket Closed/Page_Bhakti Web/1a_Ticket Closed'))

'A-Z'
WebUI.click(findTestObject('4.Support/Ticket Massages/Ticket Closed/Page_Bhakti Web/2Clickth_Nama Toko'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('TCNamaTokoOBA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('4.Support/Ticket Massages/Ticket Closed/Page_Bhakti Web/2Clickth_Nama Toko'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('TCNamaTokoOBZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('4.Support/Ticket Massages/Ticket Closed/Page_Bhakti Web/3Clickth_Whastapp'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('TCWhatsAppOBA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('4.Support/Ticket Massages/Ticket Closed/Page_Bhakti Web/3Clickth_Whastapp'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('TCWhatsAppOBZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('4.Support/Ticket Massages/Ticket Closed/Page_Bhakti Web/4Clickth_Kabupaten'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('TCKabupatenOBA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('4.Support/Ticket Massages/Ticket Closed/Page_Bhakti Web/4Clickth_Kabupaten'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('TCKabupatenOBZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('4.Support/Ticket Massages/Ticket Closed/Page_Bhakti Web/5Clickth_Kategori'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('TcKategoriOBA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('4.Support/Ticket Massages/Ticket Closed/Page_Bhakti Web/5Clickth_Kategori'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('TcKategoriOBZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('4.Support/Ticket Massages/Ticket Closed/Page_Bhakti Web/6Clickth_Title'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('TCTitleOBA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('4.Support/Ticket Massages/Ticket Closed/Page_Bhakti Web/6Clickth_Title'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('TCTitleOBZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('4.Support/Ticket Massages/Ticket Closed/Page_Bhakti Web/7Clickth_ClockTime'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('TCClockTimeOBA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('4.Support/Ticket Massages/Ticket Closed/Page_Bhakti Web/7Clickth_ClockTime'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('TCClockTimeOBZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('4.Support/Ticket Massages/Ticket Closed/Page_Bhakti Web/8Clickth_Already Reply'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('TCalreadyReplyOBA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('4.Support/Ticket Massages/Ticket Closed/Page_Bhakti Web/8Clickth_Already Reply'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('TCalreadyReplyOBA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

WebUI.setText(findTestObject('4.Support/Ticket Massages/Ticket Closed/Page_Bhakti Web/9STStoreName'), 'ridwan')

'Delay\r\n'
WebUI.delay(3)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('TCStoreName.PNG')

WebUI.setText(findTestObject('4.Support/Ticket Massages/Ticket Closed/Page_Bhakti Web/9STStoreName'), ' ')

'Delay\r\n'
WebUI.delay(2)

WebUI.setText(findTestObject('4.Support/Ticket Massages/Ticket Closed/Page_Bhakti Web/10STWhatsApp'), '081802369768')

'Delay\r\n'
WebUI.delay(3)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('TCWhatsApp.PNG')

WebUI.setText(findTestObject('4.Support/Ticket Massages/Ticket Closed/Page_Bhakti Web/10STWhatsApp'), ' ')

'Delay\r\n'
WebUI.delay(2)

WebUI.setText(findTestObject('4.Support/Ticket Massages/Ticket Closed/Page_Bhakti Web/11STRegency'), 'kabupaten kubu raya')

'Delay\r\n'
WebUI.delay(3)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('TCKabupaten.PNG')

WebUI.setText(findTestObject('4.Support/Ticket Massages/Ticket Closed/Page_Bhakti Web/11STRegency'), ' ')

'Delay\r\n'
WebUI.delay(2)

WebUI.setText(findTestObject('4.Support/Ticket Massages/Ticket Closed/Page_Bhakti Web/12STCategory'), 'other')

'Delay\r\n'
WebUI.delay(3)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('TCKategori.PNG')

WebUI.setText(findTestObject('4.Support/Ticket Massages/Ticket Closed/Page_Bhakti Web/12STCategory'), ' ')

'Delay\r\n'
WebUI.delay(3)

WebUI.setText(findTestObject('4.Support/Ticket Massages/Ticket Closed/Page_Bhakti Web/13STTitle'), 'tidak bisa join')

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('TCTitle.PNG')

WebUI.setText(findTestObject('4.Support/Ticket Massages/Ticket Closed/Page_Bhakti Web/13STTitle'), ' ')

'Delay\r\n'
WebUI.delay(2)

WebUI.click(findTestObject('4.Support/Ticket Massages/Ticket Closed/Tambelan/Page_Bhakti Web/rect'))

'Delay\r\n'
WebUI.delay(2)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('TCView.PNG')

WebUI.delay(2)

WebUI.click(findTestObject('4.Support/Ticket Massages/Ticket Closed/Tambelan/Page_Bhakti Web/path'))

