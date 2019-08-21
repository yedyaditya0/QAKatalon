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


// Memilih menu Emas
Mobile.tap(findTestObject('Home/Gold/AddToCart/android.widget.LinearLayout15'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

//Mobile.tap(findTestObject('Home/Gold/AddToCart/android.widget.LinearLayout20'), 0)

// Memilih button add to cart
Mobile.tap(findTestObject('Home/Gold/AddToCart/Cart1'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

// Memilih button lanjutkan ketika checkbox syarat dan ketentuan belum ceklis
Mobile.tap(findTestObject('Home/Gold/AddToCart/android.widget.LinearLayout6'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

// Memilih checkbox syarat dan ketentuan
Mobile.tap(findTestObject('Home/Gold/AddToCart/android.widget.CheckBox0'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

// Memilih button lanjutkan
Mobile.tap(findTestObject('Home/Gold/AddToCart/android.widget.LinearLayout6 (1)'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

// Memilih buble card Rp 200.000
Mobile.tap(findTestObject('Home/Gold/AddToCart/com.google.android.material.chip.Chip1 - Rp 200.000'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

// Memilih buble card 0.1Gram
Mobile.tap(findTestObject('Home/Gold/AddToCart/android.widget.RadioButton0 - 0.1 Gram'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

// Memilih button add to cart
Mobile.tap(findTestObject('Home/Gold/AddToCart/android.widget.LinearLayout1'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

// Memilih icon keranjang pada bagian header
Mobile.tap(findTestObject('Home/Gold/AddToCart/android.widget.RelativeLayout1'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
