//Question 3.6 extra.
import java.util.Arrays;
import java.util.Scanner;

public class SearchTab {

	public static int [] calculerTable(int nb, int max) { //utilisation de la fonction création de tableau.
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
		System.out.println("Le tableau de valeur est le suivant:");
		System.out.println(Arrays.toString(tab));//affiche le tableau souhaité.
		return tab;
		}

	public static int Search(int val, int tab []) { //création de la fonction search.
		int x;
		int place=-1;
		for (x=0; x<tab.length; x++){
			if (tab[x]==val){
				place=x;
			}
		}
		if (place==-1){
			System.out.println("La valeur recherch�e ne se trouve pas dans le tableau!");
		}else{
			System.out.println("La valeur recherch�e se trouve à la place n°"+place+"!");
			}
		return place;
		}


	public static void main(String[] args) {
		int a;
		int b;
		int valeur;
		int c[];
		Scanner sc = new Scanner(System.in);
		System.out.println("De quel nombre voulez vous la table?");
		a = sc.nextInt();
		System.out.println("Jusqu'� quel nombre voulez-vous que la table aille?");
		b = sc.nextInt();
		c = calculerTable(a,b);
		System.out.println("Quelle valeur recherchez-vous dans le tableau pr�c�dent?");
		valeur = sc.nextInt();
		Search(valeur,c);
		}
}
