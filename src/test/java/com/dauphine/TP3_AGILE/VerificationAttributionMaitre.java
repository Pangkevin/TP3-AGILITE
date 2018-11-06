package com.dauphine.TP3_AGILE;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import starWars.Maitre;
import starWars.Padawan;

public class VerificationAttributionMaitre {

	Maitre maitre;
	Padawan padawan;

	Padawan padawan2;

	@Given("^un padawan et un maitre$")
	public void un_padawan_et_un_maitre() throws Exception {

		this.maitre = new Maitre("Kenobi", "Obiwan", "Jedi");
		this.padawan = new Padawan("Skywalker", "Anakin", "Jedi");

	}

	@When("^le createur d univers valide l attribution d'un maitre a un padawan$")
	public void le_createur_d_univers_valide_l_attribution_d_un_maitre_a_un_padawan() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		this.padawan.setMaitre(this.maitre);
	}

	@Then("^ce maitre est attribue au padawan$")
	public void ce_maitre_est_attribue_au_padawan() throws Exception {

		un_padawan_et_un_maitre();
		le_createur_d_univers_valide_l_attribution_d_un_maitre_a_un_padawan();

		assertEquals(this.padawan.getMaitre(), this.maitre);

	}

	@Given("^des padawan et un maitre existant$")
	public void des_padawan_et_un_maitre_existant() throws Exception {

		this.maitre = new Maitre("Kenobi", "Obiwan", "Jedi");
		this.padawan = new Padawan("Skywalker", "Anakin", "Jedi");
		this.padawan2 = new Padawan("Tano", "Ashoka", "Jedi");
	}

	@When("^le createur d univers a rattache zero ou plus padawans a un maitre$")
	public void le_createur_d_univers_a_rattache_zero_ou_plus_padawans_a_un_maitre() throws Exception {
		this.padawan.setMaitre(this.maitre);
		this.padawan2.setMaitre(this.maitre);
	}

	@Then("^La liste des padawans d'un maitre contient bien ses padawans rajoutes$")
	public void la_liste_des_padawans_d_un_maitre_contient_bien_ses_padawans_rajoutes() throws Exception {
		des_padawan_et_un_maitre_existant();
		le_createur_d_univers_a_rattache_zero_ou_plus_padawans_a_un_maitre();
		assertTrue(this.maitre.getListPadawan().contains(this.padawan));
		assertTrue(this.maitre.getListPadawan().contains(this.padawan2));

	}
}
