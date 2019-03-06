/*Cambia el programa anterior de tal forma que los datos de los gatos se introduzcan
directamente en el código de la forma gatito[2].setColor(“marrón”) o bien
mediante el constructor, de la forma gatito[3] = new Gato(“Garfield”, “naranja”,
“macho”). Muestra a continuación los datos de todos los gatos utilizando un
bucle.*/
public class ej2{
  public static void main(String[] args) {
    Gato[] arrayGatos = new Gato[3];
    int i;
    arrayGatos[0] = new Gato();
    arrayGatos[0].setNombre("Misifú");
    arrayGatos[0].setGenero("MACHO");
    arrayGatos[0].setRaza("Persa");

    arrayGatos[1] = new Gato();
    arrayGatos[1].setNombre("Arterio");
    arrayGatos[1].setGenero("MACHO");
    arrayGatos[1].setRaza("Egipcio");

    arrayGatos[2] = new Gato();
    arrayGatos[2].setNombre("Elisa");
    arrayGatos[2].setGenero("HEMBRA");
    arrayGatos[2].setRaza("Leonizado");

    for (i=0; i<3; i++) {
      System.out.println(arrayGatos[i]);
    }
  }
}
