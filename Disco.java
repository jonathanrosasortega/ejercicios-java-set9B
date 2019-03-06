public class Disco{
  private String codigo = "Vacio";
  private String autor;
  private String titulo;
  private String genero;
  private int duracion;

  public String getCodigo(){
    return codigo;
  }
  public void setCodigo(String codigoMain){
    this.codigo = codigoMain;
  }

  public String getAutor(){
    return autor;
  }
  public void setAutor(String autorMain){
    this.autor = autorMain;
  }

  public String getTitulo(){
    return titulo;
  }
  public void setTitulo(String tituloMain){
    this.titulo = tituloMain;
  }

  public String getGenero(){
    return genero;
  }
  public void setGenero(String generoMain){
    this.genero = generoMain;
  }

  public int getDuracion(){
    return duracion;
  }
  public void setDuracion(int duracionMain){
    this.duracion = duracionMain;
  }

  public String toString(){
    String cadena = "---------------------------";
    cadena += "\nCódigo: " + this.codigo;
    cadena += "\nAutor: " + this.autor;
    cadena += "\nTítulo: " + this.titulo;
    cadena += "\nGénero: " + this.genero;
    cadena += "\nDuración: " + this.duracion;
    cadena += "\n---------------------------";
    return cadena;
  }
}
