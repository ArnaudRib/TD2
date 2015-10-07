// Question 3.6
import java.util.Arrays;
import java.util.Scanner;

public class RechercheVal {

	public static int Recherche(int val, int tab []){ //cr�ation de la fonction search
		int x;
		int place=-1;
		for (x=0; x<tab.length; x++){
			if (tab[x]==val){
				place=x;
			}
		}
		if (place==-1){
			System.out.print("La valeur "+val+" ne se trouve pas dans le tableau suivant : ");
			System.out.println(Arrays.toString(tab));
		}else{
			System.out.print("La valeur "+val+" se trouve à la place n°"+place+" dans le tableau suivant : ");
			System.out.println(Arrays.toString(tab));
			}
		return place;
	}


	public static void main(String[] args) {
		int [] tab1= {1,2,3,4,5};
		int val1 = Recherche(55,tab1);
		int val2 = Recherche(5,tab1);
		int [] tab2 = {9,8,7,6,5,4,3,2,1,0};
		int val3 = Recherche(9,tab2);
		int val4 = Recherche(5,tab2);
		}
}
