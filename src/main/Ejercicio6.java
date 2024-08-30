package main;

import javax.swing.JOptionPane;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numerosIngresados= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del arreglo"));
		
		int[] arregloInicial=listaNumeros(numerosIngresados);
		
		int[] arregloBurbuja=ordenamientoBurbuja(arregloInicial,numerosIngresados);
		
		
		
		for (int i=0;i<arregloBurbuja.length;i++) {
			
			System.out.println(arregloBurbuja[i] + " ");
		}
		
	}
	
	public static int[] listaNumeros(int numerosIngresados){
		int numeros []=new int [numerosIngresados];
		
		for(int i = 0;i<numerosIngresados;i++) {
			int valoresIngresados= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor" + " " + (1+i)));
			 numeros [i]= valoresIngresados;
			
		}
		return numeros;
		
	}
	
	public static int [] ordenamientoBurbuja(int[] arregloInicial,int numerosIngresados) {
		int listaFinal[]= arregloInicial.clone();
	
		for (int i = 0; i < arregloInicial.length - 1; i++) {
	        for (int j = 0; j < arregloInicial.length - i - 1; j++) {
	            if (listaFinal[j] > listaFinal[j + 1]) {
	                // Intercambio de los elementos
	                int temporal = listaFinal[j]; //almaceno posicion actual
	                listaFinal[j] = listaFinal[j + 1]; //intercambio posicion actual por la siguiente
	                listaFinal[j + 1] = temporal; //intercambio posicion siguiente por la actual
	            }
	        }
	    }
		
		return listaFinal;
	}
	
	
	
	
}
