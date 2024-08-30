package main;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Valores ingresados
		int valor1 =Integer.parseInt(JOptionPane.showInputDialog("Ingrse el valor 1: "));
		int valor2 =Integer.parseInt(JOptionPane.showInputDialog("Ingrse el valor 2: "));
		int valor3 =Integer.parseInt(JOptionPane.showInputDialog("Ingrse el valor 3: "));
		int valor4 =Integer.parseInt(JOptionPane.showInputDialog("Ingrse el valor 4: "));
		int valor5 =Integer.parseInt(JOptionPane.showInputDialog("Ingrse el valor 5: "));
		int valor6 =Integer.parseInt(JOptionPane.showInputDialog("Ingrse el valor 6: "));

		//Valores Totales
		int totalNumeros=6;
		
		
		//Listado de valores
		ArrayList<Integer> numeros= new ArrayList<Integer>();
		numeros.add(valor1);
		numeros.add(valor2);
		numeros.add(valor3);
		numeros.add(valor4);
		numeros.add(valor5);
		numeros.add(valor6);
		
		
		
		//variables metodos
		int numerosPositivos=determinarPositivos(numeros);
		float porcentajePositivo= determinarPorcentajePositivo(numerosPositivos, totalNumeros);
		
		int numerosNeutros=determinarNeutros(numeros);
		float porcentajeNeutro= determinarPorcentajeNeutros(numerosNeutros, totalNumeros);
		
		int numerosNegativos=determinarNegativos(numeros);
		float porcentajeNegativo= determinarPorcentajeNegativos(numerosNegativos, totalNumeros);
		
		
		//mensaje
		JOptionPane.showMessageDialog(null,"Positivos: " + numerosPositivos + "(" + (porcentajePositivo) + "%)\n" +
				"Negativos: " + numerosNeutros + "(" + (porcentajeNegativo) + "%)\n" + 
				"Ceros: " + numerosNeutros + "(" + (porcentajeNeutro) + "%)\n");
		//JOptionPane.showMessageDialog(null,"Negativos: " + numerosNeutros + "(" + (porcentajeNegativo) + "%)\n");
		//JOptionPane.showMessageDialog(null,"Ceros: " + numerosNeutros + "(" + (porcentajeNeutro) + "%)\n");

	}
	
	
	//Metodos Positivos
	public static int determinarPositivos (ArrayList<Integer> numeros) {
		int positivos= 0;
		for (int numero:numeros) {
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
	public static int determinarNeutros (ArrayList<Integer> numeros) {
		int neutros= 0;
		for (int numero:numeros) {
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
	public static int determinarNegativos (ArrayList<Integer> numeros) {
		int negativos= 0;
		for (int numero:numeros) {
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
