/*Utiliza la clase Gato para crear un array de cuatro gatos e introduce los datos
de cada uno de ellos mediante un bucle. Muestra a continuación los datos de
todos los gatos utilizando también un bucle.*/
public class ej1{
  public static void main(String[] args) {
    Gato[] arrayGatos = new Gato[5];
    int i;
    for (i=0; i<5; i++) {
      arrayGatos[i] = new Gato();
      System.out.println("Introduce nombre del gato:");
      arrayGatos[i].setNombre(System.console().readLine());
      System.out.println("Introduce su género:");
      arrayGatos[i].setGenero(System.console().readLine());
      System.out.println("Introduce su raza:");
      arrayGatos[i].setRaza(System.console().readLine());
    }

    for (i=0; i<5; i++) {
      System.out.println(arrayGatos[i]);
    }
  }
}
