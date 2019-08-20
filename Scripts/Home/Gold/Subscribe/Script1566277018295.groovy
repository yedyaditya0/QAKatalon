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



// Memilih menu gold pada halaman Home
Mobile.tap(findTestObject('Home/Gold/Subscribe/android.widget.ImageView6'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

// Memilih button Beli
Mobile.tap(findTestObject('Home/Gold/Subscribe/android.widget.TextView23 - BELI'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

// Memilih link ketentuan pada bottom sheet Syarat dan ketentuan
Mobile.tap(findTestObject('Home/Gold/Subscribe/android.widget.TextView2 - ketentuan'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

// Button Back
Mobile.tap(findTestObject('Home/Gold/Subscribe/android.widget.ImageButton0'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

// Memilih checkbox pada syartum gold
Mobile.tap(findTestObject('Home/Gold/Subscribe/android.widget.CheckBox0'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

// Memilih button Lanjutkan
Mobile.tap(findTestObject('Home/Gold/Subscribe/android.widget.LinearLayout6'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

// Memilih tap dalam Gram
Mobile.tap(findTestObject('Home/Gold/Subscribe/android.widget.CompoundButton1 - Beli Dalam Gram'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

// Memilih tap dalam Rupiah
Mobile.tap(findTestObject('Home/Gold/Subscribe/android.widget.CompoundButton0 - Beli Dalam Rupiah'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

// Memilih buble Rupiah 300.000
Mobile.tap(findTestObject('Home/Gold/Subscribe/com.google.android.material.chip.Chip2 - Rp 300.000'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

// Memilih buble Gram 0.25g
Mobile.tap(findTestObject('Home/Gold/Subscribe/android.widget.RadioButton1 - 0.25 Gram'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

// Memilih button Beli
Mobile.tap(findTestObject('Home/Gold/Subscribe/android.widget.LinearLayout1'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

// Memilih arrow dropdown detail
Mobile.tap(findTestObject('Home/Gold/Subscribe/android.widget.ImageView1'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

// Memilih button Virtual Account
Mobile.tap(findTestObject('Home/Gold/Subscribe/android.widget.LinearLayout22'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)


