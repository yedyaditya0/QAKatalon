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

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

// Klik button Keranjang pada bagian Menu Bar
Mobile.tap(findTestObject('Home/Reksadana/Cart/android.widget.FrameLayout13'), 0)

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

// Klik button Edit pada salah satu card produk reksadana
Mobile.tap(findTestObject('Home/Reksadana/Cart/android.widget.LinearLayout16'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

// Klik button Rp 500.000
Mobile.tap(findTestObject('Home/Reksadana/Cart/com.google.android.material.chip.Chip3 - Rp 500.000'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

// Klik Button Beli Sekarang
Mobile.tap(findTestObject('Home/Reksadana/Cart/android.widget.LinearLayout3 (2)'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

//Mobile.tap(findTestObject('Home/Reksadana/Cart/Button_Edit'), 0)
//
//Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)
//
//Mobile.verifyElementText(findTestObject('Home/Reksadana/Cart/Text-BerapaYangMauKamuBeli'), 'Berapa yang mau kamu beli?')
//
//Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)
//
//Mobile.tap(findTestObject('Home/Reksadana/Rp100'), 0)
//
//Mobile.tap(findTestObject('Home/Reksadana/Cart/Button_Simpan'), 0)
//
//Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
//
