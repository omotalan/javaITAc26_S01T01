# Nom del Projecte
**Descripció**: Sprint 1, Tasca 1, Nivell 1, Exercici 2

## 📌 Enunciat del exercici (si és aplicable)
Exercici 2 – Classe Cotxe
Objectiu

Amb aquest exercici aprendràs la diferència entre els modificadors static i final aplicats a atributs i mètodes. Veuràs com es comporten aquestes paraules clau i en quins casos un atribut pot o no pot ser inicialitzat al constructor. També entendràs la diferència entre mètodes estàtics i no estàtics, i com s’invoquen correctament des del main().
Enunciat

Has de crear una classe que representi un cotxe amb algunes particularitats que et permetran entendre com funciona la memòria i la inicialització en Java.
Passos a seguir
Fes un commit explicatiu per a cada punt, seguint l’estàndard de Conventional Commits.

    Crea una classe anomenada Car amb els següents atributs:
        brand: ha de ser static final
        model: ha de ser static
        power: ha de ser final
    Reflexiona, comprova i documenta al teu Readme:
        Quin d’aquests atributs pot ser inicialitzat des del constructor?
        Quin no es pot modificar mai?
        Quin afecta totes les instàncies de la classe?
    Afegeix dos mètodes:
        Un mètode estàtic anomenat brake() que mostri per consola:
        "El vehicle està frenant"
        Un mètode no estàtic anomenat accelerate() que mostri per consola:
        "El vehicle està accelerant"
    Crea una classe Main amb el mètode main() i:
        Crida el mètode brake() sense crear cap objecte.
        Crea una instància de Car i crida el mètode accelerate() des d’aquesta instància.

Et pot ajudar a entendre millor el comportament de static fer servir System.out.println() per imprimir valors i comprovar quan canvien i quan no. Pots provar a crear diversos cotxes i veure si els canvis en el model afecten a tots, o només a un. Documenta les teves descobertes.


## ✨ Funcionalitats (si és aplicable)

## 🛠 Tecnologies
- Backend: Java

## 🚀 Instal·lació i Execució
1. Clonar el repositori: `git clone ...`
2. Execució del "Main"


## 📸 Demo
```bash
El vehicle està frenant
El vehicle està accelerant
Car model set successfully: Elantra
i20 Car instance model name: Elantra
tucson Car instance model name: Elantra

Process finished with exit code 0
```

# Cuestions extras

## Quin d’aquests atributs pot ser inicialitzat des del constructor?

Nomès els atributs que no són static. Els static pertanyen a la classe, aixì que inicialitzar-los desde el constructor
no compilaria - els static es deuen inicialitzar-se juntament amb la propia classe.

## Quin no es pot modificar mai?

Els atributs _final_ - els inicialitzem amb uns valor definits i ja està, no es canvia mai.

## Quin afecta totes les instàncies de la classe?

Els atributs static, que pertanyen a la classe i mai a les instàncies.