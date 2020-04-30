package project;

//import static project.AttributeName.*;
//import static project.UseCaseName.*;

class Controller extends mvc.Controller {
	
//	private static Controller ctrl = null;
	
	Controller() {
		super();
		
		for(AttributeName n : AttributeName.values())
			this.addAttribute(n, n.get());
		
		for(UseCaseName n : UseCaseName.values())
			this.addUseCase(n, n.get(this));
	}
	
//	public static Controller get() {
//		if(ctrl == null) {
//			Controller ctrl = new Controller();
//		}
//			
//		return Controller.ctrl;
//	}
}
