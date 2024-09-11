package fr.iut.editeur.document;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DocumentTest {

    @Test
    public void testCommandeAjouter() {
        Document document = new Document();
        document.ajouter("Hello");
        assertEquals("Hello", document.toString());
    }

    @Test
    public void testCommandeRemplacer() {
        Document document = new Document();
        document.ajouter("Hello");
        document.remplacer(0, 4, "World");
        assertEquals("World", document.toString());
    }

    @Test
    public void testCommandeMajuscules() {
        Document document = new Document();
        document.ajouter("Hello");
        document.majuscules(0, 4);
        assertEquals("HELLO", document.toString());
    }

    @Test
    public void testCommandeEffacer() {
        Document document = new Document();
        document.ajouter("Hello");
        document.effacer(0, 4);
        assertEquals("", document.toString());
    }

    @Test
    public void testCommandeClear() {
        Document document = new Document();
        document.ajouter("Hello");
        document.clear();
        assertEquals("", document.toString());
    }

}