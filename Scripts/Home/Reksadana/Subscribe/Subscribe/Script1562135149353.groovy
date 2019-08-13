import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.sun.org.apache.bcel.internal.generic.FADD
import com.kms.katalon.core.mobile.driver.MobileDriverType
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

// 	Memilih menu Reksadana
Mobile.tap(findTestObject('Home/Reksadana/Subscribe/android.widget.ImageView5'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

// Memilih Button Update Profil Risiko
Mobile.tap(findTestObject('Home/Reksadana/Subscribe/android.widget.TextView4 - Update'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

// Memilih Profil Risiko Moderat
Mobile.tap(findTestObject('Home/Reksadana/Subscribe/android.widget.RadioButton1 - Moderat'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

// Memilih Produk Reksadana
Mobile.tap(findTestObject('Home/Reksadana/Subscribe/android.widget.LinearLayout6'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

// Memilih button Beli
Mobile.tap(findTestObject('Home/Reksadana/Subscribe/BELI'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

// Memilih centang ceklist persetujuan
Mobile.tap(findTestObject('Home/Reksadana/Subscribe/android.widget.CheckBox0 - Saya telah memahami dan menyetujui isi dari Ketentuan Prospektus dan Fund Sheet produk ini'), 
    0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

// Memilih button Lanjutkan
Mobile.tap(findTestObject('Home/Reksadana/Subscribe/android.widget.LinearLayout3'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

//// Memilih card Rp 100.000
Mobile.tap(findTestObject('Home/Reksadana/Subscribe/com.google.android.material.chip.Chip0 - Rp 100.000'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

//// Memilih Button Beli Sekarang
Mobile.tap(findTestObject('Home/Reksadana/Subscribe/android.widget.LinearLayout3 (1)'), 0)
//
Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
//
//// Memilih button Virtual Account
Mobile.tap(findTestObject('Home/Reksadana/Subscribe/android.widget.LinearLayout23'), 0)
//
Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
//
//// Memilih button Detail Pembelian produk
Mobile.tap(findTestObject('Home/Reksadana/Subscribe/android.widget.ImageView1'), 0)
