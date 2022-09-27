package zooAnimales;

import gestion.Zona;

public class Animal {
	protected static int totalAnimales = 0;
	protected String nombre;
	protected int edad;
	protected String habitat;
	protected String genero;
	protected Zona zona;
	
	public Animal(String nombre, int edad, String habitat, String genero, Zona zona) {
		totalAnimales ++;
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.zona = zona;
	}
	
	public Animal(String nombre, int edad, String habitat, String genero) {
		this(nombre, edad, habitat, genero, null);
	}
	public Animal() {
		this(null,0,null,null,null);
	}
	
	public int getTotalAnimales() {
		return totalAnimales;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat=habitat;
	}
	
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public Zona getZona() {
		return zona;
	}
	public void setZona(Zona zona) {
		this.zona = zona;
	}
	public String totalPorTipo() {
		return "Mamiferos: "+Mamifero.cantidadMamiferos()+"\nAves: "+Ave.cantidadAves()+"\nReptiles: "+Reptil.cantidadReptiles()+"\nPeces: "+Pez.cantidadPeces()+"\nAnfibios: "+ Anfibio.cantidadAnfibios();
	}
	@Override
	public String toString() {
		if (zona == null) {
			return "Mi nombre es "+ this.nombre +", tengo una edad de " +this.edad+ ", habito en " +this.habitat + " y mi genero es " +this.genero;
		}
		else {
			return "Mi nombre es "+ this.nombre +", tengo una edad de " +this.edad+ ", habito en " +this.habitat + " y mi genero es " +this.genero+", la zona en la que me ubico es " +this.zona.getNombre()+ ", en el "+this.zona.getZoo().getNombre();
		}
	}
	
	public String movimiento() {
		return "desplazarse";
	}
	
}
