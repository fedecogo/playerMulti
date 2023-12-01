package entities;
import elementoMultimediale.ElementoMultimediale;
import interfacee.ImgRegola;

public class Foto extends ElementoMultimediale implements ImgRegola {
    // E inv questa è la classe per gestire gli elementi immagine. Eredita da elementoMultimediale.ElementoMultimediale e
    // implementa l’interfaccia ImgRegolabile.Metodi per mostrare l’immagine e regolare la luminosità.
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
