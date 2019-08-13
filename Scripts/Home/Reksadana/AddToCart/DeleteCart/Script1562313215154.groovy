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
//
//Mobile.tap(findTestObject('Home/Reksadana/Cart/Button_Delete'), 0)
//
//Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)
//
//Mobile.tap(findTestObject('Home/Reksadana/Cart/Button_Batal'), 0)
//
//Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)
//
//Mobile.tap(findTestObject('Home/Reksadana/Cart/Button_Delete'), 0)
//
//Mobile.tap(findTestObject('Home/Reksadana/Cart/Button_Hapus'), 0)
//
//Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)
//
//Mobile.verifyElementText(findTestObject('Home/Reksadana/Cart/Text-Keranjang'), 'Keranjang')
//
//Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

// Memilih Menu Cart pada menu bar 
Mobile.tap(findTestObject('Home/Reksadana/Cart/android.widget.FrameLayout13 (1)'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

// Memilih button Hapus pada salah satu card produk reksadana
Mobile.tap(findTestObject('Home/Reksadana/Cart/android.widget.LinearLayout13'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

// Klik Batal untuk membatalkan hapus produk reksadana
Mobile.tap(findTestObject('Home/Reksadana/Cart/android.widget.TextView5 - Batal'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

// Klik button Hapus kembali pada salah satu card produk reksadana
Mobile.tap(findTestObject('Home/Reksadana/Cart/android.widget.LinearLayout13'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

// Klik button Hapus untuk menghapus produk Reksadana
Mobile.tap(findTestObject('Home/Reksadana/Cart/android.widget.TextView6 - Hapus'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
