package br.una.apa.ordenacao;

public class SelectionSort implements AlgoritimoOrdenacao {

	@Override
	public int[] ordena(int[] a) {

        for (int i = 0; i < a.length-1; i++) {
        	
			int s = a[i];
			int menor = a[i+1];
			int p =  i+1;
			for (int j = i+2; j < a.length; j++) {
				if (a[j] < menor) {
					 menor = a[j];
					 p = j;
				}
			}
			if (menor < s) {
				a[i] = a[p];
				a[p] = s;
			}
			
		}
		return a;
	}

}
