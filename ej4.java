/*Modifica el programa “Colección de discos” como se indica a continuación:
a) Mejora la opción “Nuevo disco” de tal forma que cuando se llenen todas las
posiciones del array, el programa muestre un mensaje de error. No se permitirá
introducir los datos de ningún disco hasta que no se borre alguno de la lista.
b) Mejora la opción “Borrar” de tal forma que se verifique que el código
introducido por el usuario existe.
c) Modifica el programa de tal forma que el código del disco sea único, es decir
que no se pueda repetir.
d) Crea un submenú dentro dentro de “Listado” de tal forma que exista un
listado completo, un listado por autor (todos los discos que ha publicado un
determinado autor), un listado por género (todos los discos de un género determinado) y
un listado de discos cuya duración esté en un rango determinado por el usuario.*/
public class ej4 {
	public static void main(String[] args) {
	Disco[] arrayDiscos = new Disco[100];
	int i;
	String codigoMain;
	String autorMain;
	String tituloMain;
	String generoMain;
	int duracionMain;
	boolean salir = false;
	int opcion;
	int segundaOpcion;
	String duracionString;
	boolean stop = false;
	boolean repetido = false;
	boolean existe = true;
	String nombreAutor = "";
	String nombreGenero = "";
	int minDuracion = 0;
	int maxDuracion = 0;

	for (i=0; i<100; i++) {
		arrayDiscos[i] = new Disco();
	} //Creando Discos (Pero vacios)

	do { //Start do-while principal
		System.out.println("\nColeción de discos");
		System.out.println("\n------------------");
		System.out.println("\n1 - Listado de discos");
		System.out.println("\n2 - Nuevo disco");
		System.out.println("\n3 - Modificar disco");
		System.out.println("\n4 - Borrar");
		System.out.println("\nCualquier otra tecla/valor cerrará el programa");
		System.out.println("\nIntroduzca una opción");
		opcion = Integer.parseInt(System.console().readLine());

		switch(opcion){
			case 1: //Listado de discos
				System.out.println("\nListados posibles:");
				System.out.println("\n------------");
				System.out.println("1. Completo");
				System.out.println("2. Por autor");
				System.out.println("3. Por género");
				System.out.println("4. Por rango de duración");
				segundaOpcion = Integer.parseInt(System.console().readLine());

				switch(segundaOpcion){
					case 1:
						System.out.println("\nListado completo:");
						System.out.println("\n------------");
						for (i=0; i<100; i++) {
							if (!arrayDiscos[i].getCodigo().equals("Vacio")) {
								System.out.println(arrayDiscos[i]);
								System.out.println("\n------------");
							}
						}
					break;
					case 2:
						System.out.println("Introduzca el nombre del autor");
						nombreAutor = Integer.parseInt(System.console().readLine());
						System.out.println("\nListado por autor " + nombreAutor + " :");
						System.out.println("\n------------");
						for (i=0; i<100; i++) {
							if ((!arrayDiscos[i].getCodigo().equals("Vacio")) && (arrayDiscos[i].getAutor().equals(nombreAutor))) {
								System.out.println(arrayDiscos[i]);
								System.out.println("\n------------");
							}
						}
					break;
					case 3:
						System.out.println("Introduzca el género del disco");
						nombreGenero = Integer.parseInt(System.console().readLine());
						System.out.println("\nListado por género " + nombreGenero + " :");
						System.out.println("\n------------");
						for (i=0; i<100; i++) {
							if ((!arrayDiscos[i].getCodigo().equals("Vacio")) && (arrayDiscos[i].getGenero().equals(nombreGenero))) {
								System.out.println(arrayDiscos[i]);
								System.out.println("\n------------");
							}
						}
					break;
					case 4:
						System.out.println("Listado por duración. Introduzca la duración mínima");
						minDuracion = Integer.parseInt(System.console().readLine());
						System.out.println("Ahora introduzca la duración máxima");
						maxDuracion = Integer.parseInt(System.console().readLine());
						System.out.println("\nListado por duración, entre" + minDuracion + " y " + maxDuracion + " :");
						System.out.println("\n------------");
						for (i=0; i<100; i++) {getDuracion
							if ((!arrayDiscos[i].getCodigo().equals("Vacio")) && ((arrayDiscos[i].getCodigo() >= minDuracion) && (arrayDiscos[i].getCodigo() <= maxDuracion)) ) {
								System.out.println(arrayDiscos[i]);
								System.out.println("\n------------");
							}
						}
					break;
					default:
						System.out.println("\nSaliendo...");
				}
				/**/

				/*Crea un submenú dentro dentro de “Listado” de tal forma que exista un
listado completo, un listado por autor (todos los discos que ha publicado un
determinado autor), un listado por género (todos los discos de un género determinado) y
un listado de discos cuya duración esté en un rango determinado por el usuario.*/
			break;
			case 2: // Crear disco
      		stop = false;
				for (i=0; ((i<100) && (!stop)); i++) {
					if (arrayDiscos[i].getCodigo().equals("Vacio") && (!stop)) {
						arrayDiscos[i] = new Disco();
						System.out.println("\nCreando nuevo disco:");
						System.out.println("\n------------");
						
						System.out.println("Introduzca codigo:");
						codigoMain = System.console().readLine();
						repetido = false;
						for (int k=0; ((k<100) && (!repetido)); k++) {
							if(arrayDiscos[k].getCodigo().equals(codigoMain)){
								repetido = true;
								System.out.println("El código está repetido. No se puede crear el disco");
							} else {
								arrayDiscos[i].setCodigo(codigoMain);

								System.out.println("Introduzca autor:");
								autorMain = System.console().readLine();
								arrayDiscos[i].setAutor(autorMain);

								System.out.println("Introduzca titulo:");
								tituloMain = System.console().readLine();
								arrayDiscos[i].setTitulo(tituloMain);

								System.out.println("Introduzca genero:");
								generoMain = System.console().readLine();
								arrayDiscos[i].setGenero(generoMain);

								System.out.println("Introduzca duracion:");
								duracionMain = Integer.parseInt(System.console().readLine());
								arrayDiscos[i].setDuracion(duracionMain);

								System.out.println("Se ha creado el nuevo disco.");
		            			stop = true;
							}
						}
						
					}
				} //Fin for
				if(!stop){
					System.out.println("No se pueden crear más discos. La lista está en su límite");
				}
			break;
			case 3: //Modificar disco
				System.out.println("\nModificación de discos");
				System.out.println("----------------------");
				System.out.println("Introduzca el codigo del disco que desee editar (O solo pulse INTRO si no quiere cambiarlo):");
				codigoMain = System.console().readLine();
				System.out.println("Buscando...");
				i=0;
				while(!arrayDiscos[i].getCodigo().equals(codigoMain)){
					i++;
				}

				System.out.println("Cambiando código" + arrayDiscos[i].getCodigo());
				System.out.println("Nuevo código:");
				codigoMain = System.console().readLine();
				if (!codigoMain.equals("")){
					arrayDiscos[i].setCodigo(codigoMain);
				}
				

				System.out.println("Cambiando autor" + arrayDiscos[i].getAutor());
				System.out.println("Nuevo autor:");
				autorMain = System.console().readLine();
				if (!autorMain.equals("")){
					arrayDiscos[i].setAutor(autorMain);
				}

				System.out.println("Cambiando título" + arrayDiscos[i].getTitulo());
				System.out.println("Nuevo título:");
				tituloMain = System.console().readLine();
				if (!tituloMain.equals("")){
					arrayDiscos[i].setTitulo(tituloMain);
				}

				System.out.println("Cambiando género" + arrayDiscos[i].getGenero());
				System.out.println("Nuevo género:");
				generoMain = System.console().readLine();
				if (!generoMain.equals("")){
					arrayDiscos[i].setGenero(generoMain);
				}

				System.out.println("Cambiando duración" + arrayDiscos[i].getDuracion());
				System.out.println("Nueva duración:");
				duracionString = System.console().readLine();
				if (!duracionString.equals("")){
					arrayDiscos[i].setDuracion(Integer.parseInt(duracionString));
				}

				System.out.println("Disco editado correctamente");
			break;
			case 4: //borrar disco
				System.out.println("\nBorrado de discos");
				System.out.println("----------------------");
				System.out.println("Introduzca el codigo del disco que desee borrar:");
				codigoMain = System.console().readLine();
				System.out.println("Buscando...");
				i=0;
				existe = false;
				while((!arrayDiscos[i].getCodigo().equals(codigoMain)) && (i<100)){
					i++;
					if(arrayDiscos[i].getCodigo().equals(codigoMain)) {
						existe = true;
					}
				}
				if (existe) {
					arrayDiscos[i].setCodigo("Vacio");				
					System.out.println("Disco borrado");
				} else {
					System.out.println("No existen discos con ese código");
				}
			break;
			default:
				salir = true;
				System.out.println("\nSaliendo...");
		}
	} while(!salir);
	}
}
