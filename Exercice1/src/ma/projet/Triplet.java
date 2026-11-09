
package ma.projet;

/**
 * Classe generique Triplet pour stocker trois objets du meme type.
 * @param <T> le type des trois elements
 */
public class Triplet<T> {

    // Trois attributs de meme type
    private final T premier;
    private final T second;
    private final T troisieme;

    // Constructeur principal
    public Triplet(T premier, T second, T troisieme) {
        this.premier = premier;
        this.second = second;
        this.troisieme = troisieme;
    }

    // Accesseur du premier element
    public T getPremier() {
        return premier;
    }

    // Accesseur du second element
    public T getSecond() {
        return second;
    }

    // Accesseur du troisieme element
    public T getTroisieme() {
        return troisieme;
    }

    // Affiche les trois elements
    public void affiche() {
        System.out.println("Triplet : ["
                + premier + ", "
                + second + ", "
                + troisieme + "]");
    }
}

