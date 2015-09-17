package br.una.apa.ordenacao;

public class InsertionSort implements AlgoritimoOrdenacao {

	@Override
	public int[] ordena(int[] a) {
		
        for (int i = 0; i < a.length; i++) {
        	int chave = a[i];
        	int j = i-1;
        	while (j >= 0 && a[j] > chave) {
				a[j +1] = a[j];
				j--;
			}
        	a[j +1] = chave;
		}
		return a;
	}
}
