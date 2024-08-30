package main;

import javax.swing.JOptionPane;

public class Ejercicio3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Valores ingresados
		int valor1 =Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de la lista: "));
		
		//listado valores
		int[] valoresOperar= listaNumeros(valor1);
		
		

		//Valores Totales
		int totalNumeros=valor1;
		
		
		//variables metodos
		int numerosPositivos=determinarPositivos(valoresOperar);
		float porcentajePositivo= determinarPorcentajePositivo(numerosPositivos, totalNumeros);
		
		int numerosNeutros=determinarNeutros(valoresOperar);
		float porcentajeNeutro= determinarPorcentajeNeutros(numerosNeutros, totalNumeros);
		
		int numerosNegativos=determinarNegativos(valoresOperar);
		float porcentajeNegativo= determinarPorcentajeNegativos(numerosNegativos, totalNumeros);
		
		
		//mensaje
		JOptionPane.showMessageDialog(null,"Positivos: " + numerosPositivos + "(" + (porcentajePositivo) + "%)\n" +
				"Negativos: " + numerosNegativos + "(" + (porcentajeNegativo) + "%)\n" + 
				"Ceros: " + numerosNeutros + "(" + (porcentajeNeutro) + "%)\n");
		

	}
	
	
	//Creacion listado
	public static int[] listaNumeros(int valor1) {
		
		int numeros[]=new int [valor1];
		
		
		for (int i = 0;i<valor1;i++) {
			int valores =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero: "));
			numeros [i]= valores;
		}
		return numeros;	
	}
	
	
	//Metodos Positivos
	public static int determinarPositivos (int[] valoresOperar) {
		int positivos= 0;
		for (int numero:valoresOperar) {
			if (numero>0) {
				positivos++;
			}
		}
		
		return positivos;
	}
	
	public static float determinarPorcentajePositivo (int numerosPositivos, int totalNumeros) {
		return ((float)numerosPositivos/totalNumeros)*100;
		
	}
	
	
	
	//Metodos Neutros
	public static int determinarNeutros (int[] valoresOperar) {
		int neutros= 0;
		for (int numero:valoresOperar) {
			if (numero==0) {
				neutros++;
			}
		}
		
		return neutros;
	}
	
	public static float determinarPorcentajeNeutros (int numerosNeutros, int totalNumeros) {
		return ((float)numerosNeutros/totalNumeros)*100;
	}
	
	
	
	//Metodos Negativos
	public static int determinarNegativos (int[] valoresOperar) {
		int negativos= 0;
		for (int numero:valoresOperar) {
			if (numero<0) {
				negativos++;
			}
		}
		
		return negativos;
	}
	
	public static float determinarPorcentajeNegativos (int numerosNegativos, int totalNumeros) {
		return ((float)numerosNegativos/totalNumeros)*100;
	}
	
	
}
