#Author: Kévin Pang & Alexandre Cote
@tag
Feature: US 2 - Creer un maitre
  I want to use this template for my feature file
  
  En tant que createur d'univers
  Je veux pouvoir creer un maitre Jedi qui poss�de un nom, prenom, faction et un age
  afin d enrichir l'univers star wars

  @tag1
  Scenario Outline: Creation d'un maitre
    Given La creation d'un maitre possedant un <nom> <prenom> <faction>
    When le createur d univers valide la creation d un maitre apres avoir renseigne ces informations
    Then ce nom, prenom et faction sont attribues au maitre

    Examples: 
      | nom    | prenom | faction |
      | Kenobi | Obiwan | Jedi    |

  @tag2 @tag2
  Scenario Outline: Verifier l'age du maitre
    Given Pour pouvoir inserer un age au padawan, il faut lui donner une valeur <age>
    When le createur d'univers valide l'age du maitre
    Then l age du maitre doit etre obligatoirement superieur a O

    Examples: 
      | nom       | prenom | faction | age | résultat |
      | Skywalker | Anakin | Sith    |  -5 | Erreur   |
      | Kenobi    | Obiwan | Jedi    |  27 | Valide   |
