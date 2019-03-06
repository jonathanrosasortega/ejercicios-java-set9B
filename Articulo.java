public class Articulo{
	private String codigo = "Vacio";
	private String descripcion;
	private float precioCompra;
	private float precioVenta;
	private int stock;

	public String getCodigo(){
		return this.codigo;
	}
  public int getStock(){
		return this.stock;
	}

	public void setCodigo(String codigoInsert){
		this.codigo = codigoInsert;
	}
	public void setDescripcion(String descripcionInsert){
		this.descripcion = descripcionInsert;
	}
	public void setPrecioCompra(float precioCompraInsert){
		this.precioCompra = precioCompraInsert;
	}
	public void setPrecioVenta(float precioVentaInsert){
		this.precioVenta = precioVentaInsert;
	}
	public void setStock(int stockInsert){
		this.stock = stockInsert;
	}

	public String toString(){
    String cadena = "---------------------------";
    cadena += "\nCódigo: " + this.codigo;
    cadena += "\nDescripción: " + this.descripcion;
    cadena += "\nPrecio de Compra: " + this.precioCompra + "€";
    cadena += "\nPrecio de Venta: " + this.precioVenta + "€";
    cadena += "\nStock: " + this.stock + " unidades";
    return cadena;
  }
}
