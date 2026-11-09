
package ma.projet;

public class TestTriplet {

    public static void main(String[] args) {

        // Creation d'un triplet d'entiers
        Triplet<Integer> tInt = new Triplet<>(1, 2, 3);
        tInt.affiche();

        // Creation d'un triplet de chaines de caracteres
        Triplet<String> tStr = new Triplet<>("A", "B", "C");
        tStr.affiche();

        // Utilisation du getter getSecond()
        System.out.println("Second element de tInt : "
                + tInt.getSecond());
    }
}

