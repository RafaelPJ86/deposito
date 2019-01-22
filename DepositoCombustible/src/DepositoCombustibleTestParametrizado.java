import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.*;
import org.junit.runners.Parameterized.Parameters;;

@RunWith(Parameterized.class)
public class DepositoCombustibleTestParametrizado {
	private double num;
	private double res;
	private double max;
	private double actual;

	public DepositoCombustibleTestParametrizado(double n, double r, double m, double a ) {
		num=n;
		res=r;
		max=m;
		actual=a;
		
		
	} 
	
	@Parameters
	public static Collection<Object[]> numeros(){
		
		return Arrays.asList(new Object [][]{
			{10,50,60,40},{400,440,60,40},{-10,-50,60,40}			
						
		});
		
	}
	
	
	@Test
	public void testCombustible(){
		
		DepositoCombustible tank = new DepositoCombustible(max,actual);
		double llenar= tank.fill(num);		
		assertEquals(llenar, res, 0);
		
		
	}
	
	
}
