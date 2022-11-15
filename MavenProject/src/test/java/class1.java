

	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	public class class1 {
			@BeforeClass
			public void beforeClass()
			{
				System.out.println("beforeClass");
			}
			
			@AfterClass
			public void afterClass()
			{
				System.out.println("afterClass");
			}
			
			@BeforeMethod
			public void beforeMethod()
			{
				System.out.println("beforeMethod");
			}
			
			@AfterMethod
			public void afterMethod()
			{
				System.out.println("afterMethod");
			}
			
			@Test
			public void TC01()
			{
				System.out.println("TC01");
			}
			
			@Test
			public void TC02()
			{
				System.out.println("TC02");
			}
			
			

	}



