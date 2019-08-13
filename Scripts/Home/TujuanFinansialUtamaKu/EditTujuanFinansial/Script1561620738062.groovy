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

//// Wait for login application
//Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)
//
//// Tap button edit for change goal
//Mobile.tap(findTestObject('Home/Button_Edit'), 0)
//
//// Wait for change goal 
//Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)
//
//// Verify element text
////Mobile.verifyElementText(findTestObject("Home/Text-MulailahBerinvestasi"), 'Mulailah berinvestasi untuk meraih mimpimu')
////// Check Element for text in goal
////Mobile.checkElement(findTestObject("Home/Text-MulailahBerinvestasi"), 0)
//// Tap to change goal
//Mobile.tap(findTestObject('Home/Haji'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Home/Button_Edit'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

// Klik button edit pada card goal rekomendasi
Mobile.tap(findTestObject('Home/DapatkanRekomendasi/android.widget.FrameLayout4'), 0)

Mobile.swipe(800, 1000, 10, 800)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

// Klik Button DP Mobil
Mobile.tap(findTestObject('Home/DapatkanRekomendasi/android.widget.LinearLayout8'), 0)

