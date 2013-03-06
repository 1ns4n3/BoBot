package IUT.BoBot.SmartCells;

import java.util.Calendar;

import IUT.BoBot.SmartCell;

/**
 * Reply to "Quel serons nous demain ?"
 *
 */
public class TomorrowCell implements SmartCell {
	
	Calendar calendar;

	/**
	 * Initialize the cell with the date of today.
	 */
	public TomorrowCell() {
		this.calendar = Calendar.getInstance();
	}
	
	/**
	 * Initialize the cell with the date passed in.
	 */
	public TomorrowCell(Calendar calendar) {
		this.calendar = calendar;
	}
	
	public String ask(String question) {
		if(!question.contains("Quel jour demain"))
			return null;
		
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		int month = calendar.get(Calendar.MONTH);
		int year = calendar.get(Calendar.YEAR);
		int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
		String jour = weekDays[dayOfWeek];
		String mois = yearMonth[month];
		String date;
		return date = (jour  +" "+ (dayOfMonth+1) +" "+ mois +" "+ year);
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
