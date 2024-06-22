package org.generation;

public class Main {

	public static void main(String[] args) {
		Triangulo bermudas = new Triangulo("Bremudas", 20, 10, 15);
		Triangulo t = new Triangulo("TrianguloTE", 250, 175, 145);
		Cuadrado c = new Cuadrado ("Cuadrado", 60);
		Rectangulo r = new Rectangulo ("Rectangulo", 30, 60);
		Rombo rom = new Rombo ("Rombo", 45, 50, 55);
		Romboide romb = new Romboide ("Romboide", 50, 100);
		Trapecio trap = new Trapecio ("Trapecio", 50, 100, 40, 50,60,100,60);
		imprimirCalculo(bermudas);
		imprimirCalculo(t);
		imprimirCalculo(c);
		imprimirCalculo(r);
		imprimirCalculo(rom);
		imprimirCalculo(romb);
		imprimirCalculo(trap);

	}//main

	
	
	public static void imprimirCalculo(FiguraGeometrica f) {
		
		System.out.println(f.toString());
		System.out.println("+========================");
		System.out.println("|El área de [" + f.getNombre() 
		+ "] es: " + f.calcularArea());
		System.out.println("|El périmetro de [" + f.getNombre() 
		+ "] es: " + f.calcularPerimetro());

		System.out.println("+========================");

		
	}//imprimirCalculo
}//class main
