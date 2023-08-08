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

WebUI.delay(3)

WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/OrderBy/Page_Bhakti Web/1a_Reporting'))

WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/OrderBy/Page_Bhakti Web/2a_MD Survey  Attendance'))

'A-Z'
WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/OrderBy/Page_Bhakti Web/3OB_Judul Form'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('JudulFormA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/OrderBy/Page_Bhakti Web/3OB_Judul Form'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('JudulFormZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/OrderBy/Page_Bhakti Web/4OB_Tags'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('TagA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/OrderBy/Page_Bhakti Web/4OB_Tags'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('TagZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/OrderBy/Page_Bhakti Web/5OB_Start Date'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('Start1-100.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/OrderBy/Page_Bhakti Web/5OB_Start Date'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('Start100-1.PNG')

'Delay\r\n'
WebUI.delay(2)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('TagZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/OrderBy/Page_Bhakti Web/6OB_Due Date'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('Start1-100.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/OrderBy/Page_Bhakti Web/6OB_Due Date'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('Start100-1.PNG')

'Delay\r\n'
WebUI.delay(2)

WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/Search-ExportExcel/Page_Bhakti Web/1button_JAKARTA'))

WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/Search-ExportExcel/Page_Bhakti Web/2nb-option_MEDAN'))

WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/Search-ExportExcel/Page_Bhakti Web/3button_Nama Survey'))

WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/Search-ExportExcel/Page_Bhakti Web/4nb-option_Nama Survey'))

WebUI.setText(findTestObject('5.Reporting/1.MD Survey Dan Attendance/Search-ExportExcel/Page_Bhakti Web/5Search'), 'pajak')

WebUI.setText(findTestObject('5.Reporting/1.MD Survey Dan Attendance/Search-ExportExcel/Page_Bhakti Web/6DateStart'), '01/01/2022')

WebUI.delay(2)

WebUI.setText(findTestObject('5.Reporting/1.MD Survey Dan Attendance/Search-ExportExcel/Page_Bhakti Web/7DateEnd'), '12/12/2023')

WebUI.delay(2)

WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/Search-ExportExcel/Page_Bhakti Web/8button_Export To Excel'))

'Excel belum bisa kebuka, untuk screenshot excel musti manual kyknya\r\n'
WebUI.delay(0)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('SurveyHistory')

WebUI.refresh()

WebUI.delay(2)

'setting sesuai posisi button response-nya dengan judul form Survey Toko'
WebUI.focus(findTestObject('5.Reporting/1.MD Survey Dan Attendance/Response/Page_Bhakti Web/Click button_RESPONSES Tambel'))

'setting sesuai posisi button response-nya dengan judul form Survey Toko'
WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/Response/Page_Bhakti Web/Click button_RESPONSES Tambel'))

'Delay\r\n'
WebUI.delay(3)

WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/Response/Page_Bhakti Web/2button_Nama Sales'))

'A-Z'
WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/Response/Page_Bhakti Web/3th_SALES'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('ResponseSalesOBA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/Response/Page_Bhakti Web/3th_SALES'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('ResponseSalesOBZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/Response/Page_Bhakti Web/4th_STORE NAME'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('ResponseStoreNameA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/Response/Page_Bhakti Web/4th_STORE NAME'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('ResponseStoreNameZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/Response/Page_Bhakti Web/5th_CREATED DATE'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('ResponseCreateDateA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/Response/Page_Bhakti Web/5th_CREATED DATE'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('ResponseCreateDateZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/Response/Page_Bhakti Web/6button_Store Name'))

WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/Response/Page_Bhakti Web/nb-option_Nama Toko'))

WebUI.setText(findTestObject('5.Reporting/1.MD Survey Dan Attendance/Response/Page_Bhakti Web/7SearchResponse'), 'ridwan')

WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/Response/Page_Bhakti Web/8button_Export To Excel'))

WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/Response/Page_Bhakti Web/9button_VIEW'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('ResponseView.PNG')

