package org.generation;

public class Romboide implements FiguraGeometrica{
	private String nombre;
	private double base;
	private double altura;
	public Romboide(String nombre, double base, double altura) {
		super();
		this.nombre = nombre;
		this.base = base;
		this.altura = altura;
	}//constructor romboide 
	
	@Override
	public double calcularArea(){
		return base*altura;
		
	}//calcularArea
	
	@Override
	public double calcularPerimetro() {
		return base*2+altura*2;
	}//calcularPerimetro
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getBase() {
		return base;
	}
	public void setBase(Double base) {
		this.base = base;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	

}//class romboide 