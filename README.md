# How to get WebElement using tagName locator in Selenium WebDriver

This repository holds beginner code to help you understand how to get WebElement using the tagName locator in Selenium WebDriver.

## What is a WebElement?
Everything starting from a textbox, label, and checkbox to a button, drop-down, radio button, etc. present on a webpage is referred to as a WebElement. A WebElement is a simple HTML element that is represented as an object of WebElement by the Selenium WebDriver. By doing so, Selenium helps to interact with these elements on a webpage to perform actions like entering data, clicking buttons, etc.

## Different WebElement locators in Selenium
- id
- name
- class
- linkText
- partialLinkText
- tagName
- CSS
- xPath

## Different ways to locate web elements in Selenium WebDriver
1. findElement(): to locate the first matching element
```
WebElement element = driver.findElement(By.tagname("input")).sendKeys("LambdaTest");
```  

2. findElements(): to locate all the matching element
```
List<WebElement> elements = driver.findElements(By.tagname("input")).sendKeys("LambdaTest");
```

## About Project
It is created using Selenium with Java, TestNG, and Maven for Web-based automation

This is the list of tools, being used in this framework:
1. Apache Maven
2. Java 8
3. TestNG Framework
4. Selenium WebDrvier

## Steps for Execution on LambdaTest Cloud Platform
1. Import this project in Eclipse/IntelliJ as an “Existing Maven Project”
2. Update your LambdaTest account username and accessKey in BaseTest.java. You can find these in the Profile section. 
3. Execute any one of the test cases by right-clicking and selecting the Run as the TestNG option.
4. You can see the logs coming on Console as your execution progresses.
5. log in to your LambdaTest dashboard to see the detailed execution results for the executed test case.
