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

WebUI.click(findTestObject('2.Master/Master Target Peserta/User Group/User Tags MD/Page_Bhakti Web/1Clicka_Master'))

WebUI.click(findTestObject('2.Master/Master Target Peserta/User Group/User Tags MD/Page_Bhakti Web/2Clicka_Master Target Peserta'))

WebUI.delay(1)

WebUI.click(findTestObject('2.Master/Master Target Peserta/User Group/User Tags MD/Page_Bhakti Web/3Click a_User Tags MD'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/2.Master/Master Target Peserta/User Group/User Tags MD/TambelanSearch/Page_Bhakti Web/span_Pilih Cabang'))

WebUI.click(findTestObject('Object Repository/2.Master/Master Target Peserta/User Group/User Tags MD/TambelanSearch/Page_Bhakti Web/nb-option_JAKARTA_1_2'))

WebUI.click(findTestObject('Object Repository/2.Master/Master Target Peserta/User Group/User Tags MD/TambelanSearch/Page_Bhakti Web/span_Pilih Wilayah'))

WebUI.click(findTestObject('Object Repository/2.Master/Master Target Peserta/User Group/User Tags MD/TambelanSearch/Page_Bhakti Web/nb-option_JAKARTA_1_2_3'))

WebUI.delay(1)

WebUI.click(findTestObject('2.Master/Master Target Peserta/User Group/User Tags MD/Page_Bhakti Web/8Click button_Browse User'))

WebUI.delay(1)

WebUI.click(findTestObject('2.Master/Master Target Peserta/User Group/User Tags MD/Page_Bhakti Web/9Click button_Search with'))

WebUI.delay(1)

WebUI.focus(findTestObject('2.Master/Master Target Peserta/User Group/User Tags MD/Page_Bhakti Web/10Click nb-option_Nama Pemilik'))

WebUI.click(findTestObject('2.Master/Master Target Peserta/User Group/User Tags MD/Page_Bhakti Web/10Click nb-option_Nama Pemilik'))

WebUI.click(findTestObject('2.Master/Master Target Peserta/User Group/User Tags MD/Page_Bhakti Web/11Click h5_Browse Data User'))

WebUI.setText(findTestObject('2.Master/Master Target Peserta/User Group/User Tags MD/Page_Bhakti Web/12ST input_Nama Pemilik_filter-nama_pemilik'), 
    'a')

WebUI.click(findTestObject('2.Master/Master Target Peserta/User Group/User Tags MD/Page_Bhakti Web/13Click button_Go'))

WebUI.delay(3)

WebUI.setText(findTestObject('2.Master/Master Target Peserta/User Group/User Tags MD/Page_Bhakti Web/14ST Nama Toko'), 'rino shop')

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('NamaTokoSearch.PNG')

WebUI.setText(findTestObject('2.Master/Master Target Peserta/User Group/User Tags MD/Page_Bhakti Web/14ST Nama Toko'), ' ')

WebUI.delay(2)

WebUI.setText(findTestObject('2.Master/Master Target Peserta/User Group/User Tags MD/Page_Bhakti Web/15ST Kecamatan'), 'kecamatan kebon jeruk')

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('KecamatanSearch.PNG')

WebUI.setText(findTestObject('2.Master/Master Target Peserta/User Group/User Tags MD/Page_Bhakti Web/15ST Kecamatan'), ' ')

WebUI.delay(2)

WebUI.setText(findTestObject('2.Master/Master Target Peserta/User Group/User Tags MD/Page_Bhakti Web/16ST Alamat'), 'jalan pejuangan')

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('AlamatSearch.PNG')

WebUI.setText(findTestObject('2.Master/Master Target Peserta/User Group/User Tags MD/Page_Bhakti Web/16ST Alamat'), ' ')

WebUI.delay(2)

WebUI.setText(findTestObject('2.Master/Master Target Peserta/User Group/User Tags MD/Page_Bhakti Web/17ST KAbupaten'), 'kota jakarta barat')

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('KabupatenSearch.PNG')

WebUI.setText(findTestObject('2.Master/Master Target Peserta/User Group/User Tags MD/Page_Bhakti Web/17ST KAbupaten'), ' ')

WebUI.delay(2)

WebUI.setText(findTestObject('2.Master/Master Target Peserta/User Group/User Tags MD/Page_Bhakti Web/18ST Provinsi'), 'jawa barat')

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('ProvinsiSearch.PNG')

WebUI.setText(findTestObject('2.Master/Master Target Peserta/User Group/User Tags MD/Page_Bhakti Web/18ST Provinsi'), ' ')

WebUI.delay(2)

WebUI.setText(findTestObject('2.Master/Master Target Peserta/User Group/User Tags MD/Page_Bhakti Web/19ST Email'), 'rinodarput05@gmail.com')

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('EmailSearch.PNG')

WebUI.setText(findTestObject('2.Master/Master Target Peserta/User Group/User Tags MD/Page_Bhakti Web/19ST Email'), ' ')

