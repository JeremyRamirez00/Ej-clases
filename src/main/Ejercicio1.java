package main;

import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ingreso de numeros
		int num1= Integer.parseInt(JOptionPane.showInputDialog("Digite el valor 1:"));
		int num2= Integer.parseInt(JOptionPane.showInputDialog("Digite el valor 2:"));
		int num3= Integer.parseInt(JOptionPane.showInputDialog("Digite el valor 3:"));
		
		//Impresión 
		JOptionPane.showMessageDialog(null,calcularMayor(num1, num2, num3) + " Es mayor");
		JOptionPane.showMessageDialog(null,calcularMediano(num1, num2, num3) + " Es el del medio");
		JOptionPane.showMessageDialog(null,calcularMenor(num1, num2, num3) + " Es menor");
		
		
		
	}
	
	public static int calcularMayor(int num1, int num2, int num3) {
		if(num1>num2 && num1>num3){
			return num1;
		}else if(num2>num1 && num2>num3){
			return num2;
		}else {
			return num3;
		}
	
	}
	
	
	public static int calcularMenor(int num1, int num2, int num3) {
		if(num1<num2 && num1<num3){
			return num1;
		}else if(num2<num1 && num2<num3){
			return num2;
		}else {
			return num3;
		}
	
	}
	
	
	public static int calcularMediano(int num1, int num2, int num3) {
		if((num1>num2 && num1<num3) || (num1<num2 && num1>num3)){
			return num1;
		}else if((num2>num1 && num2<num3) || (num2<num1 && num2>num3)){
			return num2;
		}else {
			return num3;
		}
	
	}
	
}