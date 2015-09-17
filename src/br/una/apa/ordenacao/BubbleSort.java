package br.una.apa.ordenacao;

public class BubbleSort implements AlgoritimoOrdenacao{

	public int[] ordena(int[] a) {
		int ii = 0;
		int length = a.length-1;
		while (ii < a.length) {
			for (int i = 0; i < length; i++) {
				if (a[i] > a[i + 1]) {
					int j = a[i];
					a[i] = a[i + 1];
					a[i + 1] = j;
				}
			}
			length--;
			ii++;
		}
		return a;
	}
}
