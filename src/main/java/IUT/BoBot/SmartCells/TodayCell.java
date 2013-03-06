package IUT.BoBot.SmartCells;

import java.util.Calendar;

import IUT.BoBot.SmartCell;

/**
 * Reply to "Quel jour est-il?"
 *
 */
public class TodayCell implements SmartCell {
	
	Calendar calendar;

	/**
	 * Initialize the cell with the date of today.
	 */
	public TodayCell() {
		this.calendar = Calendar.getInstance();
	}
	
	/**
	 * Initialize the cell with the date passed in.
	 */
	public TodayCell(Calendar calendar) {
		this.calendar = calendar;
	}
	
	public String ask(String question) {
		if(!question.contains("Quel jour aujourd'hui"))
			return null;
		
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		int month = calendar.get(Calendar.MONTH);
		int year = calendar.get(Calendar.YEAR);
		int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
		String jour = weekDays[dayOfWeek - 1];
		String mois = yearMonth[month];
		String date;
		return date = (jour  +" "+ dayOfMonth +" "+ mois +" "+ year);

	}
	
	private String[] weekDays = new String[] { 
			"Dimanche", "Lundi", "Mardi", "Mercredi",
			"Jeudi", "Vendredi", "Samedi" 
			};
	private String[] yearMonth = new String[] { 
			"Janvier", "Fevrier", "Mars", "Avril",
			"Mai", "Juin", "Juillet", "Aout", "Septembre", "Octobre", "Novembre", "Decembre" 
			};



}
