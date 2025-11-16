
public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Por favor, vaya introduciendo números enteros positivos. Para terminar, introduzca un número primo:");
        
        int numeroIntroducido = 0;
        boolean esNoPrimo = true; 
        int contadorNoPrimo = 0;
        int contadorPrimo = 0;
        int acumulador = 0;
        int mayor = 0;
        int menor = 0;

        do {
            numeroIntroducido = Integer.parseInt(System.console().readLine());

            menor = numeroIntroducido;

            contadorNoPrimo = 0; 

            for (int i = 1; i < numeroIntroducido; i++) {
                if (numeroIntroducido % i == 0) {
                    contadorNoPrimo++;
                }
            }
            
            if (contadorNoPrimo == 1) {
                esNoPrimo = false;
            
            } else {
                esNoPrimo = true;
                contadorPrimo++;
            }

            if (esNoPrimo == true) {
                acumulador += numeroIntroducido;
            }

            if (numeroIntroducido > mayor && esNoPrimo == true) {
                mayor = numeroIntroducido;
            }

            if (numeroIntroducido < menor && esNoPrimo == true) {
                menor = numeroIntroducido;
            }

        } while (esNoPrimo == true); 

        System.out.printf("Ha introducido %d números no primos.%n", contadorPrimo);
        System.out.printf("Máximo: %d%n", mayor);
        System.out.printf("Mínimo: %d%n", menor);
        System.out.printf("Media: %d%n", acumulador/contadorPrimo);
    }
}