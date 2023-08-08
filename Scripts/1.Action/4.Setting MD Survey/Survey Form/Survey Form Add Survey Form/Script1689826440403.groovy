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

WebUI.click(findTestObject('1.Action/User MD Survey/User MD Survey Search/Page_Bhakti Web/1Click a_Action'))

WebUI.click(findTestObject('1.Action/User MD Survey/User MD Survey Search/Page_Bhakti Web/2Click a_Setting MD Survey'))

WebUI.delay(1)

WebUI.click(findTestObject('1.Action/User MD Survey/Survey Form Create Survey Form/Page_Bhakti Web/Click a_Survey Form'))

WebUI.delay(1)

WebUI.click(findTestObject('1.Action/User MD Survey/Survey Form Create Survey Form/Page_Bhakti Web/2Click button_Add Survey Form'))

WebUI.delay(2)

WebUI.setText(findTestObject('1.Action/User MD Survey/Survey Form Create Survey Form/Page_Bhakti Web/3ST Title of Survey'), 
    'AutoSurveyTitle01')

WebUI.setText(findTestObject('1.Action/User MD Survey/Survey Form Create Survey Form/Page_Bhakti Web/4ST Description'), 'AutoDescription01')

WebUI.setText(findTestObject('1.Action/User MD Survey/Survey Form Create Survey Form/Page_Bhakti Web/5ST Tag'), 'AutoTag01')

WebUI.click(findTestObject('1.Action/User MD Survey/Survey Form Create Survey Form/Page_Bhakti Web/6Click Combobox Pilih Divisi'))

WebUI.click(findTestObject('1.Action/User MD Survey/Survey Form Create Survey Form/Page_Bhakti Web/7.1 Click Opsi Rinnai'))

WebUI.click(findTestObject('1.Action/User MD Survey/Survey Form Create Survey Form/Page_Bhakti Web/7.2 Click Opsi Shimizu'))

WebUI.click(findTestObject('1.Action/User MD Survey/Survey Form Create Survey Form/Page_Bhakti Web/7.3 Click Opsi Miyako'))

WebUI.setText(findTestObject('1.Action/User MD Survey/Survey Form Create Survey Form/Page_Bhakti Web/8 ST Question'), 'AutoQuestion01')

WebUI.click(findTestObject('1.Action/User MD Survey/Survey Form Create Survey Form/Page_Bhakti Web/9 Click Add Another Options 1'))

WebUI.setText(findTestObject('1.Action/User MD Survey/Survey Form Create Survey Form/Page_Bhakti Web/10 ST Option 1'), 'AutoOption01')

WebUI.click(findTestObject('1.Action/User MD Survey/Survey Form Create Survey Form/Page_Bhakti Web/11 Click Add Another Option 2'))

WebUI.setText(findTestObject('1.Action/User MD Survey/Survey Form Create Survey Form/Page_Bhakti Web/12 ST Option 2'), 'AutoOption02')

WebUI.click(findTestObject('1.Action/User MD Survey/Survey Form Create Survey Form/Page_Bhakti Web/13 Click Add Another Option 3'))

WebUI.setText(findTestObject('1.Action/User MD Survey/Survey Form Create Survey Form/Page_Bhakti Web/14 ST Option 3'), 'AutoOption03')

WebUI.click(findTestObject('1.Action/User MD Survey/Survey Form Create Survey Form/Page_Bhakti Web/15 Click Add Another Option 4'))

WebUI.setText(findTestObject('1.Action/User MD Survey/Survey Form Create Survey Form/Page_Bhakti Web/16 ST Option 4'), 'AutoOption04')

WebUI.delay(2)

WebUI.click(findTestObject('1.Action/User MD Survey/Survey Form Create Survey Form/Page_Bhakti Web/17 click Add Tambah Pertanyaan'))

WebUI.delay(1)

WebUI.setText(findTestObject('1.Action/User MD Survey/Survey Form Create Survey Form/Page_Bhakti Web/18 ST Question 2'), 'AutoQuestion02')

WebUI.click(findTestObject('1.Action/User MD Survey/Survey Form Create Survey Form/Page_Bhakti Web/19 Click Add Another Option 2'))

WebUI.setText(findTestObject('1.Action/User MD Survey/Survey Form Create Survey Form/Page_Bhakti Web/20 ST Option 1'), 'AutoOption01')

WebUI.click(findTestObject('1.Action/User MD Survey/Survey Form Create Survey Form/Page_Bhakti Web/21 Click Add Another Option 2'))

WebUI.setText(findTestObject('1.Action/User MD Survey/Survey Form Create Survey Form/Page_Bhakti Web/22 ST Option 2'), 'AutoOption02')

WebUI.click(findTestObject('1.Action/User MD Survey/Survey Form Create Survey Form/Page_Bhakti Web/23 Click Add Another Option 2'))

WebUI.setText(findTestObject('1.Action/User MD Survey/Survey Form Create Survey Form/Page_Bhakti Web/24 ST Option 3'), 'AutoOption03')

WebUI.delay(1)

WebUI.click(findTestObject('1.Action/User MD Survey/Survey Form Create Survey Form/Page_Bhakti Web/Click button_SAVE'))

WebUI.delay(2)

WebUI.setText(findTestObject('1.Action/User MD Survey/Survey Form Create Survey Form/Page_Bhakti Web/27 ST From Date'), '01/01/2023')

WebUI.setText(findTestObject('1.Action/User MD Survey/Survey Form Create Survey Form/Page_Bhakti Web/28 ST TO Date'), '12/12/2023')

WebUI.click(findTestObject('1.Action/User MD Survey/Survey Form Create Survey Form/Page_Bhakti Web/29 Click Target Survey'))

WebUI.click(findTestObject('1.Action/User MD Survey/Survey Form Create Survey Form/Page_Bhakti Web/30 Click Pilihan Nasional'))

WebUI.click(findTestObject('1.Action/User MD Survey/Survey Form Create Survey Form/Page_Bhakti Web/31 Click Button Assign'))

WebUI.click(findTestObject('1.Action/User MD Survey/Survey Form Create Survey Form/Page_Bhakti Web/32 Click Button Request Approval'))

WebUI.delay(555)

WebUI.click(findTestObject('1.Action/User MD Survey/Survey Form Create Survey Form/Page_Bhakti Web/33 Click Button Request Approval'))

