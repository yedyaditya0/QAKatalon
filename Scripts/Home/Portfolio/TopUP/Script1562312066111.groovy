import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.junit.After

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

//Mobile.tap(findTestObject('Home/Portfolio/TopUP/android.widget.FrameLayout11'), 0)
//Mobile.tap(findTestObject('Home/Portfolio/TopUP/android.widget.ImageView13'), 3)
Mobile.tap(findTestObject('Home/Portfolio/TopUP/android.widget.TextView11 - Portofolio'), 3)

//Mobile.tap(findTestObject('Home/Portfolio/TopUP/android.view.ViewGroup7'), 0)
Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

// Choose reksadana in card portfolio
Mobile.tap(findTestObject('Home/Portfolio/TopUP/CardReksa2'), 5)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

// Check element is present or verify element text
//Mobile.waitForElementPresent(findTestObject("Home/Portfolio/TopUP/Text-TotalInvestast"), 0)
// Check element is present or verify element text
//Mobile.verifyElementPresent(findTestObject("Home/Portfolio/TopUP/Text-PerkiraanUntungRugi"), 0)
// Check element is present or verify element text
//Mobile.verifyElementText(findTestObject("Home/Portfolio/TopUP/Text-PerkiraanNilaiPasar"), 'Perkiraan Nilai Pasar', 5)
//Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)
Mobile.tap(findTestObject('Home/Portfolio/TopUP/Button_TopUp'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

// Choose button Lanjutkan
Mobile.tap(findTestObject('Home/Portfolio/TopUP/Btn_Lanjutkan1'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
Mobile.tap(findTestObject('Home/Portfolio/TopUP/Field_Checkbox'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

// Choose button Lanjutkan
Mobile.tap(findTestObject('Home/Portfolio/TopUP/Btn_Lanjutkan1'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

// Choose Button Beli when field nominal beli is empty
Mobile.tap(findTestObject('Home/Portfolio/TopUP/Btn_TopUp1'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

//Choose Rupiah for field minimal beli
Mobile.tap(findTestObject('Home/Portfolio/TopUP/Rp200'), 0)

// Choose again button Beli
Mobile.tap(findTestObject('Home/Portfolio/TopUP/Btn_TopUp1'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

//Mobile.verifyElementText(findTestObject('Home/Portfolio/TopUP/Text-Metode Pembayaran'), 'Metode Pembayaran')

// Choose semua promo for check all promo available
Mobile.tap(findTestObject("Home/Portfolio/TopUP/Button_SemuaPromo"), 0)

Mobile.delay(5)

// Choose Button Salin kode
Mobile.tap(findTestObject("Home/Portfolio/TopUP/Button_Salin"), 0)

Mobile.delay(2)

// Choose Button back
Mobile.tap(findTestObject('Home/Portfolio/TopUP/android.widget.ImageButton0'), 0)

Mobile.delay(3)

// Choose button Gunakan Promo
Mobile.tap(findTestObject('Home/Portfolio/TopUP/android.widget.Button0 - Gunakan'), 0)

// Salin kode promo
Mobile.setText(findTestObject('Home/Portfolio/TopUP/android.widget.EditText0 - Kode Promo'), 'Invest100', 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

//// Choose Button back
//Mobile.tap(findTestObject('Home/Portfolio/TopUP/android.widget.ImageButton0'), 0)
//// Choose Button Gunakan kode promo
//Mobile.tap(findTestObject('Home/Portfolio/TopUP/android.widget.TextView1 - Gunakan Kode Promo'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

// Tap to out from kode promo
Mobile.tap(findTestObject('Home/Portfolio/TopUP/Linear'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

// Choose button dropdwon
Mobile.tap(findTestObject("Home/Portfolio/TopUP/Dropdown_Detail2"), 0)

Mobile.delay(2)

// Choose BCA VA
Mobile.tap(findTestObject('Home/Portfolio/TopUP/Button_VA2'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

