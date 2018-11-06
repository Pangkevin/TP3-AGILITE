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
	 * On va tester si le nouveau maitre est bien diff�rent de l'ancien maitre //
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
			// Permet de ne pas rajouter le même Padawan dans la liste d'un même maitre
			if (!maitre.getListPadawan().contains(this)) {

				this.maitre.getListPadawan().add(this);
			}
		}

	}

	@SuppressWarnings("unlikely-arg-type")
	public void supprimerMaitre() {

		if (this.maitre != null) {
			this.maitre.getListPadawan().remove(this);
			this.maitre = null;
		}

	}

	// Red�finir les �quals

	@Override
	public boolean equals(Object test1) {
		if (test1 == null)
			return false;
		if (test1 == this)
			return true;
		if (!(test1 instanceof Padawan)) {
			return false;
		} else {
			Padawan test2 = (Padawan) test1;

			if (test2.getNom().equals(this.getNom()) && test2.getPrenom().equals(this.getPrenom())
					&& test2.getFaction().equals(this.getFaction())) {

				return true;
			}

		}
		return false;
	}

}
