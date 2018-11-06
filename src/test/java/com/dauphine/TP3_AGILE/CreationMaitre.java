package com.dauphine.TP3_AGILE;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import starWars.Maitre;

public class CreationMaitre {
	private Maitre anakin;
	private Maitre obiwan;

	// Les champs de renseignement de lidentite d'anakin
	private String nomObiwan;
	private String prenomObiwan;
	private String factionObiwan;

	// les variables dage

	private int agePositif;
	private int ageNegatif;

	@Given("^La creation d'un maitre possedant un Kenobi Obiwan Jedi$")
	public void la_creation_d_un_maitre_possedant_un_Kenobi_Obiwan_Jedi() throws Exception {
		this.nomObiwan = "Kenobi";
		this.prenomObiwan = "Obiwan";
		this.factionObiwan = "Jedi";
	}

	@When("^le createur d univers valide la creation d un maitre apres avoir renseigne ces informations$")
	public void le_createur_d_univers_valide_la_creation_d_un_maitre_apres_avoir_renseigne_ces_informations()
			throws Exception {
		this.obiwan = new Maitre(this.nomObiwan, this.prenomObiwan, this.factionObiwan);
	}

	@Then("^ce nom, prenom et faction sont attribues au maitre$")
	public void ce_nom_prenom_et_faction_sont_attribues_au_maitre() throws Exception {
		assertEquals("Jedi", obiwan.getFaction());
		assertEquals("Kenobi", obiwan.getNom());
		assertEquals("Obiwan", obiwan.getPrenom());
	}

	@Given("^Pour pouvoir inserer un age au maitre, il faut lui donner une valeur -(\\d+)$")
	public void pour_pouvoir_inserer_un_age_au_maitre_il_faut_lui_donner_une_valeur(int arg1) throws Exception {
		this.ageNegatif = arg1;
		this.obiwan = new Maitre("Kenobi", "Obiwan", "Jedi");

	}

	@Given("^Pour pouvoir inserer un age au maitre, il faut lui donner une valeur (\\d+)$")
	public void pour_pouvoir_inserer_un_age_au_maitre_il_faut_lui_donner_une_valeur2(int arg1) throws Exception {

		this.agePositif = arg1;
	}

	@When("^le createur d'univers valide l'age du maitre$")
	public void le_createur_d_univers_valide_l_age_du_maitre() throws Exception {

	}

	@Then("^l age du maitre doit etre obligatoirement superieur a O$")
	public void l_age_du_maitre_doit_etre_obligatoirement_superieur_a_O() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		pour_pouvoir_inserer_un_age_au_maitre_il_faut_lui_donner_une_valeur(-5);
		pour_pouvoir_inserer_un_age_au_maitre_il_faut_lui_donner_une_valeur2(27);
		try {

			this.obiwan.setAge(this.agePositif);
			this.anakin.setAge(this.ageNegatif);
		} catch (Exception e) {

			assertTrue(true);
			assertEquals(this.obiwan.getAge(), 27);
		}
	}

}
