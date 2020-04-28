package mvc;
import java.util.HashMap;

public abstract class Controller {
	private HashMap<AttributeName,Attribute> attributs;
	private HashMap<UseCaseName,UseCase> useCases;
	
	public Controller()
	{
		this.attributs = new HashMap<>();
		this.useCases = new HashMap<>();
	}
	
	public Controller(Controller ctrl)
	{
		this.attributs = ctrl.attributs;
		this.useCases = ctrl.useCases;
	}
	
	public void addAttribute(AttributeName name, Attribute attr)
	{
		this.attributs.put(name, attr);
	}
	
	public void addUseCase(UseCaseName name, UseCase uc)
	{
		this.useCases.put(name, uc);
	}
	
	public Attribute getAttribut(AttributeName name) { return this.attributs.get(name); }
	public UseCase getUseCase(UseCaseName name) { return this.useCases.get(name); }
	
	public void entToIhm()
	{
		for(Attribute a : this.attributs.values())
			a.ihm = a.ent.toIhm();
	}
	
	public void call(UseCaseName useCaseName)
	{
		this.useCases.get(useCaseName).doIt();
	}
}
