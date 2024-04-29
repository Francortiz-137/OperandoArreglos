package SmartWatch;

public class SmartWatch {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Debe proporcionar al menos un parámetro con los pasos diarias.");
            return;
        }
        int[] steps = new int[args.length];

        for (int i = 0; i < args.length; i++) {
            try {
                steps[i] = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.out.println("Uno de los parámetros no es un número válido: " + args[i]);
                return;
            }
        }

        System.out.println("El promedio de pasos diarios es: " + promedio(clearSteps(steps)));
    }

    public static int[] clearSteps(int[] steps){
        int[] correctedSteps = new int[steps.length];
        int counter = 0;
        for(int step: steps){
            if(step >= 200 && step <= 100000){
                correctedSteps[counter] = step;
                counter++;
            }
        }
        return correctedSteps;
    }

    public static double promedio(int[] steps) {
        int total = 0;
        for (int step : steps) {
            total += step;
        }
        return (double) total / steps.length;
    }
}
