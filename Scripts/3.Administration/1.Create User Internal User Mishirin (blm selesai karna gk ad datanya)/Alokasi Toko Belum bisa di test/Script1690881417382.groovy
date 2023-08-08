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

WebUI.click(findTestObject('3.Administration/1.Create User Internal User Mishirin/Alokasi Toko/Page_Bhakti Web/1Clicka_Administration'))

WebUI.click(findTestObject('3.Administration/1.Create User Internal User Mishirin/Alokasi Toko/Page_Bhakti Web/2Clicka_Create User Internal'))

WebUI.click(findTestObject('3.Administration/1.Create User Internal User Mishirin/Alokasi Toko/Page_Bhakti Web/3Clicka_User Mishirin'))

WebUI.click(findTestObject('3.Administration/1.Create User Internal User Mishirin/Alokasi Toko/Page_Bhakti Web/4Clickbutton_Pilih Target'))

WebUI.click(findTestObject('3.Administration/1.Create User Internal User Mishirin/Alokasi Toko/Page_Bhakti Web/5Clicknb-option_SPG'))

'belum bisa lanjut test karna datanya tidak ada\r\n'
WebUI.delay(0)

