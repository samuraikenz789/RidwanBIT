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

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/1Clicka_Administration'))

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/2Clicka_User Wallet Management'))

'A-Z'
WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/3Click OB th_Nama'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('NamaOBA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/3Click OB th_Nama'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('NamaOBZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/4Click OB th_Status Peserta'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('StatusPesertaOBA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/4Click OB th_Status Peserta'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('StatusPesertaOBZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/5Click OB th_No. Telepon'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('NoTelponOB1-100.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/5Click OB th_No. Telepon'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('NoTelponOB100-1.PNG')

'Delay\r\n'
WebUI.delay(2)

'A-Z'
WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/6Click OB th_Email'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('EmailOBA-Z.PNG')

'Delay\r\n'
WebUI.delay(2)

'Z-A\r\n'
WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/6Click OB th_Email'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('EmailOBZ-A.PNG')

'Delay\r\n'
WebUI.delay(2)

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/7Click button_Search with'))

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/option_Email'))

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/Click Label Setelah Pilih Opsi Browse Data User'))

WebUI.setText(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/ST input_Email_filter-email'), 'wijayadell789@gmail.com')

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/111 Reuse button_Go setelah set text'))

WebUI.delay(2)

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/7Click button_Search with'))

WebUI.delay(2)

WebUI.focus(findTestObject('3.Administration/6.User Wallet Management/Tambelan Wallet/Page_Bhakti Web/nb-option_Nama Toko'))

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Tambelan Wallet/Page_Bhakti Web/nb-option_Nama Toko'))

WebUI.delay(2)

WebUI.focus(findTestObject('3.Administration/6.User Wallet Management/Tambelan Wallet/Page_Bhakti Web/nb-option_No HP'))

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Tambelan Wallet/Page_Bhakti Web/nb-option_No HP'))

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/Click Label Setelah Pilih Opsi Browse Data User'))

WebUI.setText(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/ST input_No HP, Nama Toko_filter-no_hp'), 
    '081394338831')

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/111 Reuse button_Go setelah set text'))

WebUI.delay(0)

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/7Click button_Search with'))

WebUI.delay(2)

WebUI.focus(findTestObject('3.Administration/6.User Wallet Management/Tambelan Wallet/tambelanyg bener/Page_Bhakti Web/nb-option_No HP'))

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Tambelan Wallet/tambelanyg bener/Page_Bhakti Web/nb-option_No HP'))

WebUI.delay(2)

WebUI.focus(findTestObject('3.Administration/6.User Wallet Management/Tambelan Wallet/tambelanyg bener/Page_Bhakti Web/nb-option_Nama Toko'))

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Tambelan Wallet/tambelanyg bener/Page_Bhakti Web/nb-option_Nama Toko'))

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/Click Label Setelah Pilih Opsi Browse Data User'))

WebUI.setText(findTestObject('3.Administration/6.User Wallet Management/Tambelan Wallet/Page_Bhakti Web/input_Nama Toko_filter-nama_toko'), 
    'ridwan')

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Page_Bhakti Web/111 Reuse button_Go setelah set text'))

WebUI.delay(5)

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Tambelan Wallet/tambelanbutton/Page_Bhakti Web/button_Cek Wallet'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/3.Administration/6.User Wallet Management/User Wallet Management Suspend Wallet/Page_Bhakti Web/button_Wallet Point MSR'))

WebUI.delay(3)

WebUI.focus(findTestObject('Object Repository/3.Administration/6.User Wallet Management/User Wallet Management Suspend Wallet/Page_Bhakti Web/nb-option_TCNew'))

WebUI.click(findTestObject('Object Repository/3.Administration/6.User Wallet Management/User Wallet Management Suspend Wallet/Page_Bhakti Web/nb-option_TCNew'))

WebUI.focus(findTestObject('Object Repository/3.Administration/6.User Wallet Management/User Wallet Management Suspend Wallet/Page_Bhakti Web/circle'))

WebUI.click(findTestObject('Object Repository/3.Administration/6.User Wallet Management/User Wallet Management Suspend Wallet/Page_Bhakti Web/circle'))

WebUI.delay(1)

WebUI.focus(findTestObject('Object Repository/3.Administration/6.User Wallet Management/User Wallet Management Suspend Wallet/Page_Bhakti Web/div_Suspend Wallet'))

WebUI.click(findTestObject('Object Repository/3.Administration/6.User Wallet Management/User Wallet Management Suspend Wallet/Page_Bhakti Web/div_Suspend Wallet'))

WebUI.setText(findTestObject('3.Administration/6.User Wallet Management/Tambelan Wallet/Page_Bhakti Web/1 ST Alasan membukan wallet'), 
    'Testing')

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Tambelan Wallet/Page_Bhakti Web/2Click button_Yes'))

WebUI.delay(3)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('SuspendWallet.PNG')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/3.Administration/6.User Wallet Management/SuspendWallet/Page_Bhakti Web/circle'))

WebUI.click(findTestObject('Object Repository/3.Administration/6.User Wallet Management/SuspendWallet/Page_Bhakti Web/div_Unsuspend Wallet'))

WebUI.click(findTestObject('Object Repository/3.Administration/6.User Wallet Management/SuspendWallet/Page_Bhakti Web/button_Yes'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('Un-SuspendWallet.PNG')

'tambah disini\r\n'
WebUI.delay(0)

WebUI.click(findTestObject('Object Repository/3.Administration/6.User Wallet Management/Tambelan Wallet/TambelanV2/Page_Bhakti Web/button_tc'))

WebUI.click(findTestObject('Object Repository/3.Administration/6.User Wallet Management/Tambelan Wallet/TambelanV2/Page_Bhakti Web/nb-option_Wallet Point MSR'))

'atas udh aman'
WebUI.delay(0)

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Tambelan Wallet/Wallet TambahKurang Saldo/Page_Bhakti Web/1Click Tambah Transaksi'))

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Tambelan Wallet/Wallet TambahKurang Saldo/Page_Bhakti Web/2.Click button_-- Pilih Tipe Transaksi --'))

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Tambelan Wallet/Wallet TambahKurang Saldo/Page_Bhakti Web/3Click option_Adjustment'))

WebUI.setText(findTestObject('3.Administration/6.User Wallet Management/Tambelan Wallet/Wallet TambahKurang Saldo/Page_Bhakti Web/4ST Notes'), 
    'Adjustment Transaksi')

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Tambelan Wallet/WalletSelectPlusMinus/Page_Bhakti Web/button_-'))

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Tambelan Wallet/Wallet TambahKurang Saldo/Page_Bhakti Web/5.1Click Nominal Plus'))

WebUI.setText(findTestObject('3.Administration/6.User Wallet Management/Tambelan Wallet/Wallet TambahKurang Saldo/Page_Bhakti Web/7ST Nominal Transaksi'), 
    '1')

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Tambelan Wallet/Wallet TambahKurang Saldo/Page_Bhakti Web/8 Click button_Input'))

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/Tambelan Wallet/Wallet TambahKurang Saldo/Page_Bhakti Web/9 Click button_Iya'))

WebUI.delay(2)

'dari bawah pindah ke detial transaksi\r\n'
WebUI.delay(0)

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/User Wallet Management (Suspend-Search-Excel)/Page_Bhakti Web/4Click a_Detail Transaksi'))

WebUI.setText(findTestObject('3.Administration/6.User Wallet Management/User Wallet Management (Suspend-Search-Excel)/Page_Bhakti Web/5ST Start Date'), 
    '01/01/2023')

WebUI.setText(findTestObject('3.Administration/6.User Wallet Management/User Wallet Management (Suspend-Search-Excel)/Page_Bhakti Web/6 ST End Date'), 
    '12/12/2023')

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/User Wallet Management (Suspend-Search-Excel)/Page_Bhakti Web/7 Click button_Apply Date'))

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/User Wallet Management (Suspend-Search-Excel)/Page_Bhakti Web/8Click button_Export to Excel'))

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('DetailTransaksiExcelDownload.PNG')

WebUI.delay(2)

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/User Wallet Management (Suspend-Search-Excel)/Page_Bhakti Web/9Click button_All'))

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/User Wallet Management (Suspend-Search-Excel)/Page_Bhakti Web/10 Click nb-option_Nomor Transaksi'))

WebUI.setText(findTestObject('3.Administration/6.User Wallet Management/User Wallet Management (Suspend-Search-Excel)/Page_Bhakti Web/99 ST Nomor Transaksi, Tipe Transaksi, Total Trans'), 
    'RI-4RSPN | 6228297255 | 02A9Z0')

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('NomorTransaksiHasilSearch1.PNG')

WebUI.delay(2)

WebUI.setText(findTestObject('3.Administration/6.User Wallet Management/User Wallet Management (Suspend-Search-Excel)/Page_Bhakti Web/99 ST Nomor Transaksi, Tipe Transaksi, Total Trans'), 
    'MCM-512C SBC | 8361139864 | 0CF2XX')

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('NomorTransaksiHasilSearch2.PNG')

WebUI.delay(2)

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/User Wallet Management (Suspend-Search-Excel)/Page_Bhakti Web/9Click button_All'))

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/User Wallet Management (Suspend-Search-Excel)/Page_Bhakti Web/11 Tipe Transaksi'))

WebUI.setText(findTestObject('3.Administration/6.User Wallet Management/User Wallet Management (Suspend-Search-Excel)/Page_Bhakti Web/99 ST Nomor Transaksi, Tipe Transaksi, Total Trans'), 
    'Redeem')

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('TipeTransaksiHasilSearch1.PNG')

WebUI.delay(2)

WebUI.setText(findTestObject('3.Administration/6.User Wallet Management/User Wallet Management (Suspend-Search-Excel)/Page_Bhakti Web/99 ST Nomor Transaksi, Tipe Transaksi, Total Trans'), 
    'Refund')

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('TipeTransaksiHasilSearch2.PNG')

WebUI.delay(2)

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/User Wallet Management (Suspend-Search-Excel)/Page_Bhakti Web/9Click button_All'))

WebUI.click(findTestObject('3.Administration/6.User Wallet Management/User Wallet Management (Suspend-Search-Excel)/Page_Bhakti Web/12 Total Transaksi'))

WebUI.setText(findTestObject('3.Administration/6.User Wallet Management/User Wallet Management (Suspend-Search-Excel)/Page_Bhakti Web/99 ST Nomor Transaksi, Tipe Transaksi, Total Trans'), 
    '50')

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('TotalTransaksiHasilSearch1.PNG')

WebUI.delay(2)

WebUI.setText(findTestObject('3.Administration/6.User Wallet Management/User Wallet Management (Suspend-Search-Excel)/Page_Bhakti Web/99 ST Nomor Transaksi, Tipe Transaksi, Total Trans'), 
    '30')

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('TotalTransaksiHasilSearch2.PNG')

WebUI.delay(2)

