#Author: Kévin Pang & Alexandre Cote

@tag
Feature: US 1 - Creer un Padawan
  I want to use this template for my feature file

En tant que createur d'univers
Je veux pouvoir creer un padawan (apprenti jedi) qui possede un nom, prenom, faction et un age
afin d enrichir l'univers star wars

  @tag1
  Scenario Outline: Creation d'un padawan
    Given La creation dun padawan possedant un <nom> <prenom> <faction>
    When le createur d univers valide la creation d un padawan apres avoir renseigne ces informations
    Then ce nom, prenom et faction sont attribues au padawan 

    Examples: 
   | nom         | prenom  | faction |
   | Skywalker   | Anakin  | Sith    |
   
     @tag2
  Scenario Outline: Verifier l'age du padawan
    Given Pour pouvoir inserer un age au padawan, il faut lui donner une valeur <age>
    When le createur d'univers valide l'age du padawan
    Then l age doit etre obligatoirement superieur a O

    Examples: 
   | nom         | prenom  | faction | age| résultat |
   | Skywalker   | Anakin  | Sith    | -5 |Erreur    |
   | Kenobi      | Obiwan  | Jedi    | 27 |Valide    |