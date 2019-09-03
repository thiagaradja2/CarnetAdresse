import java.util.Scanner;

public class CarnetAdresses {
	
	private Personne[] carnet;
	private int nbPersonne;
	
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

	}
	
	public void afficherCarnet() {
		for (int i=0; i<this.carnet.length;i++)
		{
			System.out.println("Index "+i+": ");
			System.out.println(carnet[i].getNom());
			System.out.println(carnet[i].getPrenom());
			System.out.println(carnet[i].getNumero());
		}
	}
	public void ajouterPersonneCarnet(Personne personne) {
		Personne[] newCarnet = new Personne[this.carnet.length + 1] ;
		for (int i = 0; i < this.carnet.length; i ++) {
			newCarnet[i] = carnet[i];
		}
		newCarnet[this.carnet.length] = personne;
	}
	public void supprimerPersonneCarnet(int index) {
		
	}

}
