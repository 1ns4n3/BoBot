package IUT.BoBot.SmartCells;

import static org.junit.Assert.*;

import org.junit.Test;

public class AurevoirCellTest {
	
	AurevoirCell cell = new AurevoirCell();

	@Test
	public void testAurevoir() {
		assertEquals("Au revoir!", cell.ask("Au revoir"));
	}
	
	@Test
	public void testNotAurevoir() {
		assertEquals(null, cell.ask("au revoir"));
	}

}
