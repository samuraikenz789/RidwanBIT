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

WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/SurveyStatistic/Page_Bhakti Web/1a_Reporting'))

WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/SurveyStatistic/Page_Bhakti Web/2a_MD Survey  Attendance'))

WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/SurveyStatistic/Page_Bhakti Web/3a_Survey Statistic'))

WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/SurveyStatistic/Page_Bhakti Web/4button_JAKARTA'))

WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/SurveyStatistic/Page_Bhakti Web/5nb-option_MEDAN'))

WebUI.setText(findTestObject('5.Reporting/1.MD Survey Dan Attendance/SurveyStatistic/Page_Bhakti Web/6StartDateSurveyStatistic'), 
    '01/01/2021')

WebUI.setText(findTestObject('5.Reporting/1.MD Survey Dan Attendance/SurveyStatistic/Page_Bhakti Web/7EndDateSurveyStatistic'), 
    '01/01/2023')

WebUI.setText(findTestObject('5.Reporting/1.MD Survey Dan Attendance/SurveyStatistic/Page_Bhakti Web/8SearchSurvey'), 'survey mishirin')

WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/SurveyStatistic/Page_Bhakti Web/9Clickspan_View Statistik'))

WebUI.delay(2)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('SurveyStaticView.PNG')

WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/SurveyStatistic/Page_Bhakti Web/10Clickspan_Filter Result'))

WebUI.setText(findTestObject('5.Reporting/1.MD Survey Dan Attendance/SurveyStatistic/Page_Bhakti Web/11StartDateFilter'), 
    '01/01/2021')

WebUI.setText(findTestObject('5.Reporting/1.MD Survey Dan Attendance/SurveyStatistic/Page_Bhakti Web/12EndDateFilter'), 
    '01/01/2023')

WebUI.click(findTestObject('5.Reporting/1.MD Survey Dan Attendance/SurveyStatistic/Page_Bhakti Web/13div_Apply Filter'))

WebUI.delay(2)

'Take Photo ada di C:\\Users\\Admin\\Katalon Studio\\New-Mishirin-Website dengan nama sesuai yang di input'
WebUI.takeScreenshot('SurveyStaticViewAfterFilter.PNG')

