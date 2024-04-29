package MultiplosDeTres;

public class MultiplosDeTres {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Debe proporcionar al menos un parámetro con los numeos.");
            return;
        }
        int[] numeros = new int[args.length];

        for (int i = 0; i < args.length; i++) {
            try {
                numeros[i] = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.out.println("Uno de los parámetros no es un número válido: " + args[i]);
                return;
            }
        }

        System.out.println(suma(numeros));
        System.out.println(promedio(numeros));
    }
    //Ejercicio 3
    public static int suma(int[] numeros) {
        int suma = 0;
        for (int num : numeros) {
            if (num % 3 == 0) {
                suma += num;
            }
        }
        return suma;
    }

//Ejercicio4
    public static double promedio(int[] numeros) {
        int cantidadMultiplos = 0;
        int sumaMultiplos = 0;
        for (int num : numeros) {
            if (num % 3 == 0) {
                cantidadMultiplos++;
                sumaMultiplos += num;
            }
        }
        if (cantidadMultiplos == 0) {
            return 0; // Evitar división por cero si no hay múltiplos de tres
        }
        return (double) sumaMultiplos / cantidadMultiplos;
    }
}
