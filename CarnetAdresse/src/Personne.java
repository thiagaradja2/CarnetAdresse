
public class Personne {

	private String nom ;
	private String prenom;
	private String dateNaissance;
	private String numero;
	private String adresse;
	
	public Personne() {
		
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	public void afficherPersonne() {
		System.out.println("Nom :"+ this.getNom());
		System.out.println("Prenom :"+ this.getPrenom());
		System.out.println("Numero :"+ this.getNumero());
		

	}
}
