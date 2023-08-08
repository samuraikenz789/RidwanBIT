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

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Page_Bhakti Web/6Click nb-option_Program Scan QR Code'))

WebUI.delay(1)

'Input di ganti karka kode campaign tidak boleh sama'
WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Page_Bhakti Web/7ST Kode Campaign'), 
    'AutoKodeCampaign9')

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Page_Bhakti Web/8ST Nama Campaign'), 
    'AutoNamaCampaign')

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Page_Bhakti Web/9ST Start Date Tayang Campaign'), 
    '01/01/2023')

WebUI.sendKeys(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Page_Bhakti Web/9ST Start Date Tayang Campaign'), 
    Keys.chord(Keys.TAB))

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Page_Bhakti Web/9ST Start Date Tayang Campaign'), 
    '101010')

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/CampaignUploadFileAndPDF/Page_Bhakti Web/2ST End Date Periode Tayang'), 
    '12/12/2023')

WebUI.sendKeys(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/CampaignUploadFileAndPDF/Page_Bhakti Web/2ST End Date Periode Tayang'), 
    Keys.chord(Keys.TAB))

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/CampaignUploadFileAndPDF/Page_Bhakti Web/2ST End Date Periode Tayang'), 
    '101010')

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/CampaignUploadFileAndPDF/Page_Bhakti Web/3ST Start Date Periode Scan'), 
    '01/01/2023')

WebUI.sendKeys(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/CampaignUploadFileAndPDF/Page_Bhakti Web/3ST Start Date Periode Scan'), 
    Keys.chord(Keys.TAB))

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/CampaignUploadFileAndPDF/Page_Bhakti Web/3ST Start Date Periode Scan'), 
    '101010')

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/CampaignUploadFileAndPDF/Page_Bhakti Web/4ST End Date Periode Scan'), 
    '11/11/2023')

WebUI.sendKeys(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/CampaignUploadFileAndPDF/Page_Bhakti Web/4ST End Date Periode Scan'), 
    Keys.chord(Keys.TAB))

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/CampaignUploadFileAndPDF/Page_Bhakti Web/4ST End Date Periode Scan'), 
    '101010')

WebUI.delay(2)

CustomKeywords.'file_upload.FileUpload.uploadFile'(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/CampaignUploadFileAndPDF/Page_Bhakti Web/1. Banner Campaign Upload JPG PNG'), 
    'C:\\Users\\Admin\\Desktop\\test.jpg')

WebUI.delay(1)

CustomKeywords.'file_upload.FileUpload.uploadFile'(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/CampaignUploadFileAndPDF/Page_Bhakti Web/2. Flyer Campaign Upload PDF'), 
    'C:\\Users\\Admin\\Desktop\\test.pdf')

WebUI.delay(1)

CustomKeywords.'file_upload.FileUpload.uploadFile'(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/CampaignUploadFileAndPDF/Page_Bhakti Web/3. Header Campaign Upload PDF'), 
    'C:\\Users\\Admin\\Desktop\\test.pdf')

WebUI.delay(1)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Page_Bhakti Web/16Click button_Pilih Group Zona'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Page_Bhakti Web/17Click Pembagian Zona nb-option_msr-1 Lihat Detail'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Page_Bhakti Web/18Click button_Master Grouping Peserta'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Page_Bhakti Web/18.1 Click nb-option_A-PEMENANG-PERINGKAT'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Page_Bhakti Web/18.1 Click nb-option_NEWGROUPTC'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Page_Bhakti Web/18.1 Click nb-option_PROVINSI-MSR-3'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Page_Bhakti Web/18.1.1 Click nb-option_kabupaten-msr-1'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Page_Bhakti Web/18.1.1 Click nb-option_provinsi-msr-1'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Page_Bhakti Web/18.1.1 Click nb-option_provinsi-msr-2'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Page_Bhakti Web/18.1.1 Click nb-option_user-msr-1'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/CampaignUploadFileAndPDF/Page_Bhakti Web/6CLick Header Campaign'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Page_Bhakti Web/20.button_Master Grouping Peserta Blacklist'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Page_Bhakti Web/21Click nb-option_GROUP TOKO CURANG'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/CampaignUploadFileAndPDF/Page_Bhakti Web/6CLick Header Campaign'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Page_Bhakti Web/23 Click Combobox Pemilik Toko'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/TambelanCampaign/Page_Bhakti Web/div_Group Peserta yang tidak diizinkan ikut campaign'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Page_Bhakti Web/22 Click checkbox Pemilik toko'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Page_Bhakti Web/23 Click Combobox Pemilik Toko'))

WebUI.focus(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/TambelanCampaign/Page_Bhakti Web/1Click nb-option_Dealer'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/TambelanCampaign/Page_Bhakti Web/1Click nb-option_Dealer'))

WebUI.focus(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/TambelanCampaign/Page_Bhakti Web/2Click nb-option_Subdealer'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/TambelanCampaign/Page_Bhakti Web/2Click nb-option_Subdealer'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/TambelanCampaign/Page_Bhakti Web/6 Click Label div_Peserta yang diizinkan ikut campaign'))

WebUI.scrollToElement(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/TambelanCampaign/Page_Bhakti Web/div_Group Peserta yang tidak diizinkan ikut campaign'), 
    0)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Page_Bhakti Web/24Click Combobox Karyawan Toko'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Page_Bhakti Web/25 Click button_Pilih Status Peserta Karyawan Toko'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/TambelanCampaign/Page_Bhakti Web/2.1 CLick Pilihan nb-option_Karyawan'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/TambelanCampaign/Page_Bhakti Web/6 Click Label div_Peserta yang diizinkan ikut campaign'))

'buat input tanggal dan upload PDF\r\n'
WebUI.delay(3)

WebUI.focus(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Page_Bhakti Web/27Click button_Selanjutnya'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Page_Bhakti Web/27Click button_Selanjutnya'))

WebUI.delay(5)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Page_Bhakti Web/28Click button_Pilih Kategori Peserta'))

WebUI.delay(5)

WebUI.focus(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Page_Bhakti Web/28.1 Click nb-option_Dealer'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Page_Bhakti Web/28.1 Click nb-option_Dealer'))

WebUI.focus(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Page_Bhakti Web/28.1 Click nb-option_Karyawan'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Page_Bhakti Web/28.1 Click nb-option_Karyawan'))

WebUI.focus(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Page_Bhakti Web/28.1 Click nb-option_Subdealer'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Page_Bhakti Web/28.1 Click nb-option_Subdealer'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Page_Bhakti Web/29Click Label div_Kategori Peserta'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Page_Bhakti Web/30Click button_Pilih Target Wallet'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Page_Bhakti Web/31Click nb-option_Wallet Point MSR'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Page_Bhakti Web/32Click Label div_Target Wallet'))

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Page_Bhakti Web/33 ST Tanggal Kadaluarsa Point'), 
    '12/12/2023')

WebUI.sendKeys(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Page_Bhakti Web/33 ST Tanggal Kadaluarsa Point'), 
    Keys.chord(Keys.TAB))

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Page_Bhakti Web/33 ST Tanggal Kadaluarsa Point'), 
    '101010')

CustomKeywords.'file_upload.FileUpload.uploadFile'(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Setting Campaign Search-Lock-Delete CampaignV2/Page_Bhakti Web/1Click button_IMPORT FROM'), 
    'C:\\Users\\Admin\\Desktop\\1QA Dokumentasi\\Barang Tamplate.xlsx')

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/NewCampaign Setting D Pengaturan Bonus Point/Page_Bhakti Web/100 Click Titipan button_Selanjutnya'), 
    0)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/NewCampaign Setting D Pengaturan Bonus Point/Page_Bhakti Web/100 Click Titipan button_Selanjutnya'))

WebUI.delay(10)

WebUI.callTestCase(findTestCase('1.Action/1.Setting Campaign/1.2 NewCampaign Setting Tambahan QR Code'), [:], FailureHandling.STOP_ON_FAILURE)

