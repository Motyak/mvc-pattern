package project;

enum AttributeName implements mvc.Attribute.Name {
	grille {
		Grille get() { return new Grille(new Grille.Ent(3, 1), new Grille.Ihm(9, 7)); }
	}
	;
	
	abstract mvc.Attribute get();
}
