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
			this.addAttribute(n, n.get());
		
		for(mvc.UseCase.Name n : ucs)
			this.addUseCase(n, n.get(this));
	}
	
	public void addAttribute(Attribute.Name name, Attribute attr)
	{
		this.attributs.put(name, attr);
	}
	
	public void addUseCase(UseCase.Name name, UseCase uc)
	{
		this.useCases.put(name, uc);
	}
	
	public Attribute getAttribut(Attribute.Name name) { return this.attributs.get(name); }
	public UseCase getUseCase(UseCase.Name name) { return this.useCases.get(name); }
	
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
