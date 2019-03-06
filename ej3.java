/*Realiza el programa “Colección de discos” por tu cuenta, mirando lo menos
posible el ejemplo que se proporciona. Pruébalo primero para ver cómo
funciona y luego intenta implementarlo tú mismo.*/
public class ej3 {
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
  String duracionString;
  boolean stop = false;

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
				System.out.println("\nListado:");
				System.out.println("\n------------");
				for (i=0; i<100; i++) {
					if (!arrayDiscos[i].getCodigo().equals("Vacio")) {
						System.out.println(arrayDiscos[i]);
						System.out.println("\n------------");
					}
				}
			break;
			case 2: // Crear disco
      stop = false;
				for (i=0; ((i<100) && (!stop)); i++) {
					if (arrayDiscos[i].getCodigo().equals("Vacio")) {
						arrayDiscos[i] = new Disco();
						System.out.println("\nCreando nuevo disco:");
						System.out.println("\n------------");
						System.out.println("Introduzca codigo:");
						codigoMain = System.console().readLine();
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
				while(!arrayDiscos[i].getCodigo().equals(codigoMain)){
					i++;
				}
				arrayDiscos[i].setCodigo("Vacio");				
				System.out.println("Disco borrado");
			break;
			default:
				salir = true;
				System.out.println("\nSaliendo...");
		}
	} while(!salir);
	}
}
