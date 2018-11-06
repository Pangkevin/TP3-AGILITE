package starWars;

public class Padawan extends Individu {

	private Maitre maitre = null;

	public Padawan(String nom, String prenom, String faction) {
		super(nom, prenom, faction);

	}

	public Maitre getMaitre() {
		return maitre;
	}

	/**
	 * On va tester si le nouveau maitre est bien différent de l'ancien maitre //
	 * Nous avons redifini le equals de la classe maitre
	 * 
	 * @param maitre
	 */
	public void setMaitre(Maitre maitre) {
		if (this.maitre != null) {
			if (!this.maitre.equals(maitre)) {
				this.supprimerMaitre();
				this.maitre = maitre;
			}

		} else {

			this.maitre = maitre;
			this.maitre.getListPadawan().add(this);
		}

	}

	@SuppressWarnings("unlikely-arg-type")
	public void supprimerMaitre() {

		if (this.maitre != null) {
			this.maitre.getListPadawan().remove(this);
			this.maitre = null;
		}

	}

}
