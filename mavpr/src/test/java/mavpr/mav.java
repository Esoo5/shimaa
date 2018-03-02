package mavpr;

import org.testng.Assert;
import org.testng.annotations.Test;

public class mav {
	@Test
	public void dummy(){
		
		Assert.assertEquals(1,1);
	
	}
	@Test
	public void dum_to_fail(){
		
		Assert.assertEquals(1,2);
	}

}
