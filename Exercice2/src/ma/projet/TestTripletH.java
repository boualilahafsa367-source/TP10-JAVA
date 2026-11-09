
package ma.projet;

public class TestTripletH {

    public static void main(String[] args) {

        // Triplet heterogene : Integer, String, Double
        TripletH<Integer, String, Double> th =
                new TripletH<>(42, "Answer", 3.14);

        th.affiche();

        // Exemple avec des objets de types differents
        TripletH<String, Integer, Boolean> th2 =
                new TripletH<>("Alice", 30, true);

        th2.affiche();

        // Utilisation des getters
        System.out.println("Premier element : " + th.getPremier());
        System.out.println("Deuxieme element : " + th.getSecond());
        System.out.println("Troisieme element : " + th.getTroisieme());
    }
}


