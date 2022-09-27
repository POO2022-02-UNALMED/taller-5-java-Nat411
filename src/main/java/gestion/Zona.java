package gestion;

import java.util.ArrayList;

import zooAnimales.Animal;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private ArrayList<Animal> animal;
	
	public Zona (String nombre, Zoologico zoo, ArrayList<Animal> animal) {
		this.nombre = nombre;
		this.zoo = zoo;
		this.animal = animal;
	}
	
	public Zona (String nombre, Zoologico zoo) {
		this(nombre, zoo, new ArrayList<Animal>());
	}
	
	public Zona() {
		this(null, null,new ArrayList<Animal>());
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Zoologico getZoo (){
		return zoo;
	}
	
	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}
	
	public ArrayList<Animal> getAnimal(){
		return animal;
	}
	
	public void setAnimal(ArrayList<Animal> animal) {
		this.animal = animal;
	}
	
	public void agregarAnimales(Animal animal) {
		this.animal.add(animal);
	}
	
	public int cantidadAnimales() {
		return animal.size();
	}
}
