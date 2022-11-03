package fabricdulces2;

import javax.swing.*;
import java.util.Scanner;


public class Main {
    //Vamos a usar metodos para que el codigo quede mas limpio, y para que sea mas facil de leer
    //Los diferentes metodos que vamos a usar son:
    //1. Metodo para Mostrar el menu inicial
    //2. Metodo para leer los codigos del menu
    //3.Metodo para filtrar los codigos del menu
    //4.metodo para leer Materia Prima
    //5.Metodo para filtrar Materia Prima
    //6.Metodo para leer Costo de Produccion
    //7.Metodo para filtrar Costo de Produccion
    //8.Metodo para calcular costo de produccion
    //9.Metodo para calcular precio de venta
    //10.Metodo para calcular ganancia

    public static void main(String[] args) {
        menuInicial();
    }
    public static void menuInicial() {
        int opcion;
        boolean salir = true;
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a la fabrica de dulces\n" +
                        "1. Mostrar codigos de los dulces\n" +
                        "2.Salir del programa"));

                if (opcion < 1 || opcion > 2) {
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
                } else {
                    switch (opcion) {
                        case 1 -> mostrarCodigos();
                        case 2 -> {
                            JOptionPane.showMessageDialog(null, "Gracias por usar el programa");
                            salir = false;
                        }
                    }
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Opcion no valida");
            }

        } while (salir);

    }

    private static boolean filtrarCodigo(String opcion) {

        boolean resultado = false;
        if (!(opcion.equalsIgnoreCase("M1")
                || opcion.equalsIgnoreCase("M2")
                || opcion.equalsIgnoreCase("T1")
                || opcion.equalsIgnoreCase("T2")
                || opcion.equalsIgnoreCase("P1"))) {
            resultado = true;
        }
        return resultado;
    }

    private static void mostrarCodigos() {
        String opcion;
        do {
            try {
                opcion = JOptionPane.showInputDialog("Bienvenido a la fabrica de dulces\n" +
                        "1.M1\n" +
                        "2.M2\n" +
                        "3.T1\n" +
                        "4.T2\n" +
                        "5.P1\n");

                if (filtrarCodigo(opcion)) {
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
                } else {
                    double materiaPrima = precioMateriaPrima() ;
                    double costoProduccion = precioCosteProduccion();
                    double precioVenta = calcularPrecioVenta(materiaPrima, costoProduccion);
                    JOptionPane.showMessageDialog(null, "El Numero de unidades necesaias para obtener un benefio de 2500 son: " + precioVenta);
                    break;

                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Opcion no valida");
            }

        } while (true);


    }


    public static double precioMateriaPrima() {
        double resultado;
        double opcion;
        final double MINIMO = 1;
        final double MAXIMO = 2;
        do {
            try {
                opcion = Double.parseDouble(JOptionPane.showInputDialog("Bienvenido a la fabrica de dulces\n" +
                        "Ingrese el precio de la materia prima"));
                if (opcion < MINIMO || opcion > MAXIMO) {
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
                } else {
                    resultado = opcion;
                    return resultado;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Opcion no valida");
            }

        } while (true);
    }

    public static double precioCosteProduccion() {
        double resultado;
        double opcion;
        final double MINIMO = 0.5;
        final double MAXIMO = 0.9;
        do {
            try {
                opcion = Double.parseDouble(JOptionPane.showInputDialog("Introduzca precio del Coste de la produccion: "));
                if (opcion < MAXIMO && MINIMO < opcion) {
                    resultado = opcion;
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Opcion no valida");
            }
        } while (true);

        return resultado;
    }

    private static double calcularPrecioVenta (double materiaPrima, double costoProduccion){
        final double BENEFICIO = 2500.00;
        return Math.ceil(BENEFICIO/(materiaPrima + costoProduccion));
    }


}

