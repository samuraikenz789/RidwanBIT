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

WebUI.setText(findTestObject('Object Repository/2.Master/Master Barang/Master Barang View Edit Delete/Page_Bhakti Web/input_Email address_email'), 
    'amink@jasakom.com')

WebUI.setEncryptedText(findTestObject('Object Repository/2.Master/Master Barang/Master Barang View Edit Delete/Page_Bhakti Web/input_Password_password'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.sendKeys(findTestObject('Object Repository/2.Master/Master Barang/Master Barang View Edit Delete/Page_Bhakti Web/input_Password_password'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/2.Master/Master Barang/Master Barang View Edit Delete/Page_Bhakti Web/a_Master'))

WebUI.click(findTestObject('Object Repository/2.Master/Master Barang/Master Barang View Edit Delete/Page_Bhakti Web/a_Master Barang'))

WebUI.delay(2)

WebUI.click(findTestObject('2.Master/Master Barang/TambelanView/Page_Bhakti Web/test view 1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('ViewPre-Edit.PNG')

WebUI.click(findTestObject('Object Repository/2.Master/Master Barang/Master Barang View Edit Delete/Page_Bhakti Web/button_IAK'))

WebUI.click(findTestObject('Object Repository/2.Master/Master Barang/Master Barang View Edit Delete/Page_Bhakti Web/nb-option_BKT'))

WebUI.click(findTestObject('Object Repository/2.Master/Master Barang/Master Barang View Edit Delete/Page_Bhakti Web/button_Pilih Kategori'))

WebUI.click(findTestObject('Object Repository/2.Master/Master Barang/Master Barang View Edit Delete/Page_Bhakti Web/nb-option_Produk'))

WebUI.setText(findTestObject('Object Repository/2.Master/Master Barang/Master Barang View Edit Delete/Page_Bhakti Web/input_Product ID_ng-untouched ng-pristine n_5b0adb'), 
    '411')

WebUI.click(findTestObject('Object Repository/2.Master/Master Barang/Master Barang View Edit Delete/Page_Bhakti Web/button_Edit'))

WebUI.click(findTestObject('2.Master/Master Barang/TambelanView/Page_Bhakti Web/test view 1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/2.Master/Master Barang/Master Barang View Edit Delete/Page_Bhakti Web/div_Edit_delete-product-icon ng-star-inserted'))

WebUI.click(findTestObject('Object Repository/2.Master/Master Barang/Master Barang View Edit Delete/Page_Bhakti Web/button_Delete'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('ViewPre-Edit.PNG')

