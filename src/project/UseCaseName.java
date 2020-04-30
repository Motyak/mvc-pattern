package project;

//	automatically created
enum UseCaseName implements mvc.UseCase.Name {
	jouerCoup {
		public JouerCoup get(mvc.Controller ctrl) { return new JouerCoup((Controller)ctrl); }
	}
	;

}
