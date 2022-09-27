package zooAnimales;
import java.util.ArrayList;

import gestion.Zona;

public class Pez extends Animal{
	private static ArrayList<Pez> listado = new ArrayList<Pez>();
	public static int salmones = 0;	
	public static int bacalaos = 0;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez(String nombre, int edad, String habitat, String genero, Zona zona, String colorEscamas, int cantidadAletas) {
		super(nombre, edad,habitat,genero,zona);
		totalAnimales ++;
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		listado.add(this);
	}
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		this(nombre, edad, habitat, genero, null, colorEscamas, cantidadAletas);
	}
	public Pez() {
		this(null,0, null,null,null,null,0);
	}
	
	public ArrayList<Pez> getListado(){
		return listado;
	}
	
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	
	public int getCantidadAletas() {
		return cantidadAletas;
	}
	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas= cantidadAletas;
	}
	
	public static int cantidadPeces() {
		return listado.size();
	}
	
	public String movimiento() {
		return "nadar";
	}
	public void crearSalmon(String nombre, int edad, String genero) {
		new Pez(nombre, edad, "oceano", genero, "rojo",6);
		salmones++;
	}
	
	public void crearBacalao(String nombre, int edad, String genero) {
		new Pez(nombre, edad, "oceano", genero, "gris",6);
		bacalaos++;
	}
	
	
}
