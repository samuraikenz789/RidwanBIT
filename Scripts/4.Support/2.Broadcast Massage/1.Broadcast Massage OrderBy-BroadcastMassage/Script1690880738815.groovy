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

WebUI.click(findTestObject('4.Support/Broadcast Massage/1.Broadcast Massage/Page_Bhakti Web/1Clicka_Support'))

WebUI.click(findTestObject('4.Support/Broadcast Massage/1.Broadcast Massage/Page_Bhakti Web/2Clicka_Broadcast Message'))

WebUI.click(findTestObject('4.Support/Broadcast Massage/1.Broadcast Massage/Page_Bhakti Web/3Clickbutton_Pilih Group'))

WebUI.delay(1)

WebUI.click(findTestObject('4.Support/Broadcast Massage/1.Broadcast Massage/Page_Bhakti Web/4ScrolltoClickOption User-MSR-1'))

WebUI.click(findTestObject('4.Support/Broadcast Massage/1.Broadcast Massage/Page_Bhakti Web/11Click th_Nama Toko'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('OrderByNamaTokoA-Z.PNG')

WebUI.click(findTestObject('4.Support/Broadcast Massage/1.Broadcast Massage/Page_Bhakti Web/11Click th_Nama Toko'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('OrderByNamaTokoZ-A.PNG')

WebUI.delay(1)

WebUI.click(findTestObject('4.Support/Broadcast Massage/1.Broadcast Massage/Page_Bhakti Web/12Click th_Nama Pemilik'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('OrderByNamaPemilikA-Z.PNG')

WebUI.click(findTestObject('4.Support/Broadcast Massage/1.Broadcast Massage/Page_Bhakti Web/12Click th_Nama Pemilik'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('OrderByNamaPemilikZ-A.PNG')

WebUI.delay(1)

WebUI.click(findTestObject('4.Support/Broadcast Massage/1.Broadcast Massage/Page_Bhakti Web/13Click th_Email'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('OrderByEmailA-Z.PNG')

WebUI.click(findTestObject('4.Support/Broadcast Massage/1.Broadcast Massage/Page_Bhakti Web/13Click th_Email'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('OrderByEmailZ-A.PNG')

WebUI.delay(1)

WebUI.click(findTestObject('4.Support/Broadcast Massage/1.Broadcast Massage/Page_Bhakti Web/14Click th_No Hp'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('OrderByNoHPA-Z.PNG')

WebUI.click(findTestObject('4.Support/Broadcast Massage/1.Broadcast Massage/Page_Bhakti Web/14Click th_No Hp'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('OrderByNoHPZ-A.PNG')

WebUI.delay(1)

WebUI.click(findTestObject('4.Support/Broadcast Massage/1.Broadcast Massage/Page_Bhakti Web/15Click th_KabupatenKota'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('OrderByKabupatenKotaA-Z.PNG')

WebUI.click(findTestObject('4.Support/Broadcast Massage/1.Broadcast Massage/Page_Bhakti Web/15Click th_KabupatenKota'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('OrderByKabupatenKotaZ-A.PNG')

WebUI.delay(1)

WebUI.click(findTestObject('4.Support/Broadcast Massage/1.Broadcast Massage/Page_Bhakti Web/5Clickbutton_Selanjutnya'))

WebUI.delay(1)

WebUI.click(findTestObject('4.Support/Broadcast Massage/1.Broadcast Massage/Page_Bhakti Web/6ClickPilih Tamplate'))

WebUI.delay(1)

WebUI.click(findTestObject('4.Support/Broadcast Massage/1.Broadcast Massage/Page_Bhakti Web/Click Opsi Test Broadcast Mishirin'))

WebUI.click(findTestObject('4.Support/Broadcast Massage/1.Broadcast Massage/Page_Bhakti Web/8Click button_Broadcast'))

WebUI.click(findTestObject('4.Support/Broadcast Massage/1.Broadcast Massage/Page_Bhakti Web/9Click button_Yes'))

WebUI.delay(5)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('BroadcastMassageSend.PNG')

