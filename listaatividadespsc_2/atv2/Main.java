/* Escreva um programa em Java que calcule o produto de A (número real) por B (número inteiro),
ou seja, A*B, por intermédio de adições sucessivas. Tanto A quanto B devem ser fornecidos
pela pessoa utilizadora do programa.*/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    Double numA, numB;
	    Double result =0.0;
	    int cont = 0;
	    System.out.println("Escreva o primeiro numero: ");
	    numA = sc.nextDouble();
	    System.out.println("Escreva o segundo numero: ");
	    numB = sc.nextDouble();
	    
	    do{
	       result = numA+result;
	       cont++;
	       
	    }while(cont < numB );
		   System.out.println("O resultado é: " + result);
	}
}
