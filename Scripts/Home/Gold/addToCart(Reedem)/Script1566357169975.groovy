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

// Memilih menu portfolio
Mobile.tap(findTestObject('Home/Gold/AddToCart/Reedem/android.widget.FrameLayout10'), 0)

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

// Memilih card emas
Mobile.tap(findTestObject('Home/Gold/AddToCart/Reedem/CardEmas2'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

// Memilih button Jual
Mobile.tap(findTestObject('Home/Gold/AddToCart/Reedem/android.widget.LinearLayout26'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

// Memilih button add to cart
Mobile.tap(findTestObject('Home/Gold/AddToCart/Reedem/android.widget.LinearLayout3'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

// Memilih 0.1 gram
Mobile.tap(findTestObject('Home/Gold/AddToCart/Reedem/android.widget.RadioButton0 - 0.1 Gram'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

// Memilih button add to cart
Mobile.tap(findTestObject('Home/Gold/AddToCart/Reedem/android.widget.LinearLayout3'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

// Memilih icon add to cart pada bagian header
Mobile.tap(findTestObject('Home/Gold/AddToCart/Reedem/android.widget.RelativeLayout0'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

