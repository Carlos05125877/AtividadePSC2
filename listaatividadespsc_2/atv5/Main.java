/*FaC'a um algoritmo que receba a idade, altura e peso de 10 pessoas. Calcule e mostre:
(a) a quantidade de pessoas com idade superior a 50 anos;
(b) a media alturas das pessoas com idade entre 10 e 20 anos;
(c) a porcentagem de pessoas com peso inferior a 40 quilos entre todas as pessoas*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade, cont;
        double altura, peso, somaAlturas = 0, mediaAlturas, percentualPeso;
        int contIdade = 0, contPeso = 0, cont10a20 = 0;

        for (cont = 0; cont < 10; cont++) {
            System.out.println("Escreva sua idade: ");
            idade = sc.nextInt();

            if (idade >= 50) {
                contIdade++;
            }

            System.out.println("Escreva sua altura: ");
            altura = sc.nextDouble();
            if (idade >= 10 && idade <= 20) {
                somaAlturas += altura;
                cont10a20++;
            }

            System.out.println("Escreva seu peso: ");
            peso = sc.nextDouble();
            if (peso < 40.0) {
                contPeso++;
            }
        }

        mediaAlturas = somaAlturas / cont10a20;
        percentualPeso = contPeso *10 ;

        System.out.printf("Pessoas acima de 50 anos: %d\n", contIdade);
        System.out.printf("Média das alturas entre 10 e 20 anos: %.2f\n", mediaAlturas);
        System.out.printf("Percentual de pessoas abaixo de 40Kg: %.2f%%\n", percentualPeso);
    }
}