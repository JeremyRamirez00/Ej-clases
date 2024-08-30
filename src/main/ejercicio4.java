package main;

import javax.swing.JOptionPane;

public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int base= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base: "));
		int altura= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura: "));
		
		for (int i=0;i<altura;i++) {
			for (int j=0;j<base;j++) {
				if (i==0 || i==altura-1) {
					System.out.print("*");
				}else if(j==0 || j==base-1){
					System.out.print("*");
					
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
