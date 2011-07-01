package trond.testbenk.hallo;

import java.util.ArrayList;
import java.util.List;

public class KalenderOppgave {

	public static List<Integer> hentListe() {
		
		ArrayList<Integer> returnValue = new ArrayList<Integer>();
		
		for (int yearToCheck = 1950; yearToCheck < 2201; yearToCheck++) {
			if(yearToCheck % 4 == 0 		// delelig p� fire
			   && ! (yearToCheck % 100 == 0   // og ikke delelig p� 100
					 && !(yearToCheck % 400 == 0)  //hvis ikke delielig p� 400
			))returnValue.add(yearToCheck);
		}
		return returnValue;
	}
	

}
