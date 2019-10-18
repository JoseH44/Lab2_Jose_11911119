package lab2_josehernandez_11911119;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jrdjh
 */
public class Lab2_JoseHernandez_11911119 {

    /**
     * @param args the command line arguments
     */
    public static String usuario = "leobanegas";
    static int contraseña = 99;

    public static String usuario1;
    public static int contraseña1;

    public static boolean acceso = false;

    public static void main(String[] args) {
        ArrayList lista = new ArrayList();
        int opcionMenu = 0;
        while (opcionMenu != 9) {

            Scanner input = new Scanner(System.in);
            System.out.println("1-Crear Universidad");
            System.out.println("2-Eliminar Universidad");
            System.out.println("3-Log In");
            System.out.println("4-Ascender Universidad");
            System.out.println("5-Listar Universidad");
            System.out.println("6-Modificar Universidad");
            System.out.println("7-Descender Universidad");
            System.out.println("8-Random");
            System.out.println("9-Salir");
            System.out.print("Ingrese la opcion que desea ejecutar: ");
            int opcion = input.nextInt();
            switch (opcion) {
                case 1: {
                    if (acceso) {
                        System.out.print("Ingrese el Nombre de la Universidad: ");
                        String nombreUni = input.next();
                        System.out.print("Ingrese el nombre del Rector: ");
                        String nombreRect = input.nextLine();
                        nombreRect = input.nextLine();
                        System.out.print("Ingrese la sucursal de la Universidad: ");
                        String Sucursal = input.nextLine();
                        //Sucursal = input.nextLine();
                        System.out.print("Ingrese el año de creacion: ");
                        int creacion = input.nextInt();
                        System.out.print("Ingrese el numero de maestros: ");
                        int maestros = input.nextInt();
                        System.out.print("Ingrese el numero de estudiantes: ");
                        int estudiantes = input.nextInt();
                        lista.add(new Universidades(nombreUni, nombreRect, Sucursal, creacion, maestros, estudiantes, opcionMenu, Sucursal));
                    } else {
                        System.out.println("Primero debe hacer el Log-In");
                        System.out.println("");

                    }
                }

                break;

                case 2: {
                    if (acceso) {
                        System.out.print("Ingrese la posicion de la universidad que desea eliminar: ");
                        int pos = input.nextInt();
                        if (pos > lista.size()) {
                            System.out.println("Posicion Inexistente ");
                        } else {
                            lista.remove(pos);
                        }
                    }
                }
                break;

                case 3: {

                    System.out.println("Ingrese el usuario: ");
                    usuario1 = input.next();
                    System.out.println("Ingrese la contraseña: ");
                    contraseña1 = input.nextInt();

                    while (!usuario1.equals(usuario) && contraseña1 != contraseña) {
                        System.out.println("Usuario o Contraseña Incorrecta");
                        System.out.println("Ingrese el usuario: ");
                        usuario1 = input.next();
                        System.out.println("Ingrese la contraseña: ");
                        contraseña1 = input.nextInt();

                    }
                    acceso = true;
                }
                break;

                case 4: {

                }
                break;

                case 5: {
                    if (acceso) {
                        for (int i = 0; i < lista.size(); i++) {
                            System.out.println(lista.get(i));
                        }
                    }
                }
                break;
                default:
                    throw new AssertionError();
            }
        }//fin del while
    }

}
