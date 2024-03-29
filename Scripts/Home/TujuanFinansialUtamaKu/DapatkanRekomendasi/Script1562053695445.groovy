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

//Mobile.tap(findTestObject('null'), 0)
Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

// Memilih button Simpan
Mobile.tap(findTestObject('Home/DapatkanRekomendasi/android.widget.LinearLayout12'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

// Memilih button Dapatkan Rekomendasi
Mobile.tap(findTestObject('Home/DapatkanRekomendasi/android.widget.TextView8 - Dapatkan Rekomendasi'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

// Memilih button Update
Mobile.tap(findTestObject('Home/DapatkanRekomendasi/android.widget.Button0 - UPDATE (1)'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
