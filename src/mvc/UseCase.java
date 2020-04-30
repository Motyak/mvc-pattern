package mvc;

public abstract class UseCase {
	protected Controller ctrl;
	
	public UseCase(Controller ctrl)
	{
		this.ctrl = ctrl;
	}
	
	public abstract void doIt();
	
	public static interface Name {}
}
