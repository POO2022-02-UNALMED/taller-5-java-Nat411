package zooAnimales;
import java.util.ArrayList;

import gestion.Zona;


public class Anfibio extends Animal{
		private static ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
		public static int ranas = 0;	
		public static int salamandras = 0;
		private String colorPiel;
		private boolean venenoso;
		
		public Anfibio(String nombre, int edad, String habitat, String genero, Zona zona, String colorPiel, boolean venenoso) {
			super(nombre, edad,habitat,genero,zona);
			totalAnimales ++;
			this.colorPiel = colorPiel;
			this.venenoso = venenoso;
			listado.add(this);
		}
		public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
			this(nombre, edad, habitat, genero, null, colorPiel, venenoso);
		}
		public Anfibio() {
			this(null,0, null,null,null,null,false);
		}
		
		public ArrayList<Anfibio> getListado(){
			return listado;
		}
		
		public String getColorPiel() {
			return colorPiel;
		}
		public void setColorPiel(String colorPiel) {
			this.colorPiel= colorPiel;
		}
		
		public boolean isVenenoso() {
			return venenoso;
		}
		public void setVenenoso(boolean venenoso) {
			this.venenoso = venenoso;
		}
		
		public static int cantidadAnfibios() {
			return listado.size();
		}
		
		public String movimiento() {
			return "saltar";
		}
		
		public static Animal crearRana(String nombre, int edad, String genero) {
			ranas++;
			return new Anfibio(nombre, edad, "selva", genero, "rojo",true);
		}
		
		public static Animal crearSalamandra(String nombre, int edad, String genero) {
			salamandras++;
			return new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
		}
		
}
