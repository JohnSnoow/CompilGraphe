
public class Arrete {
	
	private Sommet s1;
	private Sommet s2;

	public Arrete (Sommet premier, Sommet second){
		this.s1 = premier;
		this.s2 = second;
	}
	
	public Sommet getSommet1 (Sommet s)
	{
		return this.s1;
	}
	public Sommet getSommet2 (Sommet s)
	{
		return this.s2;
	}
	
}
