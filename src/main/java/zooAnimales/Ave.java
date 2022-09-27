package zooAnimales;
import java.util.ArrayList;

import gestion.Zona;

public class Ave extends Animal{
	private static ArrayList<Ave> listado = new ArrayList<Ave>();
	public static int halcones = 0;	
	public static int aguilas = 0;
	private String colorPlumas;
	
	public Ave(String nombre, int edad, String habitat, String genero, Zona zona, String colorPlumas) {
		super(nombre, edad,habitat,genero,zona);
		totalAnimales ++;
		this.colorPlumas = colorPlumas;
		listado.add(this);
	}
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		this(nombre, edad, habitat, genero, null, colorPlumas);
	}
	public Ave() {
		this(null,0, null,null,null,null);
	}
	public ArrayList<Ave> getListado(){
		return listado;
	}
	
	public String getColorPlumas() {
		return colorPlumas;
	}
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	
	public String movimiento() {
		return "volar";
	}
	
	public static int  cantidadAves() {
		return listado.size();
	}
	
	public static Animal crearHalcon(String nombre, int edad, String genero) {
		halcones++;
		return new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
		
	}
	
	public static Animal crearAguila(String nombre, int edad, String genero) {
		aguilas++;
		return new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
		
	}
}
