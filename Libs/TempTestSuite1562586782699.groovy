import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/result/Reksadana/Portolio/Top_Up')

suiteProperties.put('name', 'Top_Up')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("/Users/ustore/Katalon Studio/Android v1.2/Reports/result/Reksadana/Portolio/Top_Up/20190708_185302/execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/result/Reksadana/Portolio/Top_Up', suiteProperties, [new TestCaseBinding('Test Cases/Login/LoginTrue', 'Test Cases/Login/LoginTrue',  null), new TestCaseBinding('Test Cases/OTP/LoginOTP', 'Test Cases/OTP/LoginOTP',  null), new TestCaseBinding('Test Cases/Home/Portfolio/TopUP', 'Test Cases/Home/Portfolio/TopUP',  null)])
