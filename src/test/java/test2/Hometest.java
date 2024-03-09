package test2;

import pagepkg.Homepage;

public class Hometest extends Baseclass {
	public void home() throws InterruptedException
	{
		Homepage ob=new Homepage(dr);
		ob.Saree("saree");
		Thread.sleep(200);
		ob.Men();
		Thread.sleep(200);
		ob.Jewellary();
		ob.titleverification();
	}

}
