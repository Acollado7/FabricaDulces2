package fabricdulces2;

import java.util.Scanner;


public class Main {
    //Vamos a usar metodos
    public static double precioMateriaPrima(Scanner sc){
        double resultado;
        double opcion;
        final double MINIMO = 1;
        final double MAXIMO = 2;
        do {
            System.out.println("Introduzca precio de la materia prima: ");
            opcion = sc.nextDouble();
                if (opcion < MAXIMO && MINIMO < opcion ){
                    resultado = opcion;
                    break;
                }

        }while (true);
        return resultado;
    }

    public static double precioCosteProduccion (Scanner sc){
        double resultado;
        double opcion;
        final double MINIMO = 0.5;
        final double MAXIMO = 0.9;
        do {
            System.out.println("Introduzca precio del coste de produccion: ");
            opcion = sc.nextDouble();
            if (opcion < MAXIMO && MINIMO < opcion ){
                resultado = opcion;
                break;
            }

        }while (true);
        return resultado;
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Declaración de constantes

        final double BENEFICIO = 2500;

        System.out.println("Bienvenido al programa de fabricación de dulces");


        //Declaración de variables
        String opcion  ;
        double materiaPrima;
        double costeProduccion;


        //Usando switch para elegir la opción

        do {
            System.out.println("Por favor, seleccione una opción del menú");
            System.out.println("1. Calcular viabilidad de productos");
            System.out.println("Las opciones son: D1, D2, D3, D4, D5");
            System.out.println("SALIR");
        opcion = sc.nextLine();

        opcion = opcion.toUpperCase();
        switch (opcion) {
            case "D1":
                System.out.println("Ha seleccionado la opción D1");
                    materiaPrima = precioMateriaPrima (sc);
                    costeProduccion = precioCosteProduccion(sc);
                System.out.printf("La opcion " + opcion + " cuesta = %.2f %n" , (materiaPrima + costeProduccion));
                System.out.println("Harian falta = " + (Math.ceil(BENEFICIO/(materiaPrima + costeProduccion))) + " unidades ");
                opcion = "salir" ;


                break;
            case "D2":
                System.out.println("Ha seleccionado la opción D2");
                materiaPrima = precioMateriaPrima (sc);
                costeProduccion = precioCosteProduccion(sc);
                System.out.printf("La opcion " + opcion + " cuesta = %.2f %n" , (materiaPrima + costeProduccion));
                System.out.println("Harian falta = " + (Math.ceil(BENEFICIO/(materiaPrima + costeProduccion))) + " unidades ");
                opcion = "salir" ;
                break;
            case "D3":
                System.out.println("Ha seleccionado la opción D3");
                materiaPrima = precioMateriaPrima (sc);
                costeProduccion = precioCosteProduccion(sc);
                System.out.printf("La opcion " + opcion + " cuesta = %.2f %n" , (materiaPrima + costeProduccion));
                System.out.println("Harian falta = " + (Math.ceil(BENEFICIO/(materiaPrima + costeProduccion))) + " unidades ");
                opcion = "salir" ;
                break;
            case "D4":
                System.out.println("Ha seleccionado la opción D4");
                materiaPrima = precioMateriaPrima (sc);
                costeProduccion = precioCosteProduccion(sc);
                System.out.printf("La opcion " + opcion + " cuesta = %.2f %n" , (materiaPrima + costeProduccion));
                System.out.println("Harian falta = " + (Math.ceil(BENEFICIO/(materiaPrima + costeProduccion))) + " unidades ");
                opcion = "salir" ;
                break;
            case "D5":
                System.out.println("Ha seleccionado la opción D5");
                materiaPrima = precioMateriaPrima (sc);
                costeProduccion = precioCosteProduccion(sc);
                System.out.printf("La opcion " + opcion + " cuesta = %.2f %n" , (materiaPrima + costeProduccion));
                System.out.println("Harian falta = " + (Math.ceil(BENEFICIO/(materiaPrima + costeProduccion))) + " unidades ");
                opcion = "salir" ;
                break;

            case "SALIR":
                break;

            default:
                System.out.println("Opción incorrecta");
                break;
        }


        }while (!opcion.equalsIgnoreCase("SALIR"));
    }
}
