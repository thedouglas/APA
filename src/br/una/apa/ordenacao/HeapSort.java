package br.una.apa.ordenacao;

public class HeapSort implements AlgoritimoOrdenacao {

	@Override
	public int[] ordena(int[] a) {
		// TODO Auto-generated method stub
		return heapSort(a);
	}

	public int[] heapSort(int[] v) {
		criaHeap(v);
		int n = v.length;

		for (int i = v.length - 1; i > 0; i--) {
			troca(v, i, 0);
			recriaHeap(v, 0, --n);
		}
		return v;
	}

	private void criaHeap(int[] v) {
		for (int i = v.length / 2 - 1; i >= 0; i--)
			recriaHeap(v, i, v.length);
	}

	private void recriaHeap(int[] v, int pos, int n) {
		int maxi;
		int l = 2 * pos;
		int direita = 2 * pos + 1;
		if ((l < n) && (v[l] > v[pos])) {
			maxi = l;
		} else {
			maxi = pos;
		}
		if (direita < n && v[direita] > v[maxi]) {
			maxi = direita;
		}
		if (maxi != pos) {
			troca(v, pos, maxi);
			recriaHeap(v, maxi, n);
		}
	}

	public void troca(int[] v, int j, int aposJ) {
		int aux = v[j];
		v[j] = v[aposJ];
		v[aposJ] = aux;
	}
}
