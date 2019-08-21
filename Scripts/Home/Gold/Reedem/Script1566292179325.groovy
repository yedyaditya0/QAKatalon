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


// Memilih menu portfolio pada bottom navigation 
Mobile.tap(findTestObject('Home/Gold/Reedem/android.widget.FrameLayout10'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

// Memilih card emas pada tab portfolio
Mobile.tap(findTestObject('Home/Gold/Reedem/CardGold2'), 0)

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

// Memilih button Jual
Mobile.tap(findTestObject('Home/Gold/Reedem/android.widget.LinearLayout26'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

// Memilih buble Rupiah Rp 300.000
Mobile.tap(findTestObject('Home/Gold/Reedem/com.google.android.material.chip.Chip2 - Rp 300.000'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

// Memilih Button Jual Sekarang
Mobile.tap(findTestObject('Home/Gold/Reedem/android.widget.TextView0 - JUAL SEKARANG'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

// Memilih Button Konfirmasi
Mobile.tap(findTestObject('Home/Gold/Reedem/android.widget.TextView16 - KONFIRMASI'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

// Pressback function
Mobile.pressBack()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

// Memilih button Back
Mobile.tap(findTestObject('Home/Gold/Reedem/android.widget.ImageView0'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
