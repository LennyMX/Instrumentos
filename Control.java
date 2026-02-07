import java.util.Scanner;

public class Control {

    public static void main(String[] args) {

        Coleccion sistema = new Coleccion();
        Scanner sc = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("\nSalud mental integral");
            System.out.println("1.- Agregar instrumento");
            System.out.println("2.- Consultar por autor");
            System.out.println("3.- Consultar por tipo (identificar / manejar)");
            System.out.println("4.- Consultar por forma (test, escala, cuestionario)");
            System.out.println("5.- Consultar por condición (estres / ansiedad)");
            System.out.println("6.- Consultar por validación");
            System.out.println("7.- Ordenar por clave");
            System.out.println("8.- Ordenar por autor");
            System.out.println("9.- Eliminar por clave");
            System.out.println("10.- Mostrar todos");
            System.out.println("0.- Salir");

            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch(opcion){

                case 1:
                    System.out.print("nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("forma (test, escala, cuestionario): ");
                    String forma = sc.nextLine();

                    System.out.print("autor: ");
                    String autor = sc.nextLine();

                    System.out.print("tipo (identificar / manejar): ");
                    String tipo = sc.nextLine();

                    System.out.print("tiene validación? (true/false): ");
                    boolean val = sc.nextBoolean();

                    System.out.print("tiene confiabilidad? (true/false): ");
                    boolean conf = sc.nextBoolean();

                    System.out.print("clave: ");
                    int clave = sc.nextInt();

                    System.out.print("cita: ");
                    int cita = sc.nextInt();

                    System.out.print("sirve para estres? (true/false): ");
                    boolean estres = sc.nextBoolean();

                    System.out.print("sirve para ansiedad? (true/false): ");
                    boolean ansiedad = sc.nextBoolean();

                    Instrumento i = new Instrumento(nombre, forma, autor, tipo, val, conf, clave, cita, estres, ansiedad);
                    sistema.agregarInstrumento(i);

                    System.out.println("instrumento agregado");
                    break;

                case 2:
                    System.out.print("autor: ");
                    sistema.consultaPorAutor(sc.nextLine());
                    break;

                case 3:
                    System.out.print("tipo: ");
                    sistema.consultarPorTipoInstrumento(sc.nextLine());
                    break;

                case 4:
                    System.out.print("forma: ");
                    String f = sc.nextLine();
                    for(Instrumento inst : sistema.getInstrumentos()){
                        if(inst.getForma().equalsIgnoreCase(f)){
                            System.out.println(inst);
                        }
                    }
                    break;

                case 5:
                    System.out.print("condición (estres/ansiedad): ");
                    sistema.consultarPorCondicion(sc.nextLine());
                    break;

                case 6:
                    System.out.print("validados (si/no): ");
                    sistema.consultarPorEvaluacion(sc.nextLine());
                    break;

                case 7:
                    sistema.ordenarPorClave();
                    System.out.println("ordenado por clave");
                    break;

                case 8:
                    sistema.ordenarPorPrimerAutor();
                    System.out.println("ordenado por autor");
                    break;

                case 9:
                    System.out.print("clave a eliminar: ");
                    sistema.eliminarInstrumentoPorClave(sc.nextInt());
                    break;

                case 10:
                    for(Instrumento inst : sistema.getInstrumentos()){
                        System.out.println(inst);
                    }
                    break;
            }

        } while(opcion != 0);

        sc.close();
    }
}
