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

WebUI.navigateToUrl('https://secondhand.binaracademy.org/')

WebUI.click(findTestObject('Object Repository/Register/a_Masuk'))

WebUI.click(findTestObject('Object Repository/Register/a_Daftar di sini'))

WebUI.setText(findTestObject('Object Repository/Register/input_Name_username'), 'cobal')

WebUI.setText(findTestObject('Object Repository/Register/input_Email_useremail'), 'kaliaja1@gmail.com')

WebUI.setText(findTestObject('Object Repository/Register/input_Password_userpassword'), 'kali123')

WebUI.click(findTestObject('Object Repository/Register/input_Password_commit'))

WebUI.click(findTestObject('Object Repository/Register/div_Bulan RamadhanBanyak diskon        Disk_1cf6bb'))

WebUI.click(findTestObject('Register spy/button profile'))

WebUI.click(findTestObject('Object Repository/Register/button_Keluar'))

WebUI.closeBrowser()

