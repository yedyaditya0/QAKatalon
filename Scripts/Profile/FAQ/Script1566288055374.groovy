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

//memilih icon profil pada halaman menu
Mobile.tap(findTestObject('Profile/android.widget.FrameLayout14 (2)'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

//memilih button FAQ pada halaman profil
Mobile.tap(findTestObject('Profile/android.widget.LinearLayout9'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

//memilih arrow right (menampilkan jawaban)
Mobile.tap(findTestObject('Profile/android.widget.ImageView0'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

//memilih arrow up (menutup jawaban)
Mobile.tap(findTestObject('Profile/android.widget.ImageView0'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

