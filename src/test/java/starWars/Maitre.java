package starWars;

import java.util.ArrayList;
import java.util.List;

public class Maitre extends Individu {

	public Maitre(String nom, String prenom, String faction) {
		super(nom, prenom, faction);

	}

	private List<Padawan> listPadawan = new ArrayList<Padawan>();

	public List<Padawan> getListPadawan() {
		return listPadawan;
	}

	// Redéfinir les équals

	@Override
	public boolean equals(Object test1) {
		if (test1 == null)
			return false;
		if (test1 == this)
			return true;
		if (!(test1 instanceof Maitre)) {
			return false;
		} else {
			Maitre test2 = (Maitre) test1;

			if (test2.getNom().equals(this.getNom()) && test2.getPrenom().equals(this.getPrenom())
					&& test2.getFaction().equals(this.getFaction())) {

				return true;
			}

		}
		return false;
	}

}
