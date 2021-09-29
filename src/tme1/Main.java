package tme1;
import java.io.File;

public class Main {
	
	public static void main(String[] args) {
		try {
		//MatriceEntiere m = new MatriceEntiere(new File("/users/nfs/Etu3/21101133/Documents/prog co/tme1/data/donnees_somme1"));
		//System.out.println(m);
		
		MatriceEntiere m1 = new MatriceEntiere(new File("/users/nfs/Etu3/21101133/Documents/prog co/tme1/data/donnees_produit1"));
		MatriceEntiere m2 = new MatriceEntiere(new File("/users/nfs/Etu3/21101133/Documents/prog co/tme1/data/donnees_produit2"));
		System.out.println(m1.produitMatrice(m2));
		//System.out.println(m2.produitMatrice(m1));
		//System.out.println(m1);
		//System.out.println(m1.transposeMatrice());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
