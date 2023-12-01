package entities;
import elementoMultimediale.ElementoMultimediale;
import interfacee.Riproducibile;

public class Audio extends ElementoMultimediale implements Riproducibile {

    //ATTRIBUTI
    private int volume;
    private int durata;

    public Audio(String titolo, int volume, int durata) {
        super(titolo);
        this.volume = volume;
        this.durata = durata;
    }

    //metodi
    @Override
    public void play() {
      { System.out.println("Play è partita la canzone chiamata "+ getTitolo());
        }
    }

    @Override
    public void alzaVolume() {
        if (volume < 10) {
            volume++;
            System.out.println("Volume aumentato a " + volume);
        } else {
            System.out.println("Volume già al massimo");
        }
    }

    @Override
    public void abbassaVolume() {
        if (volume > 0) {
            volume--;
            System.out.println("Volume diminuito a " + volume);
        } else {
            System.out.println("Volume già al minimo");
        }
    }
    @Override
    public String toString() {
        return "Titolo: " + getTitolo() + ", Volume: " + volume + ", Durata: " + durata;
    }
}

