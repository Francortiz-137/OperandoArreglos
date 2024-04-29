package Visitas;

public class Visitas {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Debe proporcionar al menos un parámetro con las visitas diarias.");
            return;
        }
        int[] visitasDiarias = new int[args.length];

        for (int i = 0; i < args.length; i++) {
            try {
                visitasDiarias[i] = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.out.println("Uno de los parámetros no es un número válido: " + args[i]);
                return;
            }
        }

        double promedioVisitas = promedio(visitasDiarias);
        System.out.println("Para la entrada anterior, el resultado es: " + promedioVisitas);
    }


    public static double promedio(int[] visitasDiarias) {
        int totalVisitas = 0;
        for (int visita : visitasDiarias) {
            totalVisitas += visita;
        }
        return (double) totalVisitas / visitasDiarias.length;
    }
}
