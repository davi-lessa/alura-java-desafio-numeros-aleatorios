import java.util.Random;
import java.util.Scanner;

public class Main {
    // Método para imprimir o número restante de chances do jogador.
    public static void printRemain(int currentTry, int maxTries){
        int remain = maxTries - currentTry;
        // Sufixo "s" para plural
        String pluralSuffix = remain > 1 ? "s" : "";
        System.out.printf("%d chance%s restantes. Boa sorte!%n", remain, pluralSuffix);
    }
    
    public static void main(String[] args) {
        // Número máximo de tentatives
        int maxTries = 5;
        // Número aleatório máximo (0, n)
        int maxRandomValue = 2;
        int score = 0;

        // Controle de nova tentativa
        String tryAgainRes = "Y";

        // Loop da tentativa atual
        do {
            tryAgainRes = "";
            boolean isRight = false;
            int currentTry = 1;
            int randomNumber = new Random().nextInt(maxRandomValue);

            System.out.printf(score > 0 ? "Pontuação: " + score : "%n");
            System.out.printf("Um número aleatório de 0 a %d foi gerado. Você tem %d chances para acertá-lo.%n", maxRandomValue, maxTries);

            while (currentTry <= maxTries) {
                Scanner scanner = new Scanner(System.in);
                int typedNumber = scanner.nextInt();

                if (typedNumber > maxRandomValue || typedNumber < 0) {
                    System.out.printf("Ops, o número gerado deve estar entre 0 e %d. Essa tentativa não será contabilizada!%n", maxRandomValue);
                    printRemain(currentTry - 1, maxTries);
                    continue;
                }

                if (currentTry < maxTries) {
                    if (typedNumber == randomNumber) {
                        score++;
                        isRight = true;
                        break;
                    } else if (typedNumber < randomNumber) {
                        System.out.println("Ops, o número inserido é MENOR que o gerado! Tente um valor maior.");
                    } else {
                        System.out.println("Ops, o número inserido é MAIOR que o gerado! Tente um valor menor.");
                    }

                    printRemain(currentTry, maxTries);
                }
                currentTry++;
            }

            if (isRight) {
                System.out.println("Parabéns, você acertou!");
            } else {
                System.out.println("Não foi dessa vez. Boa sorte na próxima!");
            }

            System.out.println("Tentar novamente? (Y/n)");

            while (!tryAgainRes.equalsIgnoreCase("Y") && !tryAgainRes.equalsIgnoreCase("N")) {
                Scanner tryAgainScanner = new Scanner(System.in);
                tryAgainRes = tryAgainScanner.next();
            }
            
        } while (tryAgainRes.equalsIgnoreCase("Y"));
        System.out.printf("Sua pontuação final foi: %d.", score);

    }
}