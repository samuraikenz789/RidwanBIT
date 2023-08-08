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

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Page_Bhakti Web/1Click a_Action'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Page_Bhakti Web/2Click a_Setting Campaign'))

WebUI.delay(1)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Page_Bhakti Web/4Click button_Add New Campaign'))

WebUI.delay(2)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Page_Bhakti Web/5Click button_Jenis Program Campaign'))

WebUI.delay(1)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Foto Header Periode/Page_Bhakti Web/1Click nb-option_Program Campaign Foto'))

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Foto Header Periode/Page_Bhakti Web/2ST Kode Campaign'), 
    'CampaignFoto1')

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Foto Header Periode/Page_Bhakti Web/3ST Nama Campaign'), 
    'NamaCampaignFoto')

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Foto Header Periode/Page_Bhakti Web/4ST Start Date Periode Tayang Campaign'), 
    '01/01/2023')

WebUI.sendKeys(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Foto Header Periode/Page_Bhakti Web/4ST Start Date Periode Tayang Campaign'), 
    Keys.chord(Keys.TAB))

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Foto Header Periode/Page_Bhakti Web/4ST Start Date Periode Tayang Campaign'), 
    '101010')

WebUI.delay(1)

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Foto Header Periode/Page_Bhakti Web/5ST End Date Periode Tayang Campaign'), 
    '12/12/2023')

WebUI.sendKeys(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Foto Header Periode/Page_Bhakti Web/5ST End Date Periode Tayang Campaign'), 
    Keys.chord(Keys.TAB))

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Foto Header Periode/Page_Bhakti Web/5ST End Date Periode Tayang Campaign'), 
    '101010')

WebUI.delay(1)

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Foto Header Periode/Page_Bhakti Web/6ST Start Date Periode Transaksi Campaign'), 
    '02/01/2023')

WebUI.sendKeys(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Foto Header Periode/Page_Bhakti Web/6ST Start Date Periode Transaksi Campaign'), 
    Keys.chord(Keys.TAB))

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Foto Header Periode/Page_Bhakti Web/6ST Start Date Periode Transaksi Campaign'), 
    '101010')

WebUI.delay(1)

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Foto Header Periode/Page_Bhakti Web/7ST End Date Periode Transaksi Campaign'), 
    '12/12/2023')

WebUI.sendKeys(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Foto Header Periode/Page_Bhakti Web/7ST End Date Periode Transaksi Campaign'), 
    Keys.chord(Keys.TAB))

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Foto Header Periode/Page_Bhakti Web/7ST End Date Periode Transaksi Campaign'), 
    '101010')

WebUI.delay(1)

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Foto Header Periode/Page_Bhakti Web/8ST Kouta Join Campaign'), 
    '500')

CustomKeywords.'file_upload.FileUpload.uploadFile'(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Foto Header Periode/Page_Bhakti Web/9Upload PNG JPG Banner Campaign'), 
    'C:\\Users\\Admin\\Desktop\\test.jpg')

WebUI.delay(1)

CustomKeywords.'file_upload.FileUpload.uploadFile'(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Foto Header Periode/Page_Bhakti Web/10Upload PDF Flyer Campaign'), 
    'C:\\Users\\Admin\\Desktop\\test.pdf')

WebUI.delay(1)

CustomKeywords.'file_upload.FileUpload.uploadFile'(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Foto Header Periode/Page_Bhakti Web/11 Upload PDF Header Campaign'), 
    'C:\\Users\\Admin\\Desktop\\test.pdf')

WebUI.delay(1)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Foto Header Periode/Page_Bhakti Web/12Click button_Pilih Group Zona'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Foto Header Periode/Page_Bhakti Web/13Click nb-option_msr-1 Lihat Detail'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Foto Header Periode/Page_Bhakti Web/14Click button_Master Grouping Peserta'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Foto Header Periode/Page_Bhakti Web/15Click nb-option_kabupaten-msr-1'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Foto Header Periode/Page_Bhakti Web/16Click nb-option_provinsi-msr-1'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Foto Header Periode/Page_Bhakti Web/17Click nb-option_provinsi-msr-2'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Foto Header Periode/Page_Bhakti Web/18Click nb-option_user-msr-1'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Foto Header Periode/Page_Bhakti Web/99Click Setelah Pilih Target Group Peserta'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Foto Header Periode/Page_Bhakti Web/19Click button_Master Grouping Peserta Blacklist'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Foto Header Periode/Page_Bhakti Web/20 Click nb-option_GROUP TOKO CURANG'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Foto Header Periode/Page_Bhakti Web/99Click Setelah Pilih Target Group Peserta'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Foto Header Periode/Page_Bhakti Web/21 Click Checkbox Pemilik Toko'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Foto Header Periode/Page_Bhakti Web/22 Click Combobox Pemilik Toko'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Foto Header Periode/Page_Bhakti Web/23 Click nb-option_Dealer'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Foto Header Periode/Page_Bhakti Web/24 Click nb-option_Subdealer'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Foto Header Periode/Page_Bhakti Web/25Click Setelah set Pemilik Toko'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Foto Header Periode/Page_Bhakti Web/26 Click Checkbox Karyawan Toko'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Foto Header Periode/Page_Bhakti Web/27Click Combobox Karyawan Toko'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Foto Header Periode/Page_Bhakti Web/28Click nb-option_Karyawan'))

WebUI.scrollToElement(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Foto Header Periode/Page_Bhakti Web/29Click button_Selanjutnya'), 
    0)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Foto Header Periode/Page_Bhakti Web/29Click button_Selanjutnya'))

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Foto Header Periode/Page_Bhakti Web/30ST Start Date Periode Kirim Foto'), 
    '03/01/2023')

WebUI.sendKeys(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Foto Header Periode/Page_Bhakti Web/30ST Start Date Periode Kirim Foto'), 
    Keys.chord(Keys.TAB))

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Foto Header Periode/Page_Bhakti Web/30ST Start Date Periode Kirim Foto'), 
    '101010')

WebUI.delay(1)

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Foto Header Periode/Page_Bhakti Web/31ST End Date Periode Kirim Foto'), 
    '12/12/2023')

WebUI.sendKeys(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Foto Header Periode/Page_Bhakti Web/31ST End Date Periode Kirim Foto'), 
    Keys.chord(Keys.TAB))

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Foto Header Periode/Page_Bhakti Web/31ST End Date Periode Kirim Foto'), 
    '101010')

WebUI.delay(1)

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Foto Header Periode/Page_Bhakti Web/32 ST Grace Period Kirim Foto'), 
    '12/12/2023')

WebUI.sendKeys(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Foto Header Periode/Page_Bhakti Web/32 ST Grace Period Kirim Foto'), 
    Keys.chord(Keys.TAB))

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Foto Header Periode/Page_Bhakti Web/32 ST Grace Period Kirim Foto'), 
    '101010')

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Foto Header Periode/Page_Bhakti Web/33 Click button_Selanjutnya'))

