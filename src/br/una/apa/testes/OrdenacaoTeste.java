package br.una.apa.testes;



import java.util.Random;

import org.junit.After;
import org.junit.Rule;
import org.junit.rules.TestName;

public abstract class OrdenacaoTeste {

	protected int tamanho = 10000;
	protected int[] vetor;
	protected int[] esperado = constroiVetorOrdenado(10000);

	protected static long inicio;
	protected long fim;

	@Rule
	public TestName teste = new TestName();


//	@Before
//	public void setUp() {
//
//		inicio = System.currentTimeMillis();
//	}

	@After
	public void tearDown() {

		fim = System.currentTimeMillis();
		System.out.println(teste.getMethodName() +" Tempo: " + ((fim - inicio) ) +" milisegundos: " );
//		System.out.println(algotitimo.getMethodName() + " Tempo: inicio " + inicio + " fim " + fim);
		System.out.println("|------------------------------------------------------------------|");
		System.out.println();
	}
	
	protected int[] constroiVetorOrdenado(int n) {
		int[] v = new int[n];
		for (int i = 0; i < n; i++) {
			v[i] = i+1;
		}
		return v;
	}
	
	public int[] embaralhar(int[] v) {

		Random random = new Random();
		for (int i = 0; i < (v.length - 1); i++) {
			// sorteia um índice
			int j = random.nextInt(v.length);
			// troca o conteúdo dos índices i e j do vetor
			int temp = v[i];
			v[i] = v[j];
			v[j] = temp;
		}
		return v;
	}

}
