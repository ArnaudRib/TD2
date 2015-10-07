// Question 3.5.
import java.util.Scanner;
import java.util.Arrays;

public class MultiplicationTableau {


	public static int calculerTable(int nb, int max) {
		int multiplication=0;
		int x=max+1;
		int tab[]= new int[max+1];
		int i;
		while (x>0){
			for (i=0; i<=max; i++){
				multiplication=nb*(max-x+1);
				tab[i]=multiplication;
				x=x-1;
				}
			}
		System.out.println(Arrays.toString(tab));
		return multiplication;
		}

	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("De quel nombre voulez vous la table?");
		a = sc.nextInt();
		System.out.println("Quel nombre maximal de la table?");
		b = sc.nextInt();
		calculerTable(a,b);
		}
}
