package de.jule.shop;

public class SimikolonProblem {

	public static void main(String[] args) {
		zaehleNullBisNeunFalsch();	
		System.out.println("--------------------------------------------");
		zaehleNullBisNeunRichtig();
		System.out.println("--------------------------------------------");
		zaehleNullBisNeunrRichtigOhneSchleife();
	}

	private static void zaehleNullBisNeunFalsch() {
		int i;
		for (i = 0; i < 10; i++); {
			System.out.println(i);
		}
	}

	private static void zaehleNullBisNeunRichtig() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}

	private static void zaehleNullBisNeunrRichtigOhneSchleife() {
		int i = 0;
		System.out.println(i);
		i = i +1 ;
		System.out.println(i);
		i = i +1 ;
		System.out.println(i);
		i = i +1 ;
		System.out.println(i);
		i = i +1 ;
		System.out.println(i);
		i = i +1 ;
		System.out.println(i);
		i = i +1 ;
		System.out.println(i);
		i = i +1 ;
		System.out.println(i);
		i = i +1 ;
		System.out.println(i);
		i = i +1 ;
		System.out.println(i);
	}
}
