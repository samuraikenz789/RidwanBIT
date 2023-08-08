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

WebUI.setText(findTestObject('Object Repository/2.Master/Master Wallet/Approved OB Lock-Unlock Wallet/Page_Bhakti Web/input_Email address_email'), 
    'amink@jasakom.com')

WebUI.setEncryptedText(findTestObject('Object Repository/2.Master/Master Wallet/Approved OB Lock-Unlock Wallet/Page_Bhakti Web/input_Password_password'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.sendKeys(findTestObject('Object Repository/2.Master/Master Wallet/Approved OB Lock-Unlock Wallet/Page_Bhakti Web/input_Password_password'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/2.Master/Master Wallet/Approved OB Lock-Unlock Wallet/Page_Bhakti Web/a_Master'))

WebUI.click(findTestObject('Object Repository/2.Master/Master Wallet/Approved OB Lock-Unlock Wallet/Page_Bhakti Web/a_Master Wallet'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/2.Master/Master Wallet/Approved OB Lock-Unlock Wallet/Page_Bhakti Web/a_Approved'))

WebUI.click(findTestObject('Object Repository/2.Master/Master Wallet/Approved OB Lock-Unlock Wallet/Page_Bhakti Web/img'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('HeaderWalletBeforeLock.PNG')

WebUI.click(findTestObject('Object Repository/2.Master/Master Wallet/Approved OB Lock-Unlock Wallet/Page_Bhakti Web/span_Review  Approval'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('Review&ApprovalBeforeLock.PNG')

WebUI.click(findTestObject('Object Repository/2.Master/Master Wallet/Approved OB Lock-Unlock Wallet/Page_Bhakti Web/button_Lock Wallet'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/2.Master/Master Wallet/Approved OB Lock-Unlock Wallet/Page_Bhakti Web/input_Confirmation_mt-2 remarks-input ng-un_e9ea76'), 
    'testing')

WebUI.click(findTestObject('Object Repository/2.Master/Master Wallet/Approved OB Lock-Unlock Wallet/Page_Bhakti Web/button_Iya'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/2.Master/Master Wallet/Approved OB Lock-Unlock Wallet/Page_Bhakti Web/a_Approved_1'))

WebUI.click(findTestObject('Object Repository/2.Master/Master Wallet/Approved OB Lock-Unlock Wallet/Page_Bhakti Web/img'))

WebUI.delay(1)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('HeaderWalletAfterLock.PNG')

WebUI.click(findTestObject('Object Repository/2.Master/Master Wallet/Approved OB Lock-Unlock Wallet/Page_Bhakti Web/a_Review  Approval'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('Review&ApprovalBeforeLock.PNG')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/2.Master/Master Wallet/Approved OB Lock-Unlock Wallet/Page_Bhakti Web/button_Unlock Wallet'))

WebUI.setText(findTestObject('Object Repository/2.Master/Master Wallet/Approved OB Lock-Unlock Wallet/Page_Bhakti Web/input_Confirmation_mt-2 remarks-input ng-un_e9ea76'), 
    'unlock')

WebUI.click(findTestObject('Object Repository/2.Master/Master Wallet/Approved OB Lock-Unlock Wallet/Page_Bhakti Web/button_Iya'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/2.Master/Master Wallet/Approved OB Lock-Unlock Wallet/Page_Bhakti Web/a_Approved_1_2'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('BerhasilUnlockWallet.PNG')

