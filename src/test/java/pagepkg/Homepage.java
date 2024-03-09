package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage  {
	WebDriver dr;
	
	@FindBy(xpath="//*[@id=\"__next\"]/div[2]/div[1]/div/div[2]/div/input")
	WebElement saree;
	
	@FindBy(xpath="//*[@id=\"__next\"]/div[2]/div[1]/div/div[2]/div[1]/div")
	WebElement search;
	
	@FindBy(xpath="//*[@id=\"__next\"]/div[2]/div[4]/div/div[5]")
	WebElement men;
	
	@FindBy(xpath="//*[@id=\"__next\"]/div[2]/div[4]/div/div[6]/div/div[3]/a[5]/p")
	WebElement jewellary;
	
	public Homepage(WebDriver dr) {
		 this.dr=dr;
		 PageFactory.initElements(dr, this);
	}


	public void Saree(String s)
	{
	        saree.sendKeys(s);
	        search.click();
	}
	public void Men()
	{
		men.click();
	}
	public void Jewellary()
	{
		jewellary.click();
	}

	public void titleverification()
	 {
		String exp="meesho.com";
		String act=dr.getPageSource();
		if(act.contains(exp))
		{
			System.out.println("Text is present");
		}
	 }
}
