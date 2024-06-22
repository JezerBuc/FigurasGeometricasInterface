package org.generation;

public class Rombo implements FiguraGeometrica{
	private String nombre;
    private double base;
    private double altura;
    private double lado;
	public Rombo(String nombre, double base, double altura, double lado) {
		super();
		this.nombre = nombre;
		this.base = base;
		this.altura = altura;
		this.lado = lado;
	}// constructor rombo
	
	@Override
	public double calcularArea(){
		return (base*altura)/2;
		
	}//calcularArea
	
	@Override
	public double calcularPerimetro() {
		return lado*4;
	}//calcularPerimetro

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	
	
    
    
    

}//class rombo
