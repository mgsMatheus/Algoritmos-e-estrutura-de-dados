package br.com.algoritmos.array;

import java.util.Iterator;

public class EstruturaArray {


	// Inicializa um array com o tamanho de 50.
	private int[] aLista = new int[50];

	private int listaSize = 10;
	
	
	
	
	//Cria uma function para criar um arrayAleatório
	public void geraArrayAleatorio() { 
		
	for (int i = 0; i < listaSize; i++) {
		
		aLista[i] = (int)(Math.random()*10)+10;
		
	}
	}

	
	
	//Getting a value by index. 
	public int recebeIndexLista(int index) {
		
		if(index < listaSize) return aLista[index]; 
			
		return 0;
	}
	
	
	public boolean contemEsseValor(int valorPesquisado) {
		
	boolean valorNaLista = false; 
	
	for(int i = 0; i < listaSize; i++) {
		if(aLista[i] == valorPesquisado) { 
			valorNaLista = true;
		}
	}
		
	return valorNaLista;
	
	}
	
	

	public void printArray() {
		
		System.out.println("----------");
		
		for(int i = 0; i < listaSize; i++) {
			System.out.print("|" +i+ "| |");
			System.out.println(aLista[i] + "|");
			System.out.println("----------");
		}
	}



	public static void main(String[] args) { 

	EstruturaArray newArray = new EstruturaArray();
	
	newArray.geraArrayAleatorio();
	
	newArray.printArray();
	
	System.out.println(newArray.recebeIndexLista(3));

	System.out.println(newArray.contemEsseValor(15));
	} 

} 