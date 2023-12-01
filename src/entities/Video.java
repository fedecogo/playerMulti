package entities;

import elementoMultimediale.ElementoMultimediale;
import interfacee.Riproducibile;

public class Video extends ElementoMultimediale implements Riproducibile {
    //video estende la classe ElementoMultimediale

    //  ATTRIBUTI
private  int volume;
private  int durata;
private  int luminosita;

    public Video(String titolo, int volume, int durata, int luminosita) {
        super(titolo);
        this.volume = volume;
        this.durata = durata;
        this.luminosita = luminosita;
    }

    @Override
    public void play() {
        { System.out.println("Play è partita il video "+ getTitolo());
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


}
