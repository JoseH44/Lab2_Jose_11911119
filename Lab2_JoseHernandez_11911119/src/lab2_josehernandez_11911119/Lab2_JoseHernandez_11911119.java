package lab2_josehernandez_11911119;

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

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1-Crear Universidad");
        System.out.println("2-Eliminar Universidad");
        System.out.println("3-Log In");
        System.out.println("4-Ascender Universidad");
        System.out.println("5-Listar Universidad");
        System.out.println("6-Modificar Universidad");
        System.out.println("7-Descender Universidad");
        System.out.println("8-Random");
        System.out.println("Ingrese la opcion que desea ejecutar: ");
        int opcion = input.nextInt();
        switch (opcion) {
            case 1: {

            }

            break;

            case 2: {

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
            }
            break;
            default:
                throw new AssertionError();
        }
    }

}
