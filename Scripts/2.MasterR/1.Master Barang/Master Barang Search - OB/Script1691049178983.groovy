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

WebUI.delay(2)

WebUI.click(findTestObject('2.Master/Master Barang/Master Barang OB dan search/Page_Bhakti Web/1Click a_Master'))

WebUI.click(findTestObject('2.Master/Master Barang/Master Barang OB dan search/Page_Bhakti Web/2Click a_Master Barang'))

WebUI.delay(3)

'A-Z'
WebUI.click(findTestObject('2.Master/Master Barang/Master Barang OB dan search/Page_Bhakti Web/3 Click OB th_Product ID'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('ProductIDOBA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('2.Master/Master Barang/Master Barang OB dan search/Page_Bhakti Web/3 Click OB th_Product ID'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('ProductIDOBZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('2.Master/Master Barang/Master Barang OB dan search/Page_Bhakti Web/4Click OB  th_Nama Produk'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('NamaProdukA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('2.Master/Master Barang/Master Barang OB dan search/Page_Bhakti Web/4Click OB  th_Nama Produk'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('NamaProdukZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('2.Master/Master Barang/Master Barang OB dan search/Page_Bhakti Web/5Click OB th_Harga Beli Acuan'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('HargaAcuanA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('2.Master/Master Barang/Master Barang OB dan search/Page_Bhakti Web/5Click OB th_Harga Beli Acuan'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('HargaAcuanZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('2.Master/Master Barang/Master Barang OB dan search/Page_Bhakti Web/6Click OB th_Harga Beli Maksimum'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('HargaBeliMaksimumA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('2.Master/Master Barang/Master Barang OB dan search/Page_Bhakti Web/6Click OB th_Harga Beli Maksimum'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('HargaBeliMaksimumZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('2.Master/Master Barang/Master Barang OB dan search/Page_Bhakti Web/7Click OB th_Vendor'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('VendorA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('2.Master/Master Barang/Master Barang OB dan search/Page_Bhakti Web/7Click OB th_Vendor'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('VendorZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('2.Master/Master Barang/Master Barang OB dan search/Page_Bhakti Web/8Click OB th_Status'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('StatusOn.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('2.Master/Master Barang/Master Barang OB dan search/Page_Bhakti Web/8Click OB th_Status'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('StatusOFF.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('2.Master/Master Barang/Master Barang OB dan search/Page_Bhakti Web/9Click OB th_In Use'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('StatusInUse.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('2.Master/Master Barang/Master Barang OB dan search/Page_Bhakti Web/9Click OB th_In Use'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('StatusNotUsed.PNG')

'Delay\r\n'
WebUI.delay(2)

WebUI.setText(findTestObject('2.Master/Master Barang/Master Barang OB dan search/Page_Bhakti Web/10 ST Product ID'), 'htelkomsel10000')

WebUI.delay(2)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('ProductIDSearch.PNG')

WebUI.setText(findTestObject('2.Master/Master Barang/Master Barang OB dan search/Page_Bhakti Web/10 ST Product ID'), ' ')

WebUI.delay(1)

WebUI.setText(findTestObject('2.Master/Master Barang/Master Barang OB dan search/Page_Bhakti Web/11 ST Nama Produk'), 'Indosat Rp 200.000\t')

WebUI.delay(2)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('NamaProduct.PNG')

WebUI.setText(findTestObject('2.Master/Master Barang/Master Barang OB dan search/Page_Bhakti Web/11 ST Nama Produk'), ' ')

WebUI.delay(1)

WebUI.setText(findTestObject('2.Master/Master Barang/Master Barang OB dan search/Page_Bhakti Web/12 ST Vendor'), 'BKT')

WebUI.delay(2)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('VendorSearch.PNG')

WebUI.setText(findTestObject('2.Master/Master Barang/Master Barang OB dan search/Page_Bhakti Web/12 ST Vendor'), ' ')

WebUI.delay(1)

