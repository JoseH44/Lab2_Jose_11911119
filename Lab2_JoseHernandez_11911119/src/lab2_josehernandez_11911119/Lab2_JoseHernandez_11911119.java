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
                        String nombreUni = input.nextLine();
                        nombreUni = input.nextLine();
                        System.out.print("Ingrese el nombre del Rector: ");
                        String nombreRect = input.nextLine();
                        nombreRect = input.nextLine();
                        System.out.print("Ingrese la sucursal de la Universidad: ");
                        String Sucursal = input.nextLine();
                        while (lista.contains(Sucursal)) {
                            System.out.println("Esta sucursal ya existe");
                            System.out.print("Ingrese la sucursal de la Universidad: ");
                            Sucursal = input.nextLine();
                        }

                        System.out.print("Ingrese el año de creacion: ");
                        int creacion = input.nextInt();
                        System.out.print("Ingrese el numero de maestros: ");
                        int maestros = input.nextInt();
                        System.out.print("Ingrese el numero de estudiantes: ");
                        int estudiantes = input.nextInt();
                        System.out.print("Nivel de la universidad \n"
                                + "1-Publica \n"
                                + "2-Privada \n"
                                + "Ingrese el numero del nivel: ");
                        int opNivel = input.nextInt();
                        String nivel = "";
                        double costoMensual;
                        if (opNivel == 1) {
                            nivel = "Publica";
                            costoMensual = 0;
                        } else {
                            nivel = "Privada";
                            costoMensual = 6000;
                        }
                        lista.add(new Universidades(nombreUni, nombreRect, Sucursal, creacion, maestros, estudiantes, costoMensual, nivel));
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
                    System.out.println("HA ACCEDIDO AL SISTEMA");
                }
                break;

                case 4: {

                }
                break;

                case 5: {
                    if (acceso) {
                        for (int i = 0; i < lista.size(); i++) {
                            System.out.println("Posicion->" + i + "\n" + lista.get(i));
                        }
                    }
                }
                break;

                case 6: {
                    if (acceso) {
                        System.out.print("Ingrese la posicion de la universidad que desea Modificar: ");
                        int uniPos = input.nextInt();
                        System.out.println("1-Modificar Nombre de la Universidad " + "\n"
                                + "2- Modificar Nombre del Rector" + "\n"
                                + "3- Modificar Sucursal de la Universidad" + "\n"
                                + "4-Modificar El año de la creacion" + "\n"
                                + "5-Modificar El numero de Maestros" + "\n"
                                + "6-Modificar El numero de estudiantes" + "\n"
                                + "Ingrese el numero de la opcion a ejecutar: ");
                        int subMenu = input.nextInt();
                        switch (subMenu) {
                            case 1: {
                                System.out.print("Ingrese el nuevo Nombre de la Universidad: ");
                                String newName = input.nextLine();
                                newName = input.nextLine();
                                ((Universidades) lista.get(uniPos)).setNombreUni(newName);
                            }

                            break;

                            case 2: {
                                System.out.print("Ingrese el nuevo nombre del Rector: ");
                                String newName = input.nextLine();
                                newName = input.nextLine();
                                ((Universidades) lista.get(uniPos)).setNombreRect(newName);
                            }
                            break;
                            case 3: {
                                System.out.print("Ingrese la nueva Sucursal: ");
                                String newSucursal = input.nextLine();
                                newSucursal = input.nextLine();
                                while (lista.contains(newSucursal)) {
                                    System.out.println("Esta sucursal ya existe");
                                    System.out.print("Ingrese la sucursal de la Universidad: ");
                                    newSucursal = input.nextLine();
                                }
                                ((Universidades) lista.get(uniPos)).setSucursal(newSucursal);
                            }
                            break;

                            case 4: {
                                System.out.print("Ingrese el nuevo año de creacion: ");
                                int newAño = input.nextInt();
                                ((Universidades) lista.get(uniPos)).setCreacion(newAño);
                            }

                            break;

                            case 5: {
                                System.out.print("Ingrese el nuevo numero de maestros: ");
                                int newMaestros = input.nextInt();
                                ((Universidades) lista.get(uniPos)).setMaestros(newMaestros);
                            }
                            break;

                            case 6: {
                                System.out.print("Ingrese el nuevo numero de estudiantes: ");
                                int newEstudiantes = input.nextInt();
                                ((Universidades) lista.get(uniPos)).setEstudiantes(newEstudiantes);
                            }
                            break;
                            default:

                        }
                    }
                }
                break;
                case 7: {

                }
                break;

                case 8: {

                }
                break;
                default:
                    throw new AssertionError();
            }
        }//fin del while
    }//fin del main.

}
