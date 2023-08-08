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

WebUI.delay(4)

WebUI.click(findTestObject('1.Action/Setting Catalog Reward/Semua Catalog/Page_Bhakti Web/1Cick a_Action'))

WebUI.click(findTestObject('1.Action/Setting Catalog Reward/Semua Catalog/Page_Bhakti Web/2Cick a_Setting Catalog Reward'))

WebUI.delay(4)

WebUI.click(findTestObject('1.Action/Setting Catalog Reward/Semua Catalog/Semua Catalog Create-Edit-Hapus Catalog/Page_Bhakti Web/1Click button_Add New Catalog'))

WebUI.click(findTestObject('1.Action/Setting Catalog Reward/Semua Catalog/Semua Catalog Create-Edit-Hapus Catalog/Page_Bhakti Web/2Click button_--Pilih Jenis Catalog--'))

WebUI.click(findTestObject('1.Action/Setting Catalog Reward/Semua Catalog/Semua Catalog Create-Edit-Hapus Catalog/Page_Bhakti Web/3Click -option_Regular'))

WebUI.setText(findTestObject('1.Action/Setting Catalog Reward/Semua Catalog/Semua Catalog Create-Edit-Hapus Catalog/Page_Bhakti Web/4ST Nama Catalog'), 
    'AutomationCatalogName')

WebUI.setText(findTestObject('1.Action/Setting Catalog Reward/Semua Catalog/Semua Catalog Create-Edit-Hapus Catalog/Page_Bhakti Web/5ST StartDate'), 
    '01/01/202312121a')

WebUI.setText(findTestObject('1.Action/Setting Catalog Reward/Semua Catalog/Semua Catalog Create-Edit-Hapus Catalog/Page_Bhakti Web/6ST EndDate'), 
    '12/12/2023121211')

WebUI.delay(15)

WebUI.click(findTestObject('1.Action/Setting Catalog Reward/Semua Catalog/Semua Catalog Create-Edit-Hapus Catalog/Page_Bhakti Web/7Click ComboBox Master Group Peserta'))

WebUI.click(findTestObject('1.Action/Setting Catalog Reward/Semua Catalog/Semua Catalog Create-Edit-Hapus Catalog/Page_Bhakti Web/7.1 NewGroupTC'))

WebUI.click(findTestObject('1.Action/Setting Catalog Reward/Semua Catalog/Semua Catalog Create-Edit-Hapus Catalog/Page_Bhakti Web/7.1 Pemenang Peringkat'))

WebUI.click(findTestObject('1.Action/Setting Catalog Reward/Semua Catalog/Semua Catalog Create-Edit-Hapus Catalog/Page_Bhakti Web/7.1 Provinsi-MSR-3'))

WebUI.click(findTestObject('1.Action/Setting Catalog Reward/Semua Catalog/Semua Catalog Create-Edit-Hapus Catalog/Page_Bhakti Web/7.1.1 Scroll KAbupaten MSR-1'))

WebUI.click(findTestObject('1.Action/Setting Catalog Reward/Semua Catalog/Semua Catalog Create-Edit-Hapus Catalog/Page_Bhakti Web/7.1.1 Provinsi MSR 1'))

WebUI.click(findTestObject('1.Action/Setting Catalog Reward/Semua Catalog/Semua Catalog Create-Edit-Hapus Catalog/Page_Bhakti Web/7.1.1 Provinsi MSR2'))

WebUI.click(findTestObject('1.Action/Setting Catalog Reward/Semua Catalog/Semua Catalog Create-Edit-Hapus Catalog/Page_Bhakti Web/7.1.1 User-MSR-1'))

WebUI.scrollToElement(findTestObject('1.Action/Setting Catalog Reward/Semua Catalog/Semua Catalog Create-Edit-Hapus Catalog/Page_Bhakti Web/8 Click Checkbox Pemilik Toko'), 
    0)

WebUI.click(findTestObject('1.Action/Setting Catalog Reward/Semua Catalog/Semua Catalog Create-Edit-Hapus Catalog/Page_Bhakti Web/8 Click Checkbox Pemilik Toko'))

WebUI.delay(2)

WebUI.focus(findTestObject('1.Action/Setting Catalog Reward/Semua Catalog/Semua Catalog Create-Edit-Hapus Catalog/Page_Bhakti Web/9 Click Pilih Status Peserta'))

WebUI.click(findTestObject('1.Action/Setting Catalog Reward/Semua Catalog/Semua Catalog Create-Edit-Hapus Catalog/Page_Bhakti Web/9 Click Pilih Status Peserta'))

WebUI.click(findTestObject('1.Action/Setting Catalog Reward/Semua Catalog/Semua Catalog Create-Edit-Hapus Catalog/Page_Bhakti Web/10Click Dealer'))

WebUI.click(findTestObject('1.Action/Setting Catalog Reward/Semua Catalog/Semua Catalog Create-Edit-Hapus Catalog/Page_Bhakti Web/11Click SubDealer'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('1.Action/Setting Catalog Reward/Semua Catalog/Semua Catalog Create-Edit-Hapus Catalog/Page_Bhakti Web/14Click button_Selanjutnya'), 
    0)

WebUI.click(findTestObject('1.Action/Setting Catalog Reward/Semua Catalog/Semua Catalog Create-Edit-Hapus Catalog/Page_Bhakti Web/14Click button_Selanjutnya'))

WebUI.delay(3)

WebUI.click(findTestObject('1.Action/Setting Catalog Reward/Semua Catalog/Semua Catalog Create-Edit-Hapus Catalog/Page_Bhakti Web/15Click button_Tambah Produk'))

WebUI.click(findTestObject('1.Action/Setting Catalog Reward/Semua Catalog/Semua Catalog Create-Edit-Hapus Catalog/Page_Bhakti Web/16Click Combobox Produk'))

WebUI.click(findTestObject('1.Action/Setting Catalog Reward/Semua Catalog/Semua Catalog Create-Edit-Hapus Catalog/Page_Bhakti Web/17 CLick li_TcVocher 5000'))

WebUI.click(findTestObject('1.Action/Setting Catalog Reward/Semua Catalog/Semua Catalog Create-Edit-Hapus Catalog/Page_Bhakti Web/18 19 Combobox Unlimited Stok'))

WebUI.click(findTestObject('1.Action/Setting Catalog Reward/Semua Catalog/Semua Catalog Create-Edit-Hapus Catalog/Page_Bhakti Web/18 19 Combobox Unlimited Stok'))

WebUI.setText(findTestObject('1.Action/Setting Catalog Reward/Semua Catalog/Semua Catalog Create-Edit-Hapus Catalog/Page_Bhakti Web/20 ST Stock'), 
    '100')

WebUI.click(findTestObject('1.Action/Setting Catalog Reward/Semua Catalog/Semua Catalog Create-Edit-Hapus Catalog/Page_Bhakti Web/21 22 Combobox Unlimited Redeem'))

WebUI.click(findTestObject('1.Action/Setting Catalog Reward/Semua Catalog/Semua Catalog Create-Edit-Hapus Catalog/Page_Bhakti Web/21 22 Combobox Unlimited Redeem'))

WebUI.setText(findTestObject('1.Action/Setting Catalog Reward/Semua Catalog/Semua Catalog Create-Edit-Hapus Catalog/Page_Bhakti Web/23 ST Maximum Redeem Per User'), 
    '3')

WebUI.click(findTestObject('1.Action/Setting Catalog Reward/Semua Catalog/Semua Catalog Create-Edit-Hapus Catalog/Page_Bhakti Web/24 Click Auto Fill Periode Redeem'))

WebUI.setText(findTestObject('1.Action/Setting Catalog Reward/Semua Catalog/Semua Catalog Create-Edit-Hapus Catalog/Page_Bhakti Web/25 ST Harga Produk'), 
    '25')

WebUI.setText(findTestObject('1.Action/Setting Catalog Reward/Semua Catalog/Semua Catalog Create-Edit-Hapus Catalog/Page_Bhakti Web/26 ST Harga Diskon'), 
    '20')

WebUI.click(findTestObject('1.Action/Setting Catalog Reward/Semua Catalog/Semua Catalog Create-Edit-Hapus Catalog/Page_Bhakti Web/27 Click button_--Pilih Tipe Wallet--'))

WebUI.click(findTestObject('1.Action/Setting Catalog Reward/Semua Catalog/Semua Catalog Create-Edit-Hapus Catalog/Page_Bhakti Web/28Click nb-option_Wallet Point MSR'))

WebUI.click(findTestObject('1.Action/Setting Catalog Reward/Semua Catalog/Semua Catalog Create-Edit-Hapus Catalog/Page_Bhakti Web/29 Click button_Save'))

WebUI.delay(3)

WebUI.click(findTestObject('1.Action/Setting Catalog Reward/Semua Catalog/Semua Catalog Create-Edit-Hapus Catalog/CreateV2/Page_Bhakti Web/1Click button_Tambah Produk'))

WebUI.click(findTestObject('1.Action/Setting Catalog Reward/Semua Catalog/Semua Catalog Create-Edit-Hapus Catalog/CreateV2/Page_Bhakti Web/2Click button_All'))

WebUI.delay(1)

WebUI.click(findTestObject('1.Action/Setting Catalog Reward/Semua Catalog/Semua Catalog Create-Edit-Hapus Catalog/CreateV2/Page_Bhakti Web/3Click nb-option_BKT'))

WebUI.click(findTestObject('1.Action/Setting Catalog Reward/Semua Catalog/Semua Catalog Create-Edit-Hapus Catalog/CreateV2/Page_Bhakti Web/4Click button_All'))

WebUI.delay(1)

WebUI.click(findTestObject('1.Action/Setting Catalog Reward/Semua Catalog/Semua Catalog Create-Edit-Hapus Catalog/CreateV2/Page_Bhakti Web/5Click nb-option_Produk'))

WebUI.delay(1)

WebUI.click(findTestObject('1.Action/Setting Catalog Reward/Semua Catalog/Semua Catalog Create-Edit-Hapus Catalog/CreateV2/Page_Bhakti Web/6Click ComboBox Produk'))

WebUI.click(findTestObject('1.Action/Setting Catalog Reward/Semua Catalog/Semua Catalog Create-Edit-Hapus Catalog/CreateV2/Page_Bhakti Web/7Click li_Miyako XX'))

WebUI.click(findTestObject('1.Action/Setting Catalog Reward/Semua Catalog/Semua Catalog Create-Edit-Hapus Catalog/CreateV2/Page_Bhakti Web/8Click Checkbox Unlimited Stock'))

WebUI.click(findTestObject('1.Action/Setting Catalog Reward/Semua Catalog/Semua Catalog Create-Edit-Hapus Catalog/CreateV2/Page_Bhakti Web/9Click Checkbox Maximum Redeem'))

WebUI.click(findTestObject('1.Action/Setting Catalog Reward/Semua Catalog/Semua Catalog Create-Edit-Hapus Catalog/CreateV2/Page_Bhakti Web/10 Click Checkbox Auto Fill Periode'))

WebUI.setText(findTestObject('1.Action/Setting Catalog Reward/Semua Catalog/Semua Catalog Create-Edit-Hapus Catalog/CreateV2/Page_Bhakti Web/11ST Harga PRoduk'), 
    '25')

WebUI.setText(findTestObject('1.Action/Setting Catalog Reward/Semua Catalog/Semua Catalog Create-Edit-Hapus Catalog/CreateV2/Page_Bhakti Web/12ST Harga Diskon'), 
    '20')

WebUI.click(findTestObject('1.Action/Setting Catalog Reward/Semua Catalog/Semua Catalog Create-Edit-Hapus Catalog/CreateV2/Page_Bhakti Web/13 Click button_--Pilih Tipe Wallet--'))

WebUI.delay(1)

WebUI.click(findTestObject('1.Action/Setting Catalog Reward/Semua Catalog/Semua Catalog Create-Edit-Hapus Catalog/CreateV2/Page_Bhakti Web/14Click nb-option_Wallet Point MSR 2'))

WebUI.click(findTestObject('1.Action/Setting Catalog Reward/Semua Catalog/Semua Catalog Create-Edit-Hapus Catalog/CreateV2/Page_Bhakti Web/15Click button_Save'))

WebUI.delay(2)

WebUI.click(findTestObject('1.Action/Setting Catalog Reward/Semua Catalog/Semua Catalog Create-Edit-Hapus Catalog/CreateV2/Page_Bhakti Web/16Click button_Selanjutnya'))

WebUI.delay(2)

WebUI.click(findTestObject('1.Action/Setting Catalog Reward/Semua Catalog/Semua Catalog Create-Edit-Hapus Catalog/CreateV2/Page_Bhakti Web/17Click button_Kirim'))

WebUI.delay(5555)

WebUI.click(findTestObject('1.Action/Setting Catalog Reward/Semua Catalog/Semua Catalog Create-Edit-Hapus Catalog/CreateV2/Page_Bhakti Web/18Click button_Submit'))

