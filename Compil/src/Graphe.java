public class Graphe {
	
	private Sommet[] ls;
	private Arrete[] li;
	private Arrete[] lp;
	private int nbCouleur;

	public Graphe (Sommet[] listeSommets, Arrete[] listeAInterference, Arrete[] listeAPreference)
	{
		this.ls = listeSommets;
		this.li = listeAInterference;
		this.lp = listeAPreference;
	}
	public Sommet[] getls (Graphe g)
	{
		return this.ls;
	}
	public Arrete[] getli (Graphe g)
	{
		return this.li;
	}
	public Arrete[] getlp (Graphe g)
	{
		return this.lp;
	}
	
	
	public void colorierGraphe(Graphe g, int nbCouleur){
		
		if (existeTrivial(g, nbCouleur) ) {
			Sommet s = recupTrivial(g);
			Graphe ng = Sommet.retirerSommet(g, s);
			colorierGraphe(ng, nbCouleur);
			Sommet.colorier(g, s, nbCouleur);
		}
		else {
			Sommet s = recupASpiller(g);
			Graphe ng = Sommet.retirerSommet(g,s);
			colorierGraphe(ng, nbCouleur);
		}	
	}
	public Sommet recupTrivial(Graphe g) {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean existeTrivial(Graphe g, int nbCouleur){
		Sommet trivial = g.ls[0];
		
		return true;
	}


	public void colorier(Graphe g, Sommet s){
		
	}
	public Sommet recupASpiller(Graphe g){
		return null ;
	}
}
