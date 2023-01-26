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

Mobile.startApplication('C:\\Users\\dimas\\Downloads\\Android-MyDemoAppRN.1.2.0.build-231.apk', true)

Mobile.tap(findTestObject('Object Repository/Cart/android.widget.ImageView (4)'), 0)

Mobile.scrollToText('Add To Cart')

Mobile.tap(findTestObject('Object Repository/Cart/android.widget.TextView - Add To Cart'), 0)

Mobile.tap(findTestObject('Object Repository/Cart/android.widget.ImageView (5)'), 0)

Mobile.tap(findTestObject('Object Repository/Cart/android.widget.ImageView (6)'), 0)

Mobile.tap(findTestObject('Object Repository/Cart/android.widget.TextView - Catalog'), 0)

Mobile.tap(findTestObject('Object Repository/Cart/android.widget.ImageView (7)'), 0)

Mobile.scrollToText('Add To Cart')

Mobile.tap(findTestObject('Cart/android.widget.TextView - Add To Cart'), 0)

Mobile.tap(findTestObject('Cart/android.widget.ImageView (5)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Cart/android.widget.TextView - My Cart'), 'My Cart')

Mobile.tap(findTestObject('Object Repository/Cart/android.widget.TextView - Proceed To Checkout'), 0)

WebUI.delay(2)

Mobile.closeApplication()

