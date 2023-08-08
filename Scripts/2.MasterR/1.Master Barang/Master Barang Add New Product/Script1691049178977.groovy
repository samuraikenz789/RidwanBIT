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

WebUI.click(findTestObject('2.Master/Master Barang/Master Barang Add New Product/Page_Bhakti Web/1CLick button_Add New Product'))

WebUI.delay(2)

'Upload file masih gagal\r\n'
WebUI.uploadFile(findTestObject('2.Master/Master Barang/Master Barang Add New Product/Page_Bhakti Web/2 Upload File button_Select File'), 
    'C:\\Users\\Admin\\Desktop\\test.jpg', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('2.Master/Master Barang/Master Barang Add New Product/Page_Bhakti Web/3Click ComboBox button_Pilih Vendor'))

WebUI.focus(findTestObject('2.Master/Master Barang/Master Barang Add New Product/Page_Bhakti Web/3.1 Pilihan IAK'))

WebUI.click(findTestObject('2.Master/Master Barang/Master Barang Add New Product/Page_Bhakti Web/3.1 Pilihan IAK'))

WebUI.click(findTestObject('2.Master/Master Barang/Master Barang Add New Product/Page_Bhakti Web/IAK Click button_Pilih Kategori'))

WebUI.click(findTestObject('2.Master/Master Barang/Master Barang Add New Product/Page_Bhakti Web/3.1.1 Pilihan Vendor IAK Pulsa'))

WebUI.click(findTestObject('2.Master/Master Barang/Master Barang Add New Product/Page_Bhakti Web/4.1 Pilihan IAK button_Pilih Produk'))

WebUI.click(findTestObject('2.Master/Master Barang/Master Barang Add New Product/Page_Bhakti Web/4.1 Pilihan IAK option_haxis100000 - AXIS'))

WebUI.click(findTestObject('2.Master/Master Barang/Master Barang Add New Product/Page_Bhakti Web/5.1 Click IAK Button Update'))

WebUI.setText(findTestObject('2.Master/Master Barang/Master Barang Add New Product/Page_Bhakti Web/6.1 ST Input Nama Produk'), 
    'TCNamaProduct')

WebUI.focus(findTestObject('2.Master/Master Barang/Master Barang Add New Product/Page_Bhakti Web/7.1 Click Checkbox Autofill'))

WebUI.click(findTestObject('2.Master/Master Barang/Master Barang Add New Product/Page_Bhakti Web/7.1 Click Checkbox Autofill'))

WebUI.setText(findTestObject('2.Master/Master Barang/Master Barang Add New Product/Page_Bhakti Web/8.1 ST Input Deskripsi produk'), 
    'IAKDescriptionProduct')

WebUI.setText(findTestObject('2.Master/Master Barang/Master Barang Add New Product/Page_Bhakti Web/9.1 ST Input Remarks'), 
    'IAK Remarks')

WebUI.click(findTestObject('2.Master/Master Barang/Master Barang Add New Product/Page_Bhakti Web/10.1 Click button_Save'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('ProductIAKAddSukses.PNG')

