import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTest{

	
	 DepositoCombustible tank = new DepositoCombustible(40.0,0.0);
     
	@Test
	public void testDepositoCombustible() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetDepositoNivel() {
		double Nivel= tank.getDepositoNivel();
		double experado= 0;
		assertEquals(Nivel, experado, 0);
		
	}

	@Test
	public void testGetDepositoMax() {
		double Maximo= tank.getDepositoMax();
		assertNotNull(Maximo);
		
	}
	@Test
	public void testGetDepositoMaxBien() {
		double Maximo= tank.getDepositoMax();
		double experado= 40;
		assertEquals(Maximo, experado, 0);
		
	}

	@Test
	public void testGetDepositoMaxMal() {
		double Maximo= tank.getDepositoMax();
		double experado= 30;
		assertEquals(Maximo, experado, 0);
		
	}


	@Test
	public void testEstaLleno() {
		bolean lleno= tank.estaLleno();
		assertTrue(lleno);
	}
	
	public void testEstaLleno12() {
		DepositoCombustible tank2 = new DepositoCombustible(40.0, 40.0);
		boolean lleno= tank2.estaLleno();
		
		assertFalse(lleno);
	}


	@Test
	public void testFill() {
		fail("Not yet implemented");
	}

	@Test
	public void testConsumir() {
		fail("Not yet implemented");
	}

}
