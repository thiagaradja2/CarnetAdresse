import java.util.Scanner;

public class CarnetAdresses {
	
	private Personne[] carnet;
	
	public CarnetAdresses() {
		
	}
	
	
	public void saisirPersonne() {
		Scanner sc =  new Scanner(System.in);
		Personne pers =  new Personne();
		System.out.println("Saisir le nom de la personne : ");
		String nom = sc.next();
		System.out.println("Saisir le prenom de la personne : ");
		String prenom = sc.next();
		System.out.println("Saisir le numéro de la personne : ");
		String numero =  sc.next();
		
		pers.setNom(nom);
		pers.setPrenom(prenom);
		pers.setNumero(numero);
		
		//System.out.println(pers.getNom());
		//System.out.println(pers.getPrenom());
		//System.out.println(pers.getNumero());

	}

}
