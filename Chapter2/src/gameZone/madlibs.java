package gameZone;

import java.util.Scanner;

public class madlibs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String color;
		String wordEst;
		String bodyPartPlural;
		String anAnimal;
		String aNoun;
		String PluralNoun;
		
		int a, b, c;
		
	
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a color >>");
		color = input.nextLine();
		System.out.print("Enter a wordEst >>");
		wordEst = input.nextLine();
		System.out.print("Enter a bodyPartPlural");
		bodyPartPlural = input.nextLine();
		System.out.print("Enter a anAnimal");
		anAnimal = input.nextLine();
		System.out.print("Enter a aNoun");
		aNoun = input.nextLine();
		System.out.print("Enter a PluralNoun");
		PluralNoun = input.nextLine();
		
		System.out.print("Enter a number >>");
		a = input.nextInt();
		System.out.print("Enter a number >>");
		b = input.nextInt();
		
		c = a - b;
		
		System.out.print("The" + color + "Dragon is the." + wordEst +"It has" +  + "");
		
	}

}
