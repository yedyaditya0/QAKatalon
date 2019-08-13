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

// Memilih menu konsultasi
Mobile.tap(findTestObject('Home/Consultation/android.widget.FrameLayout12 (1)'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

// Memilih button create konsultasi
//Mobile.tap(findTestObject('Home/Consultation/android.widget.LinearLayout21 (1)'), 0)

// Memlih button Create Konsultasi (2)
Mobile.tap(findTestObject('Home/Consultation/Create_Consultation3'), 0)


Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

// Memilih Meet Up
Mobile.tap(findTestObject('Home/Consultation/android.widget.RelativeLayout1 (1)'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

// Memilih link Ganti Konsultan
Mobile.tap(findTestObject('Home/Consultation/android.widget.TextView2 - Ganti Konsultan (1)'), 0)

Mobile.delay(5,FailureHandling.STOP_ON_FAILURE)

// Memilih button Pilih
Mobile.tap(findTestObject('Home/Consultation/android.widget.LinearLayout7'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

// Memilih tanggal konsultasi
Mobile.tap(findTestObject('Home/Consultation/13'), 0);

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

// Memilih button Lanjut
Mobile.tap(findTestObject('Home/Consultation/android.widget.LinearLayout14 (1)'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

// Memilih jam konsultasi
Mobile.tap(findTestObject('Home/Consultation/android.widget.Button9 - 1330 (1)'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

// Memilih button Lanjut
Mobile.tap(findTestObject('Home/Consultation/android.widget.LinearLayout18 (1)'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

// Mengisi field Lokasi Meet Up
Mobile.setText(findTestObject('Home/Consultation/android.widget.EditText0 - Masukkan Lokasi (1)'), 'Jekarrrrdaaah Indonesia', 
    0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

// Mengisi field Lokasi Catatan
Mobile.setText(findTestObject('Home/Consultation/android.widget.EditText1 - Masukkan Catatan (1)'), 'Ngopi Ngopi', 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

// Memilih button Lanjut
Mobile.tap(findTestObject('Home/Consultation/android.widget.LinearLayout15 (2)'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

// Memilih button Konfirmasi
Mobile.tap(findTestObject('Home/Consultation/android.widget.LinearLayout15 (3)'), 0)


