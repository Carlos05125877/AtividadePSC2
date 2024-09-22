/* Na usina de Angra dos Reis, os técnicos analisam a perda de massa de um material radioativo.
Sabendo-se que este perde 25% de sua massa a cada 30 segundos. Criar um programa que
calcule iterativamente e imprima o tempo necessário para que a massa deste material se torne
menor que 0, 10 grama. O programa pode calcular o tempo para várias massas.
*/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    double massa;
	    double massaMin = 0.1;
	    int tempo = 0;
		System.out.println("Insira a massa do material: ");
		massa = sc.nextDouble();
		
		while( massa >= massaMin){
		  massa = massa -(massa*0.25);
		  tempo = tempo + 30;
		}
		System.out.println("O tempo necessário para que a massa deste material se torne menor que 0.10 grama foi " + tempo + "s" );
	}
}
