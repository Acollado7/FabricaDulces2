package fabricdulces2;

import java.util.Scanner;


public class Main {
    public static <Producto> void main(String[] args) {
        //El programa debe tener dos opciones, la primera es realizar
        //los cálculos para ver la viabilidad de los productos y la segunda debe
        // ser “terminar”. Para terminar el programa el usuario debe escribir la
        // palabra Salir (ignorando mayúsculas y minúsculas). En caso de escribir
        // otra cosa, el programa volverá al menú principal.
        //El programa debe filtrar los códigos de los productos. En caso de
        // introducir un código inexistente, el programa preguntará de nuevo
        // por el código a introducir. Si el usuario escribe Salir (ignorando
        // mayúsculas y minúsculas) el programa termina.
        //También se debe filtrar el precio de la materia prima. En caso de que el
        // usuario introduzca un número fuera del rango, el programa debe solicitarlo de nuevo.
        //En este ejercicio también se debe solicitar el coste de la mano de obra para
        // ese producto (siempre entre 0.5€ y 0.9€). En caso de error al introducir este
        // dato, el programa solicitará de nuevo esta información.
        //El resto de restricciones son las mismas que en el ejercicio 3B, pero intenta
        // aplicar las posibles correcciones del ejercicio que hicimos en clase, para que tu
        // código no sea tan repetitivo y sea más legible.
        //Incluye comentarios en el código que permiten leer mejor tu programa.

        Scanner sc = new Scanner(System.in);

        //Declaración de variables
        String codigo;
        String nombre;
        double precio;
        double coste;
        double precioVenta;
        double margen;
        double margenMinimo;
        double margenMaximo;
        double precioMinimo;
        double precioMaximo;

        //Declaración de constantes
        final double PRECIO_MINIMO = 0.5;
        final double PRECIO_MAXIMO = 0.9;
        final double MARGEN_MINIMO = 0.3;
        final double MARGEN_MAXIMO = 0.5;


        System.out.println("Bienvenido al programa de fabricación de dulces");
        System.out.println("Por favor, seleccione una opción del menú");
        System.out.println("1. Calcular viabilidad de productos");
        System.out.println("2. Terminar");
        int opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion) {
            case 1:
                System.out.println("Introduzca el código del producto");
                codigo = sc.nextLine();
                System.out.println("Introduzca el nombre del producto");
                nombre = sc.nextLine();
                System.out.println("Introduzca el precio de la materia prima");
                precio = sc.nextDouble();
                if (precio < 0.1 || precio > 0.5) {
                    System.out.println("El precio debe estar entre 0.1 y 0.5");
                    System.out.println("Introduzca el precio de la materia prima");
                    precio = sc.nextDouble();
                }
                System.out.println("Introduzca el coste de la mano de obra");
                coste = sc.nextDouble();
                if (coste < 0.5 || coste > 0.9) {
                    System.out.println("El coste debe estar entre 0.5 y 0.9");
                    System.out.println("Introduzca el coste de la mano de obra");
                    coste = sc.nextDouble();
                }
                precioVenta = precio + coste;
                margen = precioVenta - precio;
                margenMinimo = precio * MARGEN_MINIMO;
                margenMaximo = precio * MARGEN_MAXIMO;
                precioMinimo = precio + margenMinimo;
                precioMaximo = precio + margenMaximo;

                if (margen > margenMinimo && margen < margenMaximo) {
                    System.out.println("El producto " + nombre + " es viable");
                    System.out.println("El precio de venta debe ser entre " + precioMinimo + " y " + precioMaximo);
                } else {
                    System.out.println("El producto " + nombre + " no es viable");
                }
                break;
            case 2:
                System.out.println("Hasta luego");
                break;
            default:
                System.out.println("Opción incorrecta");
                break;
        }







    }
}
