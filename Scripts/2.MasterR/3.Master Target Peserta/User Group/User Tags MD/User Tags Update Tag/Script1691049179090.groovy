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

WebUI.navigateToUrl('https://mishirin-726d8.web.app/#/auth/login')

WebUI.setText(findTestObject('Object Repository/2.Master/Master Target Peserta/User Group/User Tags MD/Update Tags MD/Page_Bhakti Web/input_Email address_email'), 
    'amink@jasakom.com')

WebUI.setEncryptedText(findTestObject('Object Repository/2.Master/Master Target Peserta/User Group/User Tags MD/Update Tags MD/Page_Bhakti Web/input_Password_password'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/2.Master/Master Target Peserta/User Group/User Tags MD/Update Tags MD/Page_Bhakti Web/button_Sign In'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/2.Master/Master Target Peserta/User Group/User Tags MD/Update Tags MD/Page_Bhakti Web/a_Master'))

WebUI.click(findTestObject('Object Repository/2.Master/Master Target Peserta/User Group/User Tags MD/Update Tags MD/Page_Bhakti Web/a_Master Target Peserta'))

WebUI.click(findTestObject('Object Repository/2.Master/Master Target Peserta/User Group/User Tags MD/Update Tags MD/Page_Bhakti Web/span_User Tags MD'))

WebUI.click(findTestObject('Object Repository/2.Master/Master Target Peserta/User Group/User Tags MD/Update Tags MD/Page_Bhakti Web/span_Pilih Cabang'))

WebUI.click(findTestObject('Object Repository/2.Master/Master Target Peserta/User Group/User Tags MD/Update Tags MD/Page_Bhakti Web/nb-option_JAKARTA_1_2'))

WebUI.click(findTestObject('Object Repository/2.Master/Master Target Peserta/User Group/User Tags MD/Update Tags MD/Page_Bhakti Web/span_Pilih Wilayah'))

WebUI.click(findTestObject('Object Repository/2.Master/Master Target Peserta/User Group/User Tags MD/Update Tags MD/Page_Bhakti Web/nb-option_JAKARTA_1_2_3'))

WebUI.click(findTestObject('2.Master/Master Target Peserta/User Group/User Tags MD/Page_Bhakti Web/8Click button_Browse User'))

WebUI.delay(1)

WebUI.click(findTestObject('2.Master/Master Target Peserta/User Group/User Tags MD/Page_Bhakti Web/9Click button_Search with'))

WebUI.click(findTestObject('2.Master/Master Target Peserta/User Group/User Tags MD/Page_Bhakti Web/10Click nb-option_Nama Pemilik'))

WebUI.click(findTestObject('2.Master/Master Target Peserta/User Group/User Tags MD/Page_Bhakti Web/11Click h5_Browse Data User'))

WebUI.setText(findTestObject('2.Master/Master Target Peserta/User Group/User Tags MD/Page_Bhakti Web/12ST input_Nama Pemilik_filter-nama_pemilik'), 
    'a')

WebUI.click(findTestObject('2.Master/Master Target Peserta/User Group/User Tags MD/Page_Bhakti Web/13Click button_Go'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/2.Master/Master Target Peserta/User Group/User Tags MD/Update Tags MD/Page_Bhakti Web/input_Email_p-inputtext p-component p-eleme_e254bd'), 
    'rino')

WebUI.click(findTestObject('Object Repository/2.Master/Master Target Peserta/User Group/User Tags MD/Update Tags MD/Page_Bhakti Web/button_Select User Group From Recent Group ID'))

WebUI.click(findTestObject('Object Repository/2.Master/Master Target Peserta/User Group/User Tags MD/Update Tags MD/Page_Bhakti Web/nb-option_JAKARTATEST2'))

WebUI.click(findTestObject('Object Repository/2.Master/Master Target Peserta/User Group/User Tags MD/Update Tags MD/Page_Bhakti Web/div_Email_p-checkbox-box'))

WebUI.delay(2)

WebUI.click(findTestObject('2.Master/Master Target Peserta/User Group/User Tags MD/TambelanSearch/Page_Bhakti Web/1Click button_Update JAKARTATEST2'))

WebUI.delay(1)

WebUI.delay(511)

WebUI.click(findTestObject('2.Master/Master Target Peserta/User Group/User Tags MD/TambelanSearch/Page_Bhakti Web/2Click button_Yes'))

WebUI.delay(1)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('UserTagMDUpdateTag.PNG')

