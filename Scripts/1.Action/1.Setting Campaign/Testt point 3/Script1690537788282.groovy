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

WebUI.setText(findTestObject('Object Repository/TestUhuy/Page_Bhakti Web/input_Email address_email'), 'amink@jasakom.com')

WebUI.setEncryptedText(findTestObject('Object Repository/TestUhuy/Page_Bhakti Web/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/TestUhuy/Page_Bhakti Web/button_Sign In'))

WebUI.delay(8)

WebUI.click(findTestObject('Object Repository/TestUhuy/Page_Bhakti Web/a_Action'))

WebUI.click(findTestObject('Object Repository/TestUhuy/Page_Bhakti Web/a_Setting Campaign'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/TestUhuy/Page_Bhakti Web/button_Add New Campaign'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/TestUhuy/Page_Bhakti Web/button_Jenis Program Campaign'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/TestUhuy/Page_Bhakti Web/nb-option_Program Campaign Quiz'))

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/2ST Kode Campaign'), 
    'QuizAutoKode108')

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/3ST Nama Campaign'), 
    'QuizAutoName100')

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
    '500')

CustomKeywords.'file_upload.FileUpload.uploadFile'(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/9Upload PNG JPG Banner Campaign'), 
    'C:\\Users\\Admin\\Desktop\\test.jpg')

WebUI.delay(1)

CustomKeywords.'file_upload.FileUpload.uploadFile'(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/TambelanQuiz/Page_Bhakti Web/1Upload PDF Flyer Campaign button_Select File'), 
    'C:\\Users\\Admin\\Desktop\\test.pdf')

WebUI.delay(1)

CustomKeywords.'file_upload.FileUpload.uploadFile'(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/11 Upload PDF Header Campaign'), 
    'C:\\Users\\Admin\\Desktop\\test.pdf')

WebUI.click(findTestObject('Object Repository/TestUhuy/Page_Bhakti Web/button_Pilih Group Zona'))

WebUI.click(findTestObject('Object Repository/TestUhuy/Page_Bhakti Web/nb-option_msr-1 Lihat Detail'))

WebUI.click(findTestObject('Object Repository/TestUhuy/Page_Bhakti Web/button_Master Grouping Peserta'))

WebUI.click(findTestObject('Object Repository/TestUhuy/Page_Bhakti Web/div_kabupaten-msr-1'))

WebUI.click(findTestObject('Object Repository/TestUhuy/Page_Bhakti Web/div_provinsi-msr-2'))

WebUI.click(findTestObject('Object Repository/TestUhuy/Page_Bhakti Web/div_user-msr-1'))

WebUI.click(findTestObject('Object Repository/TestUhuy/Page_Bhakti Web/div_Target Group Peserta'))

WebUI.click(findTestObject('Object Repository/TestUhuy/Page_Bhakti Web/span_Master Grouping Peserta Blacklist'))

WebUI.click(findTestObject('Object Repository/TestUhuy/Page_Bhakti Web/div_GROUP TOKO CURANG'))

WebUI.click(findTestObject('Object Repository/TestUhuy/Page_Bhakti Web/div_Group Peserta yang tidak diizinkan ikut_b5c700'))

WebUI.click(findTestObject('Object Repository/TestUhuy/Page_Bhakti Web/span_Peserta yang diizinkan ikut campaign_c_a07b10'))

WebUI.click(findTestObject('Object Repository/TestUhuy/Page_Bhakti Web/span_Pilih Status Peserta Pemilik Toko'))

WebUI.click(findTestObject('Object Repository/TestUhuy/Page_Bhakti Web/nb-option_Dealer'))

WebUI.click(findTestObject('Object Repository/TestUhuy/Page_Bhakti Web/div_Group Peserta yang tidak diizinkan ikut_b5c700'))

WebUI.click(findTestObject('Object Repository/TestUhuy/Page_Bhakti Web/span_Dealer, Subdealer_custom-checkbox'))

WebUI.click(findTestObject('Object Repository/TestUhuy/Page_Bhakti Web/span_Pilih Status Peserta Karyawan Toko'))

WebUI.click(findTestObject('Object Repository/TestUhuy/Page_Bhakti Web/nb-option_Karyawan'))

WebUI.click(findTestObject('Object Repository/TestUhuy/Page_Bhakti Web/nb-layout-column_Jenis Program Campaign Pro_188c74'))

WebUI.click(findTestObject('Object Repository/TestUhuy/Page_Bhakti Web/button_Selanjutnya'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/TestUhuy/Page_Bhakti Web/button_Pilih Tipe Quiz'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/TestUhuy/Page_Bhakti Web/nb-option_Quiz Regular'))

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/30ST Start Date Tanggal Mulai Quiz'), 
    '02/02/2023')

WebUI.sendKeys(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/30ST Start Date Tanggal Mulai Quiz'), 
    Keys.chord(Keys.TAB))

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/30ST Start Date Tanggal Mulai Quiz'), 
    '120010')

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/31 ST End Date Tanggal Mulai Quiz'), 
    '11/11/2023')

WebUI.sendKeys(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/31 ST End Date Tanggal Mulai Quiz'), 
    Keys.chord(Keys.TAB))

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/31 ST End Date Tanggal Mulai Quiz'), 
    '120010')

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/32 Click button_Selanjutnya'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/TestUhuy/Page_Bhakti Web/a_Periode 1'))

WebUI.click(findTestObject('Object Repository/TestUhuy/Page_Bhakti Web/button_Add Question'))

WebUI.click(findTestObject('Object Repository/TestUhuy/Page_Bhakti Web/div_Multi choice'))

WebUI.setText(findTestObject('Object Repository/TestUhuy/Page_Bhakti Web/textarea_Preview_ng-untouched ng-valid ng-dirty'), 
    '1')

WebUI.setText(findTestObject('Object Repository/TestUhuy/Page_Bhakti Web/input_Image_input-title ng-untouched ng-pri_d0ef6b'), 
    '2')

WebUI.setText(findTestObject('Object Repository/TestUhuy/Page_Bhakti Web/input_Image_input-title ng-untouched ng-pri_d0ef6b_1'), 
    '3')

WebUI.click(findTestObject('Object Repository/TestUhuy/Page_Bhakti Web/input_Image_input-title ng-untouched ng-pri_d0ef6b_1'))

WebUI.setText(findTestObject('Object Repository/TestUhuy/Page_Bhakti Web/input_Image_input-title ng-untouched ng-val_1f3d8a'), 
    '4')

WebUI.setText(findTestObject('Object Repository/TestUhuy/Page_Bhakti Web/input_Image_input-title ng-untouched ng-pri_d0ef6b_1_2'), 
    '5')

WebUI.click(findTestObject('Object Repository/TestUhuy/Page_Bhakti Web/div_Image_p-checkbox-box'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/48 Click button_Selanjutnya'))

WebUI.sendKeys(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/48 Click button_Selanjutnya'), 
    Keys.chord(Keys.PAGE_UP), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/TestUhuy/Page_Bhakti Web/a_Aturan Permainan'))

WebUI.click(findTestObject('Object Repository/TestUhuy/Page_Bhakti Web/span_Pilih Aturan_inner-circle'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/TestUhuy/Page_Bhakti Web/button_Masukkan Jumlah Periode'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/TestUhuy/Page_Bhakti Web/nb-option_1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/TestUhuy/Page_Bhakti Web/input_Reward Periode 1_ng-untouched input-f_664bce'), 
    '150', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/TestUhuy/Page_Bhakti Web/button_Pilih Wallet'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/TestUhuy/Page_Bhakti Web/div_Wallet Rupiah MSR'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/TestUhuy/Page_Bhakti Web/button_Jawaban Benar untuk mendapatkan reward'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/TestUhuy/Page_Bhakti Web/nb-option_1_1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/TestUhuy/Page_Bhakti Web/span_Setting F Aturan Reward Per Soal_custo_da9749'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/TestUhuy/Page_Bhakti Web/button_Pilih Wallet'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/TestUhuy/Page_Bhakti Web/nb-option_Wallet Rupiah MSR'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/TestUhuy/Page_Bhakti Web/span_Setting G Aturan Bonus Reward Berdasar_efdc89'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/TestUhuy/Page_Bhakti Web/button_Masukkan Jumlah Periode'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/TestUhuy/Page_Bhakti Web/nb-option_1_1_2'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/TestUhuy/Page_Bhakti Web/input_Reward Periode 1_ng-untouched input-f_664bce'), 
    '100', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/TestUhuy/Page_Bhakti Web/button_Pilih Wallet'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/TestUhuy/Page_Bhakti Web/nb-option_Wallet Rupiah MSR_1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(500, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/TestUhuy/Page_Bhakti Web/button_Selanjutnya'), FailureHandling.CONTINUE_ON_FAILURE)

