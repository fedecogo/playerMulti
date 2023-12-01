package elementoMultimediale;

public abstract class ElementoMultimediale {
    protected String titolo;

    public ElementoMultimediale(String titolo) {
        this.titolo = titolo;
    }

    public String getTitolo() {
        return titolo;
    }
    public void play() {
        { System.out.println("Play è partita la canzone chiamata "+ getTitolo());
        }
    }
}