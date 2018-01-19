import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class Swipe extends first {

    public static void main(String[] args) throws MalformedURLException {

        System.out.println("hello first");

        AndroidDriver<AndroidElement> driver = capabilities();
        TouchAction t=new TouchAction(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
        driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
        driver.findElementByXPath("//*[@content-desc='9']").click();
        t.press(driver.findElementByXPath("//*[@content-desc='15']")).waitAction(2000).moveTo(driver.findElementByXPath("//*[@content-desc='45']")).release().perform();

        // driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
       // driver.findElementByXPath("//*[@content-desc=9]").click();
    }
}
