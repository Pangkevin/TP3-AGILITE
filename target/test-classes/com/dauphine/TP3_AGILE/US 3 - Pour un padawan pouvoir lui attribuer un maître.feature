#Author: Kévin Pang & Alexandre Cote

@tag
Feature: US 3 - Pour un padawan pouvoir lui attribuer un maitre 

En tant que createur d univers, je veux pouvoir attribuer un maitre a un padawan

  @tag1
  Scenario: Attribuer un maitre a un padawan
    Given un padawan et un maitre 
    When le createur d univers valide l attribution d'un maitre a un padawan
    Then ce maitre est attribue au padawan 
   
   
    @tag2
  	Scenario: Connaitre la liste des padawans d'un maitre
    Given des padawan et un maitre existant 
    When le createur d univers a rattache zero ou plus padawans a un maitre 
    Then La liste des padawans d'un maitre contient bien ses padawans rajoutes

  