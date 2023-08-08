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

WebUI.delay(5)

WebUI.click(findTestObject('1.Action/Setting Catalog Reward/Waiting Approval/Page_Bhakti Web/1Click a_Action'))

WebUI.click(findTestObject('1.Action/Setting Catalog Reward/Waiting Approval/Page_Bhakti Web/2Click a_Setting Catalog Reward'))

WebUI.click(findTestObject('1.Action/Setting Catalog Reward/Waiting Approval/Page_Bhakti Web/3Click _Waiting Approval'))

'A-Z'
WebUI.click(findTestObject('1.Action/Setting Catalog Reward/Waiting Approval/Page_Bhakti Web/4OB th_Nama Catalog'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('NamaCatalogA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('1.Action/Setting Catalog Reward/Waiting Approval/Page_Bhakti Web/4OB th_Nama Catalog'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('NamaCatalogZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('1.Action/Setting Catalog Reward/Waiting Approval/Page_Bhakti Web/5OB th_Jenis Catalog'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('JenisCatalogA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('1.Action/Setting Catalog Reward/Waiting Approval/Page_Bhakti Web/5OB th_Jenis Catalog'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('JenisCatalogZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('1.Action/Setting Catalog Reward/Waiting Approval/Page_Bhakti Web/6OB th_Jumlah Produk'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('JumlahProduk1-100.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('1.Action/Setting Catalog Reward/Waiting Approval/Page_Bhakti Web/6OB th_Jumlah Produk'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('JumlahProduk100-1.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('1.Action/Setting Catalog Reward/Waiting Approval/Page_Bhakti Web/7OB th_Target Group'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('TargetGroupA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('1.Action/Setting Catalog Reward/Waiting Approval/Page_Bhakti Web/7OB th_Target Group'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('TargetGroupZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('1.Action/Setting Catalog Reward/Waiting Approval/Page_Bhakti Web/8OB th_Periode Aktif Catalog'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('PeriodeAktif1-100.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('1.Action/Setting Catalog Reward/Waiting Approval/Page_Bhakti Web/8OB th_Periode Aktif Catalog'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('PeriodeAktif100-1.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('1.Action/Setting Catalog Reward/Waiting Approval/Page_Bhakti Web/9OB th_Status'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('StatusA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('1.Action/Setting Catalog Reward/Waiting Approval/Page_Bhakti Web/9OB th_Status'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('StatusZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

WebUI.setText(findTestObject('1.Action/Setting Catalog Reward/Waiting Approval/Page_Bhakti Web/10ST Nama Catalog'), 'RWFlashSaleCatalog1')

'Delay\r\n'
WebUI.delay(2)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('SearchNamaCatalog.PNG')

WebUI.setText(findTestObject('1.Action/Setting Catalog Reward/Waiting Approval/Page_Bhakti Web/10ST Nama Catalog'), ' ')

