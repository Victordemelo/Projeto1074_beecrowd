/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 *
 * @author victo
 */
import java.util.Scanner;

public class Projeto1074 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //System.out.println("Digite o numero de vezes que deseja repetir: ");
        int N = leitor.nextInt();

        //System.out.println("Digite os numero que você veja se é par ou impar, positivo ou negativo: ");
        for (int i = 0; i < N; i++) {
            int X = leitor.nextInt();

            if (X % 2 == 0 && X < 0) {
                System.out.println("EVEN NEGATIVE");
            }

            if (X % 2 == 0 && X > 0) {
                System.out.println("EVEN POSITIVE");
            }

            if (X % 2 != 0 && X < 0) {
                System.out.println("ODD NEGATIVE");
            }

            if (X % 2 != 0 && X > 0) {
                System.out.println("ODD POSITIVE");
            }

            if (X == 0) {
                System.out.println("NULL");
            }
        }
    }
}
