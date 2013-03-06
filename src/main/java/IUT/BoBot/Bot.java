package IUT.BoBot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.GregorianCalendar;

import IUT.BoBot.SmartCell;
import IUT.BoBot.SmartCells.*;


public class Bot 
{
	/**
	 * List of SmartCells the questions go through to
	 * find an answer.
	 */
	final static SmartCell[] smartCells = new SmartCell[] {
		new TomorrowCell(),
		new AurevoirCell(),
		new BonjourCell(),
		new BonjourWithNameCell(),
		new TodayCell()
	};

	/**
	 * Ask something to BoBot, it will respond to you.
	 * 
	 * @param question The question you ask.
	 * @return An answer... or null if it doesn't get it.
	 */
	public static String ask(String question) {
		for(SmartCell cell:smartCells) {
			String answer = cell.ask(question);
			if(answer != null)
			  return answer;
		}
		return null;
	}
	
	public static void main(String[] args) throws IOException {
		// Qui suis-je ?
		System.out.println("Robot BoBot !");
		
		// Flux de lecture
		InputStreamReader isr = new InputStreamReader(System.in); 
		BufferedReader in = new BufferedReader(isr);
		for(;;){
			String nom = in.readLine(); 
			System.out.println(ask(nom));
			System.out.println("LOL!");
		}
		
		
		
	}
}
