package Suite;

import Listeners.MyCustomListener;
import com.epam.reportportal.annotations.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.epam.reportportal.annotations.TestCaseId;
import com.epam.reportportal.annotations.TestCaseIdKey;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import rp.org.apache.commons.logging.Log;


import javax.validation.constraints.AssertTrue;

import static Listeners.ReportBase.threadLocal;
import static java.lang.Thread.sleep;


//@Listeners(MyCustomListener.class)
public class ReportPortalTests {
    private static final Logger LOGGER = LogManager.getLogger(ReportPortalTests.class);

    /*@Test
    public void Listest1(){
        Assert.assertEquals(1,1);
    }
    @Test
    public void Listest2(){
        Assert.assertEquals(1,1);
    }
    @Test
    public void Listest3(){
        Assert.assertEquals(1,1);
    }
    @Test
    public void Listest4(){
        Assert.assertEquals(1,1);
    }
    @Test
    public void Listest5(){
        Assert.assertEquals(1,1);
    }
    @Test
    public void Listest6(){
        Assert.assertEquals(1,2);
    }
    @Test
    public void Listest7(){
        throw new RuntimeException();
    }
    @Test
    public void Listest8(){
        throw new ArrayIndexOutOfBoundsException();
    }
    @Test
    public void Listest9(){
        throw new IllegalArgumentException();
    }
    @Test
    public void Listest9a(){
        throw new IllegalArgumentException();
    }
    @Test
    @TestCaseId(parametrized = true)
    @DataProvider(name = "test")
    public Object[] Listest9b(@Optional("Abc") String test, @Optional("TESTID-1111")@TestCaseIdKey String testCaseId){
        throw new IllegalArgumentException();
    }

    @Test
    public void Listest9b(){
        throw new IllegalArgumentException();
    }
    @Test
    @TestCaseId(parametrized = true)
    public void Listest9c(){
        throw new IllegalArgumentException();
    }*/
    /*@Test
    public void LOG_TEST() {
        LOGGER.info("TESTING INFO");
        LOGGER.warn("TESTING WARN");
        LOGGER.debug("TESTING DEBUG");
        step1();
        step2();
    }

    @Step("TEST_Step1 - {container}")
    public void step1() {
        LOGGER.info("TESTING INFO step1");
        LOGGER.warn("TESTING WARN step1");
        LOGGER.debug("TESTING DEBUG step1");
    }

    @Step("TEST_Step2 - {container}")
    public void step2() {
        LOGGER.info("TESTING INFO step2");
        LOGGER.warn("TESTING WARN step2");
        LOGGER.debug("TESTING DEBUG step2");
    }
*/
    /*@Test
    public void Listest10(){
        throw new NullPointerException();
    }
    @Test
    public void Listest11(){
        threadLocal.set(101);
        System.out.println(threadLocal.get());
    }
    @Test
    public void Listest12(){

        System.out.println(threadLocal.get());
    }
    @DataProvider(name="SearchProvider")
    public Object[][] getDataFromDataprovider(){
        return new Object[][]
                {
                        { "test", "India" },
                        { "Krishna", "UK" },
                        { "Bhupesh", "USA" }
                };

    }*/
    /*@Test
    @TestCaseId(parametrized = true)
    @DataProvider(name = "test")
    public Object[] Listest9b(
            @Optional("Abc") String test,
            @Optional("TESTID-1111") @TestCaseIdKey String testCaseId) {
        throw new IllegalArgumentException();

    }*/


    @TestCaseId(parametrized = true)
    @Test(dataProvider="SearchProvider")
    public void distribTest(@Optional("Abc") String SearchProvider,
                            @Optional("TESTID-1111") @TestCaseIdKey String testCaseId) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\shanm\\IdeaProjects\\untitled\\cucu\\src\\test\\resources\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jetbrains.com/");
        driver.close();
        System.out.println("TESTING"+SearchProvider);

    }

    @DataProvider(name = "SearchProvider",parallel = true)
    public Object[][] getDataFromDataprovider() {
        return new Object[][]
                {
                        {"test", "India"},
                        {"Krishna", "UK"},
                        {"Bhupesh", "USA"}
                };

    }
}
