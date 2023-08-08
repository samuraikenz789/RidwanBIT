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

WebUI.setText(findTestObject('Object Repository/HeaderCampaign/Page_Bhakti Web/input_Email address_email'), 'amink@jasakom.com')

WebUI.setEncryptedText(findTestObject('Object Repository/HeaderCampaign/Page_Bhakti Web/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/HeaderCampaign/Page_Bhakti Web/button_Sign In'))

WebUI.delay(3)

WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/Attendance/Page_Bhakti Web/1a_Reporting'))

WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/Attendance/Page_Bhakti Web/2a_MD Survey  Attendance'))

WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/Attendance/Page_Bhakti Web/3a_Absensi MD'))

WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/Attendance/Page_Bhakti Web/4button_JAKARTA'))

WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/Attendance/Page_Bhakti Web/5nb-option_JAKARTA'))

WebUI.setText(findTestObject('5.Reporting/1.MD Survey Dan Attendance/Attendance/Page_Bhakti Web/6StartDate'), '01/01/2021')

WebUI.delay(3)

'kalau masih nyangkut di tambahin milih 2x'
WebUI.setText(findTestObject('5.Reporting/1.MD Survey Dan Attendance/Attendance/Page_Bhakti Web/7EndDate'), '01/12/2023')

WebUI.delay(3)

WebUI.setText(findTestObject('5.Reporting/1.MD Survey Dan Attendance/Page_Bhakti Web/ST Nama Sales'), 'oscar')

WebUI.delay(1)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('SearchNamaSales.PNG')

WebUI.delay(1)

WebUI.setText(findTestObject('5.Reporting/1.MD Survey Dan Attendance/Page_Bhakti Web/ST Nama Sales'), ' ')

'A-Z'
WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/Attendance/Page_Bhakti Web/8OBSales'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('AbsenSalesOBA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/Attendance/Page_Bhakti Web/8OBSales'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('AbsenSalesOBZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/Attendance/Page_Bhakti Web/9OBJumlahToko'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('JumlahTokoOBA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/Attendance/Page_Bhakti Web/9OBJumlahToko'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('JumlahTokoOBZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/Attendance/Page_Bhakti Web/10OBTotalVisit'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('TotalVisitOBA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/Attendance/Page_Bhakti Web/10OBTotalVisit'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('TotalVisitOBZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/Attendance/Page_Bhakti Web/11OBTotalVisitGP'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('TotalVisitOBA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/Attendance/Page_Bhakti Web/11OBTotalVisitGP'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('TotalVisitOBZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/Attendance/Page_Bhakti Web/12button_Export To Excel'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('AbsenMDExcel.PNG')

'DARI SINI KEBAWAH ITU VIEW\r\n'
WebUI.delay(0)

WebUI.refresh()

WebUI.delay(2)

WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/Attendance/AttendanceView/Page_Bhakti Web/4button_VIEW'))

WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/Attendance/AttendanceView/Page_Bhakti Web/5OBNamaToko'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('ViewNamaTokoOBA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/Attendance/AttendanceView/Page_Bhakti Web/5OBNamaToko'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('ViewNamaTokoOBZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/Attendance/AttendanceView/Page_Bhakti Web/6OBAbsensiBarcode'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('AbsensiBarcodeA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/Attendance/AttendanceView/Page_Bhakti Web/6OBAbsensiBarcode'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('AbsensiBarcodeZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/Attendance/AttendanceView/Page_Bhakti Web/7OBAbsensiCode'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('AbsensiCodeA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/Attendance/AttendanceView/Page_Bhakti Web/7OBAbsensiCode'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('AbsensiCodeZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/Attendance/AttendanceView/Page_Bhakti Web/8OBAbsensiGPS'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('AbsensiGPSA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/Attendance/AttendanceView/Page_Bhakti Web/8OBAbsensiGPS'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('AbsensiGPSZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/Attendance/AttendanceView/Page_Bhakti Web/9OBTotalVisit'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('TotalVisitOBA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/Attendance/AttendanceView/Page_Bhakti Web/9OBTotalVisit'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('TotalVisitOBZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/Attendance/AttendanceView/Page_Bhakti Web/10OBTotalVisitGP'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('TotalVisitGPA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/Attendance/AttendanceView/Page_Bhakti Web/10OBTotalVisitGP'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('TotalVisitGPZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/Attendance/AttendanceView/Page_Bhakti Web/11TotalVisitPeriode'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('TotalVisitPeriodeA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/Attendance/AttendanceView/Page_Bhakti Web/11TotalVisitPeriode'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('TotalVisitPeriodeZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

WebUI.setText(findTestObject('5.Reporting/1.MD Survey Dan Attendance/Attendance/AttendanceView/Page_Bhakti Web/12SearchNamaToko'), 
    'ridwan')

WebUI.scrollToElement(findTestObject('5.Reporting/1.MD Survey Dan Attendance/Attendance/AttendanceView/Page_Bhakti Web/div_ACTION'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/Attendance/AttendanceView/Page_Bhakti Web/13button_VIEW'))

'A-Z'
WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/Attendance/AttendanceView/Page_Bhakti Web/14Check-inDateInsideView'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('ViewViewCheckInDate1-100.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/Attendance/AttendanceView/Page_Bhakti Web/14Check-inDateInsideView'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('ViewViewCheckInDate100-1.PNG')

'Delay\r\n'
WebUI.delay(2)

WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/Attendance/AttendanceView/Page_Bhakti Web/15BackViewView'))

WebUI.delay(1)

WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/Attendance/AttendanceView/Page_Bhakti Web/16BackView'))

