/* *****************************************************************************************************
 * Folgen Sie den Todo-Anweisungen und beachten Sie die Kommentare der einzelnen Methoden!
 * Fuegen Sie Code hinzu!
 * Aendern Sie vom vorhandenen Code nur die return-Anweisungen!
 * Die Klasse Aktion enthaelt ausschliesslich Klassenmethoden. 
 * Auf diese koennen Sie von ausserhalb der Klasse mit dem Punktoperator zugreifen, 
 * z. B. Aktion.istGueltigeAktion("Papier")
 ****************************************************************************************************** */

public class Aktion {
	/*
	 * DIE BEIDEN KLASSENATTRIBUTE NICHT AENDERN! Verwenden Sie diese
	 * Klassenattribute in Ihrem Code. Veraendern Sie insbesondere nicht die
	 * Reihenfolge der Aktionen im Feld AKTIONEN.
	 */
	private static final String[] AKTIONEN = { "Schere", "Echse", "Papier", "Spock", "Stein" };
	private static final int N = 5;

	/*
	 * NICHT AENDERN! Sie koennen diese Methode in Ihrem Code verwenden. Gibt den
	 * String zurueck, der an Stelle index in AKTIONEN steht. Gibt "" zurueck, wenn
	 * der Index nicht gueltig ist.
	 */
	public static String getAktion(int index) {
		if (index >= 0 && index < N)
			return AKTIONEN[index];
		return "";
	}

	/*
	 * Gibt true zurueck, wenn es sich um eine gueltige Aktion, also ein Element des
	 * Feldes AKTIONEN handelt. Sonst false.
	 */
	public static boolean istGueltigeAktion(String aktion) {
		// TODO
		// ggf Anweisungen hinzufuegen

		// unbedingt return-Anweisung aendern
		for (int i = 0; i < N; i++) {
			if (AKTIONEN[i].equals(aktion)) {
				return true;
			}
		}
		return false;
	}

	/*
	 * Gibt den Index zurueck, an dem die Aktion im Feld AKTIONEN steht, z. B. 2
	 * fuer "Papier". Gibt -1 zurueck, wenn es sich um eine ungueltige Aktion
	 * handelt.
	 */
	public static int getIndex(String aktion) {
		// TODO
		// ggf Anweisungen hinzufuegen

		// unbedingt return-Anweisung aendern
		for (int i = 0; i < N; i++) {
			if (AKTIONEN[i].equals(aktion)) {
				return i;
			}
		}
		return -1;
	}

	/*
	 * Vergleicht die aktuell gesetzten Aktionen von Spieler s1 und Spieler s2. Gibt
	 * null zurueck, wenn die Aktionen gleich sind, die Runde also unentschieden
	 * endet. Gibt s1 zurueck, wenn die Aktion von s1 der Aktion von s2 ueberlegen
	 * ist. Gibt s2 zurueck, wenn die Aktion von s2 der Aktion von s1 ueberlegen
	 * ist. Sie MUESSEN den Algorithmus aus der Aufgabenstellung umsetzen. Sie
	 * duerfen NICHT einzelne Kombinationen "von Hand" angeben. Das Bestehen des
	 * dazugehoerigen UnitTests "testWerGewinnt()" ist eine BESTEHENSVORAUSSETZUNG
	 * (von mehreren).
	 */
	public static Spieler werGewinnt(Spieler s1, Spieler s2) {
		// TODO
		// ggf Anweisungen hinzufuegen

		// unbedingt return-Anweisung aendern
		int i1=getIndex(s1.getAktion());
		int i2=getIndex(s2.getAktion());
		
		if(i1==i2) {
			return null;
		}
		int diff=(i2-i1+N)%N;
		
		if(diff<=N/2) {
			return s1;
		}else {
			return s2;
		}
	
	}

}
