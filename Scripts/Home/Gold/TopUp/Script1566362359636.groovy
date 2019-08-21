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

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

// Memilih menu portfolio
Mobile.tap(findTestObject('Home/Gold/TopUp/android.widget.FrameLayout10'), 0)

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

// Memilh card Emas pada tab Portfolio
Mobile.tap(findTestObject('Home/Gold/TopUp/CardEmas2'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

// Memilih Button Top Up
Mobile.tap(findTestObject('Home/Gold/TopUp/android.widget.LinearLayout25'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

// Memilih checkbox syarat dan ketentuan
Mobile.tap(findTestObject('Home/Gold/TopUp/android.widget.CheckBox0'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

// Memilih button Lanjutkan
Mobile.tap(findTestObject('Home/Gold/TopUp/android.widget.LinearLayout6'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

// Memilih radio 0.25gr
Mobile.tap(findTestObject('Home/Gold/TopUp/android.widget.RadioButton1 - 0.25 Gram'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

// Memilih button Beli Sekarang
Mobile.tap(findTestObject('Home/Gold/TopUp/android.widget.TextView0 - BELI SEKARANG'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

// Memilih arrow dropdown detail
Mobile.tap(findTestObject('Home/Gold/TopUp/android.widget.ImageView1'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

// Memilih button Virtual Account
Mobile.tap(findTestObject('Home/Gold/TopUp/android.widget.LinearLayout22'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

// Memilih button back
Mobile.tap(findTestObject('Home/Gold/TopUp/android.widget.ImageButton1'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
