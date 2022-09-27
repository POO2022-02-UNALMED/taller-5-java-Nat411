package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Mamifero extends Animal{
	private static ArrayList<Mamifero> listado = new ArrayList<Mamifero>();
	public static int caballos = 0;	
	public static int leones = 0;
	private boolean pelaje;
	private int patas;
	
	public Mamifero(String nombre, int edad, String habitat, String genero, Zona zona, Boolean pelaje, int patas) {
		super(nombre, edad,habitat,genero,zona);
		totalAnimales ++;
		this.pelaje = pelaje;
		this.patas = patas;
		listado.add(this);
	}
	public Mamifero(String nombre, int edad, String habitat, String genero, Boolean pelaje, int patas) {
		this(nombre, edad, habitat, genero, null, pelaje, patas);
	}
	public Mamifero() {
		this(null,0, null,null,null,false,0);
	}
	public ArrayList<Mamifero> getListado(){
		return listado;
	}

	
	public boolean isPelaje() {
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
	
	public static int cantidadMamiferos() {
		return listado.size();
	}
	
	public static Animal crearCaballo(String nombre, int edad, String genero) {
		caballos++;
		return new Mamifero(nombre, edad,"pradera" , genero, null,  true, 4);

	}
	public static Animal crearLeon(String nombre, int edad, String genero) {
		leones++;
		return new Mamifero(nombre, edad,"selva" , genero, null,  true, 4);
		
	}
	
}
