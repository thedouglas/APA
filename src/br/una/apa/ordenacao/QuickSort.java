package br.una.apa.ordenacao;

public class QuickSort implements AlgoritimoOrdenacao{

	private int[] v;
	public QuickSort() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int[] ordena(int[] a) {
		v = a;
		
		ordenaRecursivo(0, v.length-1);
		
		return v;
	}
	public void ordenaRecursivo ( int p, int r) {
	   int j;
	   if (p < r) {
	      j = separa ( p, r);
	      ordenaRecursivo ( p, j-1);
	      ordenaRecursivo (j+1, r);
	   }
	}
	
	public int separa(int p, int r) {
		int c = v[r];
		int i = p;
		int aux;
		for (int j = p; j < r; j++) {
			if (v[j] <= c) {
				aux = v[i];
				v[i] = v[j];
				v[j] = aux;
				i++;
			}
		}
		aux = v[i];
		v[i] = v[r];
		v[r] = aux;
		return i;
	}

}
