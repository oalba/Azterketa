import java.util.*;
public class Receta {
	private String nombreReceta;
	//Ingrediente ingrediente = new Ingrediente();
	ArrayList<Ingrediente> ingredientes;// = new ArrayList<Ingrediente>();
	private String preparación;

	public void setNombreReceta (String nr){
		nombreReceta = nr;
	}
	public String getNombreReceta(){
		return nombreReceta;
	}
	public void setIngredientes (ArrayList<Ingrediente> ing){
		ingredientes = ing;
	}
	public ArrayList<Ingrediente>  getIngredientes(){
		return ingredientes;
	}
	public void setPreparación (String prep){
		preparación = prep;
	}
	public String getPreparación(){
		return preparación;
	}
}
