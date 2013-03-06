package IUT.BoBot.SmartCells;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;

public class TodayCellTest {
	
	// Tests should not depend on the current date.
	// So initialize the TodayCell with a fixed date.
	Calendar calendar = Calendar.getInstance();
	TodayCell cell = new TodayCell(calendar);
	
	@Before
	public void setUp() {
		calendar.set(2013, 2, 6);
	}
	
	@Test
	public void testToday() {
		assertEquals("Mercredi 6 Mars 2013", cell.ask("Quel jour aujourd'hui"));
	}
	
	@Test
	public void testNotToday() {
		assertEquals(null, cell.ask("Quel ours jette-il?"));
	}

}
