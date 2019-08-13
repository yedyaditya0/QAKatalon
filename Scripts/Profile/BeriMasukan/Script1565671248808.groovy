import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.acceptAlert()

Mobile.startApplication('/Users/ustore/Downloads/mobile-debug.apk', true)

Mobile.tap(findTestObject('Profile/android.widget.ImageView17'), 0)

Mobile.tap(findTestObject('Profile/android.widget.TextView4 - Beri Masukan'), 0)

Mobile.setText(findTestObject('Profile/android.widget.EditText0 - Nama Lengkap'), 'Aji Kurnia Putra', 0)

Mobile.setText(findTestObject('Profile/android.widget.EditText1 - Email'), 'ajikurniaputra84@gmail.com', 0)

Mobile.setText(findTestObject('Profile/android.widget.EditText2 - Masukan Pesan Anda'), 'tes', 0)

Mobile.tap(findTestObject('Profile/android.widget.Button0 - KIRIM'), 0)

Mobile.closeApplication()

