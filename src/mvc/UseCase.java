package mvc;

public abstract class UseCase {
	protected mvc.Controller ctrl;
	
	public UseCase(Controller ctrl)
	{
		this.ctrl = ctrl;
	}
	
	public abstract void doIt();
	
	public static interface Name {
		public abstract mvc.UseCase get(mvc.Controller ctrl);
	}
}
