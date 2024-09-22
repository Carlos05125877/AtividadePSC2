/*. Crie um programa que imprima a sequência dos 100 próximos números inteiros, seguintes a um
valor fornecido pela pessoa utilizadora.
*/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    int num = 0;
	    
	    
		System.out.println("Escreva um número: ");
		num = sc.nextInt();
		
		for(int cont = 0; cont < 100; cont++ ){
		   num++;
		   System.out.println(num); 
		}
	}
}
