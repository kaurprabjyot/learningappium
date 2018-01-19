import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;
import java.util.List;

import static java.util.concurrent.TimeUnit.SECONDS;
import static junit.framework.TestCase.assertTrue;

public class UIautomater extends first {

    public static void main(String[] args) throws MalformedURLException
    {

        System.out.println("hello first");
        AndroidDriver<AndroidElement> driver = capabilities();
        driver.manage().timeouts().implicitlyWait(50L, SECONDS);
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        //identity property
        List<AndroidElement> elements = driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)");
        assertTrue(elements.size() <= 13);


    }

}