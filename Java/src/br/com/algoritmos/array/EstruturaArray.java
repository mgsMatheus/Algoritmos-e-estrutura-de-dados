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
} 

} 