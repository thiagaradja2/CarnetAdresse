import java.util.Scanner;

public class Main {

	private static CarnetAdresses carnet;
	public static void main(String[] args) {
		carnet = new CarnetAdresses();
		
		//carnet.saisirPersonne();
		afficherMenu();
		
	}
	
	
	public static void afficherMenu() {
		System.out.println("==============MENU==============");
		System.out.println(" 1- Afficher le carnet ");
		System.out.println(" 2- Ajouter une personne ");
		System.out.println(" 3- Supprimer une personne");
		System.out.println(" 4- Rechercher une personne ");
		System.out.println(" 5- Trier le tableau ");
		System.out.println(" 6- Enregistrer le carnet ");
		
		System.out.println("================================");
		
		choixMenu();

	}
	
	public static void choixMenu() {
		Scanner scan = new Scanner(System.in);
		int choix = scan.nextInt();
		while(choix!=6) {
				switch(choix) {
			case 1 : 
				carnet.afficherCarnet();
				break;
			case 2 : 
				carnet.saisirPersonne();
				break;
			case 3: 
				System.out.println("Choisir l'index de la personne à supprimer");
				carnet.afficherCarnet();
				int indexASuppr = scan.nextInt();
				carnet.supprimerPersonneCarnet(indexASuppr);
				break;
			case 4 : 
				carnet.rechercherPersonne();
				break;
			case 5 : 
				carnet.trierCarnet();
				break;
			case 6 : 
				carnet.enregisterCarnet();
				break;
			default : 
				afficherMenu();
			
			}
				afficherMenu();
		}
	}
}
