package fr.iut.editeur.document;

public class Document {

    /**
     * Le texte du document
     */
    private String texte;

    public Document() {
        this.texte = "";
    }
	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public void ajouter(String texte) {
        this.texte += texte;
    }


    /**
     * Remplace le texte entre debut et fin par le texte remplacement
     * @param debut qui est l'indice de début
     * @param fin qui est l'indice de fin
     * @param remplacement qui est le texte de remplacement
     */
    public void remplacer(int debut, int fin, String remplacement) {
        String partieGauche = texte.substring(0, debut);
        String partieDroite = texte.substring(fin + 1);
        texte = partieGauche + remplacement + partieDroite;
    }

    /**
     * Met en majuscule le texte entre debut et fin
     * @param debut qui est l'indice de début
     * @param fin qui est l'indice de fin
     */
    public void majuscules(int debut, int fin) {
        String partieGauche = texte.substring(debut, fin + 1);
        remplacer(debut, fin, partieGauche.toUpperCase());
    }

    /**
     * Efface le texte entre debut et fin
     * @param debut qui est l'indice de début
     * @param fin qui est l'indice de fin
     */
    public void effacer(int debut, int fin) {
        remplacer(debut, fin, "");
    }

    /**
     * Efface tout le texte
     */
    public void clear() {
        texte = "";
    }

    /**
     * Insère la chaine de caractère chaine à l'indice debut
     * @param debut qui est l'indice de début
     * @param chaine qui est la chaine de caractère à insérer
     */
    public void inserer(int debut, String chaine) {
        String partieGauche = texte.substring(0, debut);
        String partieDroite = texte.substring(debut);
        texte = partieGauche + chaine + partieDroite;
    }

    @Override
    public String toString() {
        return this.texte;
    }
}
