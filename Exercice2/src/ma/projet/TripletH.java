
package ma.projet;

/**
 * Classe generique TripletH pour trois objets de types differents.
 *
 * @param <A> type du premier element
 * @param <B> type du second element
 * @param <C> type du troisieme element
 */
public class TripletH<A, B, C> {

    // Attributs de types potentiellement differents
    private final A premier;
    private final B second;
    private final C troisieme;

    // Constructeur principal
    public TripletH(A premier, B second, C troisieme) {
        this.premier = premier;
        this.second = second;
        this.troisieme = troisieme;
    }

    // Accesseur du premier element
    public A getPremier() {
        return premier;
    }

    // Accesseur du second element
    public B getSecond() {
        return second;
    }

    // Accesseur du troisieme element
    public C getTroisieme() {
        return troisieme;
    }

    // Affiche les trois elements
    public void affiche() {
        System.out.println("TripletH : ["
                + premier + ", "
                + second + ", "
                + troisieme + "]");
    }
}
