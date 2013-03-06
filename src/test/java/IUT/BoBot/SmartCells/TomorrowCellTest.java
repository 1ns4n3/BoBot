package IUT.BoBot.SmartCells;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;

public class TomorrowCellTest {
	
	// Tests should not depend on the current date.
	// So initialize the TodayCell with a fixed date.
	Calendar calendar = Calendar.getInstance();
	TomorrowCell cell = new TomorrowCell(calendar);
	
	@Before
	public void setUp() {
		calendar.set(2013, 2, 6);
	}
	
	@Test
	public void testTomorrow() {
		assertEquals("Jeudi 7 Mars 2013", cell.ask("Quel jour demain"));
	}
	
	@Test
	public void testNotTomorrow() {
		assertEquals(null, cell.ask("Quel ours jette-il?"));
	}

}
