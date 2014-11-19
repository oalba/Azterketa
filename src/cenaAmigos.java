import java.util.*;
import java.io.*;
public class cenaAmigos {
	public static void main(String[] args) {
		String nomre, nomin, ug, prep, ingres;
		int numre, numin, cant;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nIntroduce el numero de recetas que quieres introducir: \n");
		numre = sc.nextInt();
		ArrayList<Receta> recetas = new ArrayList<Receta>();

		for (int i = 0; i < numre; i++) {
			Receta receta = new Receta();
			Scanner sca = new Scanner(System.in);
			System.out.println("Introduce el nombre de la receta: ");
			nomre = sca.next();
			receta.setNombreReceta(nomre);
			System.out.print("Introduce el numero de ingredientes: \n");
			numin = sca.nextInt();
			ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
			for (int j = 0; j < numin; j++) {
				Ingrediente ing = new Ingrediente();
				System.out.print("Introduce el nombre del ingrediente: \n");
				nomin = sca.next();
				ing.setNombreIngrediente(nomin);
				System.out.print("La cantidad se medira en unidades(u) o en gramos(g)? \n");
				ug = sca.next();
				System.out.print("Introduce la cantidad del ingrediente: \n");
				cant = sca.nextInt();
				if (ug == "u") {
					ing.setEnGramos(true);
					ing.setCantidadUnidad(cant);
				} else if (ug == "g") {
					ing.setEnGramos(false);
					ing.setCantidadGramos(cant);				
				}
				ingredientes.add(ing);
			}
			System.out.println("Introduce la preparacion de la receta: ");
			prep = sca.next();
			receta.setPreparación(prep);
			recetas.add(receta);

			try{
				FileWriter fw = new FileWriter("/home/zubiri/AriketakJava/Azterketa/src/recetas.txt", true);
				fw.write("..." + "\n");
				fw.close(); 
            	FileReader fr = new FileReader("/home/zubiri/AriketakJava/java2_elecciones/src/censo.txt");
            	fr.close();
			}catch (IOException ioe) {
				System.out.println("Error E/S: "+ioe);
			} 
		}
	}
}