import java.util.List;


public class Sommet {
	
	private String nom;
	private String couleur;
	
	public Sommet(String nom, String couleur) 
	{
		this.nom = nom;
		this.couleur = couleur;
	}
	
	public String getCouleur (Sommet s)
	{
		return this.couleur;
	}
	
	public String getNom (Sommet s)
	{
		return this.nom;
	}
	
	public void colorierSommet(Sommet s, List<Arrete> li, List<Arrete> lp)
	{
		
	}
	
}
