package mvc;

public abstract class Attribute {
	protected mvc.Ent ent;
	protected mvc.Ihm ihm;
	
	public Attribute(mvc.Ent ent, mvc.Ihm ihm)
	{
		this.ent = ent;
		this.ihm = ihm;
	}
	
	public mvc.Ent getEnt() { return this.ent; }
	public mvc.Ihm getIhm() { return this.ihm; }
	
	public static interface Name {
		public abstract mvc.Attribute get();
	}
}
