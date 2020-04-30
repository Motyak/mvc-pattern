package mvc;

public abstract class Attribute {
	protected Ent ent;
	protected Ihm ihm;
	
	public Attribute(Ent ent, Ihm ihm)
	{
		this.ent = ent;
		this.ihm = ihm;
	}
	
	public Ent getEnt() { return this.ent; }
	public Ihm getIhm() { return this.ihm; }
	
	public static interface Name {}
}
