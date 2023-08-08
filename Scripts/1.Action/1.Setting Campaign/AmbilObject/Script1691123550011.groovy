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

WebUI.callTestCase(findTestCase('Login/Login As Administrator'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Page_Bhakti Web/1Click a_Action'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Page_Bhakti Web/2Click a_Setting Campaign'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/TestUhuy/Page_Bhakti Web/button_Add New Campaign'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/TestUhuy/Page_Bhakti Web/button_Jenis Program Campaign'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/TestUhuy/Page_Bhakti Web/nb-option_Program Campaign Quiz'))

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/2ST Kode Campaign'), 
    'QuizAutoKo3')

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/3ST Nama Campaign'), 
    'QuizAutoName20')

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/4ST Start Date Periode Tayang Campaign'), 
    '01/01/2023')

WebUI.sendKeys(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/4ST Start Date Periode Tayang Campaign'), 
    Keys.chord(Keys.TAB))

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/4ST Start Date Periode Tayang Campaign'), 
    '120010')

WebUI.delay(1)

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/5ST End Date Periode Tayang Campaign'), 
    '12/12/2023')

WebUI.sendKeys(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/5ST End Date Periode Tayang Campaign'), 
    Keys.chord(Keys.TAB))

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/5ST End Date Periode Tayang Campaign'), 
    '120010')

WebUI.delay(1)

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/6ST Start Date Periode Transaksi Campaign'), 
    '02/01/2023')

WebUI.sendKeys(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/6ST Start Date Periode Transaksi Campaign'), 
    Keys.chord(Keys.TAB))

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/6ST Start Date Periode Transaksi Campaign'), 
    '120010')

WebUI.delay(1)

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/7ST End Date Periode Transaksi Campaign'), 
    '11/12/2023')

WebUI.sendKeys(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/7ST End Date Periode Transaksi Campaign'), 
    Keys.chord(Keys.TAB))

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/7ST End Date Periode Transaksi Campaign'), 
    '120010')

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/8ST Kuota Join Campaign'), 
    '1000')

WebUI.delay(1)

CustomKeywords.'file_upload.FileUpload.uploadFile'(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/9Upload PNG JPG Banner Campaign'), 
    'C:\\Users\\Admin\\Desktop\\test.jpg')

WebUI.delay(1)

CustomKeywords.'file_upload.FileUpload.uploadFile'(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/TambelanQuiz/Page_Bhakti Web/1Upload PDF Flyer Campaign button_Select File'), 
    'C:\\Users\\Admin\\Desktop\\test.pdf')

WebUI.delay(1)

CustomKeywords.'file_upload.FileUpload.uploadFile'(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/11 Upload PDF Header Campaign'), 
    'C:\\Users\\Admin\\Desktop\\test.pdf')

WebUI.delay(1)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/12Click button_Pilih Group Zona'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/13Click nb-option_msr-1 Lihat Detail'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/14 Click button_Master Grouping Peserta'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/15Click nb-option_kabupaten-msr-1'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/16Click nb-option_provinsi-msr-1'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/17CLick nb-option_provinsi-msr-2'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/18Click nb-option_user-msr-1'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/TambelanQuiz/Page_Bhakti Web/Click Setelah Pilih Target Group Peserta'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/19 Click button_Master Grouping Peserta Blacklist'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/20Click nb-option_GROUP TOKO CURANG'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/TambelanQuiz/Page_Bhakti Web/Click Setelah Pilih Target Group Peserta'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/21 Click Checkbox Pemilik Toko'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/22Click button_Pilih Status Peserta Pemilik Toko'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/23 Click nb-option_Dealer'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/24Click nb-option_Subdealer'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/TambelanQuiz/Page_Bhakti Web/Click Setelah Pilih Target Group Peserta'))

WebUI.scrollToElement(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/25 Click Checkbox Karyawan Toko'), 
    0)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/25 Click Checkbox Karyawan Toko'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/TambelanQuiz/Page_Bhakti Web/Click button_Pilih Status Peserta Karyawan Toko'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/26Click nb-option_Karyawan'))

WebUI.scrollToElement(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/27Click button_Selanjutnya'), 
    0)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/27Click button_Selanjutnya'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/Advance01/Page_Bhakti Web/button_Pilih Tipe Quiz'))

WebUI.click(findTestObject('Object Repository/1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/Advance01/Page_Bhakti Web/nb-option_Quiz Regular'))

WebUI.click(findTestObject('Object Repository/1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/Advance01/Page_Bhakti Web/nb-layout-column_Jenis Program Campaign Pro_188c74'))

WebUI.click(findTestObject('Object Repository/1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/Advance01/Page_Bhakti Web/button_Tambah Periode'))

WebUI.scrollToElement(findTestObject('Object Repository/1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/Advance01/Page_Bhakti Web/button_Pilih Tipe Quiz'), 
    0)

WebUI.click(findTestObject('Object Repository/1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/Advance01/Page_Bhakti Web/button_Pilih Tipe Quiz'))

WebUI.click(findTestObject('Object Repository/1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/Advance01/Page_Bhakti Web/nb-option_Quiz Regular_1'))

WebUI.click(findTestObject('Object Repository/1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/Advance01/Page_Bhakti Web/div_sd_col-md-12 mt-3 ng-star-inserted'))

WebUI.click(findTestObject('Object Repository/1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/Advance01/Page_Bhakti Web/div_Periode 2Tipe QuizQuiz RegularTanggal M_cbc0e2'))

WebUI.scrollToElement(findTestObject('Object Repository/1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/Advance01/Page_Bhakti Web/button_Tambah Periode'), 
    0)

WebUI.click(findTestObject('Object Repository/1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/Advance01/Page_Bhakti Web/button_Tambah Periode'))

WebUI.scrollToElement(findTestObject('Object Repository/1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/Advance01/Page_Bhakti Web/button_Pilih Tipe Quiz'), 
    0)

WebUI.click(findTestObject('Object Repository/1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/Advance01/Page_Bhakti Web/button_Pilih Tipe Quiz'))

WebUI.click(findTestObject('Object Repository/1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/Advance01/Page_Bhakti Web/nb-option_Quiz Regular_1_2'))

WebUI.click(findTestObject('Object Repository/1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/Advance01/Page_Bhakti Web/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/Advance01/Page_Bhakti Web/a_Periode 2'))

WebUI.click(findTestObject('Object Repository/1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/Advance01/Page_Bhakti Web/a_Periode 3'))

