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

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/1.Verifikasi Peserta Baru/1.Verifikasi Peserta Baru/Page_Bhakti Web/1Clicka_Administration'))

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/1.Verifikasi Peserta Baru/1.Verifikasi Peserta Baru/Page_Bhakti Web/2Clicka_Verifikasi Peserta'))

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Tunggu Revisi dari Peserta Baru/Page_Bhakti Web/1Clicka_Tunggu Revisi dari Peserta Baru (4)'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/3.Administration/2.Verifikasi Peserta/2.Tunggu Revisi dari Peserta Baru/Tunggu Revisi Dari Peserta Baru View-Verified/Page_Bhakti Web/rect'))

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Tunggu Revisi dari Peserta Baru/Verifikasi Peserta (All Request Revisi)/Page_Bhakti Web/1Click Checkbox Permintaan Revisi'))

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Tunggu Revisi dari Peserta Baru/Verifikasi Peserta (All Request Revisi)/Page_Bhakti Web/2Revisi Email'))

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Tunggu Revisi dari Peserta Baru/Verifikasi Peserta (All Request Revisi)/Page_Bhakti Web/3 Revisi No HP'))

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Tunggu Revisi dari Peserta Baru/Verifikasi Peserta (All Request Revisi)/Page_Bhakti Web/4 Revisi No Whatsapp'))

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Tunggu Revisi dari Peserta Baru/Verifikasi Peserta (All Request Revisi)/Page_Bhakti Web/5 Revisi No Telp Toko'))

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Tunggu Revisi dari Peserta Baru/Verifikasi Peserta (All Request Revisi)/Page_Bhakti Web/6 Revisi Provinsi'))

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Tunggu Revisi dari Peserta Baru/Verifikasi Peserta (All Request Revisi)/Page_Bhakti Web/7 Revisi Kabupaten'))

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Tunggu Revisi dari Peserta Baru/Verifikasi Peserta (All Request Revisi)/Page_Bhakti Web/8 Revisi Alamat Toko'))

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Tunggu Revisi dari Peserta Baru/Verifikasi Peserta (All Request Revisi)/Page_Bhakti Web/9 Revisi Foto Toko 1'))

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Tunggu Revisi dari Peserta Baru/Verifikasi Peserta (All Request Revisi)/Page_Bhakti Web/10 Revisi Foto Toko 2'))

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Tunggu Revisi dari Peserta Baru/Verifikasi Peserta (All Request Revisi)/Page_Bhakti Web/11 Revisi Perorangan atau Badan Usaha'))

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Tunggu Revisi dari Peserta Baru/Verifikasi Peserta (All Request Revisi)/Page_Bhakti Web/12 Revisi Nama Lengkap'))

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Tunggu Revisi dari Peserta Baru/Verifikasi Peserta (All Request Revisi)/Page_Bhakti Web/13 Revisi Nomor KTP'))

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Tunggu Revisi dari Peserta Baru/Verifikasi Peserta (All Request Revisi)/Page_Bhakti Web/14 Revisi Foto KTP'))

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Tunggu Revisi dari Peserta Baru/Verifikasi Peserta (All Request Revisi)/Page_Bhakti Web/15 Revisi Nama Bank'))

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Tunggu Revisi dari Peserta Baru/Verifikasi Peserta (All Request Revisi)/Page_Bhakti Web/16 Revisi Cabang Bank'))

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Tunggu Revisi dari Peserta Baru/Verifikasi Peserta (All Request Revisi)/Page_Bhakti Web/17 Revisi No Rekening'))

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Tunggu Revisi dari Peserta Baru/Verifikasi Peserta (All Request Revisi)/Page_Bhakti Web/18 Revisi Foto Rek'))

WebUI.setText(findTestObject('3.Administration/2.Verifikasi Peserta/2.Tunggu Revisi dari Peserta Baru/Verifikasi Peserta (All Request Revisi)/Page_Bhakti Web/19 ST Pesan Revisi Data Toko'), 
    'Harap Segera Revisi Data Toko')

WebUI.setText(findTestObject('3.Administration/2.Verifikasi Peserta/2.Tunggu Revisi dari Peserta Baru/Verifikasi Peserta (All Request Revisi)/Page_Bhakti Web/20 ST Pesan Revisi Data Status Usaha'), 
    'Harap Segera Revisi Data Status Usaha')

WebUI.setText(findTestObject('3.Administration/2.Verifikasi Peserta/2.Tunggu Revisi dari Peserta Baru/Verifikasi Peserta (All Request Revisi)/Page_Bhakti Web/21 ST Pesan Revisi Data Bank'), 
    'Harap Segera Revisi Data Bank')

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Tunggu Revisi dari Peserta Baru/Verifikasi Peserta (All Request Revisi)/Page_Bhakti Web/22 Click button_Kirim Revisi'))

WebUI.delay(55555)

WebUI.click(findTestObject('3.Administration/2.Verifikasi Peserta/2.Tunggu Revisi dari Peserta Baru/Verifikasi Peserta (All Request Revisi)/Page_Bhakti Web/23 CLick button_Yes'))

