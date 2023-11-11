package org.jva;

import java.util.Random;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
//	Snack 1
		
	Scanner in=new Scanner(System.in);
	
	System.out.println("Inserisci un numero: ");
	
	String number=in.nextLine();
	
	int numberInt=Integer.valueOf(number);
	
	if(numberInt % 2==0) {
		
		System.out.println(numberInt);
		
	}else {
		
		System.out.println(numberInt+1);
		
	}
//	____________________________________
	
//	Snack 2
	
	String[] nomi = {"Mario", "Luigi", "Giovanna", "Anna", "Carlo", "Maria", "Luca", "Giuseppe", "Elena", "Francesca"};
	String[] cognomi = {"Rossi", "Bianchi", "Verdi", "Russo", "Ferrari", "Esposito", "Romano", "Gallo", "Conti", "Marino"};
	
	String[] list= new String[5];
	
	for(int x=0;x<list.length;x++) {
		
		Random rand=new Random();
		
		int number1 = rand.nextInt(10);
		
		int number2 = rand.nextInt(10);
		
		String nomeRandom= nomi[number1];
		String cognomeRandom= cognomi[number2];
		
		String fullName=nomeRandom+" "+cognomeRandom;
		
		list[x]=fullName;
		
		System.out.println(list[x]);
		
	}
	
//	__________________________________
	
	
//	Snack 3
	
	int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,12};
	int sum =0;
	
	for(int x=0;x<numbers.length;x++) {
		
		int y=x+1;
		
		if(y%2!=0) {
			sum= sum+numbers[x];
		}
		
	}
	System.out.println(sum);
//	_______________________________
	
	
	}

}
