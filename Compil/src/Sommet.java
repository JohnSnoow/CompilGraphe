import java.util.ArrayList;

public class Sommet {
	
	private String nom;
	private String couleur;
	
	public Sommet(String nom) 
	{
		this.nom = nom;
		String couleur;
	}
	
	public String getCouleur (Sommet s)
	{
		return this.couleur;
	}
	
	public String getNom (Sommet s)
	{
		return this.nom;
	}
	
	public static Graphe retirerSommet(Graphe g, Sommet s){
		return g;
		
	}

	public static void colorier(Graphe g, Sommet s, int nbCouleur) {
		ArrayList<Integer> Couleurs = new ArrayList<Integer>();
		int i;
		for (i = 1; i<nbCouleur; i++ ) {
			Couleurs.add(i);
		}
		
		
	}
	
}
