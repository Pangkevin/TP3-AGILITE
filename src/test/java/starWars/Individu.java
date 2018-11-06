package starWars;

public class Individu {

	private String nom;
	private String prenom;
	private String faction;
	private Integer age = null;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0) {
			throw new IllegalArgumentException();
		} else {
			this.age = age;
		}

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

	public String getFaction() {
		return faction;
	}

	public void setFaction(String faction) {
		this.faction = faction;
	}

	public Individu(String nom, String prenom, String faction) {
		this.nom = nom;
		this.prenom = prenom;
		this.faction = faction;
	}

}
