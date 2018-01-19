package messenger;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;
import java.util.Iterator;
import java.util.List;

import static java.util.concurrent.TimeUnit.SECONDS;

public class messengerapp extends  messenger {


    public static void main(String[] args) throws MalformedURLException {

        System.out.println("hello Messenger");
        AndroidDriver<AndroidElement> driver = capabilities();
        driver.manage().timeouts().implicitlyWait(50L, SECONDS);
        driver.findElementsByClassName("android.widget.EditText").get(0).sendKeys("prabjyot.kaur@voiceworks.com");
        driver.findElementsByClassName("android.widget.EditText").get(1).sendKeys("Lostphone_8");
        driver.findElementById("io.summa.libapp:id/cbRememberMe").click();
        driver.findElementById("io.summa.libapp:id/sign_in_button").click();
        driver.findElementById("io.summa.libapp:id/fabMain").click();
        //driver.findElementsByClassName("android.widget.RelativeLayout").get(1);
        List<AndroidElement> linklist = driver.findElementsById("io.summa.libapp:id/tvUsername");
        Iterator<AndroidElement> iter = linklist.iterator();
        while (iter.hasNext()) {

            // Iterate one by one
            AndroidElement item = iter.next();

            // get the text
            item.click();
            break;
        }
        driver.findElementById("io.summa.libapp:id/fabNext").click();
        driver.findElementsByClassName("android.widget.EditText").get(0).sendKeys("testing");
        driver.findElementById("io.summa.libapp:id/mbSend").click();
        driver.findElementById("io.summa.libapp:id/mbSend").click();
        driver.findElementsByClassName("android.widget.ImageView").get(1).click();


        //driver.findElementByXPath("//span[contains(., \"" +android.view.View+ "\")]../preceding-sibling::td/input[@type='checkbox']").click();
       // driver.findElementByXPath("//android.widget.FrameLayout]/../following-sibling::android.view.View").click();
       // driver.findElementById("io.summa.libapp:id/ntb_horizontal")
        //driver.findElementByXPath("//*[@class='android.widget.FrameLayout' and @bounds='[0,280][1440,4487]']").click();
        //android.widget.TextView[@resource-id="com.example.appium:id/idlable" and @text='pluto']
        /*
        List<AndroidElement> linklist = driver.findElements(By.id("io.summa.libapp:id/ntb_horizontal"));
        Iterator<AndroidElement> iter = linklist.iterator();
        // this will check whether list has some element or not
        while (iter.hasNext()) {

            // Iterate one by one
            AndroidElement item = iter.next();

            // get the text
             item.click();

        }
        */


    }
}