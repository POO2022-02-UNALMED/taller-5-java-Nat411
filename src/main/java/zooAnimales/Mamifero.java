package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Mamifero extends Animal{
	private static ArrayList<Mamifero> listado = new ArrayList<Mamifero>();
	public static int caballos;	public static int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero(String nombre, int edad, String habitat, String genero, Zona zona, Boolean pelaje, int patas) {
		totalAnimales ++;
		cantidadMamiferos++;
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.zona = zona;
		this.pelaje = pelaje;
		listado.add(this);
	}
	public Mamifero(String nombre, int edad, String habitat, String genero, Boolean pelaje, int patas) {
		this(nombre, edad, habitat, genero, null, pelaje, patas);
	}
	public Mamifero() {
		this(null,0, null,null,null,null,0);
	}
	
	public int getCaballos() {
		return caballos;
	}
	public int getLeones() {
		return leones;
	}
	
	public boolean getPelaje() {
		return pelaje;
	}
	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}
	
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	public int cantidadMamiferos() {
		return listado.size();
	}
	
}
