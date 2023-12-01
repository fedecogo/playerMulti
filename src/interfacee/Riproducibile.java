package interfacee;

public interface Riproducibile {
   // Questa è la tua interfaccia per gli elementi che possono essere riprodotti.
    //metodi play(), alzaVolume() e abbassaVolume().
    void play();
    void alzaVolume();
    void abbassaVolume();

    default void stop() {
        System.out.println("La riproduzione è stata interrotta.");
    }
}
