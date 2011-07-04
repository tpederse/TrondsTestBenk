package trond.testbenk.hallo;

import java.util.ArrayList;
import java.util.List;

public class KalenderOppgave {

	public static List<Integer> hentListe() {
		
		ArrayList<Integer> returVerdi = new ArrayList<Integer>();
		
		for (int aarSomSkalSjekkes = 1950; aarSomSkalSjekkes < 2201; aarSomSkalSjekkes++) {
			if(isSkuddaar(aarSomSkalSjekkes))returVerdi.add(aarSomSkalSjekkes);
		}
		return returVerdi;
	}

	private static boolean isSkuddaar(int potensieltSkuddaar) {
		if(potensieltSkuddaar % 400 == 0) return true;
		if(potensieltSkuddaar % 100 == 0) return false;
		if(potensieltSkuddaar % 4 == 0) return true;
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(hentListe());
	}

}
