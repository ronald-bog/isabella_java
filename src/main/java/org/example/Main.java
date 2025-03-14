package org.example;

public class Main {
    public static void main(String[] args) {
        int N = 10; // Cambiar este valor para probar con otros valores de N
        System.out.println(fibonacci(N));
        int ini = 20;
        int fin = 30;
        int veces = (int) (Math.random() * (fin - ini + 1)) + 20;
        System.out.println("veces: " + veces);
        //for (int i = 1; i <= veces; i++) System.out.println(i + ":" + raiz());

        // System.out.println(numerosPares(2, 355));

        System.out.println(numerosSuma(5));
    }

    //  2. Escriba una función que reciba un entero N mayor de 2 y retorne un string cono esos N términos de la serie de Fibonacci (La sucesión de Fibonacci se trata de una serie infinita de números naturales que empieza con un 0 y un 1 //  y continúa añadiendo números que son la suma de los dos anteriores: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597…)
    public static String fibonacci(int n) {
        String cadena = "0, 1";
        int a = 0, b = 1;
        for (int i = 3; i <= n; i++) {
            int next = a + b;
            cadena += ", " + next;
            a = b;
            b = next;
        }
        return cadena;
    }

    /*3. Diseñar y desarrollar una función que NO reciba datos de entrada, genere  aleatoriamente un número entre 2 y 355, le calcule su raíz cuadrada y retorne este valor. Para calcular las raíces  usar la función Sqrt de la biblioteca Math.

    En el main, antes de invocar la función, se debe calcular un aleatorio entre 20 y 30 el cual establecerá la cantidad  de veces que va a llamar a la función y en un ciclo, mostrar los resultados.*/
    public static double raiz() {
        int ini = 2;
        int fin = 355;
        int numeroRandom = (int) (Math.random() * (fin - ini + 1)) + ini;
        System.out.println(numeroRandom);
        return Math.sqrt(numeroRandom);
    }

    /*    4. Diseñar y desarrollar una función que reciba un valor inicial y un valor final, para generar 900 números aleatorios en este rango y retorne un texto que diga cuántos números pares fueron generados. Controle que el nro inicial sea menor que nro final para establecer el rango. Llame la función desde el main e imprimir el resultado arrojado.*/

    public static String numerosPares(int ini, int fin) {
        int pares = 0;
        for (int i = 1; i <= 900; i++) {
            int numeroGenerado = (int) (Math.random() * (fin - ini + 1)) + ini;
            //int numeroGenerado = (int) (Math.random() * (fin - 1)) + ini;
            if (numeroGenerado % 2 == 0) {
                pares++;
                System.out.println(numeroGenerado);
            }
        }
        return "Numeros Pares => " + pares;
    }

    /*
5. Diseñar y desarrollar una función que calcule una cantidad de númerosaleatorios que viene como parámetro de entrada y los sume. La función deberá retornar el total de la suma. Usted defina los rangos que va a usar en el cálculo. Llame la función desde el main e imprimir el resultado arrojado.
 */
    public static String numerosSuma(int cantidad) {
        int suma = 0;
        String numeros = "";
        for (int i = 1; i <= cantidad; i++) {
            int ini = 10;
            int fin = 30;
            int numeroGenerado = (int) (Math.random() * (fin - ini + 1)) + ini;
            numeros += numeroGenerado + ", ";
            suma += numeroGenerado;
        }
        String numerosSinUltimoChar = numeros.substring(0, numeros.length() - 2);
        return "SUMA DE LOS NUMEROS " + numerosSinUltimoChar + " => " + suma;
    }
}


/*
 * 6. Se requiere una función para simular el sorteo de una lotería, de acuerdo
 * con las siguientes condiciones:
 *
 * La lotería tiene 20 premios.
 *
 * Cada premio que calcula el programa debe tener el número de 4 cifras entre
 * 0000 y 9999 acompañado de la serie
 * que es un número entre 100 y 150.
 *
 * Ejemplo: 5698-101
 *
 * Cada premio lo debe imprimir el programa de la siguiente forma (n representa
 * un número cualquiera):
 *
 * Sorteo # nn - Número Premiado nnnn - Serie nnn
 *
 * Ejm: Sorteo # 19 - Número Premiado 5698 - Serie 101
 *
 * Para tener en cuenta la forma en la cual se informan los 20 resultados:
 *
 * Del premio 20 al 6 el programa imprime:
 *
 * ======PREMIOS MENORES=======
 * y la lista de los 15 premios
 *
 * Del premio 5 al 2 el programa imprime:
 * ======PREMIOS SECOS=========
 * y la lista de los 4 premios secos
 *
 * AL llegar al premio 1, el programa imprime:
 * ======Premio mayor==========
 * Y el premio mayor
 *
 * Nota: para sacar el premio mayor calcule el random por cada número, como lo
 * hacen en la realidad los sorteos.
 *
 * La función no recibe parámetros y devuelve un string con toda la lista de
 * premios. El main, invoca la función
 * e imprime el resultado que esta arroje.
 *
 *
 *
 *
 */

