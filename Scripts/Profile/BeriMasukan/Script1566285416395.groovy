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

Mobile.tap(findTestObject('Profile/android.widget.FrameLayout14 (1)'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)


Mobile.tap(findTestObject('Profile/android.widget.LinearLayout8'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)


Mobile.setText(findTestObject('Profile/android.widget.EditText0 - Nama Lengkap (1)'), 'Aji Kurnia Putra', 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)


Mobile.setText(findTestObject('Profile/android.widget.EditText1 - Email (1)'), 'ajikurniaputra84@gmail.com', 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)


Mobile.setText(findTestObject('Profile/android.widget.EditText2 - Masukan Pesan Anda (1)'), 'tes ', 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)


Mobile.tap(findTestObject('Profile/android.widget.Button0 - KIRIM (1)'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)


Mobile.closeApplication()

