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
    'QuizAutoKod103')

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

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/28Click button_Pilih Tipe Quiz'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/29Click nb-option_Quiz Regular'))

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

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/33 Click a_Periode 1'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/34 Click button_Add Question'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/35 Click div_Multi choice'))

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/36 ST Pertanyaan Quiz'), 
    'Pertanyaan Quiz 1')

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/37 ST Answer 1'), 
    'Pertanyaan 1 Nich')

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/38 ST Answer 2'), 
    'Pertanyaan 2 Nich')

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/39 ST Answer 3'), 
    'Pertanyaan 3 Nich')

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/40 ST Answer 4'), 
    'Pertanyaan 4 Nich')

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/41 Click button_Add Option'))

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/42 ST Answer 5'), 
    'Pertanyaan 5 Nich')

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/43 Click Answer 3 As Correct Answer'))

WebUI.scrollToElement(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/TambelanQuiz/Page_Bhakti Web/Scroll To _Setting D Design Quiz sblm 86'), 
    0)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/44 Click button_Set Time Limit'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/45 Click nb-option_60 Sec'))

'preview cuman sendkey esc gk mau\r\n'
not_run: WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/46 CLick button_Preview'))

not_run: WebUI.delay(2)

not_run: WebUI.sendKeys(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/47 Click Leave Preview Quiz'), 
    Keys.chord(Keys.ESCAPE), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.sendKeys(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/47 Click Leave Preview Quiz'), 
    Keys.chord(Keys.ESCAPE), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.delay(2)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/48 Click button_Selanjutnya'))

WebUI.delay(3)

WebUI.sendKeys(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/48 Click button_Selanjutnya'), 
    Keys.chord(Keys.PAGE_UP), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.scrollToElement(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/TambelanQuiz/TambelanQuizV2/Page_Bhakti Web/2Scroll to nb-card-header_Jenis Program Campaign Program Campaign Quiz'), 
    0)

not_run: WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/49 Scroll Click a_Aturan Permainan'))

'dari sini ke bawah\r\n'
WebUI.delay(3)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/TambelanQuiz/TambelanQuizV2/Page_Bhakti Web/a_Aturan Permainan'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/TambelanQuiz/TambelanQuizV2/Page_Bhakti Web/2Click Radio Button Aturan Option Peserta wajib mengikuti'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AturanPermainanFullTambelan/Page_Bhakti Web/1Click button_Masukkan Jumlah Periode'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AturanPermainanFullTambelan/Page_Bhakti Web/2Click nb-option_1'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/TambelanQuiz/TambelanQuizV2/Page_Bhakti Web/5ST Periode 1 Nilai Reward'), 
    '100', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToElement(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/TambelanQuiz/TambelanQuizV2/Page_Bhakti Web/a_Aturan Permainan'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.focus(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AturanPermainanFullTambelan/Page_Bhakti Web/3Click button_Pilih Wallet'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AturanPermainanFullTambelan/Page_Bhakti Web/3Click button_Pilih Wallet'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AturanPermainanFullTambelan/Page_Bhakti Web/4Click nb-option_Wallet Rupiah MSR'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AturanPermainanFullTambelan/Page_Bhakti Web/5Click button_Jawaban Benar untuk mendapatkan reward'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AturanPermainanFullTambelan/Page_Bhakti Web/6Click nb-option_1'), 
    FailureHandling.CONTINUE_ON_FAILURE)

'sini done\r\n\r\n'
WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToElement(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/TambelanQuiz/TambelanQuizV2/Page_Bhakti Web/9Scroll To Opsi Peserta akan Mendapatkan Reward'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/TambelanQuiz/TambelanQuizV2/Page_Bhakti Web/10Click Checkbox Setting F'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AturanPermainanFullTambelan/Page_Bhakti Web/7 CLick button_Pilih Wallet'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AturanPermainanFullTambelan/Page_Bhakti Web/8 Click nb-option_Wallet Rupiah MSR'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AturanPermainanFullTambelan/SettingF Option Select/Page_Bhakti Web/Click Setting F Pilih Reward Tiap Soal Sama'))

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AturanPermainanFullTambelan/SettingF Option Select/Page_Bhakti Web/Click Setting F Pilih Reward Tiap Soal Berbeda'))

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/TambelanQuiz/Campaign Quiz AturanPermainan/AturanTambelV2/Page_Bhakti Web/6ST Reward Soal 1'), 
    '150', FailureHandling.CONTINUE_ON_FAILURE)

'sini\r\n'
WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToElement(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/TambelanQuiz/TambelanQuizV2/Page_Bhakti Web/15Scroll to h6_Setting G Aturan Bonus Reward Berdasarkan Periode'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/TambelanQuiz/TambelanQuizV2/Page_Bhakti Web/16Click  Checkbox Setting G'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AturanPermainanFullTambelan/Page_Bhakti Web/9Click button_Masukkan Jumlah Periode'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AturanPermainanFullTambelan/Page_Bhakti Web/10Click nb-option_1'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/TambelanQuiz/TambelanQuizV2/Page_Bhakti Web/19 ST Jumlah Bonus'), 
    '100', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AturanPermainanFullTambelan/Page_Bhakti Web/11 Click button_Pilih Wallet'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AturanPermainanFullTambelan/Page_Bhakti Web/12 Click nb-option_Wallet Rupiah MSR'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AturanPermainanFullTambelan/TambelanSimpanCampainQuiz/Page_Bhakti Web/1 Click button_Selanjutnya'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToElement(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AturanPermainanFullTambelan/TambelanSimpanCampainQuiz/Page_Bhakti Web/1 Click button_Selanjutnya'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToElement(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AturanPermainanFullTambelan/TambelanSimpanCampainQuiz/Page_Bhakti Web/2 Click button_Kirim'), 
    0)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AturanPermainanFullTambelan/TambelanSimpanCampainQuiz/Page_Bhakti Web/2 Click button_Kirim'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AturanPermainanFullTambelan/TambelanSimpanCampainQuiz/Page_Bhakti Web/3 Click button_Yes'))

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('CreateNewCampaignQuiz.PNG')

