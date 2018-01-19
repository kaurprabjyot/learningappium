package reach;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.util.List;

import static java.util.concurrent.TimeUnit.SECONDS;

public class reachapp extends reach {

    private static Object element;

    public static void main(String[] args) throws MalformedURLException {

        System.out.println("hello Reach");
        AndroidDriver<AndroidElement> driver = capabilities();
        TouchAction t=new TouchAction(driver);
        driver.manage().timeouts().implicitlyWait(10, SECONDS);
        driver.findElementsByClassName("android.widget.EditText").get(0).sendKeys("prabjyot.kaur@voiceworks.com");
        driver.findElementsByClassName("android.widget.EditText").get(1).sendKeys("Lostphone_8");
        driver.findElementByClassName("android.widget.Button").click();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Agree\"));").click();
        driver.findElementsByClassName("android.widget.Button").get(1).click();
        WebElement parentElement = driver.findElementById("com.uccworks.reach:id/content_frame");
        List<AndroidElement> childElements = driver.findElements(By.xpath("//android.view.ViewGroup[@index='1']"));
        WebElement m = childElements.get(0);
        m.findElement(By.className("android.widget.ImageButton")).click();
        WebElement e = driver.findElementById("com.uccworks.reach:id/recycler");
       driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.LinearLayout\").index(1).instance(1)").click();

       // List<MobileElement> elements = driver.findElementById("com.uccworks.reach:id/recycler").findElements(By.className("android.widget.LinearLayout"));

        //WebElement e = driver.findElementById("com.uccworks.reach:id/recycler");
        //List<AndroidElement> ls = e.findElements(By.xpath("android.widget.LinearLayout[@index='1']"));
        //ls.get(0).click();
        //WebElement mm = ls.get(0);
        //mm.click();


        //List<AndroidElement> ls = e.findElement(By.className("android.widget.LinearLayout"));
        //WebElement m1 = childElements.get(0);
        //m1.click();
        //List<AndroidElement> a = e.findElements(By.xpath("//android.view.LinearLayout[@index='1']"));

        //System.out.println(mm);
       // m.findElement(By.className("android.widget.ImageButton")).click();
       // AndroidElement l  = driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.LinearLayout\")");
        //l.findElementById("1").click();


        //driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();




       // System.out.println(m);
        //m.click();

        System.out.println("hello Reach");



        //driver.findElement(By.xpath("//android.view.ViewGroup[1]/android.widget.ImageButton[0] ")).click();
    //WebElement m = childElements.get(1);

        //driver.findElementsByXPath("//android.view.View[@index='1']/android.widget.ImageButton").get(0).click();
       // driver.findElementsByAndroidUIAutomator("new UiSelector().content-desc('Navigate up)");
        //driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        //System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());


       // WebElement parentElement = driver.findElementByClassName("android.widget.LinearLayout");
       // List<WebElement> childElements = parentElement.findElements(By.className("android.view.ViewGroup"));
      // WebElement m = childElements.get(1);
       // m.findElement(By.className("android.widget.ImageButton")).click();
/**
        // Entering UserName using Parent node strategy
        WebElement parentElement = driver.findElement(By.name("Amazon Sign In"));
        List<WebElement> childElements = parentElement.findElements(By.className("android.view.View"));
        WebElement mainElement = childElements.get(4);
        mainElement.findElement(By.className("android.widget.EditText")).sendKeys("Your_UserName");
        // Entering Password using Xpath & Sibling strategy
        driver.findElementByXPath("//android.view.View[@content-desc='Password']/following-sibling::android.view.View/android.widget.EditText").sendKeys("Your_Password");
        // Click on Sign In button
        driver.findElement(By.name("Sign in")).click();
        // This is to kill the Android driver
        driver.quit();


**/
        // mainElement.findElement(By.className("android.widget.ImageButton")).click();

        //driver.findElementByName("\"Navigate up\"");
        //driver.findElementByXPath("*[@content-desc=\"Navigate up\"] and @clickable=true").click();
       // driver.findElementByXPath("//android.widget.ImageButton[@content-desc='Navigate up]").click();
        //AndroidElement el2 = (AndroidElement) driver.findElementByClassName("android.widget.ImageButton");
       // el2.getText(); //result is blank
       // el2.getAttribute("text") ;//result is blank

        //driver.findElementByAndroidUIAutomator("UiSelector().element.getAttribute(\"contentDescription\")").click();

        //driver.findElementByXPath("//*[@class='android.widget.ImageButton'] and @content-desc=\"Navigate up\"").click();
        //driver.findElementById("com.uccworks.reach:id/text_active").click();
        //android.widget.Button[@content-desc=‘Sign Out’]
       // driver.findElementByXPath("//android.widget.ImageButton[@content-desc='"']").click();
       // driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
        //driver.findElement(By.xpath("//android.widget.RadioButton[@text='Use Testdroid Cloud']"));
       // driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
    }
    }

