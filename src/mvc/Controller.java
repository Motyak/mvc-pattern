package mvc;
import java.util.HashMap;

public abstract class Controller {
	private HashMap<mvc.Attribute.Name,mvc.Attribute> attributes;
	private HashMap<mvc.UseCase.Name,mvc.UseCase> useCases;
	
	public Controller(mvc.Attribute.Name[] attrs, mvc.UseCase.Name[] ucs)
	{
		this.attributes = new HashMap<>();
		this.useCases = new HashMap<>();
		
		for(mvc.Attribute.Name n : attrs)
			this.attributes.put(n, n.get());
		
		for(mvc.UseCase.Name n : ucs)
			this.useCases.put(n, n.get(this));
	}
	
	public mvc.Attribute getAttribute(mvc.Attribute.Name name) { return this.attributes.get(name); }
	
	public void entToIhm()
	{
		for(mvc.Attribute a : this.attributes.values())
			a.ihm = a.ent.toIhm();
	}
	
	public void call(mvc.UseCase.Name useCaseName)
	{
		this.useCases.get(useCaseName).doIt();
	}
}
