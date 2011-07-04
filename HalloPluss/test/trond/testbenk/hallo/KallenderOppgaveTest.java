package trond.testbenk.hallo;

import static org.junit.Assert.*;

import org.junit.Test;

public class KallenderOppgaveTest {

	@Test
	public void testListeElementVanlig() {
		assertEquals(new Integer(1952),KalenderOppgave.hentListe().get(0));
		assertEquals(new Integer(1956),KalenderOppgave.hentListe().get(1));	
		assertEquals(61,KalenderOppgave.hentListe().size());
	}
	
	@Test
	public void testSpesialtilfeller(){
		assertTrue(KalenderOppgave.hentListe().contains(2000));
		assertTrue(KalenderOppgave.hentListe().contains(2004));
		assertFalse(KalenderOppgave.hentListe().contains(2100));
	}

}
