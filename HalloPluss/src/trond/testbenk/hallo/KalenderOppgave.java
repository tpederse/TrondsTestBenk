package trond.testbenk.hallo;

import java.util.ArrayList;
import java.util.List;

public class KalenderOppgave {

	public static List<Integer> hentListe() {
		
		ArrayList<Integer> returnValue = new ArrayList<Integer>();
		
		for (int yearToCheck = 1950; yearToCheck < 2201; yearToCheck++) {
			if(isSkuddaar(yearToCheck))returnValue.add(yearToCheck);
		}
		return returnValue;
	}

	private static boolean isSkuddaar(int yearToCheck) {
		if(yearToCheck % 400 == 0) return true;
		if(yearToCheck % 100 == 0) return false;
		if(yearToCheck % 4 == 0) return true;
		return false;
	}
	

}
