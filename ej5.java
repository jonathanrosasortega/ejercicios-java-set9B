/*Crea el programa GESTISIMAL (GESTIón SIMplificada de Almacén) para llevar
el control de los artículos de un almacén. De cada artículo se debe saber
el código, la descripción, el precio de compra, el precio de venta y el stock
(número de unidades). 
La entrada y salida de mercancía supone respectivamente el incremento y
decremento de stock de un determinado artículo. Hay que controlar que no se
pueda sacar más mercancía de la que hay en el almacén.*/

/*
El menú del programa debe tener, al menos, las siguientes opciones:
1. Listado
2. Alta
3. Baja
4. Modificación
5. Entrada de mercancía
6. Salida de mercancía
7. Salir
*/

public class ej5 {
static int almacenamiento = 200; //Tamaño del array, y nº de artículos almacenable
public static void main(String[] args) {
	Articulo[] arrayArticulo = new Articulo[almacenamiento];
	int opcion = 0;
	int i;
	boolean stop;
	String codigo;
	String descripcion;
	float precioCompra;
	float precioVenta;
	int stock;
  int incremento;
  int decremento;

	for (i=0; i<200; i++) {
		arrayArticulo[i] = new Articulo();
	}

	do { //Menú do-while
		System.out.println("\nSeleccione opción:");
		System.out.println("1. Listado");
		System.out.println("2. Alta");
		System.out.println("3. Baja");
		System.out.println("4. Modificación");
		System.out.println("5. Entrada de mercancía");
		System.out.println("6. Salida de mercancía");
		System.out.println("Para salir pulse cualquier otra tecla");
		opcion = Integer.parseInt(System.console().readLine());

		switch (opcion) {
			case 1:
				System.out.println("Listado de artículos:");
				for (i=0; i<200; i++) {
					if (!arrayArticulo[i].getCodigo().equals("Vacio")) {
						System.out.println(arrayArticulo[i]);
						System.out.println("\n------------");
					}
				}
			break;
			case 2:
				System.out.println("Alta de artículos:");
				stop = false;
				for (i=0; ((i<200) && (!stop)); i++) {
					if (arrayArticulo[i].getCodigo().equals("Vacio")) {
						System.out.println("\nIntroduzca codigo del artículo");
						arrayArticulo[i].setCodigo(System.console().readLine());
						System.out.println("\nIntroduzca descripcion del artículo");
						arrayArticulo[i].setDescripcion(System.console().readLine());
						System.out.println("\nIntroduzca el precio de compra del artículo");
						arrayArticulo[i].setPrecioCompra(Float.parseFloat(System.console().readLine()));
						System.out.println("\nIntroduzca el precio de venta del artículo");
						arrayArticulo[i].setPrecioVenta(Float.parseFloat(System.console().readLine()));
						System.out.println("\nIntroduzca el stock del artículo");
						arrayArticulo[i].setStock(Integer.parseInt(System.console().readLine()));
						stop = true;
            System.out.println("Artículo dado de alta correctamente");
					}
				}
			break;
			case 3:
				System.out.println("Baja de artículos:");
				stop = false;
				System.out.println("\nIntroduzca codigo del artículo");
				codigo = System.console().readLine();
				for (i=0; ((i<200) && (!stop)); i++) {
					if (arrayArticulo[i].getCodigo().equals(codigo)) {
						arrayArticulo[i].setCodigo("Vacio");
						stop = true;
					}
				}
			break;
			case 4:
				System.out.println("Modificacion de artículos:");
				System.out.println("Introduzca código del artículo");
				codigo = System.console().readLine();
				stop = false;
				for (i=0; ((i<200) && (!stop)); i++) {
					if (arrayArticulo[i].getCodigo().equals(codigo)) {
						System.out.println("\nIntroduzca NUEVO codigo del artículo");
						arrayArticulo[i].setCodigo(System.console().readLine());
						System.out.println("\nIntroduzca NUEVA descripcion del artículo");
						arrayArticulo[i].setDescripcion(System.console().readLine());
						System.out.println("\nIntroduzca el NUEVO precio de compra del artículo");
						arrayArticulo[i].setPrecioCompra(Float.parseFloat(System.console().readLine()));
						System.out.println("\nIntroduzca el NUEVO precio de venta del artículo");
						arrayArticulo[i].setPrecioVenta(Float.parseFloat(System.console().readLine()));
						System.out.println("\nIntroduzca el NUEVO stock del artículo");
						arrayArticulo[i].setStock(Integer.parseInt(System.console().readLine()));
						stop = true;
						System.out.println("Artículo editado correctamente");
					}
				}
			break;
			case 5:
				System.out.println("Entrada de mercancía:");
				System.out.println("Introduzca código del artículo");
				codigo = System.console().readLine();
				stop = false;
				for (i=0; ((i<200) && (!stop)); i++) {
					if (arrayArticulo[i].getCodigo().equals(codigo)) {
						System.out.println("\nIndique cuantas unidades de ese artículo entran");
            incremento = Integer.parseInt(System.console().readLine());
            incremento += arrayArticulo[i].getStock();
						arrayArticulo[i].setStock(incremento);
						stop = true;
						System.out.println("Stock incrementado correctamente");
					}
				}
			break;
			case 6:
				System.out.println("Salida de mercancía:");
				System.out.println("Introduzca código del artículo");
				codigo = System.console().readLine();
				stop = false;
				for (i=0; ((i<200) && (!stop)); i++) {
					if (arrayArticulo[i].getCodigo().equals(codigo)) {
						System.out.println("\nIndique cuantas unidades de ese artículo entran");
						decremento = Integer.parseInt(System.console().readLine());
						arrayArticulo[i].setStock((arrayArticulo[i].getStock() - decremento));
						stop = true;
						System.out.println("Stock decrementado correctamente");
					}
				}
			break;
			default:
		}
	} while((opcion > 0) && (opcion < 8)); //Fin menú do-while
}
}

/*
//SOLUCION
public class Gestisimal {
// N determina el tamaño del array
static int N = 100;
public static void main(String[] args) {
int opcion;
int primeraLibre;
int i;
int stockIntroducido;
double precioDeCompraIntroducido;
double precioDeVentaIntroducido;
String codigo;
String codigoIntroducido = "";
String descripcionIntroducida;
String precioDeCompraIntroducidoString;
String precioDeVentaIntroducidoString;
String stockIntroducidoString;
boolean existeCodigo;
//Crea el array de artículos
Articulo[] articulo = new Articulo[N];
// Crea todos los artículos que van en cada una de
// las celdas del array
for(i = 0; i < N; i++) {
articulo[i] = new Articulo();
}
// Menu
do {
System.out.println("\n\nG E S T I S I M A L");
System.out.println("===================");
System.out.println("1. Listado");
System.out.println("2. Alta");
System.out.println("3. Baja");
System.out.println("4. Modificación");
System.out.println("5. Entrada de mercancía");
System.out.println("6. Salida de mercancía");
System.out.println("7. Salir");
System.out.print("Introduzca una opción: ");
opcion = Integer.parseInt(System.console().readLine());
switch (opcion) {
/////////////////////////////////////////////////////////////////////////////
// LISTADO //////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////
case 1:
System.out.println("\nLISTADO");
System.out.println("=======");
for(i = 0; i < N; i++) {
if (!articulo[i].getCodigo().equals("LIBRE")) {
System.out.println(articulo[i]);
}
}
break;
/////////////////////////////////////////////////////////////////////////////
// ALTA /////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////
case 2:
System.out.println("\nNUEVO ARTÍCULO");
System.out.println("==============");
// Busca la primera posición libre del array
primeraLibre = 0;
codigo = articulo[primeraLibre].getCodigo();
while ((primeraLibre < N) && (!(codigo.equals("LIBRE")))) {
primeraLibre++;
if (primeraLibre < N) {
codigo = articulo[primeraLibre].getCodigo();
}
}
if (primeraLibre == N) {
System.out.println("Lo siento, a base de datos está llena.");
} else {
// Introducción de datos
System.out.println("Por favor, introduzca los datos del artículo.");
System.out.print("Código: ");
// Comprueba que el código introducido no se repita
existeCodigo = true;
while (existeCodigo) {
existeCodigo = false;
codigoIntroducido = System.console().readLine();
for (i = 0; i < N; i++) {
if (codigoIntroducido.equals(articulo[i].getCodigo())) {
existeCodigo = true;
}
}
if (existeCodigo) {
System.out.println("Ese código ya existe en la base de datos.");
System.out.print("Introduzca otro código: ");
}
} // while (existeCodigo)
articulo[primeraLibre].setCodigo(codigoIntroducido);
System.out.print("Descripcion: ");
descripcionIntroducida = System.console().readLine();
articulo[primeraLibre].setDescripcion(descripcionIntroducida);
System.out.print("Precio de compra: ");
precioDeCompraIntroducido = Double.parseDouble(System.console().readLine());
articulo[primeraLibre].setPrecioDeCompra(precioDeCompraIntroducido);
System.out.print("Precio de venta: ");
precioDeVentaIntroducido = Double.parseDouble(System.console().readLine());
articulo[primeraLibre].setPrecioDeVenta(precioDeVentaIntroducido);
System.out.print("Stock: ");
stockIntroducido = Integer.parseInt(System.console().readLine());
articulo[primeraLibre].setStock(stockIntroducido);
}
break;
/////////////////////////////////////////////////////////////////////////////
// BAJA /////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////
case 3:
System.out.println("\nBAJA");
System.out.println("====");
System.out.print("Por favor, introduzca el código del artículo que desea dar de baja: ");
codigoIntroducido = System.console().readLine();
i = -1;
codigo = "";
do {
i++;
if (i < N) {
codigo = articulo[i].getCodigo();
}
} while (!(codigo.equals(codigoIntroducido)) && (i < N));
if (i == N) {
System.out.println("Lo siento, el código introducido no existe.");
} else {
articulo[i].setCodigo("LIBRE");
System.out.println("articulo borrado.");
}
break;
/////////////////////////////////////////////////////////////////////////////
// MODIFICACIÓN /////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////
case 4:
System.out.println("\nMODIFICACIÓN");
System.out.println("============");
System.out.print("Por favor, introduzca el código del artículo cuyos datos desea cambiar: ");
codigoIntroducido = System.console().readLine();
i = -1;
do {
i++;
} while (!((articulo[i].getCodigo()).equals(codigoIntroducido)));
System.out.println("Introduzca los nuevos datos del artículo o INTRO para dejarlos igual.");
System.out.println("Código: " + articulo[i].getCodigo());
System.out.print("Nuevo código: ");
codigoIntroducido = System.console().readLine();
if (!codigoIntroducido.equals("")) {
articulo[i].setCodigo(codigoIntroducido);
}
System.out.println("Descripción: " + articulo[i].getDescripcion());
System.out.print("Nueva descripción: ");
descripcionIntroducida = System.console().readLine();
if (!descripcionIntroducida.equals("")) {
articulo[i].setDescripcion(descripcionIntroducida);
}
System.out.println("Precio de compra: " + articulo[i].getPrecioDeCompra());
System.out.print("Nuevo precio de compra: ");
precioDeCompraIntroducidoString = System.console().readLine();
if (!precioDeCompraIntroducidoString.equals("")) {
articulo[i].setPrecioDeCompra(Double.parseDouble(precioDeCompraIntroducidoString));
}
System.out.println("Precio de venta: " + articulo[i].getPrecioDeVenta());
System.out.print("Nuevo precio de venta: ");
precioDeVentaIntroducidoString = System.console().readLine();
if (!precioDeVentaIntroducidoString.equals("")) {
articulo[i].setPrecioDeVenta(Double.parseDouble(precioDeVentaIntroducidoString));
}
System.out.println("Stock: " + articulo[i].getStock());
System.out.print("Nuevo stock: ");
stockIntroducidoString = System.console().readLine();
if (!stockIntroducidoString.equals("")) {
articulo[i].setStock(Integer.parseInt(stockIntroducidoString));
}
break;
/////////////////////////////////////////////////////////////////////////////
// ENTRADA DE MERCANCÍA /////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////
case 5:
System.out.println("\nENTRADA DE MERCANCÍA");
System.out.println("====================");
System.out.print("Por favor, introduzca el código del artículo: ");
codigoIntroducido = System.console().readLine();
i = -1;
codigo = "";
do {
i++;
if (i < N) {
codigo = articulo[i].getCodigo();
}
} while (!(codigo.equals(codigoIntroducido)) && (i < N));
if (i == N) {
System.out.println("Lo siento, el código introducido no existe.");
} else {
System.out.println("Entrada de mercancía del siguiente artículo: ");
System.out.println(articulo[i]);
System.out.print("Introduzca el número de unidades que entran al almacén: ");
stockIntroducidoString = System.console().readLine();
articulo[i].setStock(Integer.parseInt(stockIntroducidoString) + articulo[i].\
getStock());
System.out.println("La mercancía ha entrado en el almacén.");
}
break;
/////////////////////////////////////////////////////////////////////////////
// SALIDA DE MERCANCÍA //////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////
case 6:
System.out.println("\nSALIDA DE MERCANCÍA");
System.out.println("===================");
System.out.print("Por favor, introduzca el código del artículo: ");
codigoIntroducido = System.console().readLine();
i = -1;
codigo = "";
do {
i++;
if (i < N) {
codigo = articulo[i].getCodigo();
}
} while (!(codigo.equals(codigoIntroducido)) && (i < N));
if (i == N) {
System.out.println("Lo siento, el código introducido no existe.");
} else {
System.out.println("Salida de mercancía del siguiente artículo: ");
System.out.println(articulo[i]);
System.out.print("Introduzca el número de unidades que desea sacar del almacén: ");
stockIntroducido = Integer.parseInt(System.console().readLine());
if (articulo[i].getStock() - stockIntroducido > 0) {
articulo[i].setStock(articulo[i].getStock() - stockIntroducido);
System.out.println("La mercancía ha salido del almacén.");
} else {
System.out.println("Lo siento, no se pueden sacar tantas unidades.");
}
}
break;
} // switch
} while (opcion != 7);
}
}*/
