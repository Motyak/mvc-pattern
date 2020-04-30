package project;

enum UseCaseName implements mvc.UseCase.Name {
	jouerCoup {
		JouerCoup get(Controller ctrl) { return new JouerCoup(ctrl); }
	}
	;
	
	abstract mvc.UseCase get(Controller ctrl);
}
