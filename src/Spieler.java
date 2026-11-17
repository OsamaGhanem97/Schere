/* *****************************************************************************************************
 * Folgen Sie den Todo-Anweisungen und beachten Sie die Kommentare!
 * Fuegen Sie Code hinzu!
 * Aendern Sie vom vorhandenen Code nur die return-Anweisungen!
 ****************************************************************************************************** */

public class Spieler {

	/* Legen Sie Objektattribute an */
	// TODO

	/* Vervollstaendigen Sie den Konstruktor */
	private String name;
	private String aktion;
	private int rundensiege;

	public Spieler(String name) {
		// TODO
		this.name = name;
		this.aktion = "";
		this.rundensiege = 0;
	}

	/* Vervollstaendigen Sie die Getter- und Setter-Methoden */
	public String getName() {
		// TODO
		// ggf Anweisungen hinzufuegen

		// unbedingt return-Anweisung aendern
		return name;
	}

	public String getAktion() {
		// TODO
		// ggf Anweisungen hinzufuegen

		// unbedingt return-Anweisung aendern
		return aktion;
	}

	public int getRundensiege() {
		// TODO
		// ggf Anweisungen hinzufuegen

		// unbedingt return-Anweisung aendern
		return rundensiege;
	}

	public void setName(String name) {
		// TODO
		this.name = name;
	}

	public void setAktion(String aktion) {
		// TODO
		this.aktion = aktion;
	}

	/* Die Anzahl der Rundensiege wird um 1 erhoeht */
	public void erhoeheRundensiege() {
		// TODO
		rundensiege++;
	}

}
