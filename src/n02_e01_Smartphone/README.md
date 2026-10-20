# Nom del Projecte
**Descripció**: Sprint 1, Tasca 1, Nivell 2, Exercici 1

## 📌 Enunciat del exercici (si és aplicable)
Exercici 1 – Smartphone amb múltiples funcionalitats
Objectiu

Amb aquest exercici practicaràs com es pot combinar l’herència de classes amb la implementació d’interfícies per crear objectes més complexos. Veuràs com una classe pot heretar atributs i comportaments d’una altra classe, i al mateix temps adoptar funcionalitats específiques a través d’interfícies.

Enunciat

Crea una classe anomenada Phone amb informació bàsica sobre un telèfon: marca i model. Aquesta classe ha d’incloure un mètode per fer trucades, que mostri per pantalla que s’està trucant al número passat com a paràmetre.

A continuació, defineix dues interfícies: una relacionada amb la funció de càmera (Camera), i una altra amb la funció de rellotge (Clock). Cada una ha de tenir un únic mètode que mostri per pantalla que s’està fent una foto o que està sonant una alarma.

Desenvolupa una classe anomenada Smartphone que sigui una extensió de Phone, i que a la vegada implementi les interfícies Camera i Clock. Implementa els comportaments perquè mostrin el missatge adequat per consola.

Finalment, des del main() de la teva aplicació, crea un objecte Smartphone, prova de fer una trucada, fer una foto i activar l’alarma.

Pensa en el teu Smartphone com un objecte que “pot fer coses”: pot trucar, pot fer fotos, pot sonar una alarma. Cadascuna d’aquestes accions podria ser compartida amb altres dispositius (una càmera de seguretat també pot fer fotos, un despertador pot sonar…). Les interfícies et permeten modelar aquest tipus de funcionalitats sense forçar relacions jeràrquiques entre classes.

## ✨ Funcionalitats (si és aplicable)

## 🛠 Tecnologies
- Backend: Java

## 🚀 Instal·lació i Execució
1. Clonar el repositori: `git clone ...`
2. Execució del "Main"


## 📸 Demo
```bash
Calling number 600123456...
Making photo...
Sounding alarm!

Process finished with exit code 0
```