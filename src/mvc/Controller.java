package mvc;
import java.util.HashMap;

public abstract class Controller {
	private HashMap<Attribute.Name,Attribute> attributs;
	private HashMap<UseCase.Name,UseCase> useCases;
	
	public Controller(mvc.Attribute.Name[] attrs, mvc.UseCase.Name[] ucs)
	{
		this.attributs = new HashMap<>();
		this.useCases = new HashMap<>();
		
		for(mvc.Attribute.Name n : attrs)
			this.attributs.put(n, n.get());
		
		for(mvc.UseCase.Name n : ucs)
			this.useCases.put(n, n.get(this));
	}
	
	public Attribute getAttribut(Attribute.Name name) { return this.attributs.get(name); }
	
	public void entToIhm()
	{
		for(Attribute a : this.attributs.values())
			a.ihm = a.ent.toIhm();
	}
	
	public void call(UseCase.Name useCaseName)
	{
		this.useCases.get(useCaseName).doIt();
	}
}
