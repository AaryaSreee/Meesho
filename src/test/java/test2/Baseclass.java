package test2;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Homepage;

public class Baseclass {

			    public static WebDriver dr;
			    @BeforeTest
				public void setup()
				{
					dr=new ChromeDriver();
					
				}

			    @BeforeClass
			    public void setUp() {
			        dr = new ChromeDriver();
			        dr.get("https://www.meesho.com/");
			        dr.manage().window().maximize();
			        dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			    }
			    
			    @Test(priority = 1)
			    public void home() throws InterruptedException
				{
					Homepage ob=new Homepage(dr);
					ob.Saree("saree");
					Thread.sleep(200);
					ob.Men();
					Thread.sleep(200);
					ob.Jewellary();
					Thread.sleep(200);
					ob.titleverification();
				}

			    
			}




