package project;

import static project.AttributeName.*;

import mvc.Controller;

public class JouerCoup extends mvc.UseCase {

	public JouerCoup(Controller ctrl) 
	{
		super(ctrl);
	}

	@Override
	public void doIt() 
	{
		Grille attr = (Grille)this.ctrl.getAttribut(grille);
		Grille.Ent grilleEnt = (Grille.Ent)attr.getEnt();
		Grille.Ihm grilleIhm = (Grille.Ihm)attr.getIhm();
		
		grilleEnt.test();
		grilleIhm.test();
	}
	
}
