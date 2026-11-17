import java.util.Random;

/* *****************************************************************************************************
 * Folgen Sie den Todo-Anweisungen und beachten Sie die Kommentare!
 ****************************************************************************************************** */

public class Computer extends Spieler {
	/* Verwenden Sie weiter unten dieses Klassenattribut */
	protected static Random rd = new Random();
	
	public Computer() {
		// TODO 
		// Aendern Sie den Aufruf des Superkonstruktors
		// Attribut name soll den Wert "Computer" erhalten
		super("Computer");
	}
	
	/* Es wird eine Zufallszahl zwischen 0 und 4 bestimmt und das entsprechende
	 * Element aus dem Feld AKTIONEN der Klasse Aktion ausgewaehlt.*/
	public void setAktion() {
		// TODO
		int z=rd.nextInt(5);
		super.setAktion(Aktion.getAktion(z));
	}

}
