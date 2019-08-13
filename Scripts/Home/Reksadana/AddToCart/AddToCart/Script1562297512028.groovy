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

// Memilih menu Reksadana
Mobile.tap(findTestObject('Home/Reksadana/Cart/android.widget.ImageView5'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

// Memilih button Update Risk Profil
Mobile.tap(findTestObject('Home/Reksadana/Cart/android.widget.TextView4 - Update'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

// Memilih Risk Profil Moderat
Mobile.tap(findTestObject('Home/Reksadana/Cart/android.widget.RadioButton1 - Moderat'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

// Memilih Card Produk Reksadana 
Mobile.tap(findTestObject('Home/Reksadana/Cart/android.widget.LinearLayout6'), 0)

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

// Memilih Button Add To Cart
Mobile.tap(findTestObject('Home/Reksadana/Cart/Button_AddToCart'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

// Mengchecklis Syarat dan Ketentuan berlaku
Mobile.tap(findTestObject('Home/Reksadana/Cart/android.widget.CheckBox0 - Saya telah memahami dan menyetujui isi dari Ketentuan Prospektus dan Fund Sheet produk ini'), 
    0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

// Memilih button Lanjutkan
Mobile.tap(findTestObject('Home/Reksadana/Cart/android.widget.LinearLayout3'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

// Memilih button Rp 300.000
Mobile.tap(findTestObject('Home/Reksadana/Cart/com.google.android.material.chip.Chip2 - Rp 300.000'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

// Memilih button Tambahkan Ke Keranjang
Mobile.tap(findTestObject('Home/Reksadana/Cart/android.widget.LinearLayout3 (1)'), 0)

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

// Memilih button Cart pada bagian top detail Reksadana
Mobile.tap(findTestObject('Home/Reksadana/Cart/android.widget.FrameLayout3'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

