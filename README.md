
# Superlliga 1r DAM
## Descripció
Aquest projecte és una aplicació Java que modela participants, jugadors i entrenadors. Utilitza Maven per a la gestió del projecte i de les dependències. L'aplicació carrega dades des d'un fitxer JSON i les processa per mostrar informació sobre els equips, jugadors titulars i suplents.

## Estructura del Projecte
- `src/main/java/org/Participant.java`: Defineix la classe `Participant` amb atributs i mètodes bàsics.
- `src/main/java/org/Jugador.java`: Defineix la classe `Jugador`, que extén `Participant` i afegeix un atribut de rol.
- `src/main/java/org/Entrenador.java`: Defineix la classe `Entrenador`, que extén `Participant`.
- `src/main/java/org/carregarDades.java`: Conté la lògica per carregar i processar les dades des d'un fitxer JSON.

## Prerequisits
- Java 11 o superior
- Maven 3.6 o superior

## Classes

### Participant
Representa un participant amb els següents atributs:
- `nom`: Nom
- `cognom`: Cognom
- `nickname`: Sobrenom
- `edat`: Edat

### Jugador
Representa un jugador, estenent `Participant` amb un atribut addicional:
- `rol`: Rol

### Entrenador
Representa un entrenador, estenent `Participant`.

### carregarDades
Conté la lògica per carregar i processar les dades des d'un fitxer JSON. Utilitza la llibreria Gson per convertir el JSON en objectes Java i accedir a la informació dels equips, jugadors titulars i suplents.
