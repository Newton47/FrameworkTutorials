package Resources;

import org.apache.bcel.classfile.Method;
import org.testng.annotations.DataProvider;

public class dataproviderClass {
	
@DataProvider(name="SearchProvider")
public static Object[][] getData(Method m)
{
	if(m.getName().equalsIgnoreCase("basepageNavigation"))
	{
	return new Object[][]{
		{"aaa@gmail.com","babla"},
		{"bbb@gmail.com","ladla"}
		
	};
	}
	else{
		return new Object[][]{
			{"aaa@gmail.com","babla"},
			{"bbb@gmail.com","ladla"}
			
		};
		
	}
	
}


}
