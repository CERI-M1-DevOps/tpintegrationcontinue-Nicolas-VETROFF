package liste;

public class Noeud {
    private Object element;
    private Noeud suivant;

    /**
     * Construit un nouveau noeud
     * @param e élément à insérer
     * @param suivant élément suivant
     */
    public Noeud(int e, Noeud suivant) {
        element = e;
        this.suivant = suivant;
    }

    /**
     * Récupère l'élément
     * @return Object
     */
    public Object getElement() {
        return element;
    }

    /**
     * Modifie l'élément
     * @param element 
     */
    public void setElement(Object element) {
        this.element = element;
    }

    /**
     * Récupère l'élément suivant
     * @return Noeud
     */
    public Noeud getSuivant() {
        return suivant;
    }

    /**
     * Modifie l'élément suivant
     * @param suivant 
     */
    public void setSuivant(Noeud suivant) {
        this.suivant = suivant;
    }

    /**
     * Affiche un noeud
     * @return string 
     */
    public String toString() {
        return "Noeud(" + element + ")";
    }
}
