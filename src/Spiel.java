import java.util.Scanner;

/* *****************************************************************************************************
 * Folgen Sie den Todo-Anweisungen und beachten Sie die Kommentare!
 * Fuegen Sie Code, insbesondere weitere Methoden, hinzu!
 * Aendern Sie vom vorhandenen Code nur die return-Anweisung von checkEingabeMenu()
 ****************************************************************************************************** */

public class Spiel {

	private static Scanner sc = new Scanner(System.in);
	public static Computer cp=null;
	 public static Spieler sp=null;
	public static void main(String[] args) {
	   
	    do {
		int eingabe;
		do {
			System.out.println("Schere-Stein-Papier-Echse-Spock");
			System.out.println("1- Spielen");
			System.out.println("2- Programm beenden");			
			eingabe=sc.nextInt();
		}while(!checkEingabeMenu(eingabe));
		if(eingabe==1) {
			System.out.println("Geben Sie den Namen des Spielers ein: ");
			String name=sc.next();
			sp=new Spieler(name);
			cp=new Computer();
			String aktion;
			do {
			do {
			System.out.println(sp.getName()+" , gib eine Aktionen an(Schere, Papier,Stein,Echse;Spock) ");
			 aktion=sc.next();
	     	}while(!Aktion.istGueltigeAktion(aktion));	
			cp.setAktion();
			System.out.println("Computer waehlt Aktion "+cp.getAktion());
			
			Spieler gewinner=Aktion.werGewinnt(sp, cp);
			if(gewinner==null) {
				System.out.println("Die Runde endet unentschieden. ");
			}else {
			System.out.println(gewinner.getName()+" hat diese Runde gewonnen");
			gewinner.erhoeheRundensiege();
			}
			System.out.println("Aktueller Stand: ");
			System.out.println(sp.getName()+" : "+sp.getRundensiege());
			System.out.println(cp.getName()+" : "+cp.getRundensiege());
			
			}while(!gewonnen(sp,cp));
			System.out.println("Ergebnis: ");
			if(sp.getRundensiege()==3) {
				System.out.println(sp.getName()+"hat mit "+ sp.getRundensiege()+":"+cp.getRundensiege() +" gewonnen");
			}else {
				System.out.println(cp.getName()+"hat mit "+ cp.getRundensiege()+":"+sp.getRundensiege() +" gewonnen");
			}
			
		}
	    
		// TODO
		// Spielablauf implementieren
		// Die Klassen Spieler, Computer und Aktion verwenden
         System.out.println();
		sc.close();
	    }while(true);
	}

	/*
	 * Gibt bei Eingabe von 1 oder 2 true zurueck Sonst false
	 */
	public static boolean checkEingabeMenu(int eingabe) {
		// TODO
		// ggf Anweisungen hinzufuegen

		// unbedingt return-Anweisung aendern
		if (eingabe == 1 || eingabe == 2) {
			return true;
		}
		return false;
	}
	
	public static boolean gewonnen(Spieler sp1,Computer cp1) {
		if(sp1.getRundensiege()>=3||cp1.getRundensiege()>=3) {
			return true;
		}
		return false;
	}

}
