import entities.Audio;

import java.util.Scanner;

public class GestoreMultimediale {
    // classe principale ,creo un’istanza del lettore multimedial e interagiraisco con l’utente per ottenere i dettagli degli
    // elementi multimediali. Dopo aver creato gli elementi  chiederai all’utente quale elemento eseguire

    public static void main(String[] args) {
        Audio song1 = new Audio("We will rock you", 10, 10);
        System.out.println(song1);

    }

}



