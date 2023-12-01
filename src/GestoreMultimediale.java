import elementoMultimediale.ElementoMultimediale;
import entities.Audio;
import entities.Video;
import java.util.Scanner;

public class GestoreMultimediale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ElementoMultimediale[] elementi = new ElementoMultimediale[5];

        //elementi multimediali
        for (int i = 0; i < 5; i++) {
            System.out.println("Vuoi creare un audio o un video?");
            String tipo = scanner.nextLine();
            System.out.println("Inserisci il titolo dell'elemento " + (i+1) + ":");
            String titolo = scanner.nextLine();
            System.out.println("Inserisci il volume:");
            int volume = scanner.nextInt();
            System.out.println("Inserisci la durata:");
            int durata = scanner.nextInt();
            scanner.nextLine();

            if (tipo.equalsIgnoreCase("audio")) {
                elementi[i] = new Audio(titolo, volume, durata);
            } else if (tipo.equalsIgnoreCase("video")) {
                System.out.println("Inserisci la luminosità:");
                int luminosita = scanner.nextInt();
                scanner.nextLine();
                elementi[i] = new Video(titolo, volume, durata, luminosita);
            }
        }
        int scelta;
        do {
            System.out.println("Quale elemento vuoi eseguire (1-5)? Inserisci 0 per terminare.");
            scelta = scanner.nextInt();
            if (scelta >= 1 && scelta <= 5) {
                ElementoMultimediale elemento = elementi[scelta - 1];
                elemento.play();
            }
        } while (scelta != 0);

        scanner.close();
    }
}


