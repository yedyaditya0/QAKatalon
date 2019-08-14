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

Mobile.startApplication('/Users/ustore/Downloads/mobile-debug.apk', true)

Mobile.verifyElementText(findTestObject('LoginTrue/Mulailah berinvestasi untuk meraih mimpimu'), 'Mulailah berinvestasi untuk meraih mimpimu')

Mobile.tap(findTestObject('LoginTrue/DP_Rumah'), 0)

for (int i = 0; i < 4; i++) {
    //Swipe Screen
    Mobile.tap(findTestObject('LoginTrue/screen_swipe'), 0)

    Mobile.swipe(800, 1000, 10, 800)
}

// Field registered no phone in number phone
Mobile.setText(findTestObject('LoginTrue/field_no_phone'), '08777111777', 0)

// Tap button Masuk
Mobile.tap(findTestObject('LoginTrue/button_masuk'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

// Verify element text Otp 
Mobile.verifyElementText(findTestObject('ObjectOTP/TextView - Verifikasi Nomor HP'), 'Verifikasi Nomor HP')

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)