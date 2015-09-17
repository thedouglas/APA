package br.una.apa.testes;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import br.una.apa.ordenacao.AlgoritimoOrdenacao;
import br.una.apa.ordenacao.BubbleSort;
import br.una.apa.ordenacao.HeapSort;
import br.una.apa.ordenacao.InsertionSort;
import br.una.apa.ordenacao.QuickSort;
import br.una.apa.ordenacao.SelectionSort;

public class TesteReverso extends OrdenacaoTeste{

	@Before
	public  void inicializa() {
		System.out.println("vetor reverso "+ tamanho);
		vetor = constroiVetorReverso(tamanho);
		
		inicio = System.currentTimeMillis();	
	}
	
	@Test
	public void bubleSortTeste() {

		AlgoritimoOrdenacao o = new BubbleSort();
		int[] v = vetor;
		int[] ordenado = o.ordena(v);

		assertArrayEquals(esperado, ordenado);
	}
	
	@Test
	public void insertionSortTeste() {

		AlgoritimoOrdenacao o = new InsertionSort();
		int[] v = vetor;
		int[] ordenado = o.ordena(v);

		assertArrayEquals(esperado, ordenado);
	}

	@Test
	public void quickSortTeste() {

		AlgoritimoOrdenacao o = new QuickSort();
		int[] v = vetor;
		int[] ordenado = o.ordena(v);

		assertArrayEquals(esperado, ordenado);
	}
	
	@Test
	public void selectionSortTeste() {

		AlgoritimoOrdenacao o = new SelectionSort();
		int[] v = vetor;
		int[] ordenado = o.ordena(v);

		assertArrayEquals(esperado, ordenado);
	}
	
	@Test
	public void heapSortTeste() {

		AlgoritimoOrdenacao o = new HeapSort();
		int[] v = vetor;
		int[] ordenado = o.ordena(v);

		assertArrayEquals(esperado, ordenado);
	}
	
	private int[] constroiVetorReverso(int n) {
		int[] v = new int[n];
		for (int i = 0; i < v.length; i++) {
			v[i] = n--;
		}
		return v;
	}
}
