package br.una.apa.ordenacao;

import java.util.Random;

public class Ordenacao {

	public static void main(String[] args) {

		AlgoritimoOrdenacao o = new InsertionSort();
		int[] vetor = constroiVetor(20000);
	
		vetor = o.ordena(vetor);
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		System.out.println("Fim ");
	}
	
	public static int[] constroiVetor(int n) {
		int[] v = new int[n];
		Random r = new Random();
		for (int i = 0; i < v.length; i++) {
			v[i] = r.nextInt();
		}
		return v;
	}
	public static int[] random(int min, int max){
	    
		Random rand = new Random();
	    int[] randomNum = new int[max];
	    for (int i = 0; i < max; i++) {
	    	randomNum[i] = rand.nextInt((max - min) + max) + min;
		}
	    return randomNum;
	}
}
