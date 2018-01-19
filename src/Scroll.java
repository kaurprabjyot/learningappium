import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class Scroll extends first {

    public static void main(String[] args) throws MalformedURLException {

        System.out.println("hello first");

        AndroidDriver<AndroidElement> driver = capabilities();
        TouchAction t = new TouchAction(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
        //Android code not related to Appium
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Radio Group\"));").click();
    }
}