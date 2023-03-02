import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication(GlobalVariable.UserappAPK, true)

WebUI.callTestCase(findTestCase('Others and Knowledgebase/Quick walkthrough'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2)

Mobile.tap(findTestObject('Object Repository/mobile/Agent profile/android.widget.TextView - Get Agent Nearby (1)'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/mobile/Agent profile/android.widget.EditText - Search agent here (2)'), 0)

Mobile.setText(findTestObject('Object Repository/mobile/Agent profile/android.widget.EditText - Search agent here (3)'), 
    'Rose', 0)

Mobile.tap(findTestObject('Object Repository/mobile/Agent profile/android.widget.TextView - rose (2)'), 0)

Mobile.tap(findTestObject('Object Repository/mobile/Agent profile/android.widget.TextView - rose (3)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/mobile/Agent profile/android.widget.TextView - KLCC (1)'), 'KLCC')

Mobile.verifyElementText(findTestObject('Object Repository/mobile/Agent profile/android.widget.TextView - Bukit Tunku (Kenny Hills) (1)'), 
    'Bukit Tunku (Kenny Hills)')

Mobile.verifyElementText(findTestObject('Object Repository/mobile/Agent profile/android.widget.TextView - Bangsar (1)'), 
    'Bangsar')

// Mobile.verifyElementText(findTestObject('Object Repository/mobile/Agent profile/android.widget.TextView - 2 Agents Nearby'), 
//   '2 Agents Nearby')
Mobile.tap(findTestObject('Object Repository/mobile/Agent profile/android.view.View (1)'), 0)

Mobile.delay(1)

Mobile.verifyElementText(findTestObject('Object Repository/mobile/Agent profile/android.widget.TextView - rose'), 'rose ')

Mobile.verifyElementText(findTestObject('Object Repository/mobile/Agent profile/android.widget.TextView - 017-8545177 5A Realty'), 
    '017-8545177 | 5A Realty')

Mobile.verifyElementText(findTestObject('Object Repository/mobile/Agent profile/android.widget.TextView - Sale'), 'Sale: ')

Mobile.verifyElementText(findTestObject('Object Repository/mobile/Agent profile/android.widget.TextView - 5'), '5')

Mobile.verifyElementText(findTestObject('Object Repository/mobile/Agent profile/android.widget.TextView - Rent'), 'Rent: ')

Mobile.verifyElementText(findTestObject('Object Repository/mobile/Agent profile/android.widget.TextView - 0'), '0')

Mobile.verifyElementText(findTestObject('Object Repository/mobile/Agent profile/android.widget.TextView - Auction'), 'Auction: ')

Mobile.verifyElementText(findTestObject('Object Repository/mobile/Agent profile/android.widget.TextView - 0 (1)'), '0')

Mobile.tap(findTestObject('Object Repository/mobile/Agent profile/android.widget.TextView - Agent'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/mobile/Agent profile/android.widget.TextView - rose (1)'), 'rose ')

Mobile.tap(findTestObject('Object Repository/mobile/Agent profile/android.widget.TextView - rose (5)'), 0)

Mobile.closeApplication()

