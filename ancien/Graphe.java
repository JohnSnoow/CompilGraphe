import java.util.List;


public class Graphe {
	
	private List<Sommet> ls;
	private List<Arrete> li;
	private List<Arrete> lp;
	private int nbCouleur;

	public Graphe (List<Sommet> listeSommets, List<Arrete> listeAInterference, List<Arrete> listeAPreference, int nbCouleur)
	{
		this.ls = listeSommets;
		this.li = listeAInterference;
		this.lp = listeAPreference;
		this.nbCouleur = nbCouleur;
	}
	
	
	public void main(String[] args) {
		
	}
	
	public String[] colorierGraphe(Graphe g){
		return null;
		
	}
}
