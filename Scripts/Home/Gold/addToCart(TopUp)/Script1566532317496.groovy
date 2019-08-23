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
Mobile.tap(findTestObject('Home/Gold/AddToCart/TopUp/android.widget.FrameLayout10'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

// Memilih card Emas
Mobile.tap(findTestObject('Home/Gold/AddToCart/TopUp/android.widget.LinearLayout13'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

// Memilih button Top up
Mobile.tap(findTestObject('Home/Gold/AddToCart/TopUp/android.widget.LinearLayout25'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

// Memilih checkbox
Mobile.tap(findTestObject('Home/Gold/AddToCart/TopUp/android.widget.CheckBox0'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

// Memilih button Lanjutkan
Mobile.tap(findTestObject('Home/Gold/AddToCart/TopUp/android.widget.LinearLayout6'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

// Memilih Rp 300.000
Mobile.tap(findTestObject('Home/Gold/AddToCart/TopUp/com.google.android.material.chip.Chip2 - Rp 300.000'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

// Memilih button add to cart
Mobile.tap(findTestObject('Home/Gold/AddToCart/TopUp/android.widget.LinearLayout3'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

// Memilih button Top Up
Mobile.tap(findTestObject('Home/Gold/AddToCart/TopUp/android.widget.LinearLayout25'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

// Memilih checkbox
Mobile.tap(findTestObject('Home/Gold/AddToCart/TopUp/android.widget.CheckBox0'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

// 
Mobile.tap(findTestObject('Home/Gold/AddToCart/TopUp/android.widget.LinearLayout6'), 0)

Mobile.tap(findTestObject('Home/Gold/AddToCart/TopUp/android.widget.LinearLayout4'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

// Memilih gram 0.1
Mobile.tap(findTestObject('Home/Gold/AddToCart/TopUp/android.widget.RadioButton0 - 0.1 Gram'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

// Memilih Top Up Sekarang
Mobile.tap(findTestObject('Home/Gold/AddToCart/TopUp/android.widget.LinearLayout3'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

// Memilih icon keranjang pada bagian header
Mobile.tap(findTestObject('Home/Gold/AddToCart/TopUp/android.widget.RelativeLayout0'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

