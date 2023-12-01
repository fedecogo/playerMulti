package entities;
import elementoMultimediale.ElementoMultimediale;
import interfacee.ImgRegola;

public class Foto extends ElementoMultimediale implements ImgRegola {
   // foto estende la classe ElementoMultimediale imp ImgRegola

     private int luminosita;
  public Foto(String titolo, int luminosita) {
    super(titolo);
    this.luminosita= luminosita;
  }
  //metodi
  @Override
  public void aumentaLuminosita() {
      if (luminosita < 10) {
          luminosita++;
          System.out.println("Luminosità aumentata a " + luminosita);
      } else {
          System.out.println("Luminosità già al massimo");
      }
  }
  @Override
  public void diminuisciLuminosita() {
      if (luminosita > 0) {
          luminosita--;
          System.out.println("Luminosità diminuita a " + luminosita);
      } else {
          System.out.println("Luminosità già al minimo");
      }
  }
  @Override
  public String toString() {
      return "Titolo: " + getTitolo() + ", Luminosità: " + luminosita;
  }
}
