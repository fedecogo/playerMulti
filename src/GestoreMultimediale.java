import elementoMultimediale.ElementoMultimediale;
import entities.Audio;
import entities.Video;
import entities.Foto;
import interfacee.Riproducibile;

import java.util.Scanner;

public class GestoreMultimediale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ElementoMultimediale[] elementi = new ElementoMultimediale[5];


        // Creazione dei 5 elementi
        for (int i = 0; i < 5; i++) {
            System.out.println("Vuoi creare un audio, un video o una foto?");
            String tipo = scanner.nextLine();
            System.out.println("Inserisci il titolo dell'elemento " + (i+1) + ":");
            String titolo = scanner.nextLine();

            switch (tipo.toLowerCase()) {
                case "audio":
                    System.out.println("Inserisci il volume:");
                    int volumeAudio = scanner.nextInt();
                    System.out.println("Inserisci la durata:");
                    int durataAudio = scanner.nextInt();
                    scanner.nextLine();
                    //nextLine diverso da nextInt
                    elementi[i] = new Audio(titolo, volumeAudio, durataAudio);
                    //elemento nell array
                    break;
                case "video":
                    System.out.println("Inserisci il volume:");
                    int volumeVideo = scanner.nextInt();
                    System.out.println("Inserisci la durata:");
                    int durataVideo = scanner.nextInt();
                    System.out.println("Inserisci la luminosità:");
                    int luminositaVideo = scanner.nextInt();
                    scanner.nextLine();
                    elementi[i] = new Video(titolo, volumeVideo, durataVideo, luminositaVideo);
                    break;
                case "foto":
                    System.out.println("Inserisci la luminosità:");
                    int luminositaFoto = scanner.nextInt();
                    scanner.nextLine();
                    elementi[i] = new Foto(titolo, luminositaFoto);
                    break;
                default:
                    System.out.println("Tipo non riconosciuto. Riprova.");
                    i--; // decrementa i per far rip il tutto dall giusta pos
                    break;
            }
        }

        // Scegli ed esegui gli elementi multimediali
        int scelta;
        do {
            System.out.println("Quale elemento vuoi eseguire (1-5)? Inserisci 0 per terminare.");
            scelta = scanner.nextInt();
            if (scelta >= 1 && scelta <= 5) {
                ElementoMultimediale elemento = elementi[scelta - 1];
                if (elemento instanceof Riproducibile) {
                    elemento.play();
                } else {
                    System.out.println(elemento.toString());
                }

                System.out.println("Vuoi regolare il volume o la luminosità? (volume o luminosità)");
                String regolazione = scanner.next();
                switch (regolazione.toLowerCase()) {
                    case "volume":
                        if (elemento instanceof Audio || elemento instanceof Video) {
                            System.out.println("Vuoi alzare o abbassare il volume? (alza o abbassa)");
                            String azione = scanner.next();
                            if (azione.equalsIgnoreCase("alza")) {
                                ((Riproducibile) elemento).alzaVolume();
                            } else if (azione.equalsIgnoreCase("abbassa")) {
                                ((Riproducibile) elemento).abbassaVolume();
                            }
                        } else {
                            System.out.println("Questo elemento non ha un volume da regolare.");
                        }
                        break;
                    case "luminosità":
                        if (elemento instanceof Foto) {
                            System.out.println("Vuoi aumentare o diminuire la luminosità? (aumenta o diminuisci)");
                            String azione = scanner.next();
                            if (azione.equalsIgnoreCase("aumenta")) {
                                ((Foto) elemento).aumentaLuminosita();
                            } else if (azione.equalsIgnoreCase("diminuisci")) {
                                ((Foto) elemento).diminuisciLuminosita();
                            }
                        } else {
                            System.out.println("Questo elemento non ha una luminosità da regolare.");
                        }
                        break;
                    default:
                        System.out.println("Regolazione non trovata.");
                        break;
                }
            }
        } while (scelta != 0);

    }
}
