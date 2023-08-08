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

not_run: WebUI.openBrowser('')

not_run: WebUI.maximizeWindow()

not_run: WebUI.navigateToUrl('https://mishirin-726d8.web.app/#/auth/login')

not_run: WebUI.doubleClick(findTestObject('Object Repository/2.Master/Master Target Peserta/Provinsi Group/Provinsi Group Create-Edit-Delete/Page_Bhakti Web/input_Email address_email'))

not_run: WebUI.setText(findTestObject('Object Repository/2.Master/Master Target Peserta/Provinsi Group/Provinsi Group Create-Edit-Delete/Page_Bhakti Web/input_Email address_email'), 
    'amink@jasakom.com')

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/2.Master/Master Target Peserta/Provinsi Group/Provinsi Group Create-Edit-Delete/Page_Bhakti Web/input_Password_password'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

not_run: WebUI.click(findTestObject('Object Repository/2.Master/Master Target Peserta/Provinsi Group/Provinsi Group Create-Edit-Delete/Page_Bhakti Web/button_Sign In'))

not_run: WebUI.delay(4)

not_run: WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Page_Bhakti Web/1Click a_Action'))

not_run: WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Page_Bhakti Web/2Click a_Setting Campaign'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Pemilik Toko 2 Opsi/Page_Bhakti Web/8Click div_Click Disini Untuk Melakukan Scan'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Pemilik Toko 2 Opsi/Page_Bhakti Web/9Click a_Setting Tambahan'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Page_Bhakti Web/4Click button_Add New Campaign'))

'sampe sini kalau gk pake login'
WebUI.delay(0)

WebUI.scrollToElement(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Pemilik Toko 2 Opsi/Page_Bhakti Web/1Scroll untuk Setting D'), 
    0)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/NewCampaign Setting D Pengaturan Bonus Point/Page_Bhakti Web/1Click Checkbox Setting D'))

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/NewCampaign Setting D Pengaturan Bonus Point/Page_Bhakti Web/2ST StartDate'), 
    '12/12/2023')

WebUI.sendKeys(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/NewCampaign Setting D Pengaturan Bonus Point/Page_Bhakti Web/2ST StartDate'), 
    Keys.chord(Keys.TAB))

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/NewCampaign Setting D Pengaturan Bonus Point/Page_Bhakti Web/2ST StartDate'), 
    '011010')

WebUI.delay(1)

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/NewCampaign Setting D Pengaturan Bonus Point/Page_Bhakti Web/3ST EndDate'), 
    '12/12/2023')

WebUI.sendKeys(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/NewCampaign Setting D Pengaturan Bonus Point/Page_Bhakti Web/3ST EndDate'), 
    Keys.chord(Keys.TAB))

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/NewCampaign Setting D Pengaturan Bonus Point/Page_Bhakti Web/3ST EndDate'), 
    '101010')

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/NewCampaign Setting D Pengaturan Bonus Point/Page_Bhakti Web/4ST Jumlah Scan'), 
    '100')

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/NewCampaign Setting D Pengaturan Bonus Point/Page_Bhakti Web/5ST Jumlah Bonus'), 
    '50')

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/NewCampaign Setting D Pengaturan Bonus Point/Page_Bhakti Web/6Click Pilih Wallet'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/NewCampaign Setting D Pengaturan Bonus Point/Page_Bhakti Web/7Click nb-option_Wallet Point MSR'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/NewCampaign Setting D Pengaturan Bonus Point/Page_Bhakti Web/8Click Pilih Aturan'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/NewCampaign Setting D Pengaturan Bonus Point/Page_Bhakti Web/9Click nb-option_Berlaku Kelipatan'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/NewCampaign Setting D Pengaturan Bonus Point/Page_Bhakti Web/10Click button_Pilih Status Peserta'))

WebUI.focus(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/NewCampaign Setting D Pengaturan Bonus Point/Page_Bhakti Web/11Click nb-option_Dealer'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/NewCampaign Setting D Pengaturan Bonus Point/Page_Bhakti Web/11Click nb-option_Dealer'))

WebUI.focus(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/NewCampaign Setting D Pengaturan Bonus Point/Page_Bhakti Web/12 Click nb-option_Subdealer'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/NewCampaign Setting D Pengaturan Bonus Point/Page_Bhakti Web/12 Click nb-option_Subdealer'))

WebUI.focus(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/NewCampaign Setting D Pengaturan Bonus Point/Page_Bhakti Web/13Click nb-option_Karyawan'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/NewCampaign Setting D Pengaturan Bonus Point/Page_Bhakti Web/13Click nb-option_Karyawan'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Pemilik Toko 2 Opsi/Page_Bhakti Web/2Scroll to untuk Setting E'), 
    0)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Setting E Pengaturan Multi Scan QR Code/Page_Bhakti Web/1Click Setting E'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Setting E Pengaturan Multi Scan QR Code/Page_Bhakti Web/2Click button_Pilih Kategori Peserta'))

WebUI.delay(1)

WebUI.focus(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/CampaignUploadFileAndPDF/Page_Bhakti Web/9Click nb-option_Karyawan'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/CampaignUploadFileAndPDF/Page_Bhakti Web/9Click nb-option_Karyawan'))

WebUI.delay(1)

WebUI.focus(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Setting E Pengaturan Multi Scan QR Code/Page_Bhakti Web/3Click nb-option_Dealer Fix'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Setting E Pengaturan Multi Scan QR Code/Page_Bhakti Web/3Click nb-option_Dealer Fix'))

WebUI.delay(1)

WebUI.focus(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/CampaignUploadFileAndPDF/Page_Bhakti Web/10 Click nb-option_Dealer'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/CampaignUploadFileAndPDF/Page_Bhakti Web/10 Click nb-option_Dealer'))

WebUI.scrollToElement(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/CampaignUploadFileAndPDF/Page_Bhakti Web/11 Scroll To div_QR'), 
    0)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Setting E Pengaturan Multi Scan QR Code/Page_Bhakti Web/6click button_Pilih Kategori Peserta'))

WebUI.focus(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Setting E Pengaturan Multi Scan QR Code/Page_Bhakti Web/7Click nb-option_Karyawan'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Setting E Pengaturan Multi Scan QR Code/Page_Bhakti Web/7Click nb-option_Karyawan'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Pemilik Toko 2 Opsi/Page_Bhakti Web/3Scroll to Untuk Setting F'), 
    0)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Setting F Pengaturan Undian/Page_Bhakti Web/1Click Setting F'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Setting F Pengaturan Undian/Page_Bhakti Web/2Click Pembagian Undian'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Setting F Pengaturan Undian/Page_Bhakti Web/3Click nb-option_Undian Nasional'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Setting F Pengaturan Undian/Page_Bhakti Web/4 Wallet Undian'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Setting F Pengaturan Undian/Page_Bhakti Web/5Click nb-option_UNDIAN AKHIR TAHUN MISHIRIN'))

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Setting F Pengaturan Undian/Page_Bhakti Web/6ST Jumlah Point'), 
    '25')

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/CampaignUploadFileAndPDF/Page_Bhakti Web/12Click button_Pilih Status Peserta'))

WebUI.delay(1)

WebUI.focus(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/CampaignUploadFileAndPDF/Page_Bhakti Web/13CLick nb-option_Dealer'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/CampaignUploadFileAndPDF/Page_Bhakti Web/13CLick nb-option_Dealer'))

WebUI.delay(1)

WebUI.focus(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/CampaignUploadFileAndPDF/Page_Bhakti Web/15Click nb-option_Karyawan'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/CampaignUploadFileAndPDF/Page_Bhakti Web/15Click nb-option_Karyawan'))

WebUI.delay(1)

WebUI.focus(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/TambelanCampaign/Page_Bhakti Web/15 CLick nb-option_Karyawan'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/TambelanCampaign/Page_Bhakti Web/15 CLick nb-option_Karyawan'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Pemilik Toko 2 Opsi/Page_Bhakti Web/Setelah Setting F pilih Option'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Setting F Pengaturan Undian/Page_Bhakti Web/11 Click button plus peringkat'))

WebUI.delay(2)

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Setting F Pengaturan Undian/Page_Bhakti Web/12ST Masukan Peringkat'), 
    '10')

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Setting F Pengaturan Undian/Page_Bhakti Web/13 ST Masukan Nilai Reward'), 
    '50')

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Setting F Pengaturan Undian/Page_Bhakti Web/14Click button_Pilih Wallet'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Setting F Pengaturan Undian/Page_Bhakti Web/15Click nb-option_Wallet Point MSR'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Setting F Pengaturan Undian/Page_Bhakti Web/16Click button_Save'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Setting F Pengaturan Undian/Page_Bhakti Web/11 Click button plus peringkat'), 
    0)

WebUI.delay(2)

WebUI.focus(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Setting G Pengaturan Peringkat/GTambelan/Page_Bhakti Web/1Click Checkbox Setting G'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Setting G Pengaturan Peringkat/GTambelan/Page_Bhakti Web/1Click Checkbox Setting G'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Setting G Pengaturan Peringkat/GTambelan/Page_Bhakti Web/2Click button_Add Zona'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Setting G Pengaturan Peringkat/GTambelan/Page_Bhakti Web/3Click Checkbox Select All'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Setting G Pengaturan Peringkat/GTambelan/Page_Bhakti Web/4Click button_OK'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Setting G Pengaturan Peringkat/GTambelan/Page_Bhakti Web/5Click Tambah Peringkat'))

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Setting G Pengaturan Peringkat/GTambelan/Page_Bhakti Web/6 ST SD Peringkat'), 
    '10')

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Setting G Pengaturan Peringkat/GTambelan/Page_Bhakti Web/7ST Nilai Reward'), 
    '25')

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Setting G Pengaturan Peringkat/GTambelan/Page_Bhakti Web/8Click button_Pilih Wallet'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Setting G Pengaturan Peringkat/GTambelan/Page_Bhakti Web/9Click nb-option_Wallet Point MSR'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Setting G Pengaturan Peringkat/GTambelan/Page_Bhakti Web/10Click button_Save'))

WebUI.delay(10)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Setting G Pengaturan Peringkat/Page_Bhakti Web/11 Click button_Selanjutnya'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Setting G Pengaturan Peringkat/Page_Bhakti Web/1Click button_Kirim'))

WebUI.delay(10)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Setting G Pengaturan Peringkat/Page_Bhakti Web/2Click button_Yes'))

WebUI.delay(4)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('CampaignQR.PNG')

