package com.dauphine.TP3_AGILE;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import starWars.Padawan;

class CreationPadawanTest {

	private Padawan anakin;

	// Les champs de renseignement de l'identite d'anakin
	private String nomAnakin;
	private String prenomAnakin;
	private String factionAnakin;

	@Given("^La creation dun padawan possedant un Skywalker Anakin Sith$")
	public void la_creation_dun_padawan_possedant_un_Skywalker_Anakin_Sith() throws Exception {
		this.nomAnakin = "Skywalker";
		this.prenomAnakin = "Anakin";
		this.factionAnakin = "Sith";
	}

	@When("^le createur d'univers valide la creation d'un padawan apres avoir renseigne ces informations$")
	public void le_createur_d_univers_valide_la_creation_d_un_padawan_apres_avoir_renseigne_ces_informations() throws Exception {
		this.anakin = new Padawan(this.nomAnakin, this.prenomAnakin, this.factionAnakin);   
	}

	@Then("^ce nom, prenom et faction sont attribues au padawan$")
	public void ce_nom_prenom_et_faction_sont_attribues_au_padawan() throws Exception {
		assertEquals("Sith", anakin.getFaction());
		assertEquals("Skywalker", anakin.getNom());
		assertEquals("Anakin", anakin.getPrenom());
	}

	@Given("^Pour pouvoir inserer un age au padawan, il faut lui donner une valeur -(\\d+)$")
	public void pour_pouvoir_inserer_un_age_au_padawan_il_faut_lui_donner_une_valeur(int arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions   
	}

	@When("^le createur d'univers valide l'age du padawan$")
	public void le_createur_d_univers_valide_l_age_du_padawan() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("^l'age doit etre obligatoirement superieur a O$")
	public void l_age_doit_etre_obligatoirement_superieur_a_O() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	}
}