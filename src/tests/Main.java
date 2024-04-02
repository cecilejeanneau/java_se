package tests;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
//	private static Scanner sc = new Scanner(System.in);
//	
//	public static int factorielle(int n) {
//		int f = 1;
//
//		for (int i = 1; i <= n; i++) {
//			f = f * i;
//		}
//		return f;
//	}
//	
//	public static void main(String[] args) {
//		System.out.println("Entrez un nb pour calculer sa factorielle : ");
//		int nb = sc.nextInt();
//		System.out.println("Factorielle %d est : %d".formatted(nb,factorielle(nb)));
//	}
	
//	private static void sort(int [] tab) { //passage par référence
//		for(int i = 0; i < tab.length -1; i++) { // "-1" parce que lorsque i arrive au dernier du tableau le j ne peut pas être en dehors. donc i doit s'arrêter à l'avant dernière !
//			for(int j = i + 1; j < tab.length; j++) {
//				if(tab[i]>tab[j]) {
//					int temp = tab[i];
//					tab[i] = tab[j];
//					tab[j] = temp;
//				}
//			}
//		}
//	}
//	
//	public static void main(String[] args) {
//		int []t = {8, 4, 5, 1, 3, 9, 5, 4};
//		sort(t);
//		System.out.println(Arrays.toString(t));
//	}
	
	public static void main(String[] args) {
		Person p = new Person("Duval", "Lucas", 35);
		
		System.out.println(p.name());
	}
}
