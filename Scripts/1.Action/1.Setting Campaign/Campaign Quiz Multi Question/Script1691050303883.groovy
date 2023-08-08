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
    'QuizAutoKod18')

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

'dari sini kebawah --------------------------------------------------'
WebUI.delay(0)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/TestObject/Page_Bhakti Web/1 c button_Tambah Periode 2'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToElement(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/TestObject/Page_Bhakti Web/2 C button_Pilih Tipe Quiz'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/TestObject/Page_Bhakti Web/3C nb-option_Quiz Regular'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/TestObject/Page_Bhakti Web/4ST START DATE'), 
    '01/01/2023', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/TestObject/Page_Bhakti Web/4ST START DATE'), 
    Keys.chord(Keys.TAB), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/TestObject/Page_Bhakti Web/4ST START DATE'), 
    '120010', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/TestObject/Page_Bhakti Web/5ST END DATE'), 
    '12/12/2023', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/TestObject/Page_Bhakti Web/5ST END DATE'), 
    Keys.chord(Keys.TAB), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/TestObject/Page_Bhakti Web/5ST END DATE'), 
    '120010', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(20)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/PeriodeFix/Page_Bhakti Web/3C button_Selanjutnya'))

'dari sini keatas --------------------------------------------------\r\n'
WebUI.delay(0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/33 Click a_Periode 1'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/1Click button_Add Question'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/2Clic div_Multi choice'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/3 ST PERTANYAAN 1'), 
    ' Sebutkan 3 jenis garansi yang RINNAI berikan?', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/4 ST ANSWER 1'), 
    'Untuk semua produk, garansi suku cadang selama 1 tahun. Selama 3 tahun, bebas jasa servis.', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/5 ST ANSWER 2'), 
    '3 tahun garansi servis gratis', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/6 ST ANSWER 3'), 
    '5 tahun garansi khusus katup gas', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/7ST ANSWER 4'), 
    'Khusus produk pemanas air listrik, garansi inner tank 5 tahun. Bila ada kebocoran inner tank, diganti dengan unit baru', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/8 ADD MORE ANSWER'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/9 ST ANSWER 5'), 
    'Produk Rinnai tidak memberikan garansi', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/10 C ANSWER 1 AS TRUE'), 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'file_upload.FileUpload.uploadFile'(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/11 UP IMAGE'), 
    'C:\\Users\\Admin\\Desktop\\1QA Dokumentasi\\Auto Image\\Garansi.jpg')

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/Advance01/Page_Bhakti Web/99 Scrol To Setiap Add New Question'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/12 C button_Add Question'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/13 C div_Multi choice'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/14 ST PERTANYAAN 2'), 
    '7jenis api yang dimiliki oleh kompor gas RINNAI ', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/15 ST ANSWER 1'), 
    'Inner Flame', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/16 ST ANSWER 2'), 
    '1. Inner Flame2. Api Turbo3. Api Tornado4. Sun Burner5. Api Dragon6. Api Besar7. Api Ekonomis', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/17 ST ANSWER 3'), 
    'Api Ekonomis', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/18 ST ANSWER 4'), 
    'Api Besar', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/19 C button_Add Option'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/20 ST ANSWER 5'), 
    'Sun Burner', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/21 C ANSWER 2 AS TRUE'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/Advance01/Page_Bhakti Web/99 Scrol To Setiap Add New Question'), 
    0, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'file_upload.FileUpload.uploadFile'(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/22 UP FILE AUDIO'), 
    'C:\\Users\\Admin\\Desktop\\1QA Dokumentasi\\Auto Image\\StoveSound.mp3')

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/Advance01/Page_Bhakti Web/99 Scrol To Setiap Add New Question'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/23 C button_Add Question'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/24 C div_Multi choice'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/25 ST PERTANYAAN 3'), 
    'Sebutkan semuah Jenis Produk Rinnai', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/26 ST ANSWER 1'), 
    'COOKER HOOD', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/27 ST ANSWER 2'), 
    'HOT WATER SOLUTION', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/28 ST ANSWER 3'), 
    'BUILD IN HOB, COOKER HOOD, HOT WATER SOLUTION, GAS STOVE, REGULATOR', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/29 ST ANSWER 4'), 
    'GAS STOVE', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/30 C ADD QUESTION 5'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/31 ST ANSWER 5'), 
    'REGULATOR', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/32 C ANSWER 3 AS TRUE'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/Advance01/Page_Bhakti Web/99 Scrol To Setiap Add New Question'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/33 CLICK div_Video'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/34 ST LINK VIDEO'), 
    'https://www.youtube.com/watch?v=gPEriWECkB8', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/35 C button_Search'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/36 ST START TIME'), 
    '0:00', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/37 ST END TIME'), 
    '1:00', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/38 C UPLOAD VIDEO'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/Advance01/Page_Bhakti Web/99 Scrol To Setiap Add New Question'), 
    0)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/39C  button_Add Question'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/40 C div_Multi choice'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/41 ST PERTANYAAN 4'), 
    'Sebutkan Jenis Produk Miyako', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/42 ST ANSWER 1'), 
    'Kompor', FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'file_upload.FileUpload.uploadFile'(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/42.1 UPLOAD ANSWER 1 IMAGE'), 
    'C:\\Users\\Admin\\Desktop\\1QA Dokumentasi\\Auto Image\\kompor.jpg')

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/43 ST ANSWER 2'), 
    'Kipas Angin', FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'file_upload.FileUpload.uploadFile'(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/43.1 UPLOAD ANSWER 2 IMAGE'), 
    'C:\\Users\\Admin\\Desktop\\1QA Dokumentasi\\Auto Image\\kipasangin.jpg')

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/44 ST ANSWER 3'), 
    'Dispenser', FailureHandling.STOP_ON_FAILURE)

'd'
CustomKeywords.'file_upload.FileUpload.uploadFile'(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/44.1 UPLOAD ANSWER 3 IMAGE'), 
    'C:\\Users\\Admin\\Desktop\\1QA Dokumentasi\\Auto Image\\dispenser.jpeg')

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/45 ST ANSWER 4'), 
    'Kipas Angin, Dispenser, Blender, Mixer, Setrika, Kompor', FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'file_upload.FileUpload.uploadFile'(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/45.1 UPLOAD ANSWER 4 IMAGE'), 
    'C:\\Users\\Admin\\Desktop\\1QA Dokumentasi\\Auto Image\\miyako.png')

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/46 C button_Add Option'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/47 ST ANSWER 5'), 
    'Blender', FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'file_upload.FileUpload.uploadFile'(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/47.1 UPLOAD ANSWER 5 IMAGE'), 
    'C:\\Users\\Admin\\Desktop\\1QA Dokumentasi\\Auto Image\\blender.jpg')

WebUI.scrollToElement(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/48 C ANSWER 4 AS TRUE'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/48 C ANSWER 4 AS TRUE'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/Advance01/Page_Bhakti Web/99 Scrol To Setiap Add New Question'), 
    0)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/49 C button_Add Question'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/50 ST QUESTION 5'), 
    'Question 5', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/51 ST ANSWER 1'), 
    'Answer 1', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/52 ST ANSWER 2'), 
    'Answer 2', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/53 ST ANSWER 3'), 
    'Answer 3', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/54 ST ANSWER 4'), 
    'Answer 4', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/55 C ADD ANSWER 5'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/56 ST ANSWER 5'), 
    'Answer 5', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/57 C ANSWER 5 AS TRUE'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/Advance01/Page_Bhakti Web/99 Scrol To Setiap Add New Question'), 
    0)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/58 C button_Add Question'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/59 C div_Multi choice'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/60ST QUESTION 6'), 
    'Question 6', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/61 C DELETE ANSWER 4'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/62 C DELETE ANSWER 3'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/63 C DELETE ANSWER 2'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/64 C DELETE ANSWER 1'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/65 C button_Add Option'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/66 ST ANSWER 1'), 
    'Answer 1', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AdvanceQuiz (Multi-Match)/1.Multi/Page_Bhakti Web/67 C ANSWER 1 AS TRUE'), 
    FailureHandling.STOP_ON_FAILURE)

'DARI SINI KEATAS -------------------------------------------------'
WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5555)

'preview cuman sendkey esc gk mau\r\n'
not_run: WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/46 CLick button_Preview'), 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.sendKeys(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/47 Click Leave Preview Quiz'), 
    Keys.chord(Keys.ESCAPE), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.sendKeys(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/47 Click Leave Preview Quiz'), 
    Keys.chord(Keys.ESCAPE), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/48 Click button_Selanjutnya'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/48 Click button_Selanjutnya'), 
    Keys.chord(Keys.PAGE_UP), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.scrollToElement(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/TambelanQuiz/TambelanQuizV2/Page_Bhakti Web/2Scroll to nb-card-header_Jenis Program Campaign Program Campaign Quiz'), 
    0, FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/Page_Bhakti Web/49 Scroll Click a_Aturan Permainan'), 
    FailureHandling.STOP_ON_FAILURE)

'dari sini ke bawah\r\n'
WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/TambelanQuiz/TambelanQuizV2/Page_Bhakti Web/a_Aturan Permainan'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/TambelanQuiz/TambelanQuizV2/Page_Bhakti Web/2Click Radio Button Aturan Option Peserta wajib mengikuti'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AturanPermainanFullTambelan/Page_Bhakti Web/1Click button_Masukkan Jumlah Periode'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AturanPermainanFullTambelan/Page_Bhakti Web/2Click nb-option_1'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/TambelanQuiz/TambelanQuizV2/Page_Bhakti Web/5ST Periode 1 Nilai Reward'), 
    '100', FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/TambelanQuiz/TambelanQuizV2/Page_Bhakti Web/a_Aturan Permainan'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.focus(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AturanPermainanFullTambelan/Page_Bhakti Web/3Click button_Pilih Wallet'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AturanPermainanFullTambelan/Page_Bhakti Web/3Click button_Pilih Wallet'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AturanPermainanFullTambelan/Page_Bhakti Web/4Click nb-option_Wallet Rupiah MSR'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AturanPermainanFullTambelan/Page_Bhakti Web/5Click button_Jawaban Benar untuk mendapatkan reward'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AturanPermainanFullTambelan/Page_Bhakti Web/6Click nb-option_1'), 
    FailureHandling.STOP_ON_FAILURE)

'sini done\r\n\r\n'
WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/TambelanQuiz/TambelanQuizV2/Page_Bhakti Web/9Scroll To Opsi Peserta akan Mendapatkan Reward'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/TambelanQuiz/TambelanQuizV2/Page_Bhakti Web/10Click Checkbox Setting F'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AturanPermainanFullTambelan/Page_Bhakti Web/7 CLick button_Pilih Wallet'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AturanPermainanFullTambelan/Page_Bhakti Web/8 Click nb-option_Wallet Rupiah MSR'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AturanPermainanFullTambelan/SettingF Option Select/Page_Bhakti Web/Click Setting F Pilih Reward Tiap Soal Sama'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AturanPermainanFullTambelan/SettingF Option Select/Page_Bhakti Web/Click Setting F Pilih Reward Tiap Soal Berbeda'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/TambelanQuiz/Campaign Quiz AturanPermainan/AturanTambelV2/Page_Bhakti Web/6ST Reward Soal 1'), 
    '150', FailureHandling.STOP_ON_FAILURE)

'sini\r\n'
WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/TambelanQuiz/TambelanQuizV2/Page_Bhakti Web/15Scroll to h6_Setting G Aturan Bonus Reward Berdasarkan Periode'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/TambelanQuiz/TambelanQuizV2/Page_Bhakti Web/16Click  Checkbox Setting G'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AturanPermainanFullTambelan/Page_Bhakti Web/9Click button_Masukkan Jumlah Periode'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AturanPermainanFullTambelan/Page_Bhakti Web/10Click nb-option_1'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/TambelanQuiz/TambelanQuizV2/Page_Bhakti Web/19 ST Jumlah Bonus'), 
    '100', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AturanPermainanFullTambelan/Page_Bhakti Web/11 Click button_Pilih Wallet'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AturanPermainanFullTambelan/Page_Bhakti Web/12 Click nb-option_Wallet Rupiah MSR'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AturanPermainanFullTambelan/TambelanSimpanCampainQuiz/Page_Bhakti Web/1 Click button_Selanjutnya'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AturanPermainanFullTambelan/TambelanSimpanCampainQuiz/Page_Bhakti Web/1 Click button_Selanjutnya'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AturanPermainanFullTambelan/TambelanSimpanCampainQuiz/Page_Bhakti Web/2 Click button_Kirim'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AturanPermainanFullTambelan/TambelanSimpanCampainQuiz/Page_Bhakti Web/2 Click button_Kirim'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/AturanPermainanFullTambelan/TambelanSimpanCampainQuiz/Page_Bhakti Web/3 Click button_Yes'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('CreateNewCampaignQuiz.PNG', FailureHandling.STOP_ON_FAILURE)

