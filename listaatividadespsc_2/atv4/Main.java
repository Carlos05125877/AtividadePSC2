/*Crie um programa que lê vários números inteiros e positivos e imprima o produto dos números
ímpares e a soma dos números pares. Observação: O programa será encerrado quando um
valor negativo for inserido.*/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int numero, produtoImpares=1, somaPares=0;
	    
	    
		System.out.println("Digite números inteiros positivos (negativo para encerrar):");

        while (true) {
            numero = sc.nextInt();

            if (numero < 0) {
                System.out.println("Programa interrompido " + produtoImpares);
                break;
            }

            if (numero % 2 == 0) {
                somaPares += numero;
            } else {
                produtoImpares *= numero;
            }
            
            System.out.println("Produto dos números ímpares: " + produtoImpares);
            System.out.println("Soma dos números pares: " + somaPares);
        }

        
	}
}
