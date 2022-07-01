package util

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class testing 
/*
 * Notes
 * Samsung S9+ Screen Size -> Height=2181 & Width=1080
 */

@Keyword
def ScrollUp(){
	def device_Height = Mobile.getDeviceHeight()
	def device_Width = Mobile.getDeviceWidth()

	int startX = device_Width / 2
	int startY = device_Height * 0.5

	int endX = startX
	int endY = device_Height * 0.7

	Mobile.swipe(startX, startY, endX, endY)
}

@Keyword
def ScrollDown(){
	def device_Height = Mobile.getDeviceHeight()
	def device_Width = Mobile.getDeviceWidth()

	//int startX = device_Width / 2
	int startX = (device_Width / 2) - 50
	int endX = startX

	int startY = device_Height * 0.30
	int endY = device_Height * 40.0

	println ("device_Height >> " + device_Height)
	println ("device_Width >> " + device_Width)
	println ("startX : " + startX)
	println ("endX : " + endX)
	println ("startY : " + startY)
	println ("endY : " + endY)

	Mobile.swipe(startX, endY, endX, startY)
}

@Keyword
def ScrollDownFast(){
	def device_Height = Mobile.getDeviceHeight()
	def device_Width = Mobile.getDeviceWidth()

	int startX = device_Width / 2
	int startY = device_Height * 0.8

	int endX = startX
	int endY = device_Height * 40.0

	Mobile.swipe(startX, startY, endX, endY)
}


@Keyword
def SwipeLeft(){
	def device_Height = Mobile.getDeviceHeight()
	def device_Width = Mobile.getDeviceWidth()

	int startX = device_Width * 0.90
	int startY = 758

	int endX = device_Width * 0.10
	int endY = startY

	Mobile.swipe(startX, startY, endX, endY)
}


@Keyword
def SwipeRight(){
	def device_Height = Mobile.getDeviceHeight()
	def device_Width = Mobile.getDeviceWidth()

	int startX = device_Width * 0.10
	int startY = device_Height / 2

	int endX = device_Width * 0.90
	int endY = startY

	Mobile.swipe(startX, startY, endX, endY)
}

@Keyword
def Tap(){
	Mobile.tapAtPosition(850, 711)
}
}
