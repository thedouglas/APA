package br.una.apa.testes;

import static org.junit.Assert.*;

import org.junit.Before;

import org.junit.Test;

import br.una.apa.ordenacao.AlgoritimoOrdenacao;
import br.una.apa.ordenacao.BubbleSort;
import br.una.apa.ordenacao.HeapSort;
import br.una.apa.ordenacao.InsertionSort;
import br.una.apa.ordenacao.QuickSort;
import br.una.apa.ordenacao.SelectionSort;

public class TesteOrdenado extends OrdenacaoTeste {

	@Before
	public void setUp() {
		
		System.out.println("vetor ordenado "+ tamanho);
		vetor = constroiVetorOrdenado(tamanho);
		
		inicio = System.currentTimeMillis();
		
	}

	@Test
	public void bubleSortTeste(){

		AlgoritimoOrdenacao o = new BubbleSort();

		int[] ordenado = o.ordena(vetor);

		assertArrayEquals(esperado, ordenado);
	}

	@Test
	public void InsertionSortTeste(){

		AlgoritimoOrdenacao o = new InsertionSort();

		int[] ordenado = o.ordena(vetor);

		assertArrayEquals(esperado, ordenado);
	}

	@Test
	public void quickSortTeste(){

		AlgoritimoOrdenacao o = new QuickSort();

		int[] ordenado = o.ordena(vetor);

		assertArrayEquals(esperado, ordenado);
	}

	@Test
	public void selectionSortTeste(){

		AlgoritimoOrdenacao o = new SelectionSort();

		int[] ordenado = o.ordena(vetor);

		assertArrayEquals(esperado, ordenado);
	}
	
	@Test
	public void heapSortTeste(){

		AlgoritimoOrdenacao o = new HeapSort();

		int[] ordenado = o.ordena(vetor);

		assertArrayEquals(esperado, ordenado);
	}
}
