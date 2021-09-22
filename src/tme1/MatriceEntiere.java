package tme1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MatriceEntiere {
	int matrice[][];
	
	public MatriceEntiere(int lignes, int colonnes) {
		matrice = new int[lignes][colonnes];
	}
	
	public MatriceEntiere(File fichier) {
		try(BufferedReader in = new BufferedReader(new FileReader(fichier)))
		{
			Scanner sc = new Scanner(in);
			matrice = new int[sc.nextInt()][sc.nextInt()];
			for(int x = 0; x < matrice.length; x++)
			{
				for(int y = 0; y < matrice[0].length; y++) {
					matrice[x][y] = sc.nextInt();
				}
			}
			sc.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public int getElem(int i, int j) {
		return matrice[i][j];
	}
	
	void setElem(int i, int j, int val) {
		matrice[i][j] = val;
	}
	
	@Override
	public String toString() {
		String res ="";
		for(int x = 0; x < matrice.length; x++)
		{
			for(int y = 0; y < matrice[0].length; y++) {
				res += matrice[x][y] + "\t";
			}
			res+="\n";
		}
		
		return res;
	}
	
	public void initZero() {
		for(int x = 0; x < matrice.length; x++)
		{
			for(int y = 0; y < matrice[0].length; y++) {
				matrice[x][y] = 0;
			}
		}
	}
	
	public void somme(MatriceEntiere m) {
		for(int x = 0; x < matrice.length; x++)
		{
			for(int y = 0; y < matrice[0].length; y++) {
				matrice[x][y] += m.matrice[x][y];
			}
		}
	}

	public void produitScalaire(int i) {
		for(int x = 0; x < matrice.length; x++)
		{
			for(int y = 0; y < matrice[0].length; y++) {
				matrice[x][y] *= i;
			}
		}
	}

	public MatriceEntiere produitMatrice(MatriceEntiere m) {
		int[][] res = new int[matrice[0].length][m.matrice.length];

		for(int x = 0; x < res.length; x++) {
			for(int y = 0; y < res[0].length; y++) {
				
				int stock = 0;
				for(int a = 0; a < res.length; a++) {
					System.out.println(x + "\t" + a);
					stock += (matrice[x][a] * m.matrice[a][y]);
				}
				
				res[x][y] = stock;
			}
		}
		MatriceEntiere ma = new MatriceEntiere(matrice[0].length, m.matrice.length);
		ma.matrice = res;
		return ma;		
	}
	
	
}
