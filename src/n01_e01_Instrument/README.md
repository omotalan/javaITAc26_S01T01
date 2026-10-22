# Instrument
**Descripció**: Sprint 1, Tasca 1, Nivell 1, Exercici 1

## 📌 Exercici 1 – Instruments musicals
```
Objectiu

En aquest exercici treballarem els conceptes d’herència i polimorfisme, dues peces clau de la programació orientada a objectes. També aprendrem com funciona la càrrega de classes a Java i descobrirem els blocs estàtics, que són útils per entendre com s’inicialitzen les classes en temps d’execució.

L’objectiu és entendre com podem compartir característiques comunes entre diferents objectes i, al mateix temps, fer que cadascun es comporti de manera específica.

Enunciat

Estem dissenyant un programa per gestionar instruments musicals d’un grup de música. En aquest grup, hi ha tres tipus d’instruments:

    Instruments de vent
    Instruments de corda
    Instruments de percussió

Tots aquests instruments tenen dues característiques en comú: un nom i un preu. A més, tots poden tocar-se, però ho fan de maneres diferents.
Passos a seguir
Fes un commit explicatiu per a cada punt, seguint l’estàndard de Conventional Commits.

    Crea una classe abstracta anomenada Instrument, amb:
        Dos atributs: name i price
        Un mètode abstracte anomenat play()
    Crea tres subclasses que heretin de Instrument:
        WindInstrument
        StringInstrument
        PercussionInstrument
    A cada subclasse, implementa el mètode play() perquè mostri per consola un missatge específic:
        "Està sonant un instrument de vent" per a WindInstrument
        "Està sonant un instrument de corda" per a StringInstrument
        "Està sonant un instrument de percussió" per a PercussionInstrument
    Afegeix una classe Main amb un mètode main() on:
        Es creï un objecte de cada tipus d’instrument
        Es cridi el mètode play() de cadascun per veure el comportament polimòrfic


Càrrega de classes i blocs estàtics

El procés de càrrega d’una classe en Java només es produeix una sola vegada durant l’execució del programa.

Demostra que aquesta càrrega es pot provocar de dues maneres:

    Quan es crea la primera instància de la classe.
    Quan s’accedeix a un membre estàtic de la classe (com un mètode o atribut static).

Per comprovar-ho, afegeix un bloc estàtic dins la classe i observa quan s’executa.

A més, investiga i documenta per tu mateix:

    Què és un bloc d’inicialització (sense static)?
    Quan s’executa?
    Quina diferència hi ha entre aquest i un bloc static?
```

## ✨ Funcionalitats (si és aplicable)
- Retrieve instrument information
- "Play" instrument by calling a shared method

## 🛠 Tecnologies
- Backend: Java

## 🚀 Instal·lació i Execució
1. Clonar el repositori: `git clone javaITAc26_S01T01`
2. Execució del "Main"



## 📸 Demo
```bash
/usr/lib/jvm/java-1.21.0-openjdk-amd64/bin/java -javaagent:/home/alan/idea-2026.1.1/idea-IU-261.23567.138/lib/idea_rt.jar=43483 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /home/alan/alan_projects/javaITAc26_S01T01/out/production/javaITAc26_S01T01 n01_e01_Instrument.Main
Constructor ejecutado: n01_e01_Instrument.objects.WindInstrument@6acbcfc0
Constructor ejecutado: n01_e01_Instrument.objects.StringInstrument@6f496d9f
Constructor ejecutado: n01_e01_Instrument.objects.PercussionInstrument@10f87f48
Instrument created: agogo
Està sonant un instrument de percussió
Instrument created: citar
Està sonant un instrument de corda
Instrument created: flute
Està sonant un instrument de vent

Process finished with exit code 0
```

# Cuestions extras

## Què és un bloc d’inicialització (sense static)?
És el bloc dintre de la classe que s'utilitza per inicialitzar una instància d'aquesta classe.
No són els statics, perquè pertanyen a la instància; els statics pertanyen a la classe.

## Quan s’executa?
Quan es crida `new Classe()`

## Quina diferència hi ha entre aquest i un bloc static?
El bloc static pertany a la classe i no a una instància d'ella, doncs inicialitza els atributs de classe.
Com no hi ha instància, només s'inicialitza una vegada per programa (e.g. el "main")