# Exercice 1 : Triplet homogène
<img width="1920" height="561" alt="Screenshot (1251)" src="https://github.com/user-attachments/assets/2466369c-6d66-4999-b660-af32aaaf64d3" />

Figure 1 : Résultat d'exécution du programme de manipulation d'un triplet générique.

Cet exercice a pour objectif de comprendre le principe de la généricité en Java à travers la création d'une classe générique appelée Triplet<T>.
Cette classe permet de stocker trois éléments appartenant au même type, tout en garantissant la sécurité des types lors de la compilation.
Le programme définit un constructeur pour initialiser les trois éléments, ainsi que des accesseurs (getters) pour récupérer leurs valeurs.
Il contient également une méthode affiche() permettant d'afficher le contenu du triplet. Le programme de test crée deux objets : un triplet d'entiers et un triplet de chaînes de caractères.
Le résultat d'exécution montre que la même classe peut être utilisée avec différents types de données et affiche également le deuxième élément du premier triplet.

# Exercice 2 : Triplet hétérogène
<img width="1920" height="561" alt="Screenshot (1252)" src="https://github.com/user-attachments/assets/20e4ae6a-f6b3-471d-a57d-124737798a70" />

Figure 2 : Résultat d'exécution du programme de manipulation d'un triplet hétérogène.

Cet exercice a pour objectif d'approfondir la notion de généricité en Java en utilisant plusieurs paramètres de type dans une même classe.
La classe générique TripletH<A,B,C> permet de stocker trois éléments appartenant à des types potentiellement différents.
Contrairement au triplet homogène, chaque attribut possède ici son propre paramètre de type, ce qui permet de mélanger des entiers, des chaînes de caractères et des nombres décimaux, par exemple.
Le constructeur initialise les trois éléments, tandis que les méthodes getters permettent de récupérer chaque valeur avec son type exact, sans effectuer de conversion.
La méthode affiche() présente le contenu du triplet à l'écran.
Le programme de test utilise plusieurs combinaisons de types afin de montrer que cette classe est réutilisable et garantit la sécurité des types. 
Le résultat d'exécution confirme le bon fonctionnement des différents triplets.

