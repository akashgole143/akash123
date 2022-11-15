import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class class1 {
			@BeforeClass
			public void beforeClass()
			{
				System.out.println("beforeClass");
			}
			

			@Test
			public void test()
			{
				System.out.println("Tc1");
			}
			

	}



