public class Gato{
  //atributos
  private String nombreGato;
  private String generoGato;
  private String razaGato;

  // Constructor y otros métodos /////////////////////
  public Gato(){}

  public String getNombre(){
    return nombreGato;
  }

  public void setNombre(String n){
    this.nombreGato = n;
  }

  public String getGenero(){
    return generoGato;
  }

  public void setGenero(String g){
    this.generoGato = g;
  }

  public String getRaza(){
    return razaGato;
  }

  public void setRaza(String r){
    this.razaGato = r;
  }

  public String toString() {
    String cadena = "\n------------------------------------------\nNombre: " + this.nombreGato;
    cadena += "\nGénero: " + this.generoGato;
    cadena += "\nRaza: " + this.razaGato;
    return cadena;
  }
}
