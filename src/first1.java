import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;
import static java.util.concurrent.TimeUnit.SECONDS;

public class first1 extends first {

    public static void main(String[] args) throws MalformedURLException {

        System.out.println("hello first");
        System.getenv().entrySet().stream().forEach(System.out::println);
        AndroidDriver<AndroidElement> driver = capabilities();
        driver.manage().timeouts().implicitlyWait(50L, SECONDS);
        driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
        driver.findElementById("android:id/checkbox").click();
        driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
        driver.findElementByClassName("android.widget.EditText").sendKeys("mypassword");
        driver.findElementsByClassName("android.widget.Button").get(1).click();
        driver.quit();
    }



}