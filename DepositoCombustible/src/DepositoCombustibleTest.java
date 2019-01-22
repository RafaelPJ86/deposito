import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTest{
	DepositoCombustible tank2 = new DepositoCombustible(40.0, 40.0);
	
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
		boolean lleno= tank.estaLleno();
		assertFalse(lleno);
	}
	@Test
	public void testEstaLlenoTope() {
		
		boolean llenoTope= tank2.estaLleno();
		assertTrue(llenoTope);
	}

}
