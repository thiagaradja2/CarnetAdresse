import java.io.File;
import java.io.FileWriter;
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
				this.carnet[i].afficherPersonne();
			
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
		
		Personne temp;
		for (int j = 0; j < this.nbPersonne; j++) {
	   	   for (int i = j + 1; i < this.nbPersonne; i++) {
			// comparing adjacent strings
	   		if(carnet[i].getNom()==carnet[j].getNom()) {
	   			if(carnet[i].getPrenom()==carnet[j].getPrenom()) {
	   				if (carnet[i].getNumero().compareTo(carnet[j].getNumero()) < 0) {
						temp = carnet[j];
						this.carnet[j] = this.carnet[i];
						this.carnet[i] = temp;
					}
	   			}
	   			else if(carnet[i].getPrenom().compareTo(carnet[j].getPrenom()) < 0) {
					temp = carnet[j];
					this.carnet[j] = this.carnet[i];
					this.carnet[i] = temp;
				}
	   		}
	   		else if(carnet[i].getNom().compareTo(carnet[j].getNom()) < 0) {
				temp = carnet[j];
				this.carnet[j] = this.carnet[i];
				this.carnet[i] = temp;
			}
		   }
		  
		}
		
	}
	
	public void rechercherPersonne() {
		
		
		
	}
	
	public void enregisterCarnet() {
		
		try{
			File ff=new File("CarnetSauvegarde.txt"); // définir l'arborescence
			ff.createNewFile();
			FileWriter ffw=new FileWriter(ff);
			ffw.write(" ****** ");  // écrire une ligne dans le fichier resultat.txt
			ffw.write("\n"); // forcer le passage à la ligne
			ffw.close(); // fermer le fichier à la fin des traitements
			System.out.println("succés");
			} 
		catch (Exception e) {
			System.out.println("erreur");
		}
		
	}

}
