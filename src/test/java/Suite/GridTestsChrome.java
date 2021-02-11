package Suite;

import com.epam.reportportal.annotations.TestCaseId;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;


//@Listeners(MyCustomListener.class)
public class GridTestsChrome {
    //private static final Logger LOGGER = LogManager.getLogger(GridTestsChrome.class);
    WebDriver driver;
    String baseUrl = "https://www.google.com/";
    //String nodeUrl = "http://127.0.0.1:4444/wd/hub";

    //@Parameters({"Port"})
    @BeforeMethod
    public void initiateDriver() throws MalformedURLException {
        driver = Browser.getDriver("chrome");
        driver.manage().window().maximize();


    }
    /*@TestCaseId(parametrized = true)
    @Test(dataProvider="SearchProvider")*/
    @Test
    public void distribTest_grid_chrome1() throws MalformedURLException {
/*        DesiredCapabilities capability = new DesiredCapabilities();
        capability.setCapability(CapabilityType.BROWSER_NAME, "chrome");
        driver = new RemoteWebDriver(new URL(nodeUrl), capability);
        driver.manage().window().maximize();*/
        driver.get(baseUrl);
        driver.close();
        //System.out.println(SearchProvider);


    }
    @Test
    public void distribTest_grid_chrome2() throws MalformedURLException {

        //driver.manage().window().maximize();
        driver.get(baseUrl);
        driver.close();
        //System.out.println(SearchProvider);


    }
    @DataProvider(name = "SearchProvider", parallel = true)
    public Object[][] getDataFromDataprovider() {
        return new Object[][]
                {
                        {"test", "India"},
                        {"Krishna", "UK"},
                        {"Bhupesh", "USA"}
                };

    }
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


    /*    @TestCaseId(parametrized = true)
        @Test(dataProvider="SearchProvider")
        public void distribTest_local(@Optional("Abc") String SearchProvider,
                                @Optional("TESTID-1111") @TestCaseIdKey String testCaseId) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\shanm\\IdeaProjects\\untitled\\cucu\\src\\test\\resources\\Driver\\chromedriver.exe");
            WebDriver driver1 = new ChromeDriver();
            driver1.get("https://www.jetbrains.com/");
            driver1.close();
            System.out.println("TESTING"+SearchProvider);

        }*/

}
