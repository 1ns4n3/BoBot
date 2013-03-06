package IUT.BoBot.SmartCells;

import IUT.BoBot.SmartCell;

/**
 * Reply to Au revoir.
 *
 */
public class AurevoirCell implements SmartCell {
	
	public String ask(String question) {
		if(question.contains("Au revoir"))
		  return "Au revoir!";
		else
		  return null;
	}

}
