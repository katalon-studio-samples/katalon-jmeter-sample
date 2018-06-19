import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())


RunConfiguration.setExecutionSettingFile('/var/folders/42/25_dz67d0s90tq1kph29hdy00000gp/T/Katalon/Test Cases/api-2-issue/Get issue/I could get correct information of the issue/20180618_171838/execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCase('Test Cases/api-2-issue/Get issue/I could get correct information of the issue', new TestCaseBinding('Test Cases/api-2-issue/Get issue/I could get correct information of the issue', [:]), FailureHandling.STOP_ON_FAILURE , false)
    
