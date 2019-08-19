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

Mobile.tap(findTestObject('Home/Portfolio/AddToCart/android.widget.FrameLayout10'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Home/Portfolio/AddToCart/android.widget.LinearLayout10'), 0)

Mobile.tap(findTestObject('Home/Portfolio/AddToCart/android.widget.LinearLayout17'), 0)

Mobile.tap(findTestObject('Home/Portfolio/AddToCart/android.widget.CheckBox0 - Saya telah memahami dan menyetujui isi dari Ketentuan Prospektus dan Fund Sheet produk ini'), 
    0)

Mobile.tap(findTestObject('Home/Portfolio/AddToCart/android.widget.LinearLayout4'), 0)

Mobile.tap(findTestObject('Home/Portfolio/AddToCart/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Home/Portfolio/AddToCart/com.google.android.material.chip.Chip2 - Rp 300.000'), 0)

Mobile.tap(findTestObject('Home/Portfolio/AddToCart/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Home/Portfolio/AddToCart/android.widget.LinearLayout17'), 0)

Mobile.tap(findTestObject('Home/Portfolio/AddToCart/android.widget.CheckBox0 - Saya telah memahami dan menyetujui isi dari Ketentuan Prospektus dan Fund Sheet produk ini'), 
    0)

Mobile.tap(findTestObject('Home/Portfolio/AddToCart/android.widget.LinearLayout4'), 0)

Mobile.tap(findTestObject('Home/Portfolio/AddToCart/com.google.android.material.chip.Chip0 - Rp 100.000'), 0)

Mobile.tap(findTestObject('Home/Portfolio/AddToCart/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Home/Portfolio/AddToCart/android.widget.ImageView0 (1)'), 0)

Mobile.tap(findTestObject('Home/Portfolio/AddToCart/android.widget.FrameLayout11'), 0)

Mobile.closeApplication()

