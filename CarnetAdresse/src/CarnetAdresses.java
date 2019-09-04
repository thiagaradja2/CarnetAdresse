import java.util.Scanner;

public class CarnetAdresses {
	
	private Personne[] carnet;
	private int nbPersonne=0;
	
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
		
		ajouterPersonneCarnet(pers);

	}
	
	public void afficherCarnet() {
		if(this.nbPersonne>0) {
			for (int i=0; i<this.nbPersonne;i++)
			{
				System.out.println("Index "+i+": ");
				System.out.println("Nom : "+this.carnet[i].getNom());
				System.out.println("Prenom : "+this.carnet[i].getPrenom());
				System.out.println("Numero : "+this.carnet[i].getNumero());
				System.out.println(" ----------------------- ");
				System.out.println("  ");
			}
		}
		else {
			System.out.println("Il n'y a personne a afficher");
		}
		
	}
	public void ajouterPersonneCarnet(Personne personne) {
		Personne[] newCarnet = new Personne[this.nbPersonne + 1] ;
		for (int i = 0; i < this.nbPersonne; i ++) {
			newCarnet[i] = carnet[i];
		}
		newCarnet[this.nbPersonne] = personne;
		this.carnet=newCarnet;
		this.nbPersonne++;
	}
	
	public void supprimerPersonneCarnet(int index) {
		
		//System.out.println("nbpers "+nbPersonne);
		//System.out.println("index "+index );
		if(this.nbPersonne <  index ||  index < 0) {
			System.out.println("Impossible de supprimer cette personne");
		}
		if(this.nbPersonne == 0) {
			System.out.println("Impossible de supprimer aucune personne est enregistrée");
		}
		
		if(index == this.nbPersonne-1) {
			this.nbPersonne --;
		}
		else {
			for(int i = index; i<this.nbPersonne-1;i++) {
				this.carnet[i]=this.carnet[i+1];
			}
			this.nbPersonne--;
		}
		
		
		
		
		
	}
	
	
	public void trierCarnet() {
		
	}
	
	public void rechercherPersonne() {
		
	}

}
