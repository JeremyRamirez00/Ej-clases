package main;

import javax.swing.JOptionPane;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numerosIngresados= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del arreglo: "));
		
		int[] arregloInicial=listaNumeros(numerosIngresados);
		
		int numeroCiclos= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de ciclos: "));
		
		int[] arregloCiclado=ciclosDerecha(arregloInicial,numeroCiclos);

		
		for (int i=0;i<arregloCiclado.length;i++) {
			
			System.out.print(arregloCiclado[i]);
			if (i < arregloCiclado.length - 1) {
				System.out.print (",");
			}
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
	
	public static int [] ciclosDerecha(int[]arregloInicial, int numeroCiclos) {
		int longitud=arregloInicial.length;
		int listaCiclada[]=arregloInicial.clone();
		int ciclos=numeroCiclos;
		
		for(int j=0;j<ciclos;j++) {
			
				int ultimoValor=listaCiclada[longitud-1];
				
				for(int i=longitud-2;i>=0;i--) {
					listaCiclada[i+1]=listaCiclada[i];
					
				}
				listaCiclada[0]=ultimoValor;
			
		}
		return listaCiclada;
		
		
	}
	
}
