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

WebUI.delay(7)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Page_Bhakti Web/1Click a_Action'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Setting Campaign Search-Lock-Delete Campaign/Page_Bhakti Web/2Click a_Setting Campaign'))

WebUI.delay(1)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/TambelanQuiz/TambelanQuizV2/Page_Bhakti Web/Click p_QuizAutoName08'))

WebUI.delay(1)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/TambelanQuiz/TambelanQuizV2/Page_Bhakti Web/a_Aturan Permainan'))

WebUI.delay(1)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/TambelanQuiz/TambelanQuizV2/Page_Bhakti Web/2Click Radio Button Aturan Option Peserta wajib mengikuti'))

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/TambelanQuiz/Page_Bhakti Web/91 Click button_Masukkan Jumlah Periode'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/TambelanQuiz/Page_Bhakti Web/92 Click nb-option_1'))

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/TambelanQuiz/TambelanQuizV2/Page_Bhakti Web/5ST Periode 1 Nilai Reward'), 
    '100')

WebUI.scrollToElement(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/TambelanQuiz/TambelanQuizV2/Page_Bhakti Web/a_Aturan Permainan'), 
    0)

WebUI.delay(1)

WebUI.focus(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/TambelanQuiz/Campaign Quiz AturanPermainan/AturanTambelV2/Page_Bhakti Web/CLick button_Pilih Wallet'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/TambelanQuiz/Campaign Quiz AturanPermainan/AturanTambelV2/Tam1/Page_Bhakti Web/1 Click button_Pilih Wallet'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/TambelanQuiz/Campaign Quiz AturanPermainan/AturanTambelV2/Tam1/Page_Bhakti Web/2CLick nb-option_Wallet Rupiah MSR'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/TambelanQuiz/Campaign Quiz AturanPermainan/AturanTambelV2/Page_Bhakti Web/2Click button_Jawaban Benar untuk'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/TambelanQuiz/Campaign Quiz AturanPermainan/AturanTambelV2/Page_Bhakti Web/3Click nb-option_1'), 
    FailureHandling.STOP_ON_FAILURE)

'sini done\r\n\r\n'
WebUI.delay(2)

WebUI.scrollToElement(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/TambelanQuiz/TambelanQuizV2/Page_Bhakti Web/9Scroll To Opsi Peserta akan Mendapatkan Reward'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/TambelanQuiz/TambelanQuizV2/Page_Bhakti Web/10Click Checkbox Setting F'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/TambelanQuiz/Campaign Quiz AturanPermainan/AturanTambelV2/Page_Bhakti Web/CLick button_Pilih Wallet'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/TambelanQuiz/Campaign Quiz AturanPermainan/AturanTambelV2/Page_Bhakti Web/5Click nb-option_Wallet Rupiah MSR'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/TambelanQuiz/Campaign Quiz AturanPermainan/AturanTambelV2/Page_Bhakti Web/6ST Reward Soal 1'), 
    '100', FailureHandling.CONTINUE_ON_FAILURE)

'sini\r\n'
WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToElement(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/TambelanQuiz/TambelanQuizV2/Page_Bhakti Web/15Scroll to h6_Setting G Aturan Bonus Reward Berdasarkan Periode'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/TambelanQuiz/TambelanQuizV2/Page_Bhakti Web/16Click  Checkbox Setting G'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/TambelanQuiz/TambelanQuizV2/Page_Bhakti Web/17Click button_Masukkan Jumlah Periode'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/TambelanQuiz/TambelanQuizV2/Page_Bhakti Web/18Click nb-option_1'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/TambelanQuiz/TambelanQuizV2/Page_Bhakti Web/19 ST Jumlah Bonus'), 
    '100', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/TambelanQuiz/TambelanQuizV2/Page_Bhakti Web/20Click button_Pilih Wallet'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/TambelanQuiz/TambelanQuizV2/Page_Bhakti Web/21 Click nb-option_Wallet Rupiah MSR'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5555, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/TambelanQuiz/TambelanQuizV2/Page_Bhakti Web/22 Click button_Selanjutnya'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToElement(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/TambelanQuiz/TambelanQuizV2/Page_Bhakti Web/23 Scroll Click button_Kirim'), 
    0)

WebUI.delay(5555)

WebUI.click(findTestObject('1.Action/1.Setting Campaign/Create New Program Campaign Quiz/TambelanQuiz/TambelanQuizV2/Page_Bhakti Web/24 Click button_Yes'))

