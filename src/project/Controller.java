package project;

import static project.AttributeName.*;
import static project.UseCaseName.*;

public class Controller extends mvc.Controller {
	Controller()
	{
		super();
		this.addAttribute(grille, new Grille(new Grille.Ent(3, 1), new Grille.Ihm(9, 7)));
		this.addUseCase(jouerCoup, new JouerCoup(this));
	}
}
