public class Ingrediente {
	private String nombreIngrediente;
	private int cantidadGramos;
	private int cantidadUnidad;
	private boolean enGramos;

	public void setNombreIngrediente (String ni){
		nombreIngrediente = ni;
	}
	public String getNombreIngrediente(){
		return nombreIngrediente;
	}

	public void setCantidadGramos (int cg){
		cantidadGramos = cg;
	}
	public int getCantidadGramos(){
		return cantidadGramos;
	}

	public void setCantidadUnidad (int cu){
		cantidadUnidad = cu;
	}
	public int getCantidadUnidad(){
		return cantidadUnidad;
	}

	public void setEnGramos (boolean eg){
		enGramos = eg;
	}
	public boolean getEnGramos(){
		return enGramos;
	}
}
