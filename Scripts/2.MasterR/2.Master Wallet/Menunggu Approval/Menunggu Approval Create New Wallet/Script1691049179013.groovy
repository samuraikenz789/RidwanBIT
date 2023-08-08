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

WebUI.click(findTestObject('2.Master/Master Wallet/Menunggu Approval OB Search/Page_Bhakti Web/1Click a_Master'))

WebUI.click(findTestObject('2.Master/Master Wallet/Menunggu Approval OB Search/Page_Bhakti Web/2Click a_Master Wallet'))

WebUI.delay(1)

WebUI.click(findTestObject('2.Master/Master Wallet/Menunggu Approval Create New Wallet/Page_Bhakti Web/1.Click button_Create New Wallet'))

WebUI.click(findTestObject('2.Master/Master Wallet/Menunggu Approval Create New Wallet/Page_Bhakti Web/2Click button_Pilih Tipe Wallet'))

WebUI.click(findTestObject('2.Master/Master Wallet/Menunggu Approval Create New Wallet/Page_Bhakti Web/3Click nb-option_POINT'))

WebUI.setText(findTestObject('2.Master/Master Wallet/Menunggu Approval Create New Wallet/Page_Bhakti Web/4 ST Input Nama WAllet'), 
    '')

'upload masih belum bisa\r\n'
WebUI.uploadFile(findTestObject('2.Master/Master Wallet/Menunggu Approval Create New Wallet/Page_Bhakti Web/5 Upload File button_Select File'), 
    'D:\\test.png')

WebUI.click(findTestObject('2.Master/Master Wallet/Menunggu Approval Create New Wallet/Page_Bhakti Web/6Click a_Review  Approval'))

WebUI.click(findTestObject('2.Master/Master Wallet/Menunggu Approval Create New Wallet/Page_Bhakti Web/7Click button_Kirim'))

WebUI.click(findTestObject('2.Master/Master Wallet/Menunggu Approval Create New Wallet/Page_Bhakti Web/8Click button_Submit'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('CreateNewWallet.PNG')

