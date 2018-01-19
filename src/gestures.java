import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.interactions.touch.TouchActions;

import java.net.MalformedURLException;

import static java.util.concurrent.TimeUnit.SECONDS;

public class gestures extends first {

    public static void main(String[] args) throws MalformedURLException {

        System.out.println("hello first");
        AndroidDriver<AndroidElement> driver = capabilities();
        driver.manage().timeouts().implicitlyWait(50L, SECONDS);
        driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
        //TAPPING
        TouchActions t = new TouchActions(driver);
        t.singleTap(driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']")).perform();
        driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
         t.longPress(driver.findElementByXPath("//android.widget.TextView[@text='People Names']")).release().perform();
       // System.out.println(driver.findElementByXPath("(//android.widget.TextView").getText());
      //  System.out.println(driver.findElementById("//android:id/title]").getText());

    }
}