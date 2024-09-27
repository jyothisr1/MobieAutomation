package com.automation;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DemoClass {
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
//        caps.setCapability("appium:app", "C:\\Users\\280710\\Downloads\\Saucelabs.apk");  // The filename of the mobile app
        caps.setCapability("appium:app", "C:\\Users\\280710\\Downloads\\expedia.apk");
//        caps.setCapability("appium:app", "C:\\Users\\280710\\Downloads\\Saucelabs.apk");
        caps.setCapability("appium:deviceName", "emulator-5554");
//        caps.setCapability("appium:platformVersion", "12.0");
        caps.setCapability("appium:automationName", "UiAutomator2");
//        caps.setCapability("appPackage", "com.swaglabsmobileapp");
        caps.setCapability("appPackage", "com.expedia.bookings");
//        caps.setCapability("appActivity", "com.swaglabsmobileapp.MainActivity");
        caps.setCapability("appActivity", "com.expedia.bookings.activity.SearchActivity");
//        DesiredCapabilities sauceOptions = new DesiredCapabilities();
//        sauceOptions.setCapability("username", "oauth-jyothisr212-f5b65");
//        sauceOptions.setCapability("accessKey", "eceb138b-59d3-4eee-ac5f-9383f7c678e8");
//        sauceOptions.setCapability("build", "appium-test-build");
//        sauceOptions.setCapability("name", "My first Mobile Automation Test");
//        sauceOptions.setCapability("deviceOrientation", "PORTRAIT");
//        caps.setCapability("sauce:options", sauceOptions);

//        URL url= new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");
//        AppiumDriver driver=new AndroidDriver(url,caps);
        URL serverUrl = new URL("http://127.0.0.1:4723/");
        AppiumDriver driver=new AndroidDriver(serverUrl,caps);
    }
}
