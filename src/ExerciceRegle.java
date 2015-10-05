//Question 3.1
import java.util.Scanner;

public class ExerciceRegle {
	public static void main(String[] args) {
		double longueur = 0, i, intervalle=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Longueur? ");
		longueur=sc.nextDouble();
		System.out.print("Intervalle? ");//Exercice1.print("Intervalle? ");
		intervalle=sc.nextDouble();
		for (i=0; i<longueur;i++){
			if (i%intervalle==0)
				System.out.print("|");
			else
				System.out.print("-");
		}
	}
}
